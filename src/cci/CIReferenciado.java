package cci;

import java.sql.SQLException;
import javax.swing.JTable;
import cih.util.JTableUtil;
import cih.referenciado.*;

public class CIReferenciado {
    private CIPrincipal ctrlP;
    private IFrameReferenciado      iFrameReferenciado;
    private JPCadastrarReferenciado jpCadastrarReferenciado;
    private JPAlterarReferenciado   jpAlterarReferenciado;
    private JPConsultarReferenciado jpConsultarReferenciado;
    
    public CIReferenciado(CIPrincipal ctrlP) {
        this.ctrlP = ctrlP;
    }

    public void abrirIFrame() {
        iFrameReferenciado      = new IFrameReferenciado(this);
        jpCadastrarReferenciado = new JPCadastrarReferenciado(this);
        jpConsultarReferenciado = new JPConsultarReferenciado(this);
        jpAlterarReferenciado   = new JPAlterarReferenciado(this);
        ctrlP.getJanelaPrincipal().getDesktopPane().add(iFrameReferenciado);
        carregarAbas();
        iFrameReferenciado.setVisible(true);
    }
    
    public void carregarAbas() {
        iFrameReferenciado.getjTabPane().add(jpCadastrarReferenciado);
        iFrameReferenciado.getjTabPane().add(jpConsultarReferenciado);
        iFrameReferenciado.getjTabPane().add(jpAlterarReferenciado);
        iFrameReferenciado.revalidate();
        iFrameReferenciado.repaint();
    }
    
    public CIPrincipal getCtrlP() {
        return ctrlP;
    }

    public void cadastrarReferente(String nome, String cpf) {
        try {
            ctrlP.getGtPrincipal().getGtReferenciado().cadastrarReferente(nome, cpf);
        }catch (SQLException ex) {
            ctrlP.getMensagens().exibirMensagem(iFrameReferenciado, "Erro: "+ex.getMessage());
        } catch (ClassNotFoundException ex) {
            ctrlP.getMensagens().exibirMensagem(iFrameReferenciado, "Erro: "+ex.getMessage());
        }
    }
    public void consultarReferentes(String nome, String cpf, JTable tabela) {
        Object[][] lista = ctrlP.getGtPrincipal().getGtReferenciado().consultarReferente(nome, cpf);
        JTableUtil.limparTabela(tabela);
        for(Object[] item : lista)
            JTableUtil.addLinha(tabela, item);
            
    }

    public Object[] preencherCampos(JTable tabela) {
        Object ref = null;
        try {
             ref = JTableUtil.getDadosLinhaSelecionada(tabela);
        } catch (Exception ex) {
            ctrlP.getMensagens().exibirMensagem(iFrameReferenciado, ex.getMessage());
        }
        Object refArray[] = ctrlP.getGtPrincipal().getGtReferenciado().converterParaArray(ref);
        if(refArray != null){
            return refArray;
        }
        else{
            ctrlP.getMensagens().exibirMensagem(iFrameReferenciado, "Erro ao buscar Referente");
            return null;
        }
    }

    public void alterarReferente(String nome, String cpf, Object ref) {
        try {
            ctrlP.getGtPrincipal().getGtReferenciado().alterarReferente(nome, cpf, ref);
        } catch (Exception ex) {
            ctrlP.getMensagens().exibirMensagem(iFrameReferenciado, "Erro: "+ex.getMessage());
        } 
    }
}
    
    
    

