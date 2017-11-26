package cdp;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.*;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.hibernate.proxy.HibernateProxy;

@Entity
@Table(name = "local")
public class Local implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Access(AccessType.PROPERTY)
    private int id;
    
    @Column(nullable = false)
    private String nome;
    
    @Column(nullable = false)
    private int capacidade;
    
    @Column(nullable = false)
    private String descricao;
    
    @OneToMany(mappedBy = "local", fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.NO_ACTION)
    @Cascade(CascadeType.SAVE_UPDATE)
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

//    public int getId() {
//        return id;
//    }
    
    public final int getId() {
        if (this instanceof HibernateProxy)
            return (int)((HibernateProxy)this).getHibernateLazyInitializer().getIdentifier();
        else
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
        final Local other = (Local) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
}
