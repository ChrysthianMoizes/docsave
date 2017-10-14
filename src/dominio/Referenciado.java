package dominio;

public class Referenciado extends Pessoa {
    private String cpf;
    private int    referente;

    public Referenciado() {}

    public Referenciado( int id, String nome, String cpf, int referente) {
        super(id, nome);
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
}
