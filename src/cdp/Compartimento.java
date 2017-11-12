package cdp;

import java.io.Serializable;
import java.util.Collection;
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
    @JoinColumn(name = "mobilia_id")
    private Mobilia mobilia;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "tipo_documento_id", nullable = false)
    @Cascade(CascadeType.SAVE_UPDATE)
    private TipoDocumento tipoDocumento;
    
    @OneToMany(mappedBy = "compartimento", fetch = FetchType.EAGER)
    @OnDelete(action = OnDeleteAction.NO_ACTION)
    @Cascade(CascadeType.SAVE_UPDATE)
    private Collection<Documento> documentos;

    public Compartimento() {}

    public Compartimento(int id, String codigo, String nome, int capacidade, Collection<Compartimento> compartimentos, Mobilia mobilia, TipoDocumento tipoDocumento, Collection<Documento> documentos) {
        this.id = id;
        this.codigo = codigo;
        this.nome = nome;
        this.capacidade = capacidade;
        //this.compartimentos = compartimentos;
        this.mobilia = mobilia;
        this.tipoDocumento = tipoDocumento;
        this.documentos = documentos;
    }

    public Compartimento(String codigo, String nome, int capacidade, Collection<Compartimento> compartimentos, Mobilia mobilia, TipoDocumento tipoDocumento, Collection<Documento> documentos) {
        this.codigo = codigo;
        this.nome = nome;
        this.capacidade = capacidade;
        //this.compartimentos = compartimentos;
        this.mobilia = mobilia;
        this.tipoDocumento = tipoDocumento;
        this.documentos = documentos;
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

//    public Collection<Compartimento> getCompartimentos() {
//        return compartimentos;
//    }

//    public void setCompartimentos(Collection<Compartimento> compartimentos) {
//        this.compartimentos = compartimentos;
//    }

    public Mobilia getMobilia() {
        return mobilia;
    }

    public void setMobilia(Mobilia mobilia) {
        this.mobilia = mobilia;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public Collection<Documento> getDocumentos() {
        return documentos;
    }

    public void setDocumentos(Collection<Documento> documentos) {
        this.documentos = documentos;
    }
    
    public String toString() {
        return nome;
    }
    
    public Object[] toArray() {
        return new Object[] {this, nome, codigo};
    }
}
