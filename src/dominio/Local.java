package dominio;

import java.util.Collection;

public class Local {
    private int    id;
    private String nome;
    private int    capacidade;
    private String descricao;
    private Collection<Mobilia> mobilias;

    public Local() {}

    public Local(int id, String nome, int capacidade, String descricao, Collection<Mobilia> mobilias) {
        this.id = id;
        this.nome = nome;
        this.capacidade = capacidade;
        this.descricao = descricao;
        this.mobilias = mobilias;
    }

    public Local(String nome, int capacidade, String descricao, Collection<Mobilia> mobilias) {
        this.nome = nome;
        this.capacidade = capacidade;
        this.descricao = descricao;
        this.mobilias = mobilias;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Collection<Mobilia> getMobilias() {
        return mobilias;
    }

    public void setMobilias(Collection<Mobilia> mobilias) {
        this.mobilias = mobilias;
    }
    
}
