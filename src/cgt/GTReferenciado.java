/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cgt;

import cdp.Referenciado;
import cgd.GDReferenciado;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author reida
 */
public class GTReferenciado {
    private GDReferenciado gdReferenciado;

    public GTReferenciado() {
        this.gdReferenciado = new GDReferenciado();
    }
    
    
    
    public void cadastrarReferente(String nome, String cpf) throws SQLException, ClassNotFoundException{
        Referenciado ref = null;
        ref = new Referenciado(nome, cpf, 0);
        gdReferenciado.cadastrar(ref);
    }

    public Object[][] consultarReferente(String nome, String cpf) {
        Object retorno[][] = null;
        List lista = null;
        if(nome != null && cpf != null){
            lista = gdReferenciado.consultarReferente(nome, cpf);
            
        }else{
            lista = gdReferenciado.consultar(Referenciado.class);
        }
        retorno = new Object[lista.size()][2];
            int i = 0;
            for(Object item : lista){
                Referenciado ref = (Referenciado)item;
                retorno[i][0] = ref;
                retorno[i][1] = ref.getCpf();
                i++;
            }
        return retorno;
    }

    public Object[] converterParaArray(Object ref) {
        if(ref != null){
            Referenciado referente = (Referenciado)ref;
            Object retorno[] = {referente.getNome(), referente.getCpf()};
            return retorno;
        }else
            return null;
    }

    public void alterarReferente(String nome, String cpf, Object ref) throws SQLException, ClassNotFoundException {
        Referenciado refOrig = (Referenciado)ref;
        Referenciado refNovo = new Referenciado(refOrig.getId(), nome, cpf, refOrig.getReferente());
        gdReferenciado.alterar(refNovo);
    }
    
    
}
