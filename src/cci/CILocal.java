package cci;

import cgt.GTLocal;
import java.util.List;

public class CILocal {
    private CIPrincipal ctrlP;
    private GTLocal     gtLocal;

    public CILocal(CIPrincipal ctrlP) {
        this.ctrlP = ctrlP;
        gtLocal = new GTLocal();
    }
    
    public List getListaLocais() {
        return gtLocal.listar();
    }
}
