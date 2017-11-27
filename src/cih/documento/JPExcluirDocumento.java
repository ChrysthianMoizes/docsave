package cih.documento;

import cci.CIDocumento;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
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
        jScrollPaneConsultaDoc = new javax.swing.JScrollPane();
        jTableConsultaDoc = new javax.swing.JTable();
        jComboBoxOpcoesConsultaDoc = new javax.swing.JComboBox<>();
        jTextFieldBuscaDoc = new javax.swing.JTextField();
        jButtonPesquisarConsultaDoc = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();

        setName("Excluir"); // NOI18N

        jTableConsultaDoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"RF123", "Prontuario", "Gaveta", ""}
            },
            new String [] {
                "Codigo", "Nome", "Compartimento", "Documento"
            }
        ));
        jTableConsultaDoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableConsultaDocMouseClicked(evt);
            }
        });
        jScrollPaneConsultaDoc.setViewportView(jTableConsultaDoc);

        jComboBoxOpcoesConsultaDoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Codigo", "Nome" }));

        jButtonPesquisarConsultaDoc.setText("Pesquisar");

        jButtonExcluir.setText("Excluir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneConsultaDoc)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jComboBoxOpcoesConsultaDoc, 0, 99, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldBuscaDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonPesquisarConsultaDoc)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonExcluir)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBuscaDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxOpcoesConsultaDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisarConsultaDoc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneConsultaDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonExcluir)
                .addContainerGap(65, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTableConsultaDocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableConsultaDocMouseClicked

    }//GEN-LAST:event_jTableConsultaDocMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonPesquisarConsultaDoc;
    private javax.swing.JComboBox<String> jComboBoxOpcoesConsultaDoc;
    private javax.swing.JFileChooser jFileChooserDocumento;
    private javax.swing.JScrollPane jScrollPaneConsultaDoc;
    private javax.swing.JTable jTableConsultaDoc;
    private javax.swing.JTextField jTextFieldBuscaDoc;
    // End of variables declaration//GEN-END:variables
}
