package cgt;

import cdp.Local;
import cdp.Mobilia;
import cgd.GDMobilia;
import java.util.List;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.SQLException;
import java.util.Collection;

public class GTMobilia {
    
    GDMobilia gdMobilia;

    public GTMobilia() {
        gdMobilia = new GDMobilia();
    }
    
    public void cadastrar(String nome, String identificador, int capacidade, Local local, Collection compartimentos) {
        Mobilia mobiliaNova = new Mobilia(identificador, nome, capacidade, local, compartimentos);
        try {
            gdMobilia.cadastrar(mobiliaNova);
        } catch (SQLException ex) {
            Logger.getLogger(GTMobilia.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GTMobilia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List carregar() {
        List retorno = null;
        retorno = gdMobilia.consultar(Mobilia.class);
        return retorno;
    }
    
    public List consultar(String nome) {
        List lista = new ArrayList();
        Mobilia tMobilia = gdMobilia.consultar(nome);
        if (tMobilia != null) {
            lista.add(tMobilia.getId());
            lista.add(tMobilia.getNome());
            //lista.add(tMobilia.getDescricao());
        }
        return lista;
    }
    
    public void alterar(Object objId, String nome, String desc) {
        Mobilia obj = (Mobilia)objId;
        int id = obj.getId();
        //TODO: ADICIONAR CAMPOS QUE FALTAM...
        Mobilia tMobilia = new Mobilia("01", nome, 0, null, null);
        try {
            gdMobilia.alterar(tMobilia);
        } catch (SQLException ex) {
            Logger.getLogger(GTMobilia.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GTMobilia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void excluir(Object tMobilia) {
        try {
            gdMobilia.excluir((Mobilia)tMobilia);
        } catch (SQLException ex) {
            Logger.getLogger(GTMobilia.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GTMobilia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List listar() {
        return gdMobilia.consultar(Mobilia.class);
    }
}
