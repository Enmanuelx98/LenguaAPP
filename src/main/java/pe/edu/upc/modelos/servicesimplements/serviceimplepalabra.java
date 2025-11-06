package pe.edu.upc.modelos.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.modelos.entiities.Palabras;
import pe.edu.upc.modelos.repositories.PalabraRepository;
import pe.edu.upc.modelos.serviceinterface.serviceinterpalabra;

import java.util.List;

@Service
public class serviceimplepalabra implements serviceinterpalabra {
    @Autowired
    private PalabraRepository palabraRepository;
    @Override
    public void insertarPalabra(Palabras palabras) {
        palabraRepository.save(palabras);
    }

    @Override
    public void eliminarPalabra(Long id) {
        palabraRepository.deleteById(id);
    }

    @Override
    public List<Palabras> listarPalabra() {
        return palabraRepository.findAll();
    }

    @Override
    public void updatePalabra(Palabras palabras) {
        palabraRepository.save(palabras);
    }

    @Override
    public Palabras findByCursoId(Long cursoId) {
        return palabraRepository.findByCursoId(cursoId);
    }
}
