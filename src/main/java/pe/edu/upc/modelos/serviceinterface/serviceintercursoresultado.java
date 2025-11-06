package pe.edu.upc.modelos.serviceinterface;

import pe.edu.upc.modelos.entiities.CursoResultado;

import java.util.List;

public interface serviceintercursoresultado {
    public void insertarCursoResultado(CursoResultado cursosresultado);
    public void eliminarCursoResultado(Long id);
    public List<CursoResultado> listarCursoResultado();
    public void updateCursoResultado(CursoResultado cursosresultado);
    public List<CursoResultado> listarPorUsuario(Long userId);
}
