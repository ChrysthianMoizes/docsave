/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cih.documento;

import cci.CIDocumento;
import java.awt.Frame;
import java.awt.Window;
import javax.swing.JInternalFrame;

public class JDialogDetalhes extends javax.swing.JDialog {

    Object documento[];
    CIDocumento ctrl;
    public JDialogDetalhes(JInternalFrame parent, boolean modal, Object[] documento, CIDocumento ciDocumento) {
        super();
        initComponents();
        this.ctrl = ciDocumento;
        this.setVisible(modal);
        this.setLocationRelativeTo(parent);
        this.documento = documento;
        preencherCampos(documento);
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelCodigo = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JLabel();
        jLabelCompartimento = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldCompartimento = new javax.swing.JTextField();
        jLabelTipoDocumento = new javax.swing.JLabel();
        jLabelReferenciado = new javax.swing.JLabel();
        jTextFieldTipoDocumento = new javax.swing.JTextField();
        jTextFieldReferenciado = new javax.swing.JTextField();
        jButtonOk = new javax.swing.JButton();
        jPanelDetalhe = new javax.swing.JPanel();
        jLabelMobilia = new javax.swing.JLabel();
        jTextFieldMobilia = new javax.swing.JTextField();
        jLabelLocal = new javax.swing.JLabel();
        jTextFieldLocal = new javax.swing.JTextField();
        jButtonVisualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(469, 319));
        setPreferredSize(new java.awt.Dimension(469, 319));

        jLabelCodigo.setText("Codígo");

        jLabelNome.setText("Nome");

        jLabelCompartimento.setText("Compartimento");

        jTextFieldCodigo.setEnabled(false);

        jTextFieldNome.setEnabled(false);

        jTextFieldCompartimento.setEnabled(false);

        jLabelTipoDocumento.setText("Tipo de Documento");

        jLabelReferenciado.setText("Referenciado");

        jTextFieldTipoDocumento.setEnabled(false);

        jTextFieldReferenciado.setEnabled(false);

        jButtonOk.setText("Ok");
        jButtonOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOkActionPerformed(evt);
            }
        });

        jPanelDetalhe.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelMobilia.setText("Mobília");

        jTextFieldMobilia.setEnabled(false);

        jLabelLocal.setText("Local");

        jTextFieldLocal.setEnabled(false);

        javax.swing.GroupLayout jPanelDetalheLayout = new javax.swing.GroupLayout(jPanelDetalhe);
        jPanelDetalhe.setLayout(jPanelDetalheLayout);
        jPanelDetalheLayout.setHorizontalGroup(
            jPanelDetalheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDetalheLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDetalheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelMobilia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelLocal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDetalheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldMobilia)
                    .addComponent(jTextFieldLocal))
                .addContainerGap())
        );
        jPanelDetalheLayout.setVerticalGroup(
            jPanelDetalheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDetalheLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDetalheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDetalheLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabelMobilia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jTextFieldMobilia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDetalheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDetalheLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabelLocal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jTextFieldLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jButtonVisualizar.setText("Visualizar Documento");
        jButtonVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVisualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelDetalhe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelCompartimento)
                        .addGap(37, 37, 37)
                        .addComponent(jTextFieldCompartimento))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelReferenciado)
                            .addComponent(jLabelTipoDocumento))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldTipoDocumento, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                            .addComponent(jTextFieldReferenciado)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCodigo)
                            .addComponent(jLabelNome))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNome)
                            .addComponent(jTextFieldCodigo)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonVisualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonOk)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldCodigo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabelNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldCompartimento)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelCompartimento, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelDetalhe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabelTipoDocumento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jTextFieldTipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabelReferenciado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jTextFieldReferenciado)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonOk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonVisualizar))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVisualizarActionPerformed
        //JDialogVisualizaDoc visualizador = new JDialogVisualizaDoc(this, true, documento[5]);
        ctrl.exibir(documento[5]);
    }//GEN-LAST:event_jButtonVisualizarActionPerformed

    private void jButtonOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOkActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonOkActionPerformed

 
    private void preencherCampos(Object[] documento){
        jTextFieldNome.setText(documento[0].toString());
        jTextFieldCodigo.setText(documento[1].toString());
        jTextFieldCompartimento.setText(documento[2].toString());
        jTextFieldReferenciado.setText(documento[3].toString());
        jTextFieldTipoDocumento.setText(documento[4].toString());
        jTextFieldMobilia.setText(documento[6].toString());
        jTextFieldLocal.setText(documento[7].toString());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonOk;
    private javax.swing.JButton jButtonVisualizar;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelCompartimento;
    private javax.swing.JLabel jLabelLocal;
    private javax.swing.JLabel jLabelMobilia;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelReferenciado;
    private javax.swing.JLabel jLabelTipoDocumento;
    private javax.swing.JPanel jPanelDetalhe;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldCompartimento;
    private javax.swing.JTextField jTextFieldLocal;
    private javax.swing.JTextField jTextFieldMobilia;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldReferenciado;
    private javax.swing.JTextField jTextFieldTipoDocumento;
    // End of variables declaration//GEN-END:variables
}
