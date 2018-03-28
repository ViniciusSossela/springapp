package hello.domain.model;


import java.util.Set;

/**
 * Created by vsossella on 03/03/18.
 */
public class ProdutoModel {

    private String nome;
    private long produtoId;
    private Set<TabelaPrecoProdutoModel> tabelaPrecoProduto;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getProdutoId() {
        return produtoId;
    }

    public void setProdutoId(long produtoId) {
        this.produtoId = produtoId;
    }

    public Set<TabelaPrecoProdutoModel> getTabelaPrecoProduto() {
        return tabelaPrecoProduto;
    }

    public void setTabelaPrecoProduto(Set<TabelaPrecoProdutoModel> tabelaPrecoProduto) {
        this.tabelaPrecoProduto = tabelaPrecoProduto;
    }
}
