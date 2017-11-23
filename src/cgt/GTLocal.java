package cgt;

import cdp.Local;
import cgd.GDLocal;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GTLocal {
    GDLocal gdLocal;

    public GTLocal() {
        gdLocal = new GDLocal();
    }
    
    public List listar() {
        return gdLocal.consultar(Local.class);
    }

    public void cadastrarLocal(String nome, String desc, String qtd) {
        int capacidade = Integer.parseInt(qtd);
        Local novo = new Local(nome, capacidade, desc, null);
        try {
            gdLocal.cadastrar(novo);
        } catch (SQLException ex) {
            Logger.getLogger(GTLocal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GTLocal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void alterarLocal(Object objId, String nome, String desc, String qtd) {
        Local obj = (Local)objId;
        int id = obj.getId();
        int capacidade = Integer.parseInt(qtd);
        Local localAux = new Local(id, nome, capacidade, desc, null);
        try {
            gdLocal.alterar(localAux);
        } catch (SQLException ex) {
            Logger.getLogger(GTTipoDocumento.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GTTipoDocumento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void excluirLocal(Object localAux) {
        try {
            gdLocal.excluir((Local)localAux);
        } catch (SQLException ex) {
            Logger.getLogger(GTTipoDocumento.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GTTipoDocumento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
