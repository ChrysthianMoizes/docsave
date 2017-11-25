package cci;

import java.util.List;
import java.sql.SQLException;
import cih.documento.JPAlterarDocumento;
import cih.documento.JPExcluirDocumento;
import cih.documento.JPCadastrarDocumento;
import cih.documento.JPConsultarDocumento;
import cih.documento.IFrameDocumento;

public class CIDocumento {
    private CIPrincipal ctrlP;
    private JPCadastrarDocumento jpCadastrarDocumento;
    private JPConsultarDocumento jpConsultarDocumento;
    private JPAlterarDocumento   jpAlterarDocumento;
    private JPExcluirDocumento   jpExcluirDocumento;
    private IFrameDocumento iFrameDocumento;
    
    public CIDocumento(CIPrincipal ctrlP) {
        this.ctrlP           = ctrlP;
        iFrameDocumento      = new IFrameDocumento(this);
        jpCadastrarDocumento = new JPCadastrarDocumento(this);
        jpConsultarDocumento = new JPConsultarDocumento(this);
        jpAlterarDocumento   = new JPAlterarDocumento(this);
        jpExcluirDocumento   = new JPExcluirDocumento(this);
    }
    
    private void carregarAbas() {
        iFrameDocumento.getjTabPane().add(jpCadastrarDocumento);
        iFrameDocumento.getjTabPane().add(jpConsultarDocumento);
        iFrameDocumento.getjTabPane().add(jpAlterarDocumento);
        iFrameDocumento.getjTabPane().add(jpExcluirDocumento);
        iFrameDocumento.revalidate();
        iFrameDocumento.repaint();
    }
    
    public void abrirIFrame() {
        ctrlP.getJanelaPrincipal().getDesktopPane().add(iFrameDocumento);
        carregarAbas();
        iFrameDocumento.setVisible(true);
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
