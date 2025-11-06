package pe.edu.upc.modelos.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.modelos.entiities.Alfabeto;
import pe.edu.upc.modelos.repositories.AlfabetoRepository;
import pe.edu.upc.modelos.serviceinterface.serviceinteralfabeto;

import java.util.List;


@Service
public class serviceimplealfabeto implements serviceinteralfabeto {
    @Autowired
    private AlfabetoRepository alfabetoRepository;
    @Override
    public void insertarAlfabeto(Alfabeto alfabeto) {
        alfabetoRepository.save(alfabeto);
    }

    @Override
    public void eliminarAlfabeto(Long id) {
        alfabetoRepository.deleteById(id);
    }

    @Override
    public List<Alfabeto> listarAlfabeto() {
        return alfabetoRepository.findAll();
    }

    @Override
    public void updateAlfabeto(Alfabeto alfabeto) {
        alfabetoRepository.save(alfabeto);
    }

    @Override
    public List<Alfabeto> ListarAlfabetoTipo(String tipolengua) {
        return alfabetoRepository.listarAlfabetoTipo(tipolengua);
    }
}
