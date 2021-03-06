package cgt;

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
        gtDocumento = new GTDocumento(this);
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
