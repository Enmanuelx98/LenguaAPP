package pe.edu.upc.modelos.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.modelos.dtos.CursoResultadoDTO;
import pe.edu.upc.modelos.entiities.CursoResultado;
import pe.edu.upc.modelos.serviceinterface.serviceintercursoresultado;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/cursosresultado")
public class controllerCursoResultado {
    @Autowired
    private serviceintercursoresultado serviceintercursoresultado;
    //agregar
    @PostMapping("/agregarcursoresultado")
    @PreAuthorize("hasAnyAuthority('ADMIN','ESTUDIANTE','DOCENTE')")
    public void agregarcursoresultado(@RequestBody CursoResultadoDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        CursoResultado cursoresultado = modelMapper.map(dto, CursoResultado.class);
        serviceintercursoresultado.insertarCursoResultado(cursoresultado);

    }

    //modificar
    @PutMapping("/updatecursoresultado")
    @PreAuthorize("hasAnyAuthority('ADMIN','ESTUDIANTE','DOCENTE')")
    public void editarcursoresultado(@RequestBody CursoResultadoDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        CursoResultado cursoresultado = modelMapper.map(dto, CursoResultado.class);
        serviceintercursoresultado.updateCursoResultado(cursoresultado);

    }
    //delete
    @DeleteMapping("/{id}")
    @PreAuthorize("hasAnyAuthority('ADMIN','ESTUDIANTE','DOCENTE')")
    public void eliminarcursoresultado(@PathVariable("id") Long id) {
        serviceintercursoresultado.eliminarCursoResultado(id);
    }

    //Listar
    @GetMapping("/listcursoresultado")
    @PreAuthorize("hasAnyAuthority('ADMIN','ESTUDIANTE','DOCENTE')")
    public List<CursoResultadoDTO> Listcursosresultado() {
        return serviceintercursoresultado.listarCursoResultado().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, CursoResultadoDTO.class);
        }).collect(Collectors.toList());
    }
    // Listar resultados de curso por ID de usuario
    @GetMapping("/listcursoresultadoporid/{id}")
    @PreAuthorize("hasAnyAuthority('ADMIN','ESTUDIANTE','DOCENTE')")
    public List<CursoResultadoDTO> listarPorUsuario(@PathVariable("id") Long userId) {
        return serviceintercursoresultado.listarPorUsuario(userId).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, CursoResultadoDTO.class);
        }).collect(Collectors.toList());
    }

}
