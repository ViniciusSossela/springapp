package hello.domain.service;

import hello.data.entity.Produto;
import hello.data.entity.TabelaPrecoProduto;
import hello.data.repository.ProdutoRepository;
import hello.data.repository.TabelaPrecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by vsossella on 13/02/18.
 */

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    private TabelaPrecoRepository tabelaPrecoRepository;

    public Produto save(Produto produtoInput) {

        Produto produtoNovo = new Produto();
        produtoNovo.setNome(produtoInput.getNome());
        produtoNovo.setTabelaPrecoProduto(new HashSet<>());


        produtoInput.getTabelaPrecoProduto().forEach(tabelaPrecoProduto ->
                {
                    TabelaPrecoProduto tabelaPrecoProdutoNova = new TabelaPrecoProduto();
                    tabelaPrecoProdutoNova.setPreco(tabelaPrecoProduto.getPreco());
                    tabelaPrecoProdutoNova.setTabelaPreco(tabelaPrecoRepository.findOne(
                            tabelaPrecoProduto.getTabelaPreco().getId()));
                    tabelaPrecoProdutoNova.setProduto(produtoNovo);

                    produtoNovo.getTabelaPrecoProduto().add(tabelaPrecoProdutoNova);
                }
        );

        return produtoRepository.save(produtoNovo);
    }


}
