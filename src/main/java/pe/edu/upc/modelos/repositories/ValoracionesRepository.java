package pe.edu.upc.modelos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.modelos.entiities.Valoraciones;

import java.util.List;

@Repository
public interface ValoracionesRepository extends JpaRepository<Valoraciones, Long> {
    //NUEVO
    @Query("SELECT SUM(v.valoracion) " +
            "FROM Valoraciones v " +
            "JOIN v.cursos_id c " +
            "WHERE c.tipolengua = :tipoLengua")
    public Long sumarValoracionesPorTipoLengua(@Param("tipoLengua") String tipoLengua);

    @Query("SELECT SUM(v.valoracion) " +
            "FROM Valoraciones v " +
            "WHERE v.cursos_id.id = :idCurso")
    public Long sumarValoracionesPorCurso(@Param("idCurso") Long idCurso);

    @Query("SELECT count(v.valoracion) " +
            "FROM Valoraciones v " +
            "JOIN v.cursos_id c " +
            "WHERE c.tipolengua = :tipoLengua")
    public Long contarValoracionesPorTipoLengua(@Param("tipoLengua") String tipoLengua);

    @Query("SELECT count(v.valoracion) " +
            "FROM Valoraciones v " +
            "WHERE v.cursos_id.id = :idCurso")
    public Long contarValoracionesPorCurso(@Param("idCurso") Long idCurso);

    @Query("SELECT v.comentario " +
            "FROM Valoraciones v " +
            "WHERE v.cursos_id.id = :idCurso")
    public List<String> listarComentariosPorCurso(@Param("idCurso") Long idCurso);
}
