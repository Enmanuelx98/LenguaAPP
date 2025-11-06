package pe.edu.upc.modelos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.modelos.entiities.CursoResultado;
import pe.edu.upc.modelos.entiities.Users;

import java.util.List;
import java.util.Optional;

@Repository
public interface CursoResultadoRepository extends JpaRepository<CursoResultado,Long> {
    Optional<CursoResultado> findByNombrecursoAndTipocursoAndUser(String nombrecurso, String tipocurso, Users user);
    public List<CursoResultado> findByUser_Id(Long userId);
}
