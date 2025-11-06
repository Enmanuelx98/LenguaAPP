package pe.edu.upc.modelos.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.modelos.dtos.ProgresoCursoPreguntaDTO;
import pe.edu.upc.modelos.entiities.ProgresoCursoPregunta;
import pe.edu.upc.modelos.serviceinterface.serviceinterprogreso;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/progreso")
public class controllerProgreso {
    @Autowired
    private serviceinterprogreso  serviceinterprogreso;
    //agregar
    @PostMapping("/agregarprogreso")
    @PreAuthorize("hasAnyAuthority('ADMIN','ESTUDIANTE','DOCENTE')")
    public void agregarprogreso(@RequestBody ProgresoCursoPreguntaDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        ProgresoCursoPregunta progresoCursoPregunta = modelMapper.map(dto, ProgresoCursoPregunta.class);
        serviceinterprogreso.insertarProgreso(progresoCursoPregunta);

    }

    //modificar
    @PutMapping("/updateprogreso")
    @PreAuthorize("hasAnyAuthority('ADMIN','ESTUDIANTE','DOCENTE')")
    public void editarprogreso(@RequestBody ProgresoCursoPreguntaDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        ProgresoCursoPregunta progresoCursoPregunta = modelMapper.map(dto, ProgresoCursoPregunta.class);
        serviceinterprogreso.updateProgreso(progresoCursoPregunta);

    }
    //delete
    @DeleteMapping("/{id}")
    @PreAuthorize("hasAnyAuthority('ADMIN','ESTUDIANTE','DOCENTE')")
    public void eliminarprogreso(@PathVariable("id") Long id) {
        serviceinterprogreso.eliminarProgreso(id);
    }

    //Listar
    @GetMapping("/list")
    @PreAuthorize("hasAnyAuthority('ADMIN','ESTUDIANTE','DOCENTE')")
    public List<ProgresoCursoPreguntaDTO> Listprogresos() {
        return serviceinterprogreso.listarProgreso().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ProgresoCursoPreguntaDTO.class);
        }).collect(Collectors.toList());
    }
}
