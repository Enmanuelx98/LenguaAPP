package pe.edu.upc.modelos.serviceinterface;

import pe.edu.upc.modelos.entiities.Reportes;

import java.util.List;

public interface serviceinterreportes {
    public void insertarReporte(Reportes reportes);
    public void eliminarReporte(Long id);
    public List<Reportes> listarReporte();
    public void updateReporte(Reportes reportes);
}
