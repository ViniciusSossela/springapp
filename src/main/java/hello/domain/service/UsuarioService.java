package hello.domain.service;

import hello.data.entity.Usuario;
import hello.data.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vsossella on 27/01/18.
 */

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario doLogin(String username, String password) {
        try {
            return usuarioRepository.findByUsername(username);
        } catch (Exception e) {
            return new Usuario("vazio", "vazio");
        }
    }

    public List<Usuario> findAll() {
        try {
            List<Usuario> usuarios = new ArrayList<>();
            usuarioRepository.findAll().forEach(usuarios::add);
            return usuarios;
        } catch (Exception e) {
            List<Usuario> usuarios = new ArrayList<>();
            usuarios.add(new Usuario(e.getMessage(), ""));
            return usuarios;
        }
    }

    public Usuario create(String username, String password) {
        return usuarioRepository.save(new Usuario(username, password));
    }

}
