package pe.edu.upc.modelos.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.modelos.dtos.AlfabetoDTO;
import pe.edu.upc.modelos.entiities.Alfabeto;
import pe.edu.upc.modelos.serviceinterface.serviceinteralfabeto;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/alfabeto")
public class controllerAlfabeto {
    @Autowired
    private serviceinteralfabeto serviceinteralfabeto;
    //agregar
    @PostMapping("/agregaralfabeto")
    @PreAuthorize("hasAnyAuthority('ADMIN','ESTUDIANTE','DOCENTE')")
    public void agregaralfabeto(@RequestBody AlfabetoDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        Alfabeto alfabeto = modelMapper.map(dto, Alfabeto.class);
        serviceinteralfabeto.insertarAlfabeto(alfabeto);

    }

    //modificar
    @PutMapping("/updatealfabeto")
    @PreAuthorize("hasAnyAuthority('ADMIN','ESTUDIANTE','DOCENTE')")
    public void editaralfabeto(@RequestBody AlfabetoDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        Alfabeto alfabeto = modelMapper.map(dto, Alfabeto.class);
        serviceinteralfabeto.updateAlfabeto(alfabeto);

    }
    //delete
    @DeleteMapping("/alfabeto/{id}")
    @PreAuthorize("hasAnyAuthority('ADMIN','ESTUDIANTE','DOCENTE')")
    public void eliminaralfabeto(@PathVariable("id") Long id) {
        serviceinteralfabeto.eliminarAlfabeto(id);
    }

    //Listar
    @GetMapping("/listalfabeto")
    @PreAuthorize("hasAnyAuthority('ADMIN','ESTUDIANTE','DOCENTE')")
    public List<AlfabetoDTO> Listalfabeto() {
        return serviceinteralfabeto.listarAlfabeto().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, AlfabetoDTO.class);
        }).collect(Collectors.toList());
    }
    // Listar resultados de curso por tipolenguao
    @GetMapping("/listalfabetoportipo/{tipolengua}")
    @PreAuthorize("hasAnyAuthority('ADMIN','ESTUDIANTE','DOCENTE')")
    public List<AlfabetoDTO> listaralfabetoporTipo(@PathVariable("tipolengua") String tipolengua) {
        return serviceinteralfabeto.ListarAlfabetoTipo(tipolengua).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, AlfabetoDTO.class);
        }).collect(Collectors.toList());
    }
}
