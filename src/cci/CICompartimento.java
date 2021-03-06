package cci;

import java.util.List;
import java.util.ArrayList;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
import cih.compartimento.IFrameCompartimento;
import cih.compartimento.JPAlterarCompartimento;
import cih.compartimento.JPCadastrarCompartimento;
import cih.compartimento.JPConsultarCompartimento;
import cih.compartimento.JPExcluirCompartimento;

public class CICompartimento {
    private CIPrincipal ctrlP;
    private IFrameCompartimento      iFrameCompartimento;
    private JPCadastrarCompartimento jpCadastrarCompartimento;
    private JPConsultarCompartimento jpConsultarCompartimento;
    private JPAlterarCompartimento   jpAlterarCompartimento;
    private JPExcluirCompartimento   jpExcluirCompartimento;
    
    public CICompartimento(CIPrincipal ctrlP) {
        this.ctrlP = ctrlP;
    }
    
    public void abrirIFrame() {
        iFrameCompartimento      = new IFrameCompartimento(this);
        jpCadastrarCompartimento = new JPCadastrarCompartimento(this);
        jpConsultarCompartimento = new JPConsultarCompartimento(this);
        jpAlterarCompartimento   = new JPAlterarCompartimento(this);
        jpExcluirCompartimento   = new JPExcluirCompartimento(this);
        ctrlP.getJanelaPrincipal().getDesktopPane().add(iFrameCompartimento);
        carregarAbas();
        iFrameCompartimento.setVisible(true);
    }
    
    private void carregarAbas() {
        iFrameCompartimento.getjTabPane().add(jpCadastrarCompartimento);
        iFrameCompartimento.getjTabPane().add(jpConsultarCompartimento);
        iFrameCompartimento.getjTabPane().add(jpAlterarCompartimento);
        iFrameCompartimento.getjTabPane().add(jpExcluirCompartimento);
        iFrameCompartimento.revalidate();
        iFrameCompartimento.repaint();
    }
    
    public void cadastrarCompartimento(String nome, String identificador, String capacidade
            , Object gaveta, String qtd){
        int qtdCompartimento = Integer.parseInt(qtd);
        int cmp = Integer.parseInt(capacidade);
        try { 
            ctrlP.getGtPrincipal().getGtCompartimento().cadastrarCompartimento(nome,
                    identificador, cmp, gaveta, qtdCompartimento);
        } catch (SQLException ex) {
            ctrlP.getMensagens().exibirMensagem(jpCadastrarCompartimento, "Erro: "+ex.getMessage());
        } catch (ClassNotFoundException ex) {
            ctrlP.getMensagens().exibirMensagem(jpCadastrarCompartimento, "Erro: "+ex.getMessage());
        }
        
    }
    
    public void preencherMobilia(JComboBox cmbMobilia){
        cmbMobilia.removeAllItems();
        List lista = ctrlP.getGtPrincipal().getGtMobilia().obterMobilias();
        cmbMobilia.addItem("Selecione");
        for(Object item : lista){
            cmbMobilia.addItem(item);
        }
    }

    public CIPrincipal getCtrlP() {
        return ctrlP;
    }

    public void preencherTipoDocumento(JComboBox cmbTipoDocumento) {
        cmbTipoDocumento.removeAllItems();
        List lista = ctrlP.getGtPrincipal().getGtTipoDocumento().obterTipoDocumento();
        cmbTipoDocumento.addItem("Selecione");
        for(Object item : lista){
            cmbTipoDocumento.addItem(item);
        }        
    }
    
    public void consultarCompartimento(DefaultTableModel modelo, JComboBox cmb, ArrayList ids){
        List lista = new ArrayList();
        Object[][] dados = null;
        if(cmb.getSelectedItem().toString().equals("Selecione"))
            dados = ctrlP.getGtPrincipal().getGtCompartimento().consultarCompartimento(lista);
        else{
            dados = new Object[1][];
            dados[0] = ctrlP.getGtPrincipal().getGtCompartimento()
                    .consultarCompartimento(cmb.getSelectedItem());
        }
        if(dados != null){
            if(modelo != null){
                for(Object[] item : dados){
                    modelo.addRow(item);
                }
            }
            if(cmb != null){
                for(Object item : lista){
                    cmb.addItem(item);
                    int id = ctrlP.getGtPrincipal().getGtCompartimento().getId(item);
                    ids.add(id);
                }
            }
        }else
            ctrlP.getMensagens().exibirMensagem(jpConsultarCompartimento, "Nenhum compartimento interno cadastrado");
    }

    public void alterarCompartimento(String nome, String identificador, String capacidade, 
            Object mobilia, String qtd, Object id) {
        int qtdCompartimento = Integer.parseInt(qtd);
        int cmp = Integer.parseInt(capacidade);
        try {
            ctrlP.getGtPrincipal().getGtCompartimento().alterarCompartimento(nome,
                    identificador, cmp, mobilia, qtdCompartimento, id);
        } catch (Exception ex) {
            ctrlP.getMensagens().exibirMensagem(iFrameCompartimento, "Erro: "+ex.getMessage());
        }
    }
    
    public Object[] toArrayCompartimento(Object compartimento){
       return ctrlP.getGtPrincipal().getGtCompartimento().toArrayCompartimento(compartimento);
    }

    public void excluirCompartimento(Object comp) {
        try {
            ctrlP.getGtPrincipal().getGtCompartimento().excluirCompartimento(comp);
        } catch (SQLException ex) {
            ctrlP.getMensagens().exibirMensagem(iFrameCompartimento, "Erro: "+ex.getMessage());
        } catch (ClassNotFoundException ex) {
            ctrlP.getMensagens().exibirMensagem(iFrameCompartimento, "Erro: "+ex.getMessage());
        }
    }
    
    public List getLista() {
        return ctrlP.getGtPrincipal().getGtCompartimento().listar();
    }
}
