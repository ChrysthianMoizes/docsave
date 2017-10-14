package dominio;

public class Documento {
    private int    id;
    private String nome;
    private String codigo;
    private byte[] scan;
    private TipoDocumento tipoDocumento;
    private Compartimento compartimento;
    private Referenciado  referenciado;

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

}
