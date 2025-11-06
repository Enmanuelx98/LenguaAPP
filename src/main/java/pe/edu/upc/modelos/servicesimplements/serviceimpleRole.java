package pe.edu.upc.modelos.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.modelos.entiities.Role;
import pe.edu.upc.modelos.entiities.Users;
import pe.edu.upc.modelos.repositories.RolRepository;
import pe.edu.upc.modelos.serviceinterface.serviceinterRole;

import java.util.List;

@Service
public class serviceimpleRole implements serviceinterRole {
    @Autowired
    private RolRepository rolRepository;
    @Override
    public void insertarRol(Role role) {
        rolRepository.save(role);
    }

    @Override
    public void eliminarRol(Long id) {
        rolRepository.deleteById(id);
    }

    @Override
    public List<Role> listarRol() {
        return rolRepository.findAll();
    }
    @Override
    public void updateRol(Role role) {
        rolRepository.save(role);
    }

    @Override
    public String findRolByUserId(Long user_id) {
        return rolRepository.findRolByUserId(user_id);
    }


}
