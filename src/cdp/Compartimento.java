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
@Table(name = "compartimento")
public class Compartimento implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(nullable = false)
    private String codigo;
    
    @Column(nullable = false)
    private String nome;
    
    @Column(nullable = false)
    private int capacidade;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @OnDelete(action = OnDeleteAction.NO_ACTION)
    @JoinColumn(name = "mobilia_id")
    private Mobilia mobilia;
    
    @OneToMany(mappedBy = "compartimento", fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.NO_ACTION)
    @Cascade(CascadeType.SAVE_UPDATE)
    private Collection<Documento> documentos;

    public Compartimento() {}

    public Compartimento(int id, String codigo, String nome, int capacidade, Collection<Compartimento> compartimentos, Mobilia mobilia, Collection<Documento> documentos) {
        this.id = id;
        this.codigo = codigo;
        this.nome = nome;
        this.capacidade = capacidade;
        this.mobilia = mobilia;
        this.documentos = documentos;
    }

    public Compartimento(String codigo, String nome, int capacidade, Collection<Compartimento> compartimentos, Mobilia mobilia, Collection<Documento> documentos) {
        this.codigo = codigo;
        this.nome = nome;
        this.capacidade = capacidade;
        this.mobilia = mobilia;
        this.documentos = documentos;
    }

    public Compartimento(String codigo, String nome, int capacidade, Mobilia mobilia) {
        this.codigo = codigo;
        this.nome = nome;
        this.capacidade = capacidade;
        this.mobilia = mobilia;
    }

    public Compartimento(int antigoId, String identificador, String nome, int capacidade, Mobilia mobilia) {
        this.id = antigoId;
        this.codigo = identificador;
        this.nome = nome;
        this.capacidade = capacidade;
        this.mobilia = mobilia;
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

    public Mobilia getMobilia() {
        return mobilia;
    }

    public void setMobilia(Mobilia mobilia) {
        this.mobilia = mobilia;
    }

    public Collection<Documento> getDocumentos() {
        return documentos;
    }

    public void setDocumentos(Collection<Documento> documentos) {
        this.documentos = documentos;
    }

    @Override
    public String toString() {
        return nome;
    }
    
    public static Object[] toArray(Compartimento cmp){
        return new Object[]{cmp.getNome(), cmp.getCodigo(), cmp.getCapacidade()
                , cmp.getMobilia().getCompartimentos(), cmp.getId()};
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
        final Compartimento other = (Compartimento) obj;
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
    
    public Object[] toArray() {
        return new Object[] {this, nome, codigo};
    }
}
