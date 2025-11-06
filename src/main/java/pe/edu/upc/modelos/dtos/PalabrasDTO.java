package pe.edu.upc.modelos.dtos;

import pe.edu.upc.modelos.entiities.Cursos;

public class PalabrasDTO {
    private Long id;
    private String palabra1;
    private String palabra2;
    private String palabra3;
    private String palabra4;
    private Cursos cursos_id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPalabra1() {
        return palabra1;
    }

    public void setPalabra1(String palabra1) {
        this.palabra1 = palabra1;
    }

    public String getPalabra2() {
        return palabra2;
    }

    public void setPalabra2(String palabra2) {
        this.palabra2 = palabra2;
    }

    public String getPalabra3() {
        return palabra3;
    }

    public void setPalabra3(String palabra3) {
        this.palabra3 = palabra3;
    }

    public String getPalabra4() {
        return palabra4;
    }

    public void setPalabra4(String palabra4) {
        this.palabra4 = palabra4;
    }

    public Cursos getCursos_id() {
        return cursos_id;
    }

    public void setCursos_id(Cursos cursos_id) {
        this.cursos_id = cursos_id;
    }
}
