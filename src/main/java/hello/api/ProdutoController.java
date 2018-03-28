package hello.api;

import hello.data.entity.Produto;
import hello.data.entity.TabelaPrecoProduto;
import hello.domain.model.ProdutoModel;
import hello.domain.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public Produto save(@RequestBody ProdutoModel produtoInput) {
        return service.save(produtoInput);
    }

    @CrossOrigin
    @GetMapping("/all")
    public List<Produto> findAll() {
        return service.findAll();
    }

    @CrossOrigin
    @GetMapping("/{produtoId}/tabelapreco")
    public List<TabelaPrecoProduto> findAllTabelaPreco(@PathVariable("produtoId") Long produtoId) {
        return service.findTabelaPrecoByProdutoId(produtoId);
    }
}
