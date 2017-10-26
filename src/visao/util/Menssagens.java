/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao.util;

import controlador.CIPrincipal;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author reida
 */
public class Menssagens {
    CIPrincipal ctrlP;

    public Menssagens(CIPrincipal ctrlP) {
        this.ctrlP = ctrlP;
    }
    
    public void validaCampos(Component componentePai,ArrayList<String> listaErro){
        if(!listaErro.isEmpty()){
            String itens = "";
            for(String item:listaErro){
                itens += item;
                itens += ", ";
            }
            itens = itens.substring(0, (itens.length()-2));
            JOptionPane.showMessageDialog(componentePai, "Os seguintes campos estão branco: "+itens,
                    "Alerta! Campos em branco", JOptionPane.WARNING_MESSAGE);
        }
        
    }
    
    public void exibirMenssagem(Component componetePai, String texto){
        if(texto != null){
            JOptionPane.showMessageDialog(componetePai, texto, "Informativo", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
