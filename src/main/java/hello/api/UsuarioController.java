package hello.api;

import hello.data.entity.Usuario;
import hello.domain.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by vsossella on 13/02/18.
 */

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService service;

    @CrossOrigin
    @RequestMapping(name = "/login", method = RequestMethod.POST)
    public Usuario login(@RequestBody Usuario input) {
        return service.doLogin(input.getUsername(), input.getPassword());
    }

    @CrossOrigin
    @RequestMapping("/all")
    public List<Usuario> users() {
        return service.findAll();
    }

    @CrossOrigin
    @RequestMapping("/")
    public void user() {
        service.create("oi", "d22m03");
    }

}
