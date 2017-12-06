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
import cih.documento.JDialogDetalhes;
import cih.documento.JDialogVisualizaDoc;
import cih.util.JTableUtil;
import java.awt.Desktop;
import java.awt.Frame;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import org.hibernate.exception.ConstraintViolationException;
                
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
    
    public List listarDocumentos(){
        return ctrlP.getGtPrincipal().getGtDocumento().listar();
    }

    public void excluirDocumento(Object obj) {
       try {
            ctrlP.getGtPrincipal().getGtDocumento().excluir(obj);
        } catch (Exception ex){
            ctrlP.getMensagens().exibirMensagem(iFrameDocumento, "Erro: "+ex.getMessage());
        }
        
    }
    
    public List getLista() {
        return ctrlP.getGtPrincipal().getGtDocumento().listar();
    }

    public void cadastrarDocumento(String codigo, String nome, Compartimento compartimento, TipoDocumento tpDocumento, Referenciado referenciado, File arquivoSelecionado) {
        try {
            ctrlP.getGtPrincipal().getGtDocumento().cadastrar(codigo, nome, compartimento, tpDocumento, referenciado, arquivoSelecionado);
            ctrlP.getMensagens().exibirMensagem(iFrameDocumento, "Documento cadastrado com sucesso!");
            jpCadastrarDocumento.limparCampos();
        }catch (ConstraintViolationException ex){
            ctrlP.getMensagens().exibirMensagem(iFrameDocumento, "Erro: Documento já cadastrado");
        }catch (Exception ex) {
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
    
    public void preencherDocumento(JComboBox cmbMobilia) {
        cmbMobilia.removeAllItems();
        List lista = listarDocumentos();
        cmbMobilia.addItem("Selecione");
        for (Object item : lista)
            cmbMobilia.addItem(item);
    }

    public void consultarDocumento(String codigo, String nome, JTable tabela) {
        JTableUtil.limparTabela(tabela);
        Object lista[][] = ctrlP.getGtPrincipal().getGtDocumento().consultarDocumentos(codigo, nome);
        if(lista != null){
            for(Object[] item : lista){
                JTableUtil.addLinha(tabela, item);
            }
        }
    }

    public void exibirDadosDocumento(JTable jTableConsultaDoc) {
        try {
            Object dados = JTableUtil.getDadosLinhaSelecionada(jTableConsultaDoc);
            Object doc[] = ctrlP.getGtPrincipal().getGtDocumento().documentoToArray(dados);
            JDialogDetalhes detalhes = new JDialogDetalhes(iFrameDocumento, true, doc, this);
        } catch (Exception ex) {
            ctrlP.getMensagens().exibirMensagem(iFrameDocumento, "Erro: "+ex.toString());
        }
    }
    
    public void exibir(Object scan){
        byte[] bytes = (byte[])scan;
        File arq = new File("arquivo.pdf");
        try {
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(arq));
            bos.write(bytes);
            bos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JDialogVisualizaDoc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(JDialogVisualizaDoc.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Desktop.getDesktop().open(arq);
        } catch (IOException ex) {
            Logger.getLogger(JDialogVisualizaDoc.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Object[] consultarDocumento(String codigo, String nome) {
        Object lista[][] = ctrlP.getGtPrincipal().getGtDocumento().consultarDocumentos(codigo, nome);
        Object[] doc = ctrlP.getGtPrincipal().getGtDocumento().documentoToArray(lista[0]);
        if(lista.length > 1){
            ctrlP.getMensagens().exibirMensagem(iFrameDocumento, "Mais de um campo retornado em consulta");
        }
        return doc;
    }

    public void preencherMobilia(JComboBox cmbMobilia) {
        if(!cmbMobilia.equals("Selecione")){    
            cmbMobilia.removeAllItems();
            List lista = ctrlP.getGtPrincipal().getGtMobilia().listar();
            cmbMobilia.addItem("Selecione");
            for (Object item : lista)
                cmbMobilia.addItem(item);
        }
    }

    public void alterarDocumento(String codigo, String nome, Object compartimento
            , Object local, Object mobilia, Object referenciado, Object tipoDocumento
            , byte[] arquivoSelecionado, Object doc) {
        try {
            ctrlP.getGtPrincipal().getGtDocumento().alterar(codigo, nome, compartimento, local, mobilia
                    , referenciado, tipoDocumento, arquivoSelecionado, doc);
        } catch (Exception ex) {
            ctrlP.getMensagens().exibirMensagem(iFrameDocumento, "Erro: "+ex.toString());
        }
    }
    
    
}
