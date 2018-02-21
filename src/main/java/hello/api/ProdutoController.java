package hello.api;

import hello.data.entity.Produto;
import hello.data.entity.TabelaPrecoProduto;
import hello.domain.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by vsossella on 13/02/18.
 */

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    private ProdutoService service;

    @CrossOrigin
    @RequestMapping(name = "/", method = RequestMethod.POST)
    public Produto save(@RequestBody Produto produtoInput) {
        return service.save(produtoInput);
    }
}
