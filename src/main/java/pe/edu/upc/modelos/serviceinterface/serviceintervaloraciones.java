package pe.edu.upc.modelos.serviceinterface;

import pe.edu.upc.modelos.entiities.Valoraciones;

import java.util.List;

public interface serviceintervaloraciones {
    public void insertarValoracion(Valoraciones valoracion);
    public void eliminarValoracion(Long id);
    public List<Valoraciones> listarValoracion();
    public void updateValoracion(Valoraciones valoracion);
    public Double ValoracionesPorTipoLengua(String tipoLengua);
    public Double ValoracionesPorCurso(Long idCurso);
    public List<String> listarComentariosPorCurso(Long idCurso);
}
