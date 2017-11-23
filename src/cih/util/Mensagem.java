package cih.util;

import cci.CIPrincipal;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Mensagem {

    CIPrincipal ctrlP;

    public Mensagem(CIPrincipal ctrlP) {
        this.ctrlP = ctrlP;
    }

    public void validaCampos(Component componentePai, ArrayList<String> listaErro) {
        if (!listaErro.isEmpty()) {
            String itens = "";
            for (String item : listaErro) {
                itens += item;
                itens += ", ";
            }
            itens = itens.substring(0, (itens.length() - 2));
            JOptionPane.showMessageDialog(componentePai, "Os seguintes campos estão branco: " + itens,
                    "Alerta! Campos em branco", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void exibirMenssagem(Component componentePai, String texto) {
        if (texto != null) {
            JOptionPane.showMessageDialog(componentePai, texto, "Informativo", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
