package hello.data.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

/**
 * Created by vsossella on 12/02/18.
 */

@Entity(name = "pedido")
public class Pedido {

    @Id
    @GeneratedValue
    private long id;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @OneToMany(mappedBy = "pedido", fetch = FetchType.EAGER)
    private Set<PedidoProduto> produtos;

    private Date dataPedido;

    public Pedido() {
    }

    public Pedido(long id, Cliente cliente, Set<PedidoProduto> produtos, Date dataPedido) {
        this.id = id;
        this.cliente = cliente;
        this.produtos = produtos;
        this.dataPedido = dataPedido;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Set<PedidoProduto> getProdutos() {
        return produtos;
    }

    public void setProdutos(Set<PedidoProduto> produtos) {
        this.produtos = produtos;
    }

    public Date getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }
}
