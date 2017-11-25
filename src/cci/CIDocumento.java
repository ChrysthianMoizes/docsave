package cci;

import java.io.File;
import java.util.List;
import cdp.Compartimento;
import cdp.Referenciado;
import cdp.TipoDocumento;
import cih.documento.JPAlterarDocumento;
import cih.documento.JPExcluirDocumento;
import cih.documento.JPCadastrarDocumento;
import cih.documento.JPConsultarDocumento;
import cih.documento.IFrameDocumento;
import javax.swing.JComboBox;

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

    public void cadastrarDocumento(String codigo, String nome, Compartimento compartimento, TipoDocumento tpDocumento, Referenciado referenciado, File arquivoSelecionado) {
        try {
            ctrlP.getGtPrincipal().getGtDocumento().cadastrar(codigo, nome, compartimento, tpDocumento, referenciado, arquivoSelecionado);
        } catch (Exception ex) {
            ctrlP.getMensagens().exibirMenssagem(iFrameDocumento, "Erro: " + ex.toString());
        }
    }
    
    public void preencherTipoDocumento(JComboBox cmbTipoDocumento) {
        cmbTipoDocumento.removeAllItems();
        List lista = ctrlP.getGtPrincipal().getGtTipoDocumento().obterTipoDocumento();
        cmbTipoDocumento.addItem("Selecione");
        for (Object item : lista)
            cmbTipoDocumento.addItem(item);
    }
    
    public void preencherCompartimento(JComboBox cmbCompartimento) {
        cmbCompartimento.removeAllItems();
        List lista = ctrlP.getGtPrincipal().getGtCompartimento().listar();
        cmbCompartimento.addItem("Selecione");
        for (Object item : lista)
            cmbCompartimento.addItem(item);
    }
    
    public void preencherReferenciado(JComboBox cmbReferenciado) {
        cmbReferenciado.removeAllItems();
        List lista = ctrlP.getGtPrincipal().getGtReferenciado().listar();
        cmbReferenciado.addItem("Selecione");
        for (Object item : lista)
            cmbReferenciado.addItem(item);
    }
}
