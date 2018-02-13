package hello.data.entity;

import javax.persistence.*;

/**
 * Created by vsossella on 12/02/18.
 */

@Entity(name = "pedidoproduto")
public class PedidoProduto {

    @Id
    @GeneratedValue
    private long id;

    @ManyToOne
    @JoinColumn(name = "produto_id")
    private Produto produto;

    @ManyToOne
    @JoinColumn(name = "pedido_id")
    private Pedido pedido;

    private int quantidade;

    private double precoUnitarioAlterado;

    public PedidoProduto() {
    }

    public PedidoProduto(long id, Produto produto, Pedido pedido, int quantidade, double precoUnitarioAlterado) {
        this.id = id;
        this.produto = produto;
        this.pedido = pedido;
        this.quantidade = quantidade;
        this.precoUnitarioAlterado = precoUnitarioAlterado;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoUnitarioAlterado() {
        return precoUnitarioAlterado;
    }

    public void setPrecoUnitarioAlterado(double precoUnitarioAlterado) {
        this.precoUnitarioAlterado = precoUnitarioAlterado;
    }
}
