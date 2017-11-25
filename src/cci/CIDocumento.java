package cci;

import java.util.List;
import java.sql.SQLException;
//import cih.documento.JPAlterar;
//import cih.documento.JPExcluir;
//import cih.documento.JPCadastrar;
//import cih.documento.JPConsultar;
//import cih.documento.IFrameDocumento;

public class CIDocumento {
    private CIPrincipal ctrlP;
//    private JPCadastrar jpCadastrarDocumento;
//    private JPConsultar jpConsultarDocumento;
//    private JPAlterar   jpAlterarDocumento;
//    private JPExcluir   jpExcluirDocumento;
//    private IFrameDocumento iFrameDocumento;
    
    public CIDocumento(CIPrincipal ctrlP) {
        this.ctrlP           = ctrlP;
//        iFrameDocumento      = new IFrameDocumento(this);
//        jpCadastrarDocumento = new JPCadastrar(this);
//        jpConsultarDocumento = new JPConsultar(this);
//        jpAlterarDocumento   = new JPAlterar(this);
//        jpExcluirDocumento   = new JPExcluir(this);
    }
    
    private void carregarAbas() {
//        iFrameDocumento.getjTabPane().add(jpCadastrarDocumento);
//        iFrameDocumento.getjTabPane().add(jpConsultarDocumento);
//        iFrameDocumento.getjTabPane().add(jpAlterarDocumento);
//        iFrameDocumento.getjTabPane().add(jpExcluirDocumento);
//        iFrameDocumento.revalidate();
//        iFrameDocumento.repaint();
    }
    
    public void abrirIFrame() {
        //ctrlP.getJanelaPrincipal().getDesktopPane().add(iFrameDocumento);
        carregarAbas();
        //iFrameDocumento.setVisible(true);
    }
    
    public CIPrincipal getCtrlP() {
        return ctrlP;
    }
    
    public void cadastrarDocumento() {
        ctrlP.getGtPrincipal().getGtDocumento().cadastrar();
    }
    
    public void consultarDocumento() {
        //?
    }

    public void alterarDocumento() {
        
    }

    public void excluirDocumento(Object obj) {
//        try {
//            ctrlP.getGtPrincipal().getGtDocumento().excluir(obj);
//        } catch (SQLException ex) {
//            ctrlP.getMensagens().exibirMenssagem(iFrameDocumento, "Erro: "+ex.getMessage());
//        } catch (ClassNotFoundException ex) {
//            ctrlP.getMensagens().exibirMenssagem(iFrameDocumento, "Erro: "+ex.getMessage());
//        }
    }
    
    public List getLista() {
        return ctrlP.getGtPrincipal().getGtDocumento().listar();
    }
}
