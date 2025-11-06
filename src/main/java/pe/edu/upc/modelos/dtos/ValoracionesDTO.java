package pe.edu.upc.modelos.dtos;


import pe.edu.upc.modelos.entiities.Cursos;
import pe.edu.upc.modelos.entiities.Users;

public class ValoracionesDTO {
    private Long id;
    private Long valoracion;
    private String comentario;
    private Cursos cursos_id;
    private Users user_id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getValoracion() {
        return valoracion;
    }

    public void setValoracion(Long valoracion) {
        this.valoracion = valoracion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Cursos getCursos_id() {
        return cursos_id;
    }

    public void setCursos_id(Cursos cursos_id) {
        this.cursos_id = cursos_id;
    }

    public Users getUser_id() {
        return user_id;
    }

    public void setUser_id(Users user_id) {
        this.user_id = user_id;
    }
}
