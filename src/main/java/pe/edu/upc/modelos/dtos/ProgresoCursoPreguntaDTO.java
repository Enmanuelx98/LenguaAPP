package pe.edu.upc.modelos.dtos;

import pe.edu.upc.modelos.entiities.Cursos;
import pe.edu.upc.modelos.entiities.Pregunta;
import pe.edu.upc.modelos.entiities.Users;

public class ProgresoCursoPreguntaDTO {
    private Long id;
    private Long puntaje;
    private Boolean completo;
    private Users user;
    private Cursos curso;
    private Pregunta pregunta;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(Long puntaje) {
        this.puntaje = puntaje;
    }

    public Boolean getCompleto() {
        return completo;
    }

    public void setCompleto(Boolean completo) {
        this.completo = completo;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public Cursos getCurso() {
        return curso;
    }

    public void setCurso(Cursos curso) {
        this.curso = curso;
    }

    public Pregunta getPregunta() {
        return pregunta;
    }

    public void setPregunta(Pregunta pregunta) {
        this.pregunta = pregunta;
    }
}
