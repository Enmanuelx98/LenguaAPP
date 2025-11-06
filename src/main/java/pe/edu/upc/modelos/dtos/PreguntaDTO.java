package pe.edu.upc.modelos.dtos;


import pe.edu.upc.modelos.entiities.Cursos;

public class PreguntaDTO {
    private Long id;
    private String pregunta;
    private String respuesta1;
    private String respuesta2;
    private String respuesta3;
    private String respuesta4;
    private String respuestaverdad;
    private Cursos cursos_id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getRespuesta1() {
        return respuesta1;
    }

    public void setRespuesta1(String respuesta1) {
        this.respuesta1 = respuesta1;
    }

    public String getRespuesta2() {
        return respuesta2;
    }

    public void setRespuesta2(String respuesta2) {
        this.respuesta2 = respuesta2;
    }

    public String getRespuesta3() {
        return respuesta3;
    }

    public void setRespuesta3(String respuesta3) {
        this.respuesta3 = respuesta3;
    }

    public String getRespuesta4() {
        return respuesta4;
    }

    public void setRespuesta4(String respuesta4) {
        this.respuesta4 = respuesta4;
    }

    public String getRespuestaverdad() {
        return respuestaverdad;
    }

    public void setRespuestaverdad(String respuestaverdad) {
        this.respuestaverdad = respuestaverdad;
    }

    public Cursos getCursos_id() {
        return cursos_id;
    }

    public void setCursos_id(Cursos cursos_id) {
        this.cursos_id = cursos_id;
    }
}
