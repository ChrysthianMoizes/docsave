package cih.documento;

import cci.CIDocumento;
import cdp.Compartimento;
import cdp.Referenciado;
import cdp.TipoDocumento;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

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
        jLabelTipoDeDocumentoDoc = new javax.swing.JLabel();
        jComboBoxTipoDeDocumentoDoc = new javax.swing.JComboBox<>();
        jLabelReferenciadoDoc = new javax.swing.JLabel();
        jComboBoxReferenciadoDoc = new javax.swing.JComboBox<>();
        jLabelDocumentoDoc = new javax.swing.JLabel();
        jTextFieldDocumentoDoc = new javax.swing.JTextField();
        jButtonSelecionarDoc = new javax.swing.JButton();
        jPanelLocalizacao = new javax.swing.JPanel();
        jLabelCompartimentoDoc = new javax.swing.JLabel();
        jComboBoxCompartimento = new javax.swing.JComboBox<>();
        jLabelMobilia = new javax.swing.JLabel();
        jComboBoxMobilia = new javax.swing.JComboBox<>();
        jLabelLocal = new javax.swing.JLabel();
        jComboBoxLocal = new javax.swing.JComboBox<>();

        setName("Cadastrar"); // NOI18N

        jLabelCodigoDoc.setText("Codigo");

        jLabelNomeDoc.setText("Nome");

        jButtonSalvarCadastroDoc.setText("Salvar");
        jButtonSalvarCadastroDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarCadastroDocActionPerformed(evt);
            }
        });

        jLabelTipoDeDocumentoDoc.setText("Tipo Documento");

        jLabelReferenciadoDoc.setText("Referenciado");

        jLabelDocumentoDoc.setText("Documento");

        jTextFieldDocumentoDoc.setEnabled(false);

        jButtonSelecionarDoc.setText("Selecionar");
        jButtonSelecionarDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSelecionarDocActionPerformed(evt);
            }
        });

        jPanelLocalizacao.setBorder(javax.swing.BorderFactory.createTitledBorder("Localização"));

        jLabelCompartimentoDoc.setText("Compartimento");

        jLabelMobilia.setText("Mobilia");

        jComboBoxMobilia.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxMobiliaItemStateChanged(evt);
            }
        });

        jLabelLocal.setText("Local");

        jComboBoxLocal.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxLocalItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanelLocalizacaoLayout = new javax.swing.GroupLayout(jPanelLocalizacao);
        jPanelLocalizacao.setLayout(jPanelLocalizacaoLayout);
        jPanelLocalizacaoLayout.setHorizontalGroup(
            jPanelLocalizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLocalizacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLocalizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelLocal)
                    .addComponent(jLabelMobilia)
                    .addComponent(jLabelCompartimentoDoc))
                .addGap(10, 10, 10)
                .addGroup(jPanelLocalizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBoxLocal, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBoxMobilia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBoxCompartimento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelLocalizacaoLayout.setVerticalGroup(
            jPanelLocalizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLocalizacaoLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanelLocalizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLocal)
                    .addComponent(jComboBoxLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelLocalizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMobilia)
                    .addComponent(jComboBoxMobilia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelLocalizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCompartimentoDoc)
                    .addComponent(jComboBoxCompartimento))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonSalvarCadastroDoc)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanelLocalizacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelNomeDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCodigoDoc))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldCodigoDoc)
                            .addComponent(jTextFieldNomeDoc)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelDocumentoDoc)
                            .addComponent(jLabelTipoDeDocumentoDoc)
                            .addComponent(jLabelReferenciadoDoc))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldDocumentoDoc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonSelecionarDoc))
                            .addComponent(jComboBoxReferenciadoDoc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxTipoDeDocumentoDoc, 0, 412, Short.MAX_VALUE))))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNomeDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNomeDoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanelLocalizacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(jButtonSelecionarDoc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonSalvarCadastroDoc)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvarCadastroDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarCadastroDocActionPerformed
        ArrayList erro = new ArrayList();
        if(jTextFieldCodigoDoc.getText().equals(""))
            erro.add("Codigo");
        if(jTextFieldNomeDoc.getText().equals(""))
            erro.add("Nome");
        if(jComboBoxCompartimento.getSelectedItem().equals("Selecione"))
            erro.add("Compartimento");
        if(jComboBoxLocal.getSelectedItem().equals("Selecione"))
            erro.add("Local");
        if(jComboBoxMobilia.getSelectedItem().equals("Selecione"))
            erro.add("Mobilia");
        if(jComboBoxReferenciadoDoc.getSelectedItem().equals("Selecione"))
            erro.add("Referenciado");
        if(jComboBoxTipoDeDocumentoDoc.getSelectedItem().equals("Selecione"))
            erro.add("Tipo de Docmento");
        if(arquivoSelecionado == null)
            erro.add("Documento");
        if(ctrl.getCtrlP().getMensagens().validaCampos(this, erro)){
            String codigo = jTextFieldCodigoDoc.getText();
            String nome   = jTextFieldNomeDoc.getText();
            Compartimento compartimento = (Compartimento) jComboBoxCompartimento.getSelectedItem();
            TipoDocumento tpDocumento   = (TipoDocumento) jComboBoxTipoDeDocumentoDoc.getSelectedItem();
            Referenciado  referenciado  = (Referenciado) jComboBoxReferenciadoDoc.getSelectedItem();
            ctrl.cadastrarDocumento(codigo, nome, compartimento, tpDocumento, referenciado, arquivoSelecionado);
            ctrl.getCtrlP().getMensagens().exibirMensagem(this, "Documento cadastrado com sucesso!");
            limparCampos();
        }
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

    private void jComboBoxLocalItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxLocalItemStateChanged
        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
            ctrl.preencherMobilia(jComboBoxMobilia, jComboBoxLocal.getSelectedItem());
        }
    }//GEN-LAST:event_jComboBoxLocalItemStateChanged

    private void jComboBoxMobiliaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxMobiliaItemStateChanged
         if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
            ctrl.preencherCompartimento(jComboBoxCompartimento, jComboBoxMobilia.getSelectedItem());
        }
    }//GEN-LAST:event_jComboBoxMobiliaItemStateChanged

    private void preencherCampos() {
        ctrl.preencherCompartimento(jComboBoxCompartimento);
        ctrl.preencherTipoDocumento(jComboBoxTipoDeDocumentoDoc);
        ctrl.preencherReferenciado(jComboBoxReferenciadoDoc);
        ctrl.preencherLocal(jComboBoxLocal);
    }
    
    public void limparCampos() {
        preencherCampos();
        jComboBoxMobilia.setSelectedIndex(0);
        jTextFieldCodigoDoc.setText("");
        jTextFieldNomeDoc.setText("");
        jTextFieldDocumentoDoc.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSalvarCadastroDoc;
    private javax.swing.JButton jButtonSelecionarDoc;
    private javax.swing.JComboBox<String> jComboBoxCompartimento;
    private javax.swing.JComboBox<String> jComboBoxLocal;
    private javax.swing.JComboBox<String> jComboBoxMobilia;
    private javax.swing.JComboBox<String> jComboBoxReferenciadoDoc;
    private javax.swing.JComboBox<String> jComboBoxTipoDeDocumentoDoc;
    private javax.swing.JFileChooser jFileChooserDocumento;
    private javax.swing.JLabel jLabelCodigoDoc;
    private javax.swing.JLabel jLabelCompartimentoDoc;
    private javax.swing.JLabel jLabelDocumentoDoc;
    private javax.swing.JLabel jLabelLocal;
    private javax.swing.JLabel jLabelMobilia;
    private javax.swing.JLabel jLabelNomeDoc;
    private javax.swing.JLabel jLabelReferenciadoDoc;
    private javax.swing.JLabel jLabelTipoDeDocumentoDoc;
    private javax.swing.JPanel jPanelLocalizacao;
    private javax.swing.JTextField jTextFieldCodigoDoc;
    private javax.swing.JTextField jTextFieldDocumentoDoc;
    private javax.swing.JTextField jTextFieldNomeDoc;
    // End of variables declaration//GEN-END:variables

    private void validar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
