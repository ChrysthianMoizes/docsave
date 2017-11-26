package cci;

import java.io.File;
import java.util.List;
import javax.swing.JComboBox;
import cdp.Local;
import cdp.Mobilia;
import cdp.Referenciado;
import cdp.Compartimento;
import cdp.TipoDocumento;
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
    private IFrameDocumento      iFrameDocumento;
    
    public CIDocumento(CIPrincipal ctrlP) {
        this.ctrlP = ctrlP;
    }
    
    public void abrirIFrame() {
        iFrameDocumento      = new IFrameDocumento(this);
        jpCadastrarDocumento = new JPCadastrarDocumento(this);
        jpConsultarDocumento = new JPConsultarDocumento(this);
        jpAlterarDocumento   = new JPAlterarDocumento(this);
        jpExcluirDocumento   = new JPExcluirDocumento(this);
        ctrlP.getJanelaPrincipal().getDesktopPane().add(iFrameDocumento);
        carregarAbas();
        iFrameDocumento.setVisible(true);
    }
    
    private void carregarAbas() {
        iFrameDocumento.getjTabPane().add(jpCadastrarDocumento);
        iFrameDocumento.getjTabPane().add(jpConsultarDocumento);
        iFrameDocumento.getjTabPane().add(jpAlterarDocumento);
        iFrameDocumento.getjTabPane().add(jpExcluirDocumento);
        iFrameDocumento.revalidate();
        iFrameDocumento.repaint();
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
//            ctrlP.getMensagens().exibirMensagem(iFrameDocumento, "Erro: "+ex.getMessage());
//        } catch (ClassNotFoundException ex) {
//            ctrlP.getMensagens().exibirMensagem(iFrameDocumento, "Erro: "+ex.getMessage());
//        }
    }
    
    public List getLista() {
        return ctrlP.getGtPrincipal().getGtDocumento().listar();
    }

    public void cadastrarDocumento(String codigo, String nome, Compartimento compartimento, TipoDocumento tpDocumento, Referenciado referenciado, File arquivoSelecionado) {
        try {
            ctrlP.getGtPrincipal().getGtDocumento().cadastrar(codigo, nome, compartimento, tpDocumento, referenciado, arquivoSelecionado);
            ctrlP.getMensagens().exibirMensagem(iFrameDocumento, "Documento cadastrado com sucesso!");
            jpCadastrarDocumento.limparCampos();
        } catch (Exception ex) {
            ctrlP.getMensagens().exibirMensagem(iFrameDocumento, "Erro: " + ex.toString());
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
    
     public void preencherLocal(JComboBox cmbLocal) {
        if(!cmbLocal.equals("Selecione")){    
            cmbLocal.removeAllItems();
            List lista = ctrlP.getGtPrincipal().getGtLocal().listar();
            cmbLocal.addItem("Selecione");
            for (Object item : lista)
                cmbLocal.addItem(item);
        }
    }
     
    public void preencherMobilia(JComboBox cmbMobilia, Object local) {
        if(!local.equals("Selecione")){
            cmbMobilia.removeAllItems();
            List lista = ctrlP.getGtPrincipal().getGtMobilia().obterMobiliasDeLocais((Local)local);
            cmbMobilia.addItem("Selecione");
            for (Object item : lista)
                cmbMobilia.addItem(item);
        }
    }
    
    public void preencherCompartimento(JComboBox cmbMobilia, Object mobilia) {
        if (!mobilia.equals("Selecione")) {
            cmbMobilia.removeAllItems();
            List lista = ctrlP.getGtPrincipal().getGtCompartimento().obterCompartimentos((Mobilia)mobilia);
            cmbMobilia.addItem("Selecione");
            for (Object item : lista)
                cmbMobilia.addItem(item);
        }
    }
}
