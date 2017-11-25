package cih.documento;

import cci.CIDocumento;
import cdp.Compartimento;
import cdp.Referenciado;
import cdp.TipoDocumento;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import sun.java2d.d3d.D3DRenderQueue;

public class JPCadastrarDocumento extends javax.swing.JPanel {
    CIDocumento ctrl;
    File arquivoSelecionado;
    
    public JPCadastrarDocumento(CIDocumento ciDocumento) {
        initComponents();
        this.ctrl = ciDocumento;
        preencherCampos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooserDocumento = new javax.swing.JFileChooser();
        jLabelCodigoDoc = new javax.swing.JLabel();
        jTextFieldCodigoDoc = new javax.swing.JTextField();
        jLabelNomeDoc = new javax.swing.JLabel();
        jTextFieldNomeDoc = new javax.swing.JTextField();
        jButtonSalvarCadastroDoc = new javax.swing.JButton();
        jLabelCompartimentoDoc = new javax.swing.JLabel();
        jComboBoxCompartimentoDoc = new javax.swing.JComboBox<>();
        jLabelTipoDeDocumentoDoc = new javax.swing.JLabel();
        jComboBoxTipoDeDocumentoDoc = new javax.swing.JComboBox<>();
        jLabelReferenciadoDoc = new javax.swing.JLabel();
        jComboBoxReferenciadoDoc = new javax.swing.JComboBox<>();
        jLabelDocumentoDoc = new javax.swing.JLabel();
        jTextFieldDocumentoDoc = new javax.swing.JTextField();
        jButtonSelecionarDoc = new javax.swing.JButton();

        setName("Cadastrar"); // NOI18N

        jLabelCodigoDoc.setText("Codigo");

        jLabelNomeDoc.setText("Nome");

        jButtonSalvarCadastroDoc.setText("Salvar");
        jButtonSalvarCadastroDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarCadastroDocActionPerformed(evt);
            }
        });

        jLabelCompartimentoDoc.setText("Compartimento");

        jComboBoxCompartimentoDoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabelTipoDeDocumentoDoc.setText("Tipo De Documento");

        jComboBoxTipoDeDocumentoDoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabelReferenciadoDoc.setText("Referenciado");

        jComboBoxReferenciadoDoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabelDocumentoDoc.setText("Documento");

        jTextFieldDocumentoDoc.setEnabled(false);

        jButtonSelecionarDoc.setText("Selecionar");
        jButtonSelecionarDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSelecionarDocActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelTipoDeDocumentoDoc)
                            .addComponent(jLabelReferenciadoDoc)
                            .addComponent(jLabelCompartimentoDoc)
                            .addComponent(jLabelNomeDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxCompartimentoDoc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxReferenciadoDoc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxTipoDeDocumentoDoc, 0, 396, Short.MAX_VALUE)
                            .addComponent(jTextFieldNomeDoc)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabelDocumentoDoc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldDocumentoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonSelecionarDoc))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonSalvarCadastroDoc)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(jLabelCodigoDoc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldCodigoDoc)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCodigoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCodigoDoc))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabelNomeDoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jTextFieldNomeDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(91, 91, 91)
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
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvarCadastroDoc))
                .addGap(29, 29, 29))
        ));
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvarCadastroDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarCadastroDocActionPerformed
        
        //validar();
        
        String codigo = jTextFieldCodigoDoc.getText();
        String nome   = jTextFieldNomeDoc.getText();
        Compartimento compartimento = (Compartimento) jComboBoxCompartimentoDoc.getSelectedItem();
        TipoDocumento tpDocumento   = (TipoDocumento) jComboBoxTipoDeDocumentoDoc.getSelectedItem();
        Referenciado  referenciado  = (Referenciado) jComboBoxReferenciadoDoc.getSelectedItem();
        ctrl.cadastrarDocumento(codigo, nome, compartimento, tpDocumento, referenciado, arquivoSelecionado);
        
        //limpar campos se cadastrou corretamente.
        //mensagem de alerta.
        
    }//GEN-LAST:event_jButtonSalvarCadastroDocActionPerformed

    private void jButtonSelecionarDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSelecionarDocActionPerformed
        int escolha = jFileChooserDocumento.showDialog(this, "Selecionar");
        if (escolha != JFileChooser.APPROVE_OPTION)
            JOptionPane.showMessageDialog(this, "Selecione um arquivo!", "Aviso", JOptionPane.ERROR);
        else {
            arquivoSelecionado = jFileChooserDocumento.getSelectedFile();
            jTextFieldDocumentoDoc.setText(arquivoSelecionado.getAbsolutePath());
        }
    }//GEN-LAST:event_jButtonSelecionarDocActionPerformed

    private void preencherCampos() {
        ctrl.preencherCompartimento(jComboBoxCompartimentoDoc);
        ctrl.preencherTipoDocumento(jComboBoxTipoDeDocumentoDoc);
        ctrl.preencherReferenciado(jComboBoxReferenciadoDoc);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSalvarCadastroDoc;
    private javax.swing.JButton jButtonSelecionarDoc;
    private javax.swing.JComboBox<String> jComboBoxCompartimentoDoc;
    private javax.swing.JComboBox<String> jComboBoxReferenciadoDoc;
    private javax.swing.JComboBox<String> jComboBoxTipoDeDocumentoDoc;
    private javax.swing.JFileChooser jFileChooserDocumento;
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

    private void validar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
