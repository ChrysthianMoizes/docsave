package cih.base;

import javax.swing.Icon;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import cci.CIPrincipal;
import cci.util.Modulo;
import cih.base.PanelMenu;

public class FramePrincipal extends javax.swing.JFrame {

    private CIPrincipal ctrlP;
    PanelMenu menuPadrao;
    
    public FramePrincipal(CIPrincipal ctrlP) {
        this.ctrlP = ctrlP;
        initComponents();
        menuPadrao = new PanelMenu(ctrlP); 
        //desktopPane.setMaximumSize();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        panelMenu = new javax.swing.JPanel();
        desktopPane = new javax.swing.JDesktopPane();
        lblFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelPrincipal.setLayout(new javax.swing.BoxLayout(panelPrincipal, javax.swing.BoxLayout.LINE_AXIS));

        panelMenu.setPreferredSize(new java.awt.Dimension(126, 675));
        panelMenu.setLayout(new javax.swing.BoxLayout(panelMenu, javax.swing.BoxLayout.LINE_AXIS));
        panelPrincipal.add(panelMenu);

        desktopPane.setBackground(new java.awt.Color(0, 204, 255));
        desktopPane.setAutoscrolls(true);
        desktopPane.setMaximumSize(getMaximumSize());

        lblFundo.setText("jLabel1");

        desktopPane.setLayer(lblFundo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopPaneLayout.createSequentialGroup()
                .addComponent(lblFundo, javax.swing.GroupLayout.PREFERRED_SIZE, 1334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopPaneLayout.createSequentialGroup()
                .addComponent(lblFundo, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelPrincipal.add(desktopPane);
        desktopPane.getAccessibleContext().setAccessibleParent(this);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 1268, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JDesktopPane getDesktopPane() {
        return desktopPane;
    }

    public JPanel getPanelMenu() {
        return panelMenu;
    }

    public PanelMenu getMenuPadrao() {
        return menuPadrao;
    }

    public void configurarDesktopPane() {
        Icon img = new ImageIcon("src//cih/imagens/fundo.jpg");
        lblFundo.setIcon(img);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        desktopPane.setMaximumSize(panelPrincipal.getMaximumSize());
        ctrlP.alterarMenu(Modulo.MENU_PRINCIPAL);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JLabel lblFundo;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
