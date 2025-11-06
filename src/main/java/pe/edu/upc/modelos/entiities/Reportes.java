package pe.edu.upc.modelos.entiities;

import jakarta.persistence.*;

@Entity
public class Reportes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String comentario;
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private Users user;

    public Reportes(){}

    public Reportes(Long id, String comentario, Users user) {
        this.id = id;
        this.comentario = comentario;
        this.user = user;
    }

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
