package cci;

import cci.util.Modulo;
import cgd.Config;
import cgt.GTPrincipal;
import cih.util.Mensagem;
import cih.base.FramePrincipal;
        
public class CIPrincipal {

    private FramePrincipal janelaPrincipal;
    private GTPrincipal     gtPrincipal;
    private CILocal         ciLocal;
    private CIUsuario       ciUsuario;
    private CIMobilia       ciMobilia;
    private CIDocumento     ciDocumento;
    private CICompartimento ciCompartimento;
    private CIReferenciado  ciReferenciado;
    private CITipoDocumento ciTipoDocumento;
    private Mensagem        mensagens;
    
 
    public CIPrincipal() {
        new Config();
        iniciarFramePrincipal();
        gtPrincipal     = new GTPrincipal();
        ciCompartimento = new CICompartimento(this);
        ciDocumento     = new CIDocumento(this);
        ciLocal         = new CILocal(this);
        ciMobilia       = new CIMobilia(this);
        ciReferenciado  = new CIReferenciado(this);
        ciTipoDocumento = new CITipoDocumento(this);
        ciUsuario       = new CIUsuario(this);
        mensagens      = new Mensagem(this);
    }
    
    public void iniciarFramePrincipal() {
        janelaPrincipal = new FramePrincipal(this);  
        janelaPrincipal.configurarDesktopPane();
        janelaPrincipal.setVisible(true);
    }

    public FramePrincipal getJanelaPrincipal() {
        return janelaPrincipal;
    }

    public void alterarMenu(int MODULO){
        janelaPrincipal.getPanelMenu().removeAll();
        switch (MODULO) {
            case Modulo.MENU_PRINCIPAL: 
                janelaPrincipal.getMenuPadrao().setVisible(true);
                janelaPrincipal.getPanelMenu().add(janelaPrincipal.getMenuPadrao());
                break;
            default:
                janelaPrincipal.getMenuPadrao().setVisible(true);
                janelaPrincipal.getPanelMenu().add(janelaPrincipal.getMenuPadrao());
                break;
         }
        janelaPrincipal.revalidate();
        janelaPrincipal.repaint();
    }
    
    public GTPrincipal getGtPrincipal() {
        return gtPrincipal;
    }

    public CICompartimento getCiCompartimento() {
        return ciCompartimento;
    }

    public CIDocumento getCiDocumento() {
        return ciDocumento;
    }

    public CILocal getCiLocal() {
        return ciLocal;
    }

    public CIMobilia getCiMobilia() {
        return ciMobilia;
    }

    public CIReferenciado getCiReferenciado() {
        return ciReferenciado;
    }

    public CITipoDocumento getCiTipoDocumento() {
        return ciTipoDocumento;
    }

    public CIUsuario getCiUsuario() {
        return ciUsuario;
    }

    public Mensagem getMensagens() {
        return mensagens;
    }
    
    public static void main(String args[]){
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }   
        } catch(Exception e){}
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CIPrincipal();
            }   
        });
    }
}
