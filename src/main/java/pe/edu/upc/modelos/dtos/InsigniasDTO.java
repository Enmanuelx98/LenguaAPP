package pe.edu.upc.modelos.dtos;

import pe.edu.upc.modelos.entiities.Users;

public class InsigniasDTO {
    private Long id;
    private String nombre;
    private Users user;

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
