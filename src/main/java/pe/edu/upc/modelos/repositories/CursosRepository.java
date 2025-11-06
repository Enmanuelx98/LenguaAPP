package pe.edu.upc.modelos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.modelos.entiities.Cursos;

import java.util.List;
import java.util.Optional;

@Repository
public interface CursosRepository extends JpaRepository<Cursos, Long> {
    // Buscar un curso por su ID
    Optional<Cursos> findById(Long id);
    @Query("SELECT c FROM Cursos c WHERE c.tipolengua = :tipolengua")
    public List<Cursos> findByTipoLengua(@Param("tipolengua") String tipolengua);

}
