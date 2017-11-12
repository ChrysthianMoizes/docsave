package cci;

import cgt.GTCompartimento;
import java.util.List;

public class CICompartimento {
    private CIPrincipal     ctrlP;
    private GTCompartimento gtCompartimento;

    public CICompartimento(CIPrincipal ctrlP) {
        this.ctrlP = ctrlP;
        gtCompartimento = new GTCompartimento();
    }
    
    public List getLista() {
        return gtCompartimento.listar();
    }
}
