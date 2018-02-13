package hello.api;

import hello.data.entity.Cliente;
import hello.domain.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by vsossella on 13/02/18.
 */

@RestController
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @CrossOrigin
    @RequestMapping(name = "/cliente", method = RequestMethod.POST)
    public Cliente save(@RequestBody Cliente clienteInput) {
        return clienteService.save(clienteInput);
    }

}
