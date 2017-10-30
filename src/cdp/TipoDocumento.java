package cdp;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "tipo_documento")
public class TipoDocumento implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int    id;
    
    @Column(nullable = false)
    private String nome;
    
    @Column(nullable = true)
    private String descricao;

    public TipoDocumento() {}

    public TipoDocumento(int id, String nome, String descricao) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
    }

    public TipoDocumento(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return  nome;
    }
    
    
}
