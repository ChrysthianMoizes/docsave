/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cih.referenciado;

import cci.CIReferenciado;
import cih.referenciado.*;

import javax.swing.JTabbedPane;

/**
 *
 * @author reida
 */
public class IFrameReferenciado extends javax.swing.JInternalFrame {

    /**
     * Creates new form IFrameReferenciado
     */
    CIReferenciado ctrl;
    public IFrameReferenciado(CIReferenciado ctrl) {
        this.ctrl = ctrl;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelDeAbas = new javax.swing.JTabbedPane();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Refrênciado");

        painelDeAbas.setPreferredSize(new java.awt.Dimension(548, 431));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelDeAbas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelDeAbas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JTabbedPane getjTabPane() {
        return painelDeAbas;
    }
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane painelDeAbas;
    // End of variables declaration//GEN-END:variables
}
