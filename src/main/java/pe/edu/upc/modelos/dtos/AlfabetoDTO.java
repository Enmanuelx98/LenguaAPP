package pe.edu.upc.modelos.dtos;


public class AlfabetoDTO {
    private Long id;
    private String letra;
    private String tipolengua;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public String getTipolengua() {
        return tipolengua;
    }

    public void setTipolengua(String tipolengua) {
        this.tipolengua = tipolengua;
    }
}
