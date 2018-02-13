package hello.data.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by vsossella on 12/02/18.
 */

@Entity(name = "tabelapreco")
public class TabelaPreco {

    @Id
    @GeneratedValue
    private long id;

    private String nome;
    private String descricao;

    public TabelaPreco() {
    }

    public TabelaPreco(long id, String nome, String descricao) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
