package pe.edu.upc.modelos.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.modelos.dtos.ValoracionesDTO;
import pe.edu.upc.modelos.entiities.Valoraciones;
import pe.edu.upc.modelos.serviceinterface.serviceintervaloraciones;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/valoraciones")
public class controllerValoraciones {
    @Autowired
    private serviceintervaloraciones serviceintervaloraciones;
    //agregar
    @PostMapping("/agregarvaloraciones")
    @PreAuthorize("hasAnyAuthority('ADMIN','ESTUDIANTE','DOCENTE')")
    public void agregarvaloraciones(@RequestBody ValoracionesDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        Valoraciones valoraciones = modelMapper.map(dto, Valoraciones.class);
        serviceintervaloraciones.insertarValoracion(valoraciones);

    }

    //modificar
    @PutMapping("/updatevaloraciones")
    @PreAuthorize("hasAnyAuthority('ADMIN','ESTUDIANTE','DOCENTE')")
    public void editarvaloraciones(@RequestBody ValoracionesDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        Valoraciones valoraciones = modelMapper.map(dto, Valoraciones.class);
        serviceintervaloraciones.updateValoracion(valoraciones);

    }
    //delete
    @DeleteMapping("/{id}")
    @PreAuthorize("hasAnyAuthority('ADMIN','ESTUDIANTE','DOCENTE')")
    public void eliminarvaloracion(@PathVariable("id") Long id) {
        serviceintervaloraciones.eliminarValoracion(id);
    }

    //Listar
    @GetMapping("/list")
    @PreAuthorize("hasAnyAuthority('ADMIN','ESTUDIANTE','DOCENTE')")
    public List<ValoracionesDTO> Listvaloraciones() {
        return serviceintervaloraciones.listarValoracion().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ValoracionesDTO.class);
        }).collect(Collectors.toList());
    }

    //NUEVOS
    @GetMapping("/suma/tipolengua/{tipoLengua}")
    @PreAuthorize("hasAnyAuthority('ADMIN','ESTUDIANTE','DOCENTE')")
    public Double sumarPorTipoLengua(@PathVariable("tipoLengua") String tipoLengua) {
        return serviceintervaloraciones.ValoracionesPorTipoLengua(tipoLengua);
    }

    @GetMapping("/suma/curso/{idCurso}")
    @PreAuthorize("hasAnyAuthority('ADMIN','ESTUDIANTE','DOCENTE')")
    public Double sumarPorCurso(@PathVariable Long idCurso) {
        return serviceintervaloraciones.ValoracionesPorCurso(idCurso);
    }

    @GetMapping("/comentarios/{idCurso}")
    @PreAuthorize("hasAnyAuthority('ADMIN','ESTUDIANTE','DOCENTE')")
    public List<String> listarComentariosPorCurso(@PathVariable Long idCurso) {
        return serviceintervaloraciones.listarComentariosPorCurso(idCurso);
    }
}
