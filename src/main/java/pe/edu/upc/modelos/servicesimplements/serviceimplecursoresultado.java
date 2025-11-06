package pe.edu.upc.modelos.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.modelos.entiities.CursoResultado;
import pe.edu.upc.modelos.repositories.CursoResultadoRepository;
import pe.edu.upc.modelos.serviceinterface.serviceintercursoresultado;

import java.util.List;
import java.util.Optional;

@Service
public class serviceimplecursoresultado implements serviceintercursoresultado {
    @Autowired
    private CursoResultadoRepository cursoResultadoRepository;
    @Override
    public void insertarCursoResultado(CursoResultado cursosresultado) {
        // Buscar si ya existe un registro con los mismos datos
        Optional<CursoResultado> existente = cursoResultadoRepository.findByNombrecursoAndTipocursoAndUser(
                cursosresultado.getNombrecurso(),
                cursosresultado.getTipocurso(),
                cursosresultado.getUser()
        );
        // Si existe, eliminarlo
        existente.ifPresent(cursoResultadoRepository::delete);
        // Guardar el nuevo resultado
        cursoResultadoRepository.save(cursosresultado);
    }

    @Override
    public void eliminarCursoResultado(Long id) {
        cursoResultadoRepository.deleteById(id);
    }

    @Override
    public List<CursoResultado> listarCursoResultado() {
        return cursoResultadoRepository.findAll();
    }

    @Override
    public void updateCursoResultado(CursoResultado cursosresultado) {
        cursoResultadoRepository.save(cursosresultado);
    }

    @Override
    public List<CursoResultado> listarPorUsuario(Long userId) {
        return cursoResultadoRepository.findByUser_Id(userId);
    }
}
