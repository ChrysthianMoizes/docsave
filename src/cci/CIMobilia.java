package cci;

import cdp.Local;
import cdp.Mobilia;
import cgt.GTMobilia;
import java.util.List;
import java.util.ArrayList;
import cih.mobilia.IFrameMobilia;
import java.util.Collection;

public class CIMobilia {
    private CIPrincipal   ctrlP;
    private IFrameMobilia iFrameMobilia;
    private GTMobilia     gtMobilia;

    public CIMobilia(CIPrincipal ctrlP) {
        this.ctrlP = ctrlP;
        this.gtMobilia = new GTMobilia();
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
       return gtMobilia.carregar();
    }
    
    public List carregarCmbBoxLocais() {
       return ctrlP.getCiLocal().getListaLocais();
    }
    
    public List carregarTableCompartimentos() {
       return ctrlP.getCiCompartimento().getLista();
    }
    
    public void abrirCadastro() {
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
            gtMobilia.cadastrar(nome, identificador, capacidade, local, compartimentos);
            exibirMenssagemInformativa("Cadastro concluído com sucesso!");
            return true;
        }
        else 
            return validou;
    }
    
    public boolean alterar(Mobilia mobilia, String nome, String identificador, int capacidade, Local local, Collection compartimentos) {
        boolean validou = validarCampos(nome, identificador, capacidade, compartimentos);
        if (validou) {
            gtMobilia.alterar(mobilia, nome, identificador, capacidade, local, compartimentos);
            return true;
        }
        else 
            return validou;
    }
    
    public void exibirMenssagemInformativa(String texto) {
        ctrlP.getMensagens().exibirMenssagem(iFrameMobilia, texto);
    }
    
    public void excluir(Mobilia mobilia) {
        gtMobilia.excluir(mobilia);
    }
    
    public List listar() {
        List lista = gtMobilia.listar();
        if(lista != null)
            return lista;
        else{
            ctrlP.getMensagens().exibirMenssagem(iFrameMobilia, "Nenhuma mobília cadastrada");
            return null;
        }
    }

    public GTMobilia getGtMobilia() {
        return gtMobilia;
    }
}
