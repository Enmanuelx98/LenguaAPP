package pe.edu.upc.modelos.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.modelos.dtos.PalabrasDTO;
import pe.edu.upc.modelos.entiities.Palabras;
import pe.edu.upc.modelos.serviceinterface.serviceinterpalabra;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/palabra")
public class controllerPalabra {
    @Autowired
    private serviceinterpalabra serviceinterpalabra;
    //agregar
    @PostMapping("/agregarpalabra")
    @PreAuthorize("hasAnyAuthority('ADMIN','ESTUDIANTE','DOCENTE')")
    public void agregarpalabra(@RequestBody PalabrasDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        Palabras palabras = modelMapper.map(dto, Palabras.class);
        serviceinterpalabra.insertarPalabra(palabras);

    }

    //modificar
    @PutMapping("/updatepalabra")
    @PreAuthorize("hasAnyAuthority('ADMIN','ESTUDIANTE','DOCENTE')")
    public void editarpalabra(@RequestBody PalabrasDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        Palabras palabras = modelMapper.map(dto, Palabras.class);
        serviceinterpalabra.updatePalabra(palabras);

    }
    //delete
    @DeleteMapping("eliminarpalabra/{id}")
    @PreAuthorize("hasAnyAuthority('ADMIN','ESTUDIANTE','DOCENTE')")
    public void eliminarpalabra(@PathVariable("id") Long id) {
        serviceinterpalabra.eliminarPalabra(id);
    }

    //Listar
    @GetMapping("/listpalabra")
    @PreAuthorize("hasAnyAuthority('ADMIN','ESTUDIANTE','DOCENTE')")
    public List<PalabrasDTO> Listpalabra() {
        return serviceinterpalabra.listarPalabra().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, PalabrasDTO.class);
        }).collect(Collectors.toList());
    }

    // Buscar palabras por el id del curso
    @GetMapping("/buscarporcurso/{cursoId}")
    @PreAuthorize("hasAnyAuthority('ADMIN','ESTUDIANTE','DOCENTE')")
    public PalabrasDTO buscarPorCurso(@PathVariable("cursoId") Long cursoId) {
        ModelMapper m = new ModelMapper();
        PalabrasDTO dto = m.map(serviceinterpalabra.findByCursoId(cursoId), PalabrasDTO.class);
        return dto;
    }
}
