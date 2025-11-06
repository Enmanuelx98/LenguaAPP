package pe.edu.upc.modelos.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.modelos.entiities.Users;
import pe.edu.upc.modelos.repositories.IUserRepository;
import pe.edu.upc.modelos.serviceinterface.serviceinteruser;

import java.util.List;

@Service
public class serviceimpleuser implements serviceinteruser {

    @Autowired
    private IUserRepository userRepository;

    @Override
    public void insertarUsuario(Users users) {
        userRepository.save(users);
    }

    @Override
    public Boolean updateUsuariopass(String email, String password) {
        Users existingUser = userRepository.findOneByEmail(email);
        if (existingUser != null) {
            existingUser.setPassword(password);
            userRepository.save(existingUser);
            return true;
        }
        return false;
    }

    @Override
    public Users findOneByUsername(String username) {
        return userRepository.findOneByUsername(username);
    }

    @Override
    public Users listId(Long id) {
        return userRepository.findById(id).orElse(new Users());
    }

    @Override
    public List<Users> lista() {
        return userRepository.findAll();
    }

    @Override
    public void insRol(String role, Long user_id) {
        userRepository.insRol(role, user_id);
    }
    @Override
    public void updateUsuario(Users users) {
        userRepository.save(users);
    }

    @Override
    public void eliminarUsuario(Long id) {
        userRepository.deleteById(id);
    }

}
