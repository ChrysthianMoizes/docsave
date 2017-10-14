package dominio;

public class Documento {
    private int    id;
    private String nome;
    private String codigo;
    private byte[] scan;

    public Documento() {}

    public Documento(int id, String nome, String codigo, byte[] scan) {
        this.id = id;
        this.nome = nome;
        this.codigo = codigo;
        this.scan = scan;
    }
    
    public Documento(String nome, String codigo, byte[] scan) {
        this.nome = nome;
        this.codigo = codigo;
        this.scan = scan;
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
    
}
