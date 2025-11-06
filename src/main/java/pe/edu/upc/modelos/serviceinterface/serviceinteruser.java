package pe.edu.upc.modelos.serviceinterface;

import pe.edu.upc.modelos.entiities.Users;

import java.util.List;

public interface serviceinteruser {
    public void insertarUsuario(Users users);
    public void updateUsuario(Users users);
    public void eliminarUsuario(Long id);
    public Boolean updateUsuariopass(String email, String password);
    public Users findOneByUsername(String username);
    public Users listId(Long id);
    public List<Users> lista();
    public void insRol(String role, Long user_id);
}
