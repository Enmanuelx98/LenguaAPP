package pe.edu.upc.modelos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.modelos.entiities.Cursos;
import pe.edu.upc.modelos.entiities.Users;
import pe.edu.upc.modelos.entiities.UsuarioCurso;
import pe.edu.upc.modelos.securities.JwtRequest;
import pe.edu.upc.modelos.securities.JwtResponse;
import pe.edu.upc.modelos.securities.JwtTokenUtil;
import pe.edu.upc.modelos.serviceinterface.serviceintercursos;
import pe.edu.upc.modelos.serviceinterface.serviceinteruser;
import pe.edu.upc.modelos.serviceinterface.serviceinterusuariocurso;
import pe.edu.upc.modelos.servicesimplements.JwtUserDetailsService;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


//Clase 3
@RestController
@CrossOrigin
public class JwtAuthenticationController {
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private JwtTokenUtil jwtTokenUtil;
    @Autowired
    private JwtUserDetailsService userDetailsService;
    //USUARIOCURSO
    @Autowired
    private serviceinteruser userService;

    @Autowired
    private serviceintercursos cursosService;

    @Autowired
    private serviceinterusuariocurso usuarioCursoService;

    @PostMapping("/login")
    public ResponseEntity<JwtResponse> login(@RequestBody JwtRequest req) throws Exception {
        authenticate(req.getUsername(), req.getPassword());

        final UserDetails userDetails = userDetailsService.loadUserByUsername(req.getUsername());
        final String token = jwtTokenUtil.generateToken(userDetails);

        // Agrego Cursos
        Users user = userService.findOneByUsername(req.getUsername());
        List<Cursos> cursos = cursosService.listarCurso();
        if (!cursos.isEmpty()){
            List<UsuarioCurso> cursosDelUsuario = usuarioCursoService.findByUser_Id(user.getId());
            Set<Long> idsCursosDelUsuario = cursosDelUsuario.stream()
                    .map(uc -> uc.getCurso().getId())
                    .collect(Collectors.toSet());

            for (Cursos curso : cursos) {
                if (!idsCursosDelUsuario.contains(curso.getId())) {
                    UsuarioCurso uc = new UsuarioCurso();
                    uc.setUser(user);
                    uc.setCurso(curso);
                    uc.setCompletado(false);
                    String nombreCurso = curso.getNombre();

                    if (nombreCurso.matches(".*\\d+$")) {
                        int numero = Integer.parseInt(nombreCurso.replaceAll("\\D+", ""));
                        uc.setHabilitado(numero == 1);
                    } else {
                        uc.setHabilitado(false);
                    }
                    usuarioCursoService.insertarUserCurso(uc);
                }
            }
        }

        return ResponseEntity.ok(new JwtResponse(token));
    }

    private void authenticate(String username, String password) throws Exception {
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
        } catch (DisabledException e) {
            throw new Exception("USER_DISABLED", e);
        } catch (BadCredentialsException e) {
            throw new Exception("INVALID_CREDENTIALS", e);
        }


    }
}