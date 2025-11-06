package pe.edu.upc.modelos.serviceinterface;

import pe.edu.upc.modelos.entiities.Alfabeto;

import java.util.List;

public interface serviceinteralfabeto {
    public void insertarAlfabeto(Alfabeto alfabeto);
    public void eliminarAlfabeto(Long id);
    public List<Alfabeto> listarAlfabeto();
    public void updateAlfabeto(Alfabeto alfabeto);
    public List<Alfabeto> ListarAlfabetoTipo(String tipolengua);

}
