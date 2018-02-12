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

    private Cliente cliente;

    @OneToMany(mappedBy = "pedido", fetch = FetchType.EAGER)
    private Set<PedidoProduto> produtos;

    private Date dataPedido;

}
