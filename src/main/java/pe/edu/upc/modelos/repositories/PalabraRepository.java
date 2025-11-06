package pe.edu.upc.modelos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.modelos.entiities.Palabras;

@Repository
public interface PalabraRepository extends JpaRepository<Palabras, Long> {
    @Query("SELECT p FROM Palabras p WHERE p.cursos_id.id = :cursoId")
    public Palabras findByCursoId(@Param("cursoId") Long cursoId);
}
