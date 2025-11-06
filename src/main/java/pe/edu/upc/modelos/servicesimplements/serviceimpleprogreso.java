package pe.edu.upc.modelos.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.modelos.entiities.ProgresoCursoPregunta;
import pe.edu.upc.modelos.repositories.ProgresoCursopreguntaRepository;
import pe.edu.upc.modelos.serviceinterface.serviceinterprogreso;

import java.util.List;

@Service
public class serviceimpleprogreso implements serviceinterprogreso {
    @Autowired
    private ProgresoCursopreguntaRepository progresoCursopreguntaRepository;
    @Override
    public void insertarProgreso(ProgresoCursoPregunta progresoCursoPregunta) {
        progresoCursopreguntaRepository.save(progresoCursoPregunta);
    }

    @Override
    public void eliminarProgreso(Long id) {
        progresoCursopreguntaRepository.deleteById(id);
    }

    @Override
    public List<ProgresoCursoPregunta> listarProgreso() {
        return progresoCursopreguntaRepository.findAll();
    }

    @Override
    public void updateProgreso(ProgresoCursoPregunta progresoCursoPregunta) {
        progresoCursopreguntaRepository.save(progresoCursoPregunta);
    }
}
