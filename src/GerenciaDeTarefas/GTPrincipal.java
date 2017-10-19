/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GerenciaDeTarefas;

/**
 *
 * @author reida
 */
public class GTPrincipal {

    GTCompartimento gtCompartimento;
    GTDocumento gtDocumento;
    GTLocal gtLocal;
    GTMobilia gtMobilia;
    GTPessoa gtPessoa;
    GTReferenciado gtReferenciado;
    GTTipoDocumento gtTipoDocumento;
    GTUsuario gtUsuario;

    public GTPrincipal() {
        gtCompartimento = new GTCompartimento();
        gtDocumento = new GTDocumento();
        gtLocal = new GTLocal();
        gtMobilia = new GTMobilia();
        gtPessoa = new GTPessoa();
        gtReferenciado = new GTReferenciado();
        gtTipoDocumento = new GTTipoDocumento();
        gtUsuario = new GTUsuario();
    }  
    
}
