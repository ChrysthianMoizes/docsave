package controlador;

import GerenciaDeTarefas.GTPrincipal;
import Visao.framePrincipal;
import dao.ConfigDAO;
import javax.swing.JOptionPane;
import Visao.Util.Erro;
        
public class CIPrincipal {

    final public int MENUPRINCIPAL = 0;
    final public int MENUTIPODOCUMENTO = 1;
    
    private framePrincipal janelaPrincipal;
    private GTPrincipal gtPrincipal;
    private CICompartimento ciCompartimento;
    private CIDocumento ciDocumento;
    private CILocal ciLocal;
    private CIMobilia ciMobilia;
    private CIReferenciado ciReferenciado;
    private CITipoDocumento ciTipoDocumento;
    private CIUsuario ciUsuario;
    private Erro erro;
    
 
    public CIPrincipal() {
        new ConfigDAO();
        iniciarJanelaPrincipal();
        gtPrincipal = new GTPrincipal();
        ciCompartimento = new CICompartimento(this);
        ciDocumento = new CIDocumento(this);
        ciLocal = new CILocal(this);
        ciMobilia = new CIMobilia(this);
        ciReferenciado = new CIReferenciado(this);
        ciTipoDocumento = new CITipoDocumento(this);
        ciUsuario = new CIUsuario(this);
        erro = new Erro(this);
    }
    
    public void iniciarJanelaPrincipal(){
        janelaPrincipal = new framePrincipal(this);  
        janelaPrincipal.configurarDesktopPane();
        janelaPrincipal.setVisible(true);
    }

    public framePrincipal getJanelaPrincipal() {
        return janelaPrincipal;
    }

    public void alterarMenu(int flag){
        janelaPrincipal.getPanelMenu().removeAll();
        switch(flag){
            case MENUPRINCIPAL: janelaPrincipal.getMenuPadrao().setVisible(true);
                janelaPrincipal.getPanelMenu().add(janelaPrincipal.getMenuPadrao());
                break;
            case MENUTIPODOCUMENTO: janelaPrincipal.getMenuTipoDocumento().setVisible(true);
                janelaPrincipal.getPanelMenu().add(janelaPrincipal.getMenuTipoDocumento());
                break;
            default:janelaPrincipal.getMenuPadrao().setVisible(true);
                janelaPrincipal.getPanelMenu().add(janelaPrincipal.getMenuPadrao());
                break;
         }
        janelaPrincipal.revalidate();
        janelaPrincipal.repaint();
    }

    public int getMENUPRINCIPAL() {
        return MENUPRINCIPAL;
    }

    public int getMENUTIPODOCUMENTO() {
        return MENUTIPODOCUMENTO;
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

    public Erro getErro() {
        return erro;
    }
    
    
    
    
     public static void main(String args[]){
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }   
        }catch(Exception e){
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CIPrincipal();
            }   
        });
    }
    
}
