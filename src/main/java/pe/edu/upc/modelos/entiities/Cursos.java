package pe.edu.upc.modelos.entiities;

import jakarta.persistence.*;

@Entity
public class Cursos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 30)
    private String nombre;
    @Column(length = 300)
    private String descripcion;
    @Column(length = 300)
    private String objetivos;
    private String tipolengua;

    public Cursos() {}

    public Cursos(String tipolengua, String objetivos, String descripcion, String nombre, Long id) {
        this.tipolengua = tipolengua;
        this.objetivos = objetivos;
        this.descripcion = descripcion;
        this.nombre = nombre;
        this.id = id;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getObjetivos() {
        return objetivos;
    }

    public void setObjetivos(String objetivos) {
        this.objetivos = objetivos;
    }

    public String getTipolengua() {
        return tipolengua;
    }

    public void setTipolengua(String tipolengua) {
        this.tipolengua = tipolengua;
    }
}
