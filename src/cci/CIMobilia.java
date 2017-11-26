package cci;

import cdp.Local;
import cdp.Mobilia;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import cih.mobilia.IFrameMobilia;

public class CIMobilia {
    private CIPrincipal   ctrlP;
    private IFrameMobilia iFrameMobilia;

    public CIMobilia(CIPrincipal ctrlP) {
        this.ctrlP = ctrlP;
    }
    
    private boolean validarCampos(String nome, String identificador, int capacidade, Collection compartimentos) {
        ArrayList<String> listaErro = new ArrayList<>();
        if (nome.equals("")){
            listaErro.add("Nome");
        }
        if (identificador.equals("")){
            listaErro.add("Descrição");
        }
        if (capacidade == 0){
            listaErro.add("Capacidade");
        }
        if (compartimentos == null){
            listaErro.add("Compartimento");
        }
        if (listaErro.isEmpty())
            return true;
        else {
            ctrlP.getMensagens().validaCampos(iFrameMobilia, listaErro);
            return false;
        }
    }
    
    public List carregarCmbBoxMobilias() {
       return ctrlP.getGtPrincipal().getGtMobilia().carregar();
    }
    
    public List carregarCmbBoxLocais() {
       return ctrlP.getCiLocal().getListaLocais();
    }
    
    public List carregarTableCompartimentos() {
       return ctrlP.getCiCompartimento().getLista();
    }
    
    public void abrirIFrame() {
        iFrameMobilia = new IFrameMobilia(this);
        ctrlP.getJanelaPrincipal().getDesktopPane().add(iFrameMobilia);
        iFrameMobilia.setVisible(true);
    }
    
    public void consultar(Mobilia mobilia) {
        iFrameMobilia.preencherCamposConsulta(mobilia);
    }
    
    public boolean cadastrar(String nome, String identificador, int capacidade, Local local, Collection compartimentos) {
        boolean validou = validarCampos(nome, identificador, capacidade, compartimentos);
        if (validou) {
            ctrlP.getGtPrincipal().getGtMobilia().cadastrar(nome, identificador, capacidade, local, compartimentos);
            exibirMenssagemInformativa("Cadastro concluído com sucesso!");
            return true;
        }
        else 
            return validou;
    }
    
    public boolean alterar(Mobilia mobilia, String nome, String identificador, int capacidade, Local local, Collection compartimentos) {
        boolean validou = validarCampos(nome, identificador, capacidade, compartimentos);
        if (validou) {
            ctrlP.getGtPrincipal().getGtMobilia().alterar(mobilia, nome, identificador, capacidade, local, compartimentos);
            return true;
        }
        else 
            return validou;
    }
    
    public void exibirMenssagemInformativa(String texto) {
        ctrlP.getMensagens().exibirMensagem(iFrameMobilia, texto);
    }
    
    public void excluir(Mobilia mobilia) {
        ctrlP.getGtPrincipal().getGtMobilia().excluir(mobilia);
    }
    
    public List listar() {
        List lista = ctrlP.getGtPrincipal().getGtMobilia().listar();
        if(lista != null)
            return lista;
        else{
            ctrlP.getMensagens().exibirMensagem(iFrameMobilia, "Nenhuma mobília cadastrada");
            return null;
        }
    }
    
    public Local consultarLocal(int id) {
        return ctrlP.getGtPrincipal().getGtLocal().consultarId(id);
    }
}
