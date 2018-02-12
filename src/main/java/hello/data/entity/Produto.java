package hello.data.entity;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by vsossella on 12/02/18.
 */

@Entity(name = "produto")
public class Produto {

    @Id
    @GeneratedValue
    private long id;

    private String nome;

    @OneToMany(mappedBy = "produto", fetch = FetchType.EAGER)
    private Set<TabelaPrecoProduto> tabelaPrecoProduto;

}
