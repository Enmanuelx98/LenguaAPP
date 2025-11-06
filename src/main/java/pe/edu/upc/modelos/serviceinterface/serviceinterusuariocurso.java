package pe.edu.upc.modelos.serviceinterface;

import pe.edu.upc.modelos.entiities.Cursos;
import pe.edu.upc.modelos.entiities.UsuarioCurso;

import java.util.List;

public interface serviceinterusuariocurso {
    public void insertarUserCurso(UsuarioCurso usuarioCurso);
    public void eliminarUserCurso(Long id);
    public List<UsuarioCurso> listarUserCurso();
    public void updateUserCurso(UsuarioCurso usuarioCurso);
    public List<UsuarioCurso> findByUser_Id(Long userId);
    public List<Cursos> findCursosHabilitadosByUserId(Long userId, String tipolengua);
    public void CompletoCurso(Long userId, Long cursoId);
    public List<Cursos> findCursosByUserId(Long userId, String tipolengua);

}
