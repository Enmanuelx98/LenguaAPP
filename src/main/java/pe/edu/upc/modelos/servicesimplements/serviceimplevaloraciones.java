package pe.edu.upc.modelos.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.modelos.entiities.Valoraciones;
import pe.edu.upc.modelos.repositories.ValoracionesRepository;
import pe.edu.upc.modelos.serviceinterface.serviceintervaloraciones;

import java.util.List;

@Service
public class serviceimplevaloraciones implements serviceintervaloraciones {
    @Autowired
    private ValoracionesRepository valoracionesRepository;
    @Override
    public void insertarValoracion(Valoraciones valoracion) {
        valoracionesRepository.save(valoracion);
    }

    @Override
    public void eliminarValoracion(Long id) {
        valoracionesRepository.deleteById(id);
    }

    @Override
    public List<Valoraciones> listarValoracion() {
        return valoracionesRepository.findAll();
    }

    @Override
    public void updateValoracion(Valoraciones valoracion) {
        valoracionesRepository.save(valoracion);
    }
    @Override
    public Double ValoracionesPorTipoLengua(String tipoLengua) {
        Long suma = valoracionesRepository.sumarValoracionesPorTipoLengua(tipoLengua);
        Long cantidad = valoracionesRepository.contarValoracionesPorTipoLengua(tipoLengua);

        if (cantidad == null || cantidad == 0) {
            return 0.0;
        }
        return (double) suma / cantidad;
    }

    @Override
    public Double ValoracionesPorCurso(Long idCurso) {
        Long suma = valoracionesRepository.sumarValoracionesPorCurso(idCurso);
        Long cantidad = valoracionesRepository.contarValoracionesPorCurso(idCurso);

        if (cantidad == null || cantidad == 0) {
            return 0.0;
        }
        return (double) suma / cantidad;
    }

    @Override
    public List<String> listarComentariosPorCurso(Long idCurso) {
        return valoracionesRepository.listarComentariosPorCurso(idCurso);
    }
}
