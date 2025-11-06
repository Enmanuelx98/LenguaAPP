package pe.edu.upc.modelos.entiities;

import jakarta.persistence.*;

@Entity
public class Insignias {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 30)
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private Users user;

    public Insignias(){}

    public Insignias(Long id, String nombre, Users user) {
        this.id = id;
        this.nombre = nombre;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
}
