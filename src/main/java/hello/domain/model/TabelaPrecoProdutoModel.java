package hello.domain.model;

import hello.data.entity.TabelaPreco;

/**
 * Created by vsossella on 03/03/18.
 */
public class TabelaPrecoProdutoModel {

    private Double preco;
    private TabelaPrecoModel tabelaPreco;

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public TabelaPrecoModel getTabelaPreco() {
        return tabelaPreco;
    }

    public void setTabelaPreco(TabelaPrecoModel tabelaPreco) {
        this.tabelaPreco = tabelaPreco;
    }
}
