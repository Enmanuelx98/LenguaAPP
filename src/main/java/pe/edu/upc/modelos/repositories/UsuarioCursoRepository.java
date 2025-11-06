package pe.edu.upc.modelos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.modelos.entiities.Cursos;
import pe.edu.upc.modelos.entiities.UsuarioCurso;

import java.util.List;

@Repository
public interface UsuarioCursoRepository extends JpaRepository<UsuarioCurso, Long> {
    public List<UsuarioCurso> findByUser_Id(Long userId);
    //Lista los cursos habilitados para cierta lengua para el usuario que inicio sesion
    @Query("SELECT uc.curso FROM UsuarioCurso uc " +
            "WHERE uc.user.id = :userId AND uc.habilitado = true AND uc.curso.tipolengua = :tipolengua")
    public List<Cursos> findCursosHabilitadosByUserId(@Param("userId") Long userId, @Param("tipolengua") String tipolengua);

    //Ubicar el UsuarioCurso
    @Query("SELECT uc FROM UsuarioCurso uc WHERE uc.user.id = :userId AND uc.curso.id = :cursoId")
    public UsuarioCurso findByUserIdAndCursoId(@Param("userId") Long userId, @Param("cursoId") Long cursoId);

    @Query("SELECT uc.curso FROM UsuarioCurso uc " +
            "WHERE uc.user.id = :userId AND uc.curso.tipolengua = :tipolengua")
    public List<Cursos> findCursosByUserId(@Param("userId") Long userId, @Param("tipolengua") String tipolengua);

}
