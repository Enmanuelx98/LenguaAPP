package pe.edu.upc.modelos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.modelos.entiities.Reportes;

@Repository
public interface ReportesRepository extends JpaRepository<Reportes, Long> {
}
