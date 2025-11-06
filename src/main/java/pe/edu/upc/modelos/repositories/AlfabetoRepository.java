package pe.edu.upc.modelos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.modelos.entiities.Alfabeto;

import java.util.List;

@Repository
public interface AlfabetoRepository extends JpaRepository<Alfabeto, Long> {
    @Query("SELECT a " +
            "FROM Alfabeto a " +
            "WHERE a.tipolengua = :tipolengua")
    public List<Alfabeto> listarAlfabetoTipo(@Param("tipolengua") String tipolengua);
}
