package pe.edu.upc.modelos.serviceinterface;

import pe.edu.upc.modelos.entiities.ProgresoCursoPregunta;

import java.util.List;

public interface serviceinterprogreso {
    public void insertarProgreso(ProgresoCursoPregunta progresoCursoPregunta);
    public void eliminarProgreso(Long id);
    public List<ProgresoCursoPregunta> listarProgreso();
    public void updateProgreso(ProgresoCursoPregunta progresoCursoPregunta);
}
