package pe.edu.upc.modelos.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.modelos.dtos.CursosDTO;
import pe.edu.upc.modelos.dtos.UsuarioCursoDTO;
import pe.edu.upc.modelos.entiities.UsuarioCurso;
import pe.edu.upc.modelos.serviceinterface.serviceinterusuariocurso;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuariocursos")
public class controllerUsuarioCurso {
    @Autowired
    private serviceinterusuariocurso serviceinterusercursos;
    //agregar
    @PostMapping("/agregarusercurso")
    public void agregarusercurso(@RequestBody UsuarioCursoDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        UsuarioCurso usuarioCurso = modelMapper.map(dto, UsuarioCurso.class);
        serviceinterusercursos.insertarUserCurso(usuarioCurso);

    }

    //modificar
    @PutMapping("/updateusercurso")
    @PreAuthorize("hasAnyAuthority('ADMIN','ESTUDIANTE','DOCENTE')")
    public void editarusercurso(@RequestBody UsuarioCursoDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        UsuarioCurso usuarioCurso = modelMapper.map(dto, UsuarioCurso.class);
        serviceinterusercursos.updateUserCurso(usuarioCurso);

    }
    @PutMapping("/completar/{userId}/{cursoId}")
    @PreAuthorize("hasAnyAuthority('ADMIN','ESTUDIANTE','DOCENTE')")
    public void completarCurso(@PathVariable("userId") Long userId, @PathVariable("cursoId") Long cursoId) {
        serviceinterusercursos.CompletoCurso(userId, cursoId);
    }

    //delete
    @DeleteMapping("/{id}")
    @PreAuthorize("hasAnyAuthority('ADMIN','ESTUDIANTE','DOCENTE')")
    public void eliminarusercurso(@PathVariable("id") Long id) {
        serviceinterusercursos.eliminarUserCurso(id);
    }

    //Listar
    @GetMapping("/list")
    @PreAuthorize("hasAnyAuthority('ADMIN','ESTUDIANTE','DOCENTE')")
    public List<UsuarioCursoDTO> Listusercurso() {
        return serviceinterusercursos.listarUserCurso().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, UsuarioCursoDTO.class);
        }).collect(Collectors.toList());
    }
    // Listar cursos por ID de usuario
    @GetMapping("/listcursousuario/{usuarioId}")
    public List<UsuarioCursoDTO> listarCursosPorUsuario(@PathVariable("usuarioId") Long usuarioId) {
        return serviceinterusercursos.findByUser_Id(usuarioId).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, UsuarioCursoDTO.class);
        }).collect(Collectors.toList());
    }
    // Listar cursos habilitados por tipo de lengua y por ID de usuario
    @GetMapping("/listcursoshabilitados/{userId}/{tipolengua}")
    public List<CursosDTO> listarCursosHabilitadosPorUsuario(@PathVariable("userId") Long usuarioId, @PathVariable("tipolengua") String tipolengua) {
        return serviceinterusercursos.findCursosHabilitadosByUserId(usuarioId, tipolengua)
                .stream()
                .map(curso -> {
                    ModelMapper mapper = new ModelMapper();
                    return mapper.map(curso, CursosDTO.class);
                })
                .collect(Collectors.toList());
    }

    // Listar cursos habilitados por tipo de lengua y por ID de usuario
    @GetMapping("/listcursosplease/{userId}/{tipolengua}")
    public List<CursosDTO> listarCursosPorUsuario(@PathVariable("userId") Long usuarioId, @PathVariable("tipolengua") String tipolengua) {
        return serviceinterusercursos.findCursosByUserId(usuarioId, tipolengua)
                .stream()
                .map(curso -> {
                    ModelMapper mapper = new ModelMapper();
                    return mapper.map(curso, CursosDTO.class);
                })
                .collect(Collectors.toList());
    }
}
