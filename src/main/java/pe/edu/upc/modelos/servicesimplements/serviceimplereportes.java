package pe.edu.upc.modelos.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.modelos.entiities.Reportes;
import pe.edu.upc.modelos.repositories.ReportesRepository;
import pe.edu.upc.modelos.serviceinterface.serviceinterreportes;

import java.util.List;

@Service
public class serviceimplereportes implements serviceinterreportes {
    @Autowired
    private ReportesRepository reportesrepository;
    @Override
    public void insertarReporte(Reportes reportes) {
        reportesrepository.save(reportes);
    }

    @Override
    public void eliminarReporte(Long id) {
        reportesrepository.deleteById(id);
    }

    @Override
    public List<Reportes> listarReporte() {
        return reportesrepository.findAll();
    }

    @Override
    public void updateReporte(Reportes reportes) {
        reportesrepository.save(reportes);
    }
}
