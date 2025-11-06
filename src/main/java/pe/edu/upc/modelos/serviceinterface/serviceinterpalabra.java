package pe.edu.upc.modelos.serviceinterface;

import pe.edu.upc.modelos.entiities.Palabras;

import java.util.List;

public interface serviceinterpalabra {
    public void insertarPalabra(Palabras palabras);
    public void eliminarPalabra(Long id);
    public List<Palabras> listarPalabra();
    public void updatePalabra(Palabras palabras);
    public Palabras findByCursoId(Long cursoId);
}
