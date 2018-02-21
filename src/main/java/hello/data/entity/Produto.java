package hello.data.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

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

    @JsonManagedReference
    @OneToMany(mappedBy = "produto", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<TabelaPrecoProduto> tabelaPrecoProduto;

    public Produto() {
    }

    public Produto(long id, String nome, Set<TabelaPrecoProduto> tabelaPrecoProduto) {
        this.id = id;
        this.nome = nome;
        this.tabelaPrecoProduto = tabelaPrecoProduto;
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

    public Set<TabelaPrecoProduto> getTabelaPrecoProduto() {
        return tabelaPrecoProduto;
    }

    public void setTabelaPrecoProduto(Set<TabelaPrecoProduto> tabelaPrecoProduto) {
        this.tabelaPrecoProduto = tabelaPrecoProduto;
    }
}
