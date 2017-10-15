package controlador;

import dao.ConfigDAO;
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        
        new ConfigDAO();
        
        JOptionPane.showMessageDialog(null, "Hello Wordl!");
    }
    
}
