/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cih.compartimento;

import cci.CICompartimento;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author reida
 */
public class JPConsultarCompartimento extends javax.swing.JPanel {

    /**
     * Creates new form JPConsultarCompartimento
     */
    private CICompartimento ctrl;
    public JPConsultarCompartimento() {
        initComponents();
    }

    public JPConsultarCompartimento(CICompartimento ctrl) {
        this.ctrl = ctrl;
        initComponents();
        iniciarFrame();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbCompartimento = new javax.swing.JComboBox<>();
        lblCompartimento = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        btnConsultar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();

        setName("Consultar"); // NOI18N
        setPreferredSize(new java.awt.Dimension(548, 431));

        lblCompartimento.setText("Compatimento");

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificador", "Nome", "Compartimento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabela);

        btnConsultar.setText("Pesquisar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(lblCompartimento)
                .addGap(18, 18, 18)
                .addComponent(cmbCompartimento, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnConsultar)
                .addGap(18, 18, 18)
                .addComponent(btnAtualizar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCompartimento)
                    .addComponent(cmbCompartimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultar)
                    .addComponent(btnAtualizar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(115, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        iniciarFrame();
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        preencherCampos();
    }//GEN-LAST:event_btnConsultarActionPerformed


    public void iniciarFrame(){
        cmbCompartimento.removeAllItems();
        cmbCompartimento.addItem("Selecione");
        ctrl.consultarCompartimento(null, cmbCompartimento);
    }
    
    public void preencherCampos(){
        preencherTabela();
    }
    
    private void preencherTabela(){
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        tabela.removeAll();
        modelo.setRowCount(0);
        ctrl.consultarCompartimento(modelo, cmbCompartimento);
        tabela.setModel(modelo);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JComboBox<String> cmbCompartimento;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCompartimento;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}