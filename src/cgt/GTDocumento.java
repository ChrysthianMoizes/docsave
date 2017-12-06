package cgt;

import cdp.Documento;
import cgd.GDDocumento;
import cdp.Referenciado;
import cdp.TipoDocumento;
import cdp.Compartimento;
import cdp.Local;
import cdp.Mobilia;
import cih.documento.JDialogVisualizaDoc;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;
import java.io.IOException;
import java.nio.file.Files;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        if(codigo != null){
            lista = gdDocumento.consultarCodigo(codigo);            
        } else if(nome != null){
            lista = gdDocumento.consultarNome(nome);
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

    public Object[] documentoToArray(Object dados) {
        Object documento[] = new Object[8];
        Documento doc = (Documento)dados;
        documento[0] = doc.getNome();
        documento[1] = doc.getCodigo();
        documento[2] = doc.getCompartimento();
        documento[3] = doc.getReferenciado();
        documento[4] = doc.getTipoDocumento();
        documento[5] = doc.getScan();
        documento[6] = doc.getCompartimento().getMobilia();
        documento[7] = doc.getCompartimento().getMobilia().getLocal();
        return documento;
    }
    
    public Object[] documentoToArray(Object[] dados) {
        Object documento[] = new Object[8];
        Documento doc = (Documento)dados[0];
        documento[0] = doc.getNome();
        documento[1] = doc;
        documento[2] = doc.getCompartimento();
        documento[3] = doc.getReferenciado();
        documento[4] = doc.getTipoDocumento();
        documento[5] = doc.getScan();
        documento[6] = doc.getCompartimento().getMobilia();
        documento[7] = doc.getCompartimento().getMobilia().getLocal();
        return documento;
    }

    public void alterar(String codigo, String nome, Object compartimento, Object local
            , Object mobilia, Object referenciado, Object tipoDocumento
            , byte[] arquivoSelecionado, Object antigoDoc) throws IOException, SQLException, ClassNotFoundException, Exception {
        Documento temp = (Documento)antigoDoc;
        int id = temp.getId();
        Compartimento cmp = (Compartimento)compartimento;
        Local loc = (Local)local;
        Mobilia mob = (Mobilia)mobilia;
        TipoDocumento tDoc = (TipoDocumento)tipoDocumento;
        Referenciado ref = (Referenciado)referenciado;
        File arq = new File("arquivo.pdf");
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(arq));
        bos.write(arquivoSelecionado);
        bos.close();
        Documento doc = new Documento(id, nome, codigo, arquivoSelecionado, tDoc, cmp, ref);
        gdDocumento.update(doc);
        if(!arq.delete())
            new Exception("Arquivo temporário não pode ser apagado");
    }
}
