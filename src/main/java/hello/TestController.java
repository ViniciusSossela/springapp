package hello;

import hello.data.entity.Usuario;
import hello.domain.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by vsossella on 22/05/17.
 */

@RestController
public class TestController {

    @Autowired
    private UsuarioService usuarioService;

    private final AtomicLong counter = new AtomicLong();
    private static final String template = "Hello, %s!";


    @CrossOrigin
    @RequestMapping("/login")
    public Usuario login(@RequestParam(value = "name", defaultValue = "World") String name) {
        return usuarioService.doLogin("oi", "d22m03");
    }

    @CrossOrigin
    @RequestMapping("/users")
    public List<Usuario> users() {
        return usuarioService.findAll();
    }

    @CrossOrigin
    @RequestMapping("/user")
    public void user() {
        usuarioService.create("oi", "d22m03");

    }


}
