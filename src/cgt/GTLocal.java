package cgt;

import cdp.Local;
import cgd.GDLocal;
import java.util.List;

public class GTLocal {
    GDLocal gdLocal;

    public GTLocal() {
        gdLocal = new GDLocal();
    }
    
    public List listar() {
        return gdLocal.consultar(Local.class);
    }
}
