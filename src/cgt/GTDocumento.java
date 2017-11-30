package cgt;

import cdp.Documento;
import cgd.GDDocumento;
import cdp.Referenciado;
import cdp.TipoDocumento;
import cdp.Compartimento;
import java.io.File;
import java.util.List;
import java.io.IOException;
import java.nio.file.Files;
import java.sql.SQLException;

public class GTDocumento {
    private GDDocumento gdDocumento;
    private GTPrincipal gtPrincipal;

    public GTDocumento(GTPrincipal gtPrincipal) {
        this.gdDocumento = new GDDocumento();
        this.gtPrincipal = gtPrincipal;
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

    public void cadastrar(String codigo, String nome, Compartimento compartimento, TipoDocumento tpDocumento, Referenciado referenciado, File arquivoSelecionado) throws IOException, SQLException, ClassNotFoundException, Exception {
        byte[] scan = Files.readAllBytes(arquivoSelecionado.toPath());
        //scan = new byte[]{}; //TODO CORRIGIR!
        TipoDocumento tpDocDB = gtPrincipal.getGtTipoDocumento().consultarId(tpDocumento.getId());
        Documento documento = new Documento();
        documento.setScan(scan);
        documento.setNome(nome);
        documento.setCodigo(codigo);
        documento.setTipoDocumento(tpDocDB);
        documento.setCompartimento(compartimento);
        documento.setReferenciado(referenciado);
        gdDocumento.save(documento);
    }

    public Object[][] consultarDocumentos(String codigo, String nome) {
        Object retorno[][] = null;
        List lista = null;
        if(nome != null && codigo != null){
            lista = gdDocumento.consultar(codigo, nome);
            
        } else {
            lista = gdDocumento.consultar(Documento.class);
        }
        retorno = new Object[lista.size()][4];
            int i = 0;
            for(Object item : lista){
                Documento doc = (Documento)item;
                retorno[i][0] = doc;
                retorno[i][1] = doc.getNome();
                retorno[i][2] = doc.getCompartimento();
                retorno[i][3] = doc.getReferenciado();
                i++;
            }
        return retorno;
    }

    public void fecharSessao() {
        gdDocumento.fecharSessao();
    }
}
