package hello.domain.service;

import hello.data.entity.Usuario;
import hello.data.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by vsossella on 27/01/18.
 */

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario doLogin(String username, String password) {
        try {
            return usuarioRepository.findByUsernameAndPassword(username, password);
        } catch (Exception e) {
            return null;
        }
    }

    public Usuario create(String username, String password) {
        return usuarioRepository.save(new Usuario(username, password));
    }

}
