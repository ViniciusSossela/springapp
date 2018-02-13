package hello.data.entity;

import javax.persistence.*;

/**
 * Created by vsossella on 12/02/18.
 */

@Entity(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue
    private long id;

    private String nome;
    private String estado;
    private String cidade;
    private String endereco;
    private String email;
    private String cpfcnpj;

    @ManyToOne
    @JoinColumn(name = "rota_id")
    private Rota rota;

    @ManyToOne
    @JoinColumn(name = "tabela_preco_id")
    private TabelaPreco tabelaPreco;

    public Cliente() {
    }

    public Cliente(long id, String nome, String estado, String cidade, String endereco, String email, String cpfcnpj, Rota rota, TabelaPreco tabelaPreco) {
        this.id = id;
        this.nome = nome;
        this.estado = estado;
        this.cidade = cidade;
        this.endereco = endereco;
        this.email = email;
        this.cpfcnpj = cpfcnpj;
        this.rota = rota;
        this.tabelaPreco = tabelaPreco;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Rota getRota() {
        return rota;
    }

    public void setRota(Rota rota) {
        this.rota = rota;
    }

    public TabelaPreco getTabelaPreco() {
        return tabelaPreco;
    }

    public void setTabelaPreco(TabelaPreco tabelaPreco) {
        this.tabelaPreco = tabelaPreco;
    }

    public String getCpfcnpj() {
        return cpfcnpj;
    }

    public void setCpfcnpj(String cpfcnpj) {
        this.cpfcnpj = cpfcnpj;
    }
}

