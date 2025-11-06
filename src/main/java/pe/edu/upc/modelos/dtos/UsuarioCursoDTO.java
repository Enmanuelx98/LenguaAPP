package pe.edu.upc.modelos.dtos;

import pe.edu.upc.modelos.entiities.Cursos;
import pe.edu.upc.modelos.entiities.Users;

public class UsuarioCursoDTO {
    private Long id;
    private Users user;
    private Cursos curso;
    private boolean habilitado;
    private boolean completado;

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public boolean isCompletado() {
        return completado;
    }

    public void setCompletado(boolean completado) {
        this.completado = completado;
    }
}
