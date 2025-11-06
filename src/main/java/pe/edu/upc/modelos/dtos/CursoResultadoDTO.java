package pe.edu.upc.modelos.dtos;

import pe.edu.upc.modelos.entiities.Users;

public class CursoResultadoDTO {
    private Long id;
    private String tipocurso;
    private String nombrecurso;
    private Long puntajetotal;
    private Users user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipocurso() {
        return tipocurso;
    }

    public void setTipocurso(String tipocurso) {
        this.tipocurso = tipocurso;
    }

    public String getNombrecurso() {
        return nombrecurso;
    }

    public void setNombrecurso(String nombrecurso) {
        this.nombrecurso = nombrecurso;
    }

    public Long getPuntajetotal() {
        return puntajetotal;
    }

    public void setPuntajetotal(Long puntajetotal) {
        this.puntajetotal = puntajetotal;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
}
