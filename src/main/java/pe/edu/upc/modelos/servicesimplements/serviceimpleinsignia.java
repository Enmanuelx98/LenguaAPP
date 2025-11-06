package pe.edu.upc.modelos.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.modelos.entiities.Insignias;
import pe.edu.upc.modelos.repositories.InsigniaRepository;
import pe.edu.upc.modelos.serviceinterface.serviceinterinsignia;

import java.util.List;

@Service
public class serviceimpleinsignia implements serviceinterinsignia {
    @Autowired
    private InsigniaRepository insigniaRepository;
    @Override
    public void insertarInsignia(Insignias insignia) {

        boolean existe = insigniaRepository.existsByNombreAndUser_Id(insignia.getNombre(), insignia.getUser().getId());

        if (!existe) {
            insigniaRepository.save(insignia);
        }
    }

    @Override
    public void eliminarInsignia(Long id) {
        insigniaRepository.deleteById(id);
    }

    @Override
    public List<Insignias> listarInsignia() {
        return insigniaRepository.findAll();
    }

    @Override
    public void updateInsignia(Insignias insignia) {
        insigniaRepository.save(insignia);
    }

    @Override
    public List<Insignias> listarPorUsuario(Long userId) {
        return insigniaRepository.findByUser_Id(userId);
    }
}
