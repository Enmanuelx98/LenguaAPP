package pe.edu.upc.modelos.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.modelos.entiities.Users;
import pe.edu.upc.modelos.serviceinterface.serviceintrefaceuser;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/user")
public class controllerUser {
    @Autowired
    private serviceintrefaceuser service;

    //listar
    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<Users> List() {
        return service.lista().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, Users.class);
        }).collect(Collectors.toList());
    }
}
