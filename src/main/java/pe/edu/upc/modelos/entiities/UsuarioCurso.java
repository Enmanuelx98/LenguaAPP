package pe.edu.upc.modelos.entiities;

import jakarta.persistence.*;

@Entity
public class UsuarioCurso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private Users user;

    @ManyToOne
    @JoinColumn(name = "curso_id", nullable = false)
    private Cursos curso;

    private boolean habilitado;
    private boolean completado;

    public UsuarioCurso(){}

    public UsuarioCurso(Long id, Users user, Cursos curso, boolean habilitado, boolean completado) {
        this.id = id;
        this.user = user;
        this.curso = curso;
        this.habilitado = habilitado;
        this.completado = completado;
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }

    public boolean isCompletado() {
        return completado;
    }

    public void setCompletado(boolean completado) {
        this.completado = completado;
    }

    public Cursos getCurso() {
        return curso;
    }

    public void setCurso(Cursos curso) {
        this.curso = curso;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
