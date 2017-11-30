package cdp;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.*;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name = "documento")
public class Documento implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(nullable = false)
    private String nome;
    
    @Column(nullable = false, unique = true)
    private String codigo;
    
    @Column(nullable = true, columnDefinition = "BLOB")
    @Lob
    private byte[] scan;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "tipo_documento_id", nullable = false)
    @Cascade(CascadeType.SAVE_UPDATE)
    private TipoDocumento tipoDocumento;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "compartimento_id", nullable = false)
    @Cascade(CascadeType.SAVE_UPDATE)
    private Compartimento compartimento;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "referenciado_id", nullable = false)
    @Cascade(CascadeType.SAVE_UPDATE)
    private Referenciado referenciado;

    public Documento() {}

    public Documento(int id, String nome, String codigo, byte[] scan, TipoDocumento tipoDocumento, Compartimento compartimento, Referenciado referenciado) {
        this.id = id;
        this.nome = nome;
        this.codigo = codigo;
        this.scan = scan;
        this.tipoDocumento = tipoDocumento;
        this.compartimento = compartimento;
        this.referenciado = referenciado;
    }

    public Documento(String nome, String codigo, byte[] scan, TipoDocumento tipoDocumento, Compartimento compartimento, Referenciado referenciado) {
        this.nome = nome;
        this.codigo = codigo;
        this.scan = scan;
        this.tipoDocumento = tipoDocumento;
        this.compartimento = compartimento;
        this.referenciado = referenciado;
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

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public byte[] getScan() {
        return scan;
    }

    public void setScan(byte[] scan) {
        this.scan = scan;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public Compartimento getCompartimento() {
        return compartimento;
    }

    public void setCompartimento(Compartimento compartimento) {
        this.compartimento = compartimento;
    }

    public Referenciado getReferenciado() {
        return referenciado;
    }

    public void setReferenciado(Referenciado referenciado) {
        this.referenciado = referenciado;
    }

    @Override
    public String toString() {
        return codigo;
    }
    
    

}
