package dominio;

import java.util.Collection;

public class Compartimento {
    private int    id;
    private String codigo;
    private String nome;
    private int    capacidade;
    private Collection<Compartimento> compartimentos;

    public Compartimento() {}
    
    public Compartimento(int id, String codigo, String nome, int capacidade, Collection<Compartimento> compartimentos) {
        this.id = id;
        this.codigo = codigo;
        this.nome = nome;
        this.capacidade = capacidade;
        this.compartimentos = compartimentos;
    }
    
    public Compartimento(String codigo, String nome, int capacidade, Collection<Compartimento> compartimentos) {
        this.codigo = codigo;
        this.nome = nome;
        this.capacidade = capacidade;
        this.compartimentos = compartimentos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

    public Collection<Compartimento> getCompartimentos() {
        return compartimentos;
    }

    public void setCompartimentos(Collection<Compartimento> compartimentos) {
        this.compartimentos = compartimentos;
    }
}
