package cci;

import cgt.GTLocal;
import cih.local.IFrameLocal;
import java.util.List;

public class CILocal {
    private GTLocal     gtLocal;
    private CIPrincipal ctrlP;
    private IFrameLocal iFrameLocal;

    public CILocal(CIPrincipal ctrlP) {
        this.ctrlP = ctrlP;
        gtLocal = new GTLocal();
    }
    
    //metodo que abre a tela cadastro local
    public void abrirCadastro() {
        iFrameLocal = new IFrameLocal(this);
        ctrlP.getJanelaPrincipal().getDesktopPane().add(iFrameLocal);
        iFrameLocal.setVisible(true);
    }

    public List carregarCmbBoxMobiliaLocal() {
        return null; //preciso fazer a continuação do metodo
    }

    public void consultarLocal(String text) {
        //List lista = ctrlP.getGtPrincipal().getGtLocal().consultarLocal(nome);
        //iFrameLocal.preencheTabelaConsulta(obj);
    }
    
    public List getListaLocais() {
        return gtLocal.listar();
    }
}
