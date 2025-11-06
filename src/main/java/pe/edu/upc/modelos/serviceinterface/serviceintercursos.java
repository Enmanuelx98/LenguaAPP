package pe.edu.upc.modelos.serviceinterface;

import org.springframework.data.repository.query.Param;
import pe.edu.upc.modelos.entiities.Cursos;

import java.util.List;

public interface serviceintercursos {
    public void insertarCurso(Cursos cursos);
    public void eliminarCurso(Long id);
    public List<Cursos> listarCurso();
    public void updateCurso(Cursos cursos);
    public Cursos obtenerCursoPorId(Long id);
    public List<Cursos> findByTipoLengua(String tipolengua);

}
