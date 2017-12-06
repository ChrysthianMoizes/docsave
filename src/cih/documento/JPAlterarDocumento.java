package cih.documento;

import cci.CIDocumento;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class JPAlterarDocumento extends javax.swing.JPanel {
    CIDocumento ctrl;
    Object[] doc;
    byte[] arquivoSelecionado = null;
    File arq;
    public JPAlterarDocumento(CIDocumento ciDocumento) {
        initComponents();
        this.ctrl = ciDocumento;
        jButtonVisualizar.setEnabled(false);
        preencherCampos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooserDocumento = new javax.swing.JFileChooser();
        jButtonSalvarAlteracaoDoc = new javax.swing.JButton();
        jLabelCodigoDoc = new javax.swing.JLabel();
        jTextFieldCodigoDoc = new javax.swing.JTextField();
        jTextFieldNomeDoc = new javax.swing.JTextField();
        jLabelNomeDoc = new javax.swing.JLabel();
        jPanelLocalizacao = new javax.swing.JPanel();
        jLabelCompartimentoDoc = new javax.swing.JLabel();
        jComboBoxCompartimento = new javax.swing.JComboBox<>();
        jLabelMobilia = new javax.swing.JLabel();
        jComboBoxMobilia = new javax.swing.JComboBox<>();
        jLabelLocal = new javax.swing.JLabel();
        jComboBoxLocal = new javax.swing.JComboBox<>();
        jComboBoxTipoDeDocumentoDoc = new javax.swing.JComboBox<>();
        jLabelTipoDeDocumentoDoc = new javax.swing.JLabel();
        jLabelReferenciadoDoc = new javax.swing.JLabel();
        jComboBoxReferenciadoDoc = new javax.swing.JComboBox<>();
        jLabelDocumentoDoc = new javax.swing.JLabel();
        jButtonAlterarScan = new javax.swing.JButton();
        jButtonPesquisarAlteracaoDoc = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldCodigoPesq = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldNomePesq = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jButtonVisualizar = new javax.swing.JButton();
        jTextFieldDocumentoDoc = new javax.swing.JTextField();

        setName("Alterar"); // NOI18N

        jButtonSalvarAlteracaoDoc.setText("Salvar");
        jButtonSalvarAlteracaoDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarAlteracaoDocActionPerformed(evt);
            }
        });

        jLabelCodigoDoc.setText("Codigo");

        jLabelNomeDoc.setText("Nome");

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
                    .addComponent(jComboBoxCompartimento)))
        );

        jLabelTipoDeDocumentoDoc.setText("Tipo De Documento");

        jLabelReferenciadoDoc.setText("Referenciado");

        jLabelDocumentoDoc.setText("Documento");

        jButtonAlterarScan.setText("Alterar");
        jButtonAlterarScan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarScanActionPerformed(evt);
            }
        });

        jButtonPesquisarAlteracaoDoc.setText("Pesquisar");
        jButtonPesquisarAlteracaoDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarAlteracaoDocActionPerformed(evt);
            }
        });

        jLabel2.setText("Codigo");

        jLabel1.setText("Nome");

        jButtonVisualizar.setText("Visualizar");
        jButtonVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVisualizarActionPerformed(evt);
            }
        });

        jTextFieldDocumentoDoc.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabelDocumentoDoc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonVisualizar)
                        .addGap(12, 12, 12)
                        .addComponent(jButtonAlterarScan)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldDocumentoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonSalvarAlteracaoDoc))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCodigoPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldNomePesq, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonPesquisarAlteracaoDoc))
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
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelTipoDeDocumentoDoc)
                                    .addComponent(jLabelReferenciadoDoc))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxReferenciadoDoc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBoxTipoDeDocumentoDoc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPesquisarAlteracaoDoc)
                    .addComponent(jTextFieldNomePesq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCodigoPesq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(1, 1, 1)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCodigoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCodigoDoc))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNomeDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNomeDoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelLocalizacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                    .addComponent(jButtonAlterarScan)
                    .addComponent(jButtonVisualizar)
                    .addComponent(jTextFieldDocumentoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonSalvarAlteracaoDoc)
                .addGap(36, 36, 36))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvarAlteracaoDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarAlteracaoDocActionPerformed
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
            ctrl.getCtrlP().getGtPrincipal().getGtDocumento().fecharSessao();
            ctrl.alterarDocumento(jTextFieldCodigoDoc.getText(), jTextFieldNomeDoc.getText()
                , jComboBoxCompartimento.getSelectedItem(), jComboBoxLocal.getSelectedItem()
                , jComboBoxMobilia.getSelectedItem(), jComboBoxReferenciadoDoc.getSelectedItem()
                , jComboBoxTipoDeDocumentoDoc.getSelectedItem(), arquivoSelecionado, doc[1]);
            ctrl.getCtrlP().getMensagens().exibirMensagem(this, "Documento alterado com sucesso!");
            limparCampos();
        }
    }//GEN-LAST:event_jButtonSalvarAlteracaoDocActionPerformed

    private void jButtonAlterarScanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarScanActionPerformed
        int escolha = jFileChooserDocumento.showDialog(this, "Selecionar");
        if (escolha != JFileChooser.APPROVE_OPTION)
        JOptionPane.showMessageDialog(this, "Selecione um arquivo!", "Aviso", JOptionPane.ERROR);
        else {
            arq = jFileChooserDocumento.getSelectedFile();
            jTextFieldDocumentoDoc.setText(arq.getAbsolutePath());
        }
    }//GEN-LAST:event_jButtonAlterarScanActionPerformed

    private void jButtonPesquisarAlteracaoDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarAlteracaoDocActionPerformed
        ArrayList erro = new ArrayList();
        if(jTextFieldCodigoPesq.getText().equals(""))
            erro.add("Codigo");
        if(jTextFieldNomePesq.getText().equals(""))
            erro.add("Nome");
        if(ctrl.getCtrlP().getMensagens().validaCampos(this, erro)){
            doc = ctrl.consultarDocumento(jTextFieldCodigoPesq.getText(), jTextFieldNomePesq.getText());
            jTextFieldCodigoDoc.setText(doc[1].toString());
            jTextFieldNomeDoc.setText(doc[0].toString());
            jComboBoxTipoDeDocumentoDoc.setSelectedItem(doc[4]);
            jComboBoxReferenciadoDoc.setSelectedItem(doc[3]);
            jComboBoxLocal.setSelectedItem(doc[7]);
            jComboBoxMobilia.setSelectedItem(doc[6]);
            jComboBoxCompartimento.setSelectedItem(doc[2]);            
            arquivoSelecionado = (byte[]) doc[5];
            jButtonVisualizar.setEnabled(true);
        }
    }//GEN-LAST:event_jButtonPesquisarAlteracaoDocActionPerformed

    private void jButtonVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVisualizarActionPerformed
        ctrl.exibir(doc[5]);
    }//GEN-LAST:event_jButtonVisualizarActionPerformed

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
    private javax.swing.JButton jButtonAlterarScan;
    private javax.swing.JButton jButtonPesquisarAlteracaoDoc;
    private javax.swing.JButton jButtonSalvarAlteracaoDoc;
    private javax.swing.JButton jButtonVisualizar;
    private javax.swing.JComboBox<String> jComboBoxCompartimento;
    private javax.swing.JComboBox<String> jComboBoxLocal;
    private javax.swing.JComboBox<String> jComboBoxMobilia;
    private javax.swing.JComboBox<String> jComboBoxReferenciadoDoc;
    private javax.swing.JComboBox<String> jComboBoxTipoDeDocumentoDoc;
    private javax.swing.JFileChooser jFileChooserDocumento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelCodigoDoc;
    private javax.swing.JLabel jLabelCompartimentoDoc;
    private javax.swing.JLabel jLabelDocumentoDoc;
    private javax.swing.JLabel jLabelLocal;
    private javax.swing.JLabel jLabelMobilia;
    private javax.swing.JLabel jLabelNomeDoc;
    private javax.swing.JLabel jLabelReferenciadoDoc;
    private javax.swing.JLabel jLabelTipoDeDocumentoDoc;
    private javax.swing.JPanel jPanelLocalizacao;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextFieldCodigoDoc;
    private javax.swing.JTextField jTextFieldCodigoPesq;
    private javax.swing.JTextField jTextFieldDocumentoDoc;
    private javax.swing.JTextField jTextFieldNomeDoc;
    private javax.swing.JTextField jTextFieldNomePesq;
    // End of variables declaration//GEN-END:variables
}
