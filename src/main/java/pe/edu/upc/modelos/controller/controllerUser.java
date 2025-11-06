package pe.edu.upc.modelos.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.modelos.dtos.CambioClaveDTO;
import pe.edu.upc.modelos.dtos.UserDTO;
import pe.edu.upc.modelos.entiities.Role;
import pe.edu.upc.modelos.entiities.Users;
import pe.edu.upc.modelos.serviceinterface.serviceinterRole;
import pe.edu.upc.modelos.serviceinterface.serviceinteruser;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/user")
public class controllerUser {
    @Autowired
    private serviceinteruser service;
    @Autowired
    private serviceinterRole servicerol;

    //Agregar
    @PostMapping("/insertaruser/{role}")
    public void insertar(@RequestBody UserDTO dto, @PathVariable("role") String role) {
        ModelMapper modelMapper = new ModelMapper();
        Users users = modelMapper.map(dto, Users.class);

        // Encriptar la contraseña antes de guardar
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String hashedPassword = encoder.encode(users.getPassword());
        users.setPassword(hashedPassword);
        service.insertarUsuario(users);

        Users usuarioRol=service.findOneByUsername(users.getUsername());
        Role roleAsignado= new Role();
        roleAsignado.setRol(role);
        roleAsignado.setUser(usuarioRol);
        servicerol.insertarRol(roleAsignado);
    }
    //modificar
    @PutMapping
    @PreAuthorize("hasAnyAuthority('ADMIN','ESTUDIANTE','DOCENTE')")
    public void editar(@RequestBody UserDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        Users users = modelMapper.map(dto, Users.class);
        service.updateUsuario(users);

    }

    //delete
    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void eliminar(@PathVariable("id") Long id) {
        service.eliminarUsuario(id);
    }


    //actualizar pass
    @PutMapping("/cambioclave")
    public String actualizarPassword(@RequestBody CambioClaveDTO dto) {
        String email = dto.getEmail();
        String password = dto.getPassword();
        // Encriptar la contraseña antes de guardar
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String hashedPassword = encoder.encode(password);

        boolean actualizado = service.updateUsuariopass(email, hashedPassword);

        if (!actualizado) {
            return "El correo no existe";
        }

        return "Contraseña actualizada correctamente";
    }

    //buscarid
    @GetMapping("/buscarid/{id}")
    @PreAuthorize("hasAnyAuthority('ADMIN','ESTUDIANTE','DOCENTE')")
    public UserDTO buscariD(@PathVariable("id") Long id ) {
        ModelMapper m = new ModelMapper();
        UserDTO dto = m.map(service.listId(id), UserDTO.class);
        return dto;
    }
    //buscarnombre
    @GetMapping("/buscarnombre/{username}")
    public UserDTO buscarnombre(@PathVariable("username") String username ) {
        ModelMapper m = new ModelMapper();
        UserDTO dto = m.map(service.findOneByUsername(username), UserDTO.class);
        return dto;
    }


    //listar
    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<Users> List() {
        return service.lista().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, Users.class);
        }).collect(Collectors.toList());
    }

    @PostMapping("/asignarrol/{id}")
    @PreAuthorize("hasAnyAuthority('ADMIN')")
    public ResponseEntity<String> asignarRol(@PathVariable("id") Long id, @RequestParam("role") String role) {
        try {
            // Verificar si el usuario existe
            UserDTO user = new ModelMapper().map(service.listId(id), UserDTO.class);
            if (user == null) {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Usuario no encontrado");
            }

            // Insertar el rol
            service.insRol(role, id);
            return ResponseEntity.ok("Rol asignado correctamente al usuario con ID " + id);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error al asignar el rol: " + e.getMessage());
        }
    }

}
