package pe.edu.upc.modelos.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.modelos.dtos.PalabrasDTO;
import pe.edu.upc.modelos.dtos.PreguntaDTO;
import pe.edu.upc.modelos.entiities.Pregunta;
import pe.edu.upc.modelos.serviceinterface.serviceinterpregunta;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/pregunta")
public class controllerPregunta {
    @Autowired
    private serviceinterpregunta serviceintpregunta;
    //agregar
    @PostMapping("/agregarpregunta")
    @PreAuthorize("hasAnyAuthority('ADMIN','ESTUDIANTE','DOCENTE')")
    public void agregarpregunta(@RequestBody PreguntaDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        Pregunta pregunta = modelMapper.map(dto, Pregunta.class);
        serviceintpregunta.insertarPregunta(pregunta);

    }

    //modificar
    @PutMapping("/updatepregunta")
    @PreAuthorize("hasAnyAuthority('ADMIN','ESTUDIANTE','DOCENTE')")
    public void editarpregunta(@RequestBody PreguntaDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        Pregunta pregunta = modelMapper.map(dto, Pregunta.class);
        serviceintpregunta.updatePregunta(pregunta);

    }
    //delete
    @DeleteMapping("/{id}")
    @PreAuthorize("hasAnyAuthority('ADMIN','ESTUDIANTE','DOCENTE')")
    public void eliminarpregunta(@PathVariable("id") Long id) {
        serviceintpregunta.eliminarPregunta(id);
    }

    //Listar
    @GetMapping("/list")
    @PreAuthorize("hasAnyAuthority('ADMIN','ESTUDIANTE','DOCENTE')")
    public List<PreguntaDTO> Listpreguntas() {
        return serviceintpregunta.listarPregunta().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, PreguntaDTO.class);
        }).collect(Collectors.toList());
    }

    // Buscar palabras por el id del curso
    @GetMapping("/buscarpreguntaporcurso/{cursoId}")
    @PreAuthorize("hasAnyAuthority('ADMIN','ESTUDIANTE','DOCENTE')")
    public List<PreguntaDTO> buscarPorCurso(@PathVariable("cursoId") Long cursoId) {
        return serviceintpregunta.findQuestionByCursoId(cursoId).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, PreguntaDTO.class);
        }).collect(Collectors.toList());
    }
}
