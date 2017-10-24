package controlador;

import gerenciaDeTarefas.GTPrincipal;
import visao.framePrincipal;
import dao.ConfigDAO;
import javax.swing.JOptionPane;
import visao.util.Menssagens;
        
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
    private Menssagens menssagens;
    
 
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
        menssagens = new Menssagens(this);
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

    public Menssagens getMenssagens() {
        return menssagens;
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
