/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import GerenciaDeTarefas.*;
import Visao.InterfaceTipoDocumento.CadastroTipoDocumento;

/**
 *
 * @author reida
 */
public class CITipoDocumento {
    private CIPrincipal ctrlP;
    private CadastroTipoDocumento cadastroTipoDocumento;

    public CITipoDocumento(CIPrincipal ctrlP) {
        this.ctrlP = ctrlP;
    }
    
    public void AbrirInterfaceCadastroTipoDocumento(){
        cadastroTipoDocumento = new CadastroTipoDocumento(this);
        ctrlP.getJanelaPrincipal().add(cadastroTipoDocumento);
        cadastroTipoDocumento.setVisible(true);
    }
    
}
