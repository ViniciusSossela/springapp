package hello.api;

import hello.data.entity.Rota;
import hello.domain.service.RotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by vsossella on 13/02/18.
 */

@RestController
@RequestMapping("/rota")
public class RotaController {

    @Autowired
    private RotaService service;

    @CrossOrigin
    @RequestMapping(name = "/", method = RequestMethod.POST)
    public Rota save(@RequestBody Rota rotaInput) {
        return service.save(rotaInput);
    }

    @CrossOrigin
    @GetMapping("/all")
    public List<Rota> findAll() {
        return service.findAll();
    }

}
