/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GerenciaDeTarefas;

import dao.DAOTipoDocumento;
import dominio.TipoDocumento;
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
    
    DAOTipoDocumento daoTipoDocumento;

    public GTTipoDocumento() {
        daoTipoDocumento = new DAOTipoDocumento();
    }
 
    
    public void cadastrarTipoDocumento(String nome, String Descricao){
        TipoDocumento novo = new TipoDocumento(nome, Descricao);
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
}
