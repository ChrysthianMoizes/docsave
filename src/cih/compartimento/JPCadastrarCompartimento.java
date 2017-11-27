package cih.compartimento;

import cci.CICompartimento;
import java.util.ArrayList;

public class JPCadastrarCompartimento extends javax.swing.JPanel {

    CICompartimento ctrl;
    public JPCadastrarCompartimento(CICompartimento ctrl) {
        this.ctrl = ctrl;
        initComponents();
        preencherCampos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNome = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        lblIdentificador = new javax.swing.JLabel();
        txtIdentificaor = new javax.swing.JTextField();
        lblQtdCompartimento = new javax.swing.JLabel();
        spnQtdCompartimento = new javax.swing.JSpinner();
        lblCapacidade = new javax.swing.JLabel();
        txtCapacidade = new javax.swing.JTextField();
        cmbCompartimento = new javax.swing.JComboBox<>();
        lblCompartimento = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();

        setName("Cadastrar"); // NOI18N
        setPreferredSize(new java.awt.Dimension(548, 431));

        lblNome.setText("Nome");

        lblIdentificador.setText("Identificador");

        lblQtdCompartimento.setText("Quantidade de compartimentos");

        spnQtdCompartimento.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));

        lblCapacidade.setText("Capacidade");

        lblCompartimento.setText("Compartimento interno");

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCapacidade)
                    .addComponent(lblIdentificador)
                    .addComponent(lblNome)
                    .addComponent(lblCompartimento))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtIdentificaor, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(39, 39, 39)
                            .addComponent(lblQtdCompartimento)
                            .addGap(18, 18, 18)
                            .addComponent(spnQtdCompartimento))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(cmbCompartimento, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtCapacidade, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdentificador)
                    .addComponent(txtIdentificaor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQtdCompartimento)
                    .addComponent(spnQtdCompartimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCapacidade)
                    .addComponent(txtCapacidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbCompartimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCompartimento)))
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE))
                .addContainerGap(218, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
       ArrayList<String> erro = new ArrayList<String>();
        if(txtNome.getText().equals(""))
            erro.add("Nome");
        if(txtIdentificaor.getText().equals(""))
            erro.add("Identificador");
        if(txtCapacidade.getText().equals(""))
            erro.add("Capacidade");
        //if(cmbCompartimento.getSelectedItem().toString().equals("Selecione"))
        //    erro.add("Compartimento Interno");
        if(spnQtdCompartimento.getValue().toString().equals("0"))
            erro.add("Quantidade de compartimentos");
        if(ctrl.getCtrlP().getMensagens().validaCampos(this, erro))
            ctrl.cadastrarCompartimento(txtNome.getText(), txtIdentificaor.getText(), 
                    txtCapacidade.getText(), cmbCompartimento.getSelectedItem(), spnQtdCompartimento.getValue().toString());
    }//GEN-LAST:event_btnCadastrarActionPerformed

    
    private void preencherCampos(){
        //ctrl.preencherMobilia(cmbCompartimento);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JComboBox<String> cmbCompartimento;
    private javax.swing.JLabel lblCapacidade;
    private javax.swing.JLabel lblCompartimento;
    private javax.swing.JLabel lblIdentificador;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblQtdCompartimento;
    private javax.swing.JSpinner spnQtdCompartimento;
    private javax.swing.JTextField txtCapacidade;
    private javax.swing.JTextField txtIdentificaor;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
