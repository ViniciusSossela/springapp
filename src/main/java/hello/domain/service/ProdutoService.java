package hello.domain.service;

import hello.data.entity.Produto;
import hello.data.entity.TabelaPrecoProduto;
import hello.data.repository.ProdutoRepository;
import hello.data.repository.TabelaPrecoProdutoRepository;
import hello.domain.model.ProdutoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by vsossella on 13/02/18.
 */

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    private TabelaPrecoProdutoRepository tabelaPrecoProdutoRepository;

    public Produto save(ProdutoModel produtoModel) {
        Produto produtoNovo = new Produto();

        if (produtoModel.getProdutoId() == 0) {

            produtoNovo.setNome(produtoModel.getNome());

            Produto produtoCreated = produtoRepository.save(produtoNovo);
            produtoModel.getTabelaPrecoProduto().forEach(tabelaPrecoProduto ->
                    {
                        TabelaPrecoProduto tabelaPrecoProdutoNova = new TabelaPrecoProduto();
                        tabelaPrecoProdutoNova.setPreco(tabelaPrecoProduto.getPreco());
                        tabelaPrecoProdutoNova.setTabelaPrecoId(tabelaPrecoProduto.getTabelaPreco().getId());
                        tabelaPrecoProdutoNova.setProdutoId(produtoCreated.getId());
                        tabelaPrecoProdutoRepository.save(tabelaPrecoProdutoNova);
                    }
            );
            return produtoCreated;
        } else {
//            List<TabelaPrecoProduto> tabelaPrecoProdutosFromDb =
//                    findTabelaPrecoByProdutoId(produtoModel.getProdutoId());

            deleteTabelaPrecoByProduto(produtoModel.getProdutoId());

            produtoModel.getTabelaPrecoProduto().forEach(tabelaPrecoProdutoChanged -> {

                TabelaPrecoProduto tabelaPrecoProdutoNova = new TabelaPrecoProduto();
                tabelaPrecoProdutoNova.setPreco(tabelaPrecoProdutoChanged.getPreco());
                tabelaPrecoProdutoNova.setTabelaPrecoId(tabelaPrecoProdutoChanged.getTabelaPreco().getId());
                tabelaPrecoProdutoNova.setProdutoId(produtoModel.getProdutoId());
                tabelaPrecoProdutoRepository.save(tabelaPrecoProdutoNova);

            });
        }
        return produtoNovo;
    }

    public List<Produto> findAll() {
        List<Produto> produtos = new ArrayList<>();
        produtoRepository.findAll().forEach(produtos::add);
        return produtos;
    }

    public void deleteTabelaPrecoByProduto(long produtoId) {
        List<TabelaPrecoProduto> tabelaPrecoProdutosFromDb =
                findTabelaPrecoByProdutoId(produtoId);
        tabelaPrecoProdutoRepository.delete(tabelaPrecoProdutosFromDb);
    }

    public List<TabelaPrecoProduto> findTabelaPrecoByProdutoId(long produtoId) {
        List<TabelaPrecoProduto> tabelaPrecoProdutos = new ArrayList<>();

        tabelaPrecoProdutoRepository
                .findAll()
                .forEach(tabelaPrecoProdutos::add);

        return tabelaPrecoProdutos
                .stream()
                .filter(tpp -> tpp.getProdutoId() == produtoId)
                .collect(Collectors.toList());
    }

}
