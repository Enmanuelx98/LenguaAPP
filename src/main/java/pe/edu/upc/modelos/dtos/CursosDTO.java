package pe.edu.upc.modelos.dtos;


public class CursosDTO {
    private Long id;
    private String nombre;
    private String descripcion;
    private String objetivos;
    private String tipolengua;

    public String getTipolengua() {
        return tipolengua;
    }

    public void setTipolengua(String tipolengua) {
        this.tipolengua = tipolengua;
    }

    public String getObjetivos() {
        return objetivos;
    }

    public void setObjetivos(String objetivos) {
        this.objetivos = objetivos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
