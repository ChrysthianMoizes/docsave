package cgt;

import cgd.GDTipoDocumento;
import cdp.TipoDocumento;
import java.util.List;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.SQLException;

public class GTTipoDocumento {
    
    GDTipoDocumento gdTipoDocumento;

    public GTTipoDocumento() {
        gdTipoDocumento = new GDTipoDocumento();
    }
 
    public void cadastrarTipoDocumento(String nome, String desc){
        TipoDocumento novo = new TipoDocumento(nome, desc);
        try {
            gdTipoDocumento.cadastrar(novo);
        } catch (SQLException ex) {
            Logger.getLogger(GTTipoDocumento.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GTTipoDocumento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List obterTipoDocumento(){
        List retorno = null;
        retorno = gdTipoDocumento.consultar(TipoDocumento.class);
        return retorno;
    }
    
    public List consultarTipoDocumento(String nome){
        List lista = new ArrayList();
        TipoDocumento tDocumento = gdTipoDocumento.consultarTipoDocumento(nome);
        if(tDocumento != null){
            lista.add(tDocumento.getId());
            lista.add(tDocumento.getNome());
            lista.add(tDocumento.getDescricao());
        }
        return lista;
    }
    
    public TipoDocumento consultarId(int id) {
        return gdTipoDocumento.consultarId(id);
    }
    
    public void alterarTipoDocumento(Object objId, String nome, String desc){
        TipoDocumento obj = (TipoDocumento)objId;
        int id = obj.getId();
        TipoDocumento tDocumento = new TipoDocumento(id, nome, desc);
        try {
            gdTipoDocumento.alterar(tDocumento);
        } catch (SQLException ex) {
            Logger.getLogger(GTTipoDocumento.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GTTipoDocumento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void excluirTipoDocumento(Object tDocumento){
        try {
            gdTipoDocumento.excluir((TipoDocumento)tDocumento);
        } catch (SQLException ex) {
            Logger.getLogger(GTTipoDocumento.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GTTipoDocumento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String getDescricao(Object tDocumento){
        TipoDocumento item = (TipoDocumento)tDocumento;
        return item.getDescricao();
    }
    
    public List listarTipoDocumento(){
        return gdTipoDocumento.consultar(TipoDocumento.class);
    }

    public ArrayList<String> tipoDocToArray(Object obj) {
        TipoDocumento tdoc = (TipoDocumento)obj;
        ArrayList<String> lista = new ArrayList<>();
        lista.add(tdoc.getNome());
        lista.add(tdoc.getDescricao());
        return lista;
    }
}
