package pe.edu.upc.modelos.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.modelos.entiities.Pregunta;
import pe.edu.upc.modelos.repositories.PreguntaRepository;
import pe.edu.upc.modelos.serviceinterface.serviceinterpregunta;

import java.util.List;

@Service
public class serviceimplepregunta implements serviceinterpregunta {
    @Autowired
    private PreguntaRepository preguntaRepository;
    @Override
    public void insertarPregunta(Pregunta pregunta) {
        preguntaRepository.save(pregunta);
    }

    @Override
    public void eliminarPregunta(Long id) {
        preguntaRepository.deleteById(id);
    }

    @Override
    public List<Pregunta> listarPregunta() {
        return preguntaRepository.findAll();
    }

    @Override
    public void updatePregunta(Pregunta pregunta) {
        preguntaRepository.save(pregunta);
    }

    @Override
    public List<Pregunta> findQuestionByCursoId(Long cursoId) {
        return preguntaRepository.findQuestionByCursoId(cursoId);
    }
}
