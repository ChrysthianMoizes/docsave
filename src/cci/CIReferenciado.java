/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cci;

import cih.referenciado.*;
import java.sql.SQLException;
import cih.util.JTableUtil;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;

/**
 *
 * @author reida
 */
public class CIReferenciado {
    private CIPrincipal ctrlP;
    private IFrameReferenciado iFrameReferenciado;
    private JPCadastrarReferenciado jpCadastrarReferenciado;
    private JPAlterarReferenciado jpAlterarReferenciado;
    private JPConsultarReferenciado jpConsultarReferenciado;
    public CIReferenciado(CIPrincipal ctrlP) {
        this.ctrlP = ctrlP;
        iFrameReferenciado = new IFrameReferenciado(this);
        jpCadastrarReferenciado = new JPCadastrarReferenciado(this);
        jpConsultarReferenciado = new JPConsultarReferenciado(this);
        jpAlterarReferenciado = new JPAlterarReferenciado(this);
        
    }
    
    public void carregarAbas(){
        iFrameReferenciado.getjTabPane().add(jpCadastrarReferenciado);
        iFrameReferenciado.getjTabPane().add(jpConsultarReferenciado);
        iFrameReferenciado.getjTabPane().add(jpAlterarReferenciado);
        iFrameReferenciado.revalidate();
        iFrameReferenciado.repaint();
    }

    public void abrirIFrameReferenciado(){
         ctrlP.getJanelaPrincipal().getDesktopPane().add(iFrameReferenciado);
         carregarAbas();
         iFrameReferenciado.setVisible(true);
    }
    
    public CIPrincipal getCtrlP() {
        return ctrlP;
    }

    public void cadastrarReferente(String nome, String cpf) {
        try {
            ctrlP.getGtPrincipal().getGtReferenciado().cadastrarReferente(nome, cpf);
        }catch (SQLException ex) {
            ctrlP.getMensagens().exibirMenssagem(iFrameReferenciado, "Erro: "+ex.getMessage());
        } catch (ClassNotFoundException ex) {
            ctrlP.getMensagens().exibirMenssagem(iFrameReferenciado, "Erro: "+ex.getMessage());
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
            ctrlP.getMensagens().exibirMenssagem(iFrameReferenciado, ex.getMessage());
        }
        Object refArray[] = ctrlP.getGtPrincipal().getGtReferenciado().converterParaArray(ref);
        if(refArray != null){
            return refArray;
        }
        else{
            ctrlP.getMensagens().exibirMenssagem(iFrameReferenciado, "Erro ao buscar Referente");
            return null;
        }
    }

    public void alterarReferente(String nome, String cpf, Object ref) {
        try {
            ctrlP.getGtPrincipal().getGtReferenciado().alterarReferente(nome, cpf, ref);
        } catch (Exception ex) {
            ctrlP.getMensagens().exibirMenssagem(iFrameReferenciado, "Erro: "+ex.getMessage());
        } 
    }
}
    
    
    

