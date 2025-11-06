package pe.edu.upc.modelos.servicesimplements;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.modelos.entiities.Cursos;
import pe.edu.upc.modelos.entiities.UsuarioCurso;
import pe.edu.upc.modelos.repositories.UsuarioCursoRepository;
import pe.edu.upc.modelos.serviceinterface.serviceinterusuariocurso;

import java.util.List;

@Service
public class serviceimpleusuariocurso implements serviceinterusuariocurso {
    @Autowired
    private UsuarioCursoRepository usuarioCursoRepository;
    @Override
    public void insertarUserCurso(UsuarioCurso usuarioCurso) {
        usuarioCursoRepository.save(usuarioCurso);
    }

    @Override
    public void eliminarUserCurso(Long id) {
        usuarioCursoRepository.deleteById(id);
    }

    @Override
    public List<UsuarioCurso> listarUserCurso() {
        return usuarioCursoRepository.findAll();
    }

    @Override
    public void updateUserCurso(UsuarioCurso usuarioCurso) {
        usuarioCursoRepository.save(usuarioCurso);
    }

    @Override
    public List<UsuarioCurso> findByUser_Id(Long userId) {
        return usuarioCursoRepository.findByUser_Id(userId);
    }

    @Override
    public List<Cursos> findCursosHabilitadosByUserId(Long userId, String tipolengua) {
        // Paso 1: Obtener todos los cursos del usuario
        List<UsuarioCurso> listaCursos = usuarioCursoRepository.findByUser_Id(userId);

        for (UsuarioCurso actual : listaCursos) {
            if (actual.isCompletado()) {
                String nombreCursoActual = actual.getCurso().getNombre();
                String tipoActual = actual.getCurso().getTipolengua();

                // Paso 2: Verificar si pertenece al mismo tipo de lengua
                if (tipoActual.equalsIgnoreCase(tipolengua)) {
                    // Paso 3: Verificar si el nombre termina en número (ejemplo: "Saludos 1")
                    if (nombreCursoActual.matches(".*\\d+$")) {
                        int numeroActual = Integer.parseInt(nombreCursoActual.replaceAll("\\D+", ""));
                        String baseNombre = nombreCursoActual.replaceAll("\\d+$", "").trim();
                        String nombreSiguiente = baseNombre + " " + (numeroActual + 1);

                        // Paso 4: Buscar el curso siguiente con el mismo tipo de lengua
                        for (UsuarioCurso posibleSiguiente : listaCursos) {
                            Cursos cursoSiguiente = posibleSiguiente.getCurso();
                            if (cursoSiguiente.getNombre().equalsIgnoreCase(nombreSiguiente)
                                    && cursoSiguiente.getTipolengua().equalsIgnoreCase(tipolengua)) {

                                // Habilitar si aún no lo está
                                if (!posibleSiguiente.isHabilitado()) {
                                    posibleSiguiente.setHabilitado(true);
                                    usuarioCursoRepository.save(posibleSiguiente);
                                }
                            }
                        }
                    }
                }
            }
        }
        // Paso 5: Retornar los cursos habilitados según el tipo de lengua
        return usuarioCursoRepository.findCursosHabilitadosByUserId(userId, tipolengua);
    }

    @Override
    public void CompletoCurso(Long userId, Long cursoId) {
        UsuarioCurso uc = usuarioCursoRepository.findByUserIdAndCursoId(userId, cursoId);
        if (uc != null) {
            uc.setCompletado(true);
            usuarioCursoRepository.save(uc);
        }
    }

    @Override
    public List<Cursos> findCursosByUserId(Long userId, String tipolengua) {
        return usuarioCursoRepository.findCursosByUserId(userId,tipolengua);
    }


}
