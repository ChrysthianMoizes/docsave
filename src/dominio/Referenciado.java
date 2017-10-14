package dominio;

import java.util.Collection;

public class Referenciado extends Pessoa {
    private String cpf;
    private int    referente;
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
    
}
