package cgt;

import cdp.Compartimento;
import cdp.Documento;
import cdp.Referenciado;
import cdp.TipoDocumento;
import cgd.GDDocumento;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.SQLException;
import java.util.List;

public class GTDocumento {
    private GDDocumento gdDocumento;

    public GTDocumento() {
        this.gdDocumento = new GDDocumento();
    }
    
    public List listar() {
        return gdDocumento.consultar(Documento.class);
    }
    
    public void cadastrar() {
        
    }
    
    public void alterar() {
        
    }
    
    public void excluir(Object obj) throws SQLException, ClassNotFoundException {
        gdDocumento.excluir(obj);
    }

    public void cadastrar(String codigo, String nome, Compartimento compartimento, TipoDocumento tpDocumento, Referenciado referenciado, File arquivoSelecionado) throws IOException, SQLException, ClassNotFoundException {
        //byte[] scan = Files.readAllBytes(arquivoSelecionado.toPath());
        Documento documento = new Documento(nome, codigo, new byte[]{}, tpDocumento, compartimento, referenciado);
        gdDocumento.cadastrar(documento);
    }
}
