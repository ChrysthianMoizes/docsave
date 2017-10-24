/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import visao.tipoDocumento.InterfaceTipoDocumento;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author reida
 */
public class CITipoDocumento {
    private CIPrincipal ctrlP;
    private InterfaceTipoDocumento interfaceTipoDocumento;

    public CITipoDocumento(CIPrincipal ctrlP) {
        this.ctrlP = ctrlP;
    }
    
    private void validaCampos(String nome, String descricao){
        ArrayList<String> listaErro = new ArrayList<>();
        if(nome.equals("")){
            listaErro.add("Nome");
        }
        if(descricao.equals("")){
            listaErro.add("Descrição");
        }
        ctrlP.getMenssagens().validaCampos(interfaceTipoDocumento, listaErro);
    }
    
    public void cadastrarTipoDocumento(String nome, String descricao){
        validaCampos(nome, descricao);
        ctrlP.getGtPrincipal().getGtTipoDocumento().cadastrarTipoDocumento(nome, descricao);
    }
    
    public List carregarCmbBoxTipoDocumento(){
       return ctrlP.getGtPrincipal().getGtTipoDocumento().carregarTipoDocumento();
    }
    
    public void AbrirInterfaceCadastroTipoDocumento(){
        interfaceTipoDocumento = new InterfaceTipoDocumento(this);
        ctrlP.getJanelaPrincipal().getDesktopPane().add(interfaceTipoDocumento);
        interfaceTipoDocumento.setVisible(true);
    }
    
    public void consultarTipoDocumento(String nome){
        List lista = ctrlP.getGtPrincipal().getGtTipoDocumento().consultarTipoDocumento(nome);
        interfaceTipoDocumento.preencherCamposConsulta((String)lista.get(1), (String)lista.get(2));
    }
    
    public void alterarTipoDocumento(int id, String nome, String desc){
        validaCampos(nome, desc);
        ctrlP.getGtPrincipal().getGtTipoDocumento().alterarTipoDocumento(id, nome, desc);
    }
    
    public void exibirMenssagemInformativa(String texto){
        ctrlP.getMenssagens().exibirMenssagem(interfaceTipoDocumento, texto);
    }
}
