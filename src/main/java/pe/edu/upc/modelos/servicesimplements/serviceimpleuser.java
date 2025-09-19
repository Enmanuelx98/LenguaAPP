package pe.edu.upc.modelos.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.modelos.entiities.Users;
import pe.edu.upc.modelos.repositories.IUserRepository;
import pe.edu.upc.modelos.serviceinterface.serviceintrefaceuser;

import java.util.List;

@Service
public class serviceimpleuser implements serviceintrefaceuser {

    @Autowired
    private IUserRepository userRepository;
    @Override
    public List<Users> lista() {
        return userRepository.findAll();
    }
}
