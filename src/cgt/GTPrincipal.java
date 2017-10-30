/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cgt;

/**
 *
 * @author reida
 */
public class GTPrincipal {

    private GTCompartimento gtCompartimento;
    private GTDocumento gtDocumento;
    private GTLocal gtLocal;
    private GTMobilia gtMobilia;
    private GTPessoa gtPessoa;
    private GTReferenciado gtReferenciado;
    private GTTipoDocumento gtTipoDocumento;
    private GTUsuario gtUsuario;

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

    public GTCompartimento getGtCompartimento() {
        return gtCompartimento;
    }

    public GTDocumento getGtDocumento() {
        return gtDocumento;
    }

    public GTLocal getGtLocal() {
        return gtLocal;
    }

    public GTMobilia getGtMobilia() {
        return gtMobilia;
    }

    public GTPessoa getGtPessoa() {
        return gtPessoa;
    }

    public GTReferenciado getGtReferenciado() {
        return gtReferenciado;
    }

    public GTTipoDocumento getGtTipoDocumento() {
        return gtTipoDocumento;
    }

    public GTUsuario getGtUsuario() {
        return gtUsuario;
    }
    
    
    
}
