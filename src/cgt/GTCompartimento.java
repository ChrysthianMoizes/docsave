/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cgt;

import cdp.Compartimento;
import cdp.Mobilia;
import cdp.TipoDocumento;
import cgd.GDCompartimento;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author reida
 */
public class GTCompartimento {
    
    GDCompartimento gdCompartimento;
    Iterator posicao = null;

    public GTCompartimento() {
        gdCompartimento = new GDCompartimento();
    }
    
    public void cadastrarCompartimento(String nome, String identificador, int capacidade
        , Object tipoDocumento, Object gaveta, int qtd) throws SQLException, ClassNotFoundException{
        
        Compartimento cmp = null;
        cmp = new Compartimento(identificador, nome, capacidade, (Mobilia)gaveta
                , (TipoDocumento)tipoDocumento);
        if(cmp != null)
            gdCompartimento.cadastrar(cmp);
    }
    
    public Object[][] consultarCompartimento(List listaR){
        List lista = gdCompartimento.consultar(Compartimento.class);
        listaR.addAll(lista);
        Object[][] listaRetorno = null;
        if(lista != null){
            listaRetorno = new Object[lista.size()][];
            int i = 0;
            for (Iterator it = lista.iterator(); it.hasNext();) {
                Compartimento item = (Compartimento) it.next();
                listaRetorno[i] = paraArrayTabela(item);
                i++;
            }
            return listaRetorno;
        }
        return null;
    }
    
    public Object[] consultarCompartimento(Object objPesquisa){
       Compartimento comp = gdCompartimento.consultarCompartimento(objPesquisa.toString());
       return paraArrayTabela(comp);
    }
    
    //Este metodo pode ir para a classe compartimento, a discutir com o grupo
    public Object[] paraArrayTabela(Compartimento comp){
        return new Object[]{comp.getCodigo(), comp, comp.getMobilia()};
    }
    
    public List consultarCompartimentoParaLista(){
        return gdCompartimento.consultar(Compartimento.class);
    }
    
    public void alterarCompartimento(String nome, String identificador, int capacidade
            , Object tipoDocumento, Object gaveta, int qtd) throws SQLException, ClassNotFoundException{
        Compartimento cmp = null;
        cmp = new Compartimento(identificador, nome, capacidade, (Mobilia)gaveta
                , (TipoDocumento)tipoDocumento);
        if(cmp != null)
            gdCompartimento.alterar(cmp);
    }

    public Object[] toArrayCompartimento(Object compartimento) {
        return Compartimento.toArray((Compartimento) compartimento);
    }

    public void excluirCompartimento(Object comp) throws SQLException, ClassNotFoundException {
        gdCompartimento.excluir(comp);
    }
}
