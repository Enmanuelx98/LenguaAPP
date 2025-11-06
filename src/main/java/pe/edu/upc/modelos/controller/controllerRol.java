package pe.edu.upc.modelos.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.modelos.dtos.RoleDTO;
import pe.edu.upc.modelos.dtos.UserDTO;
import pe.edu.upc.modelos.entiities.Role;
import pe.edu.upc.modelos.serviceinterface.serviceinterRole;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/rol")
public class controllerRol {
    @Autowired
    private serviceinterRole servicerol;
    //modificar
    @PutMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void editar(@RequestBody RoleDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        Role role = modelMapper.map(dto, Role.class);
        servicerol.updateRol(role);

    }
    //delete
    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void eliminar(@PathVariable("id") Long id) {
        servicerol.eliminarRol(id);
    }

    //Listar
    @GetMapping("/list")
    public List<RoleDTO> List() {
        return servicerol.listarRol().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, RoleDTO.class);
        }).collect(Collectors.toList());
    }

    //Listar roles
    @GetMapping("/listrole")
    public List<String> listarRoles() {
        List<String> roles = new ArrayList<>();
        roles.add("DOCENTE");
        roles.add("ESTUDIANTE");
        return roles;
    }

    // Buscar rol por ID de usuario
    @GetMapping("/buscarrolid/{id}")
    @PreAuthorize("hasAnyAuthority('ADMIN','ESTUDIANTE','DOCENTE')")
    public String buscarRolPorId(@PathVariable("id") Long id) {
        String rol = servicerol.findRolByUserId(id);
        if (rol != null) {
            return rol;
        } else {
            return "Rol no encontrado";
        }
    }
}
