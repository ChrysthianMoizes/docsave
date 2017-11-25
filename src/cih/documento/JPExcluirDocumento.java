package cih.documento;

import cci.CIDocumento;

public class JPExcluirDocumento extends javax.swing.JPanel {
    CIDocumento ciDocumento;
    
    public JPExcluirDocumento(CIDocumento ciDocumento) {
        initComponents();
        this.ciDocumento = ciDocumento;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelCodigoDoc = new javax.swing.JLabel();
        jTextFieldCodigoDoc = new javax.swing.JTextField();
        jLabelNomeDoc = new javax.swing.JLabel();
        jTextFieldNomeDoc = new javax.swing.JTextField();
        jButtonSalvarCadastroDoc = new javax.swing.JButton();
        jButtonCancelarCadastroDoc = new javax.swing.JButton();
        jLabelCompartimentoDoc = new javax.swing.JLabel();
        jComboBoxCompartimentoDoc = new javax.swing.JComboBox<>();
        jLabelTipoDeDocumentoDoc = new javax.swing.JLabel();
        jComboBoxTipoDeDocumentoDoc = new javax.swing.JComboBox<>();
        jLabelReferenciadoDoc = new javax.swing.JLabel();
        jComboBoxReferenciadoDoc = new javax.swing.JComboBox<>();
        jLabelDocumentoDoc = new javax.swing.JLabel();
        jTextFieldDocumentoDoc = new javax.swing.JTextField();
        jButtonPesquisarDoc = new javax.swing.JButton();

        setName("Excluir"); // NOI18N

        jLabelCodigoDoc.setText("Codigo");

        jLabelNomeDoc.setText("Nome");

        jButtonSalvarCadastroDoc.setText("Salvar");
        jButtonSalvarCadastroDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarCadastroDocActionPerformed(evt);
            }
        });

        jButtonCancelarCadastroDoc.setText("Cancelar");

        jLabelCompartimentoDoc.setText("Compartimento");

        jComboBoxCompartimentoDoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabelTipoDeDocumentoDoc.setText("Tipo De Documento");

        jComboBoxTipoDeDocumentoDoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabelReferenciadoDoc.setText("Referenciado");

        jComboBoxReferenciadoDoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabelDocumentoDoc.setText("Documento");

        jTextFieldDocumentoDoc.setEnabled(false);

        jButtonPesquisarDoc.setText("Selecionar");
        jButtonPesquisarDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarDocActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonSalvarCadastroDoc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonCancelarCadastroDoc))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabelDocumentoDoc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldDocumentoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonPesquisarDoc))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNomeDoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelCodigoDoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldCodigoDoc, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
                            .addComponent(jTextFieldNomeDoc)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelTipoDeDocumentoDoc)
                            .addComponent(jLabelReferenciadoDoc)
                            .addComponent(jLabelCompartimentoDoc))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxCompartimentoDoc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxReferenciadoDoc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxTipoDeDocumentoDoc, 0, 396, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabelCodigoDoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jTextFieldCodigoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabelNomeDoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jTextFieldNomeDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCompartimentoDoc)
                    .addComponent(jComboBoxCompartimentoDoc))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTipoDeDocumentoDoc)
                    .addComponent(jComboBoxTipoDeDocumentoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelReferenciadoDoc)
                    .addComponent(jComboBoxReferenciadoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDocumentoDoc)
                    .addComponent(jTextFieldDocumentoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisarDoc))
                .addGap(110, 110, 110)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvarCadastroDoc)
                    .addComponent(jButtonCancelarCadastroDoc))
                .addGap(29, 29, 29))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvarCadastroDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarCadastroDocActionPerformed

    }//GEN-LAST:event_jButtonSalvarCadastroDocActionPerformed

    private void jButtonPesquisarDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarDocActionPerformed
        //jFileChooserDocumentoDoc.accept();
    }//GEN-LAST:event_jButtonPesquisarDocActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelarCadastroDoc;
    private javax.swing.JButton jButtonPesquisarDoc;
    private javax.swing.JButton jButtonSalvarCadastroDoc;
    private javax.swing.JComboBox<String> jComboBoxCompartimentoDoc;
    private javax.swing.JComboBox<String> jComboBoxReferenciadoDoc;
    private javax.swing.JComboBox<String> jComboBoxTipoDeDocumentoDoc;
    private javax.swing.JLabel jLabelCodigoDoc;
    private javax.swing.JLabel jLabelCompartimentoDoc;
    private javax.swing.JLabel jLabelDocumentoDoc;
    private javax.swing.JLabel jLabelNomeDoc;
    private javax.swing.JLabel jLabelReferenciadoDoc;
    private javax.swing.JLabel jLabelTipoDeDocumentoDoc;
    private javax.swing.JTextField jTextFieldCodigoDoc;
    private javax.swing.JTextField jTextFieldDocumentoDoc;
    private javax.swing.JTextField jTextFieldNomeDoc;
    // End of variables declaration//GEN-END:variables
}
