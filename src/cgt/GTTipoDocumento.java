/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cgt;

import cgd.GDTipoDocumento;
import cdp.TipoDocumento;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author reida
 */
public class GTTipoDocumento {
    
    GDTipoDocumento daoTipoDocumento;

    public GTTipoDocumento() {
        daoTipoDocumento = new GDTipoDocumento();
    }
 
    
    public void cadastrarTipoDocumento(String nome, String desc){
        TipoDocumento novo = new TipoDocumento(nome, desc);
        try {
            daoTipoDocumento.cadastrar(novo);
        } catch (SQLException ex) {
            Logger.getLogger(GTTipoDocumento.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GTTipoDocumento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List carregarTipoDocumento(){
        List retorno = null;
        retorno = daoTipoDocumento.consultar(TipoDocumento.class);
        return retorno;
    }
    
    public List consultarTipoDocumento(String nome){
        List lista = new ArrayList();
        TipoDocumento tDocumento = daoTipoDocumento.consultarTipoDocumento(nome);
        if(tDocumento != null){
            lista.add(tDocumento.getId());
            lista.add(tDocumento.getNome());
            lista.add(tDocumento.getDescricao());
        }
        return lista;
    }
    
    public void alterarTipoDocumento(Object objId, String nome, String desc){
        TipoDocumento obj = (TipoDocumento)objId;
        int id = obj.getId();
        TipoDocumento tDocumento = new TipoDocumento(id, nome, desc);
        try {
            daoTipoDocumento.alterar(tDocumento);
        } catch (SQLException ex) {
            Logger.getLogger(GTTipoDocumento.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GTTipoDocumento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void excluirTipoDocumento(Object tDocumento){
        try {
            daoTipoDocumento.excluir((TipoDocumento)tDocumento);
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
        return daoTipoDocumento.consultar(TipoDocumento.class);
    }
}
