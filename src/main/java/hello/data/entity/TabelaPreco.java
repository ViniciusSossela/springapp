package hello.data.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by vsossella on 12/02/18.
 */
public class TabelaPreco {

    @Id
    @GeneratedValue
    private long id;

    private String nome;
    private String descricao;



}
