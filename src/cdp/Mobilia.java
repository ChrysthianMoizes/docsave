package cdp;

import java.io.Serializable;
import java.util.Collection;
import java.util.Objects;
import javax.persistence.*;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "mobilia")
public class Mobilia implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(nullable = false)
    private String codigo;
    
    @Column(nullable = false)
    private String nome;
    
    @Column(nullable = false)
    private int capacidade;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "local_id", nullable = false)
    private Local local;
    @OneToMany(mappedBy = "mobilia", fetch = FetchType.LAZY, orphanRemoval = true)
    @OnDelete(action = OnDeleteAction.NO_ACTION)
    @Cascade(CascadeType.ALL)
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

    @Override
    public String toString() {
        return nome;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Mobilia other = (Mobilia) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.capacidade != other.capacidade) {
            return false;
        }
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }

}
