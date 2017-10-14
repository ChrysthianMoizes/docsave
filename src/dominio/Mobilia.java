package dominio;

import java.util.Collection;

public class Mobilia {
    private int    id;
    private String codigo;
    private String nome;
    private int    capacidade;
    private Local  local;
    private Collection<Compartimento> compartimentos;

    public Mobilia() {}

    public Mobilia(int id, String codigo, String nome, int capacidade, Local local, Collection<Compartimento> compartimentos) {
        this.id = id;
        this.codigo = codigo;
        this.nome = nome;
        this.capacidade = capacidade;
        this.local = local;
        this.compartimentos = compartimentos;
    }

    public Mobilia(String codigo, String nome, int capacidade, Local local, Collection<Compartimento> compartimentos) {
        this.codigo = codigo;
        this.nome = nome;
        this.capacidade = capacidade;
        this.local = local;
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

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Collection<Compartimento> getCompartimentos() {
        return compartimentos;
    }

    public void setCompartimentos(Collection<Compartimento> compartimentos) {
        this.compartimentos = compartimentos;
    }
    
}
