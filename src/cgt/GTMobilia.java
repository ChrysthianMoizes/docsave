package cgt;

import cdp.Local;
import cdp.Mobilia;
import cgd.GDMobilia;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.SQLException;
import java.util.Collection;

public class GTMobilia {
    GDMobilia gdMobilia;

    public GTMobilia() {
        gdMobilia = new GDMobilia();
    }
    
    public List obterMobilias(){
        return gdMobilia.consultar(Mobilia.class);
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
    
    public Mobilia consultar(String nome) {
        return gdMobilia.consultar(nome);
    }
    
    public void alterar(Mobilia mobilia, String nome, String identificador, int capacidade, Local local, Collection compartimentos) {
        mobilia.setNome(nome);
        mobilia.setCodigo(identificador);
        mobilia.setCapacidade(capacidade);
        mobilia.setLocal(local);
        mobilia.setCompartimentos(compartimentos);
        try {
            gdMobilia.alterar(mobilia);
        } catch (SQLException ex) {
            Logger.getLogger(GTMobilia.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GTMobilia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void excluir(Object tMobilia) throws SQLException, ClassNotFoundException
            , NoSuchMethodException, IllegalAccessException, IllegalArgumentException
            , InvocationTargetException{        
        Mobilia mob = (Mobilia)tMobilia;
        gdMobilia.excluir(mob);
    }
    
    public List listar() {
        return gdMobilia.consultar(Mobilia.class);
    }

    public List obterMobiliasDeLocais(Local local) {
        return gdMobilia.consultarMobilias(local.getId());
    }
}
