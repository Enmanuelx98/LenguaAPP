package pe.edu.upc.modelos.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.modelos.dtos.CursosDTO;
import pe.edu.upc.modelos.dtos.UserDTO;
import pe.edu.upc.modelos.entiities.Cursos;
import pe.edu.upc.modelos.serviceinterface.serviceintercursos;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/cursos")
public class controllerCursos {
    @Autowired
    private serviceintercursos serviceintercursos;
    //agregar
    @PostMapping("/agregarcurso")
    @PreAuthorize("hasAnyAuthority('ADMIN','ESTUDIANTE','DOCENTE')")
    public void agregarcurso(@RequestBody CursosDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        Cursos cursos = modelMapper.map(dto, Cursos.class);
        serviceintercursos.insertarCurso(cursos);

    }

    //modificar
    @PutMapping("/updatecurso")
    @PreAuthorize("hasAnyAuthority('ADMIN','ESTUDIANTE','DOCENTE')")
    public void editarcurso(@RequestBody CursosDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        Cursos cursos = modelMapper.map(dto, Cursos.class);
        serviceintercursos.updateCurso(cursos);

    }
    //delete
    @DeleteMapping("/borrar/{id}")
    @PreAuthorize("hasAnyAuthority('ADMIN','ESTUDIANTE','DOCENTE')")
    public void eliminarcurso(@PathVariable("id") Long id) {
        serviceintercursos.eliminarCurso(id);
    }

    //Listar
    @GetMapping("/listcurso")
    public List<CursosDTO> Listcursos() {
        return serviceintercursos.listarCurso().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, CursosDTO.class);
        }).collect(Collectors.toList());
    }
    //buscarid
    @GetMapping("/buscarid/{id}")
    @PreAuthorize("hasAnyAuthority('ADMIN','ESTUDIANTE','DOCENTE')")
    public CursosDTO buscariD(@PathVariable("id") Long id ) {
        ModelMapper m = new ModelMapper();
        CursosDTO dto = m.map(serviceintercursos.obtenerCursoPorId(id), CursosDTO.class);
        return dto;
    }

    //Listar
    @GetMapping("/listcursotipolengua/{tipolengua}")
    public List<CursosDTO> Listcursostipolengua(String tipolengua) {
        return serviceintercursos.findByTipoLengua(tipolengua).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, CursosDTO.class);
        }).collect(Collectors.toList());
    }
}
