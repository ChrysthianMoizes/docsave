package cci;

import java.util.List;
import java.util.ArrayList;
import cih.local.IFrameLocal;

public class CILocal {
    private CIPrincipal ctrlP;
    private IFrameLocal iFrameLocal;

    public CILocal(CIPrincipal ctrlP) {
        this.ctrlP = ctrlP;
    }
    
    public void abrirIFrame() {
        iFrameLocal = new IFrameLocal(this);
        ctrlP.getJanelaPrincipal().getDesktopPane().add(iFrameLocal);
        iFrameLocal.setVisible(true);
    }
  
    public List getListaLocais() {
        return ctrlP.getGtPrincipal().getGtLocal().listar();
    }
    
    public List listarLocal() {
        List lista = ctrlP.getGtPrincipal().getGtLocal().listar();
        if(lista != null)
            return lista;
        else{
            ctrlP.getMensagens().exibirMensagem(iFrameLocal, "Nenhum tipo de documento cadastrado");
            return null;
        }
    }

    public void cadastrarLocal(String nome, String desc, String qtd) {
        validarCampos(nome, desc, qtd);
        ctrlP.getGtPrincipal().getGtLocal().cadastrarLocal(nome, desc, qtd);
    }

    private void validarCampos(String nome, String desc, String qtd) {
        ArrayList<String> listaErro = new ArrayList<>();
        if(nome.equals("")){
            listaErro.add("Nome");
        }
        if(desc.equals("")){
            listaErro.add("Descrição");
        }
        if(qtd.equals("")){
            listaErro.add("Capacidade");
        }
        ctrlP.getMensagens().validaCampos(iFrameLocal, listaErro);
    }
    
    public void exibirMenssagemInformativa(String texto) {
        ctrlP.getMensagens().exibirMensagem(iFrameLocal, texto);
    }

    public void alterarLocal(Object objId, String nome, String desc, String qtd) {
        validarCampos(nome, desc, qtd);
        ctrlP.getGtPrincipal().getGtLocal().alterarLocal(objId, nome, desc, qtd);
    }

    public void excluirLocal(Object localAux) {
        ctrlP.getGtPrincipal().getGtLocal().excluirLocal(localAux);
    }
}
