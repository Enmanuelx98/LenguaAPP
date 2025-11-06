package pe.edu.upc.modelos.serviceinterface;

import org.springframework.data.repository.query.Param;
import pe.edu.upc.modelos.entiities.Pregunta;

import java.util.List;

public interface serviceinterpregunta {
    public void insertarPregunta(Pregunta pregunta);
    public void eliminarPregunta(Long id);
    public List<Pregunta> listarPregunta();
    public void updatePregunta(Pregunta pregunta);
    public List<Pregunta> findQuestionByCursoId(Long cursoId);
}
