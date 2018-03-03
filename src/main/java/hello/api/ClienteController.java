package hello.api;

import hello.data.entity.Cliente;
import hello.domain.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by vsossella on 13/02/18.
 */

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @CrossOrigin
    @RequestMapping(name = "/", method = RequestMethod.POST)
    public Cliente save(@RequestBody Cliente clienteInput) {
        return clienteService.save(clienteInput);
    }

    @CrossOrigin
    @RequestMapping("/all")
    public List<Cliente> findAll() {
        return clienteService.findAll();
    }

    @CrossOrigin
    @RequestMapping("/rota/{rotaId}")
    public List<Cliente> findAllByRota(@PathVariable("rotaId") Long rotaId) {
        return clienteService.findByRota(rotaId);
    }

}
