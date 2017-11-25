package cih.base;

import cci.CIPrincipal;

public class PanelMenu extends javax.swing.JPanel {

    private CIPrincipal ctrlP;
    
    public PanelMenu(CIPrincipal ctrlP) {
        this.ctrlP = ctrlP;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnTipoDocumento = new javax.swing.JButton();
        btnCompartimento = new javax.swing.JButton();
        btnDocumento = new javax.swing.JButton();
        btnLocal = new javax.swing.JButton();
        btnMobilia = new javax.swing.JButton();
        btnReferenciado = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(124, 671));

        btnTipoDocumento.setText("Tipo de Documento");
        btnTipoDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTipoDocumentoActionPerformed(evt);
            }
        });

        btnCompartimento.setText("Compartimento");
        btnCompartimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompartimentoActionPerformed(evt);
            }
        });

        btnDocumento.setText("Documento");
        btnDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDocumentoActionPerformed(evt);
            }
        });

        btnLocal.setText("Local");
        btnLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocalActionPerformed(evt);
            }
        });

        btnMobilia.setText("Mobilia");
        btnMobilia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMobiliaActionPerformed(evt);
            }
        });

        btnReferenciado.setText("Referentes");
        btnReferenciado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReferenciadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(btnTipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(btnDocumento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnCompartimento, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
            .addComponent(btnLocal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnMobilia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnReferenciado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCompartimento, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMobilia, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReferenciado, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(120, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnTipoDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTipoDocumentoActionPerformed
        ctrlP.getCiTipoDocumento().abrirCadastroTipoDocumento();
    }//GEN-LAST:event_btnTipoDocumentoActionPerformed

    private void btnLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocalActionPerformed
        ctrlP.getCiLocal().abrirCadastro();
    }//GEN-LAST:event_btnLocalActionPerformed

    private void btnMobiliaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMobiliaActionPerformed
        ctrlP.getCiMobilia().abrirCadastro();
    }//GEN-LAST:event_btnMobiliaActionPerformed
    private void btnCompartimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompartimentoActionPerformed
        ctrlP.getCiCompartimento().abrirIFrameCompartimento();
    }//GEN-LAST:event_btnCompartimentoActionPerformed

    private void btnReferenciadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReferenciadoActionPerformed
        ctrlP.getCiReferenciado().abrirIFrameReferenciado();
    }//GEN-LAST:event_btnReferenciadoActionPerformed

    private void btnDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDocumentoActionPerformed
        ctrlP.getCiDocumento().abrirIFrame();
    }//GEN-LAST:event_btnDocumentoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCompartimento;
    private javax.swing.JButton btnDocumento;
    private javax.swing.JButton btnLocal;
    private javax.swing.JButton btnMobilia;
    private javax.swing.JButton btnReferenciado;
    private javax.swing.JButton btnTipoDocumento;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
