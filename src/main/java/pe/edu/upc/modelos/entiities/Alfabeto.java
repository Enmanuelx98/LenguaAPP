package pe.edu.upc.modelos.entiities;

import jakarta.persistence.*;


@Entity
public class Alfabeto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 30)
    private String letra;
    @Column(length = 30)
    private String tipolengua;

    public Alfabeto(){}

    public Alfabeto(Long id, String letra, String tipolengua) {
        this.id = id;
        this.letra = letra;
        this.tipolengua = tipolengua;
    }

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
