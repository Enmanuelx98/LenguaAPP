package pe.edu.upc.modelos.dtos;

import pe.edu.upc.modelos.entiities.Users;

public class ReportesDTO {
    private Long id;
    private String comentario;
    private Users user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
}
