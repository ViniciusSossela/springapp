package hello.data.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Created by vsossella on 12/02/18.
 */
public class PedidoProduto {

    @Id
    @GeneratedValue
    private long id;

    @ManyToOne
    @JoinColumn(name = "produto_id")
    private Produto produto;

    private int quantidade;

    private double precoUnitarioAlterado;

}
