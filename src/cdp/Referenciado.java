package cdp;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Referenciado extends Pessoa implements Serializable {
    
    @Column(nullable = false, unique = true)
    private String cpf;
    
    @Column(nullable = true)
    private int    referente;
    
    @OneToMany(mappedBy = "referenciado", fetch = FetchType.EAGER)
    @OnDelete(action = OnDeleteAction.NO_ACTION)
    @Cascade(CascadeType.SAVE_UPDATE)
    private Collection<Documento> documentos;

    public Referenciado() {}

    public Referenciado(int id, String nome, String cpf, int referente) {
        super(id, nome);
        this.cpf = cpf;
        this.referente = referente;
    }

    public Referenciado(String nome, String cpf, int referente) {
        super(nome);
        this.cpf = cpf;
        this.referente = referente;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getReferente() {
        return referente;
    }

    public void setReferente(int referente) {
        this.referente = referente;
    }

    public Collection<Documento> getDocumentos() {
        return documentos;
    }

    public void setDocumentos(Collection<Documento> documentos) {
        this.documentos = documentos;
    }

    @Override
    public String toString() {
        return super.getNome();
    }
    
    
}
