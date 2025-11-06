package pe.edu.upc.modelos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.modelos.entiities.Insignias;

import java.util.List;

@Repository
public interface InsigniaRepository extends JpaRepository<Insignias,Long> {
    public List<Insignias> findByUser_Id(Long userId);
    public boolean existsByNombreAndUser_Id(String nombre, Long userId);
}
