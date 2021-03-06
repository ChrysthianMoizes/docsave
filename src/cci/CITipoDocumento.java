package cci;

import java.util.List;
import java.util.ArrayList;
import cih.tipoDocumento.IFrameTipoDocumento;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class CITipoDocumento {
    private CIPrincipal ctrlP;
    private IFrameTipoDocumento iFrameTipoDocumento;

    public CITipoDocumento(CIPrincipal ctrlP) {
        this.ctrlP = ctrlP;
    }
    
    public void cadastrarTipoDocumento(String nome, String descricao) {
        if(validarCampos(nome, descricao))
            ctrlP.getGtPrincipal().getGtTipoDocumento().cadastrarTipoDocumento(nome, descricao);
    }
    
    public List carregarCmbBoxTipoDocumento() {
       return ctrlP.getGtPrincipal().getGtTipoDocumento().obterTipoDocumento();
    }
    
    public void abrirIFrame() {
        iFrameTipoDocumento = new IFrameTipoDocumento(this);
        ctrlP.getJanelaPrincipal().getDesktopPane().add(iFrameTipoDocumento);
        iFrameTipoDocumento.setVisible(true);
    }
    
    public void consultarTipoDocumento(String nome) {
        List lista = ctrlP.getGtPrincipal().getGtTipoDocumento().consultarTipoDocumento(nome);
        iFrameTipoDocumento.preencherCamposConsulta((String)lista.get(1), (String)lista.get(2));
    }
    
    public void alterarTipoDocumento(Object objId, String nome, String desc) {
        validarCampos(nome, desc);
        ctrlP.getGtPrincipal().getGtTipoDocumento().alterarTipoDocumento(objId, nome, desc);
    }
    
    public void exibirMenssagemInformativa(String texto) {
        ctrlP.getMensagens().exibirMensagem(iFrameTipoDocumento, texto);
    }
    
    public void excluirTipoDocumento(Object tDocumento) {
        ctrlP.getGtPrincipal().getGtTipoDocumento().excluirTipoDocumento(tDocumento);
    }
    
    public String getDescricao(Object item) {
        return ctrlP.getGtPrincipal().getGtTipoDocumento().getDescricao(item);
    }
    
    public List listarTipoDocumento() {
        List lista = ctrlP.getGtPrincipal().getGtTipoDocumento().listarTipoDocumento();
        if(lista != null)
            return lista;
        else{
            ctrlP.getMensagens().exibirMensagem(iFrameTipoDocumento, "Nenhum tipo de documento cadastrado");
            return null;
        }
    }
    
    private boolean validarCampos(String nome, String descricao) {
        ArrayList<String> listaErro = new ArrayList<>();
        if(nome.equals("")){
            listaErro.add("Nome");
        }
        if(descricao.equals("")){
            listaErro.add("Descrição");
        }
        return ctrlP.getMensagens().validaCampos(iFrameTipoDocumento, listaErro);
    }

    public void preencherCampos(Object obj, JTextField txtNome, JTextArea descricao) {
        ArrayList<String> tipoDocToArray = ctrlP.getGtPrincipal().getGtTipoDocumento().tipoDocToArray(obj);
        txtNome.setText(tipoDocToArray.get(0));
        descricao.setText(tipoDocToArray.get(1));
    }
    
}
