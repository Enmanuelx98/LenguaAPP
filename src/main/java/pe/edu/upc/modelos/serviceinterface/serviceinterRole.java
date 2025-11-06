package pe.edu.upc.modelos.serviceinterface;

import pe.edu.upc.modelos.entiities.Role;

import java.util.List;

public interface serviceinterRole {
    public void insertarRol(Role role);
    public void eliminarRol(Long id);
    public List<Role> listarRol();
    public void updateRol(Role role);
    public String findRolByUserId(Long user_id);}
