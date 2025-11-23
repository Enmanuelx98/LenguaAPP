package pe.edu.upc.modelos.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.modelos.dtos.ReportesDTO;
import pe.edu.upc.modelos.entiities.Reportes;
import pe.edu.upc.modelos.serviceinterface.serviceinterreportes;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/reporte")
public class controllerReporte {
    @Autowired
    private serviceinterreportes serviceinterreportes;
    //agregar
    @PostMapping("/agregarreporte")
    @PreAuthorize("hasAnyAuthority('ADMIN','ESTUDIANTE','DOCENTE')")
    public void agregarreporte(@RequestBody ReportesDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        Reportes reportes = modelMapper.map(dto, Reportes.class);
        serviceinterreportes.insertarReporte(reportes);

    }

    //modificar
    @PutMapping("/updatereporte")
    @PreAuthorize("hasAnyAuthority('ADMIN','ESTUDIANTE','DOCENTE')")
    public void editarreporte(@RequestBody ReportesDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        Reportes reportes = modelMapper.map(dto, Reportes.class);
        serviceinterreportes.updateReporte(reportes);

    }
    //delete
    @DeleteMapping("/eliminarreporte/{id}")
    @PreAuthorize("hasAnyAuthority('ADMIN','ESTUDIANTE','DOCENTE')")
    public void eliminarreporte(@PathVariable("id") Long id) {
        serviceinterreportes.eliminarReporte(id);
    }

    //Listar
    @GetMapping("/listreporte")
    @PreAuthorize("hasAnyAuthority('ADMIN','ESTUDIANTE','DOCENTE')")
    public List<ReportesDTO> Listreporte() {
        return serviceinterreportes.listarReporte().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ReportesDTO.class);
        }).collect(Collectors.toList());
    }
}
