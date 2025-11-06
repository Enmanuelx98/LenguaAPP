package pe.edu.upc.modelos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.modelos.entiities.Palabras;
import pe.edu.upc.modelos.entiities.Pregunta;

import java.util.List;

@Repository
public interface PreguntaRepository extends JpaRepository<Pregunta, Long> {
    @Query("SELECT p FROM Pregunta p WHERE p.cursos_id.id = :cursoId")
    public List<Pregunta> findQuestionByCursoId(@Param("cursoId") Long cursoId);

}
