package pe.edu.upc.modelos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.modelos.entiities.ProgresoCursoPregunta;

@Repository
public interface ProgresoCursopreguntaRepository extends JpaRepository<ProgresoCursoPregunta, Long> {
}
