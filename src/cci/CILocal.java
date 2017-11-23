package cci;

import cgt.GTLocal;
import cih.local.IFrameLocal;
import java.util.ArrayList;
import java.util.List;

public class CILocal {
    private GTLocal     gtLocal;
    private CIPrincipal ctrlP;
    private IFrameLocal iFrameLocal;

    public CILocal(CIPrincipal ctrlP) {
        this.ctrlP = ctrlP;
        gtLocal = new GTLocal();
    }
    //metodo que abre a tela cadastro local
    public void abrirCadastro() {
        iFrameLocal = new IFrameLocal(this);
        ctrlP.getJanelaPrincipal().getDesktopPane().add(iFrameLocal);
        iFrameLocal.setVisible(true);
    }
  
    public List getListaLocais() {
        return gtLocal.listar();
    }
    
    public List listarLocal() {
        List lista = ctrlP.getGtPrincipal().getGtLocal().listar();
        if(lista != null)
            return lista;
        else{
            ctrlP.getMensagens().exibirMenssagem(iFrameLocal, "Nenhum tipo de documento cadastrado");
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
        ctrlP.getMensagens().exibirMenssagem(iFrameLocal, texto);
    }

    public void alterarLocal(Object objId, String nome, String desc, String qtd) {
        validarCampos(nome, desc, qtd);
        ctrlP.getGtPrincipal().getGtLocal().alterarLocal(objId, nome, desc, qtd);
    }

    public void excluirLocal(Object localAux) {
        ctrlP.getGtPrincipal().getGtLocal().excluirLocal(localAux);
    }
}
