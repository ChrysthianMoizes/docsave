package cci;

import cih.local.IFrameLocal;
import java.util.List;

/**
 *
 * @author reida
 */
public class CILocal {
    private CIPrincipal ctrlP;
    private IFrameLocal iFrameLocal;

    public CILocal(CIPrincipal ctrlP) {
        this.ctrlP = ctrlP;
    }
    
    //metodo que abre a tela cadastro local
    public void AbrirInterfaceCadastroLocal() {
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
    
}
