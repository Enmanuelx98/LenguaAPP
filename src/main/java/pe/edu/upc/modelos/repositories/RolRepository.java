package pe.edu.upc.modelos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.modelos.entiities.Role;


@Repository
public interface RolRepository extends JpaRepository<Role, Long> {
    @Query(value = "SELECT r.rol FROM roles r WHERE r.user_id = :user_id", nativeQuery = true)
    public String findRolByUserId(@Param("user_id") Long user_id);

}
