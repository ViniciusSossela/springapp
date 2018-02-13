package hello.api;

import hello.data.entity.TabelaPreco;
import hello.domain.service.TabelaPrecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by vsossella on 13/02/18.
 */

@RestController
@RequestMapping("/tabelapreco")
public class TabelaPrecoController {

    @Autowired
    private TabelaPrecoService service;

    @CrossOrigin
    @RequestMapping(name = "/", method = RequestMethod.POST)
    public TabelaPreco save(@RequestBody TabelaPreco tabelaPrecoInput) {
        return service.save(tabelaPrecoInput);
    }
}
