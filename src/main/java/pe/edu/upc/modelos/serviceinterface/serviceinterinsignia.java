package pe.edu.upc.modelos.serviceinterface;

import pe.edu.upc.modelos.entiities.Insignias;

import java.util.List;

public interface serviceinterinsignia {
    public void insertarInsignia(Insignias insignia);
    public void eliminarInsignia(Long id);
    public List<Insignias> listarInsignia();
    public void updateInsignia(Insignias insignia);
    public List<Insignias> listarPorUsuario(Long userId);
}
