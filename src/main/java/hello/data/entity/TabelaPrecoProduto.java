package hello.data.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Created by vsossella on 12/02/18.
 */
public class TabelaPrecoProduto {

    @Id
    @GeneratedValue
    private long id;

    private double preco;

    @ManyToOne
    @JoinColumn(name = "tabela_preco_id")
    private TabelaPreco tabelaPreco;


}
