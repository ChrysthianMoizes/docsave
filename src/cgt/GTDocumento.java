package cgt;

import cdp.Documento;
import cgd.GDDocumento;
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
}
