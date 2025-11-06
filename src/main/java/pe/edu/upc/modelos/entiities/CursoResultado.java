package pe.edu.upc.modelos.entiities;

import jakarta.persistence.*;

@Entity
public class CursoResultado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 30)
    private String tipocurso;
    @Column(length = 30)
    private String nombrecurso;
    private Long puntajetotal;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private Users user;

    public CursoResultado(){}

    public CursoResultado(Long id, String tipocurso, String nombrecurso, Long puntajetotal, Users user) {
        this.id = id;
        this.tipocurso = tipocurso;
        this.nombrecurso = nombrecurso;
        this.puntajetotal = puntajetotal;
        this.user = user;
    }

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
