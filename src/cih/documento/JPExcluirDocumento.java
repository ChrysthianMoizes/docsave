package cih.documento;

import cci.CIDocumento;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class JPExcluirDocumento extends javax.swing.JPanel {
    CIDocumento ciDocumento;
    
    public JPExcluirDocumento(CIDocumento ciDocumento) {
        initComponents();
        this.ciDocumento = ciDocumento;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooserDocumento = new javax.swing.JFileChooser();
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
        jTextFieldDocumentoDoc = new javax.swing.JTextField();
        jButtonSelecionarDoc = new javax.swing.JButton();
        jButtonSalvarExclusao = new javax.swing.JButton();
        jComboBoxOpcoesExcluirDoc = new javax.swing.JComboBox<>();
        jTextFieldBuscaExclusaoDoc = new javax.swing.JTextField();
        jButtonPesquisarExclusaoDoc = new javax.swing.JButton();

        setName("Excluir"); // NOI18N

        jLabelCodigoDoc.setText("Codigo");

        jLabelNomeDoc.setText("Nome");

        jPanelLocalizacao.setBorder(javax.swing.BorderFactory.createTitledBorder("Localização"));

        jLabelCompartimentoDoc.setText("Compartimento");

        jComboBoxCompartimento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabelMobilia.setText("Mobilia");

        jComboBoxMobilia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabelLocal.setText("Local");

        jComboBoxLocal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

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

        jComboBoxTipoDeDocumentoDoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabelTipoDeDocumentoDoc.setText("Tipo De Documento");

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

        jButtonSalvarExclusao.setText("Salvar");

        jComboBoxOpcoesExcluirDoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Codigo", "Nome" }));

        jButtonPesquisarExclusaoDoc.setText("Pesquisar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelTipoDeDocumentoDoc)
                            .addComponent(jLabelReferenciadoDoc))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxReferenciadoDoc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxTipoDeDocumentoDoc, 0, 396, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabelDocumentoDoc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldDocumentoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSelecionarDoc))
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
                        .addComponent(jButtonSalvarExclusao)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jComboBoxOpcoesExcluirDoc, 0, 99, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldBuscaExclusaoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonPesquisarExclusaoDoc)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBuscaExclusaoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxOpcoesExcluirDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisarExclusaoDoc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                .addComponent(jButtonSalvarExclusao)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSelecionarDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSelecionarDocActionPerformed
        int escolha = jFileChooserDocumento.showDialog(this, "Selecionar");
        if (escolha != JFileChooser.APPROVE_OPTION)
        JOptionPane.showMessageDialog(this, "Selecione um arquivo!", "Aviso", JOptionPane.ERROR);
        else {
            File arquivoSelecionado = jFileChooserDocumento.getSelectedFile();
            jTextFieldDocumentoDoc.setText(arquivoSelecionado.getAbsolutePath());
        }
    }//GEN-LAST:event_jButtonSelecionarDocActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonPesquisarExclusaoDoc;
    private javax.swing.JButton jButtonSalvarExclusao;
    private javax.swing.JButton jButtonSelecionarDoc;
    private javax.swing.JComboBox<String> jComboBoxCompartimento;
    private javax.swing.JComboBox<String> jComboBoxLocal;
    private javax.swing.JComboBox<String> jComboBoxMobilia;
    private javax.swing.JComboBox<String> jComboBoxOpcoesExcluirDoc;
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
    private javax.swing.JTextField jTextFieldBuscaExclusaoDoc;
    private javax.swing.JTextField jTextFieldCodigoDoc;
    private javax.swing.JTextField jTextFieldDocumentoDoc;
    private javax.swing.JTextField jTextFieldNomeDoc;
    // End of variables declaration//GEN-END:variables
}
