package hello.data.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;

/**
 * Created by vsossella on 12/02/18.
 */

@Entity(name = "tabelaprecoproduto")
public class TabelaPrecoProduto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private double preco;

    @JsonManagedReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tabela_preco_id")
    private TabelaPreco tabelaPreco;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "produto_id")
    private Produto produto;

    public TabelaPrecoProduto() {
    }

    public TabelaPrecoProduto(long id, double preco, TabelaPreco tabelaPreco, Produto produto) {
        this.id = id;
        this.preco = preco;
        this.tabelaPreco = tabelaPreco;
        this.produto = produto;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public TabelaPreco getTabelaPreco() {
        return tabelaPreco;
    }

    public void setTabelaPreco(TabelaPreco tabelaPreco) {
        this.tabelaPreco = tabelaPreco;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
