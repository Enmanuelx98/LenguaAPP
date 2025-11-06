package pe.edu.upc.modelos.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.modelos.dtos.InsigniasDTO;
import pe.edu.upc.modelos.entiities.Insignias;
import pe.edu.upc.modelos.serviceinterface.serviceinterinsignia;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/insignia")
public class controllerInsignia {
    @Autowired
    private serviceinterinsignia serviceinterinsignia;
    //agregar
    @PostMapping("/agregarinsignia")
    @PreAuthorize("hasAnyAuthority('ADMIN','ESTUDIANTE','DOCENTE')")
    public void agregarinsignia(@RequestBody InsigniasDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        Insignias insignias = modelMapper.map(dto, Insignias.class);
        serviceinterinsignia.insertarInsignia(insignias);

    }

    //modificar
    @PutMapping("/updateinsignia")
    @PreAuthorize("hasAnyAuthority('ADMIN','ESTUDIANTE','DOCENTE')")
    public void editarinsignia(@RequestBody InsigniasDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        Insignias insignias = modelMapper.map(dto, Insignias.class);
        serviceinterinsignia.updateInsignia(insignias);

    }
    //delete
    @DeleteMapping("/{id}")
    @PreAuthorize("hasAnyAuthority('ADMIN','ESTUDIANTE','DOCENTE')")
    public void eliminarinsignia(@PathVariable("id") Long id) {
        serviceinterinsignia.eliminarInsignia(id);
    }

    //Listar
    @GetMapping("/listinsignia")
    @PreAuthorize("hasAnyAuthority('ADMIN','ESTUDIANTE','DOCENTE')")
    public List<InsigniasDTO> Listinsignia() {
        return serviceinterinsignia.listarInsignia().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, InsigniasDTO.class);
        }).collect(Collectors.toList());
    }
    // Listar resultados de curso por ID de usuario
    @GetMapping("/listinsigniaporid/{id}")
    @PreAuthorize("hasAnyAuthority('ADMIN','ESTUDIANTE','DOCENTE')")
    public List<InsigniasDTO> listarPorUsuario(@PathVariable("id") Long userId) {
        return serviceinterinsignia.listarPorUsuario(userId).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, InsigniasDTO.class);
        }).collect(Collectors.toList());
    }
}
