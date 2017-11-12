package cgt;

import cdp.Compartimento;
import cgd.GDCompartimento;
import java.util.List;

public class GTCompartimento {
    GDCompartimento gdCompartimento;

    public GTCompartimento() {
        gdCompartimento = new GDCompartimento();
    }
    
    public List listar() {
        return gdCompartimento.consultar(Compartimento.class);
    }
}
