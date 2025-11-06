package pe.edu.upc.modelos.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.modelos.entiities.Cursos;
import pe.edu.upc.modelos.repositories.CursosRepository;
import pe.edu.upc.modelos.serviceinterface.serviceintercursos;

import java.util.List;

@Service
public class serviceimplecursos implements serviceintercursos {
    @Autowired
    private CursosRepository cursosRepository;
    @Override
    public void insertarCurso(Cursos cursos) {
        cursosRepository.save(cursos);
    }

    @Override
    public void eliminarCurso(Long id) {
        cursosRepository.deleteById(id);
    }

    @Override
    public List<Cursos> listarCurso() {
        return cursosRepository.findAll();
    }

    @Override
    public void updateCurso(Cursos cursos) {
        cursosRepository.save(cursos);
    }

    @Override
    public Cursos obtenerCursoPorId(Long id) {
        return cursosRepository.findById(id).orElse(null);
    }

    @Override
    public List<Cursos> findByTipoLengua(String tipolengua) {
        return cursosRepository.findByTipoLengua(tipolengua);
    }

}
