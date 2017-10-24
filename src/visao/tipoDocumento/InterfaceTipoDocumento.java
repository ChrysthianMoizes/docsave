/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao.tipoDocumento;

import controlador.CITipoDocumento;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.event.ChangeEvent;
import javax.swing.plaf.basic.BasicComboBoxUI;

/**
 *
 * @author reida
 */
public class InterfaceTipoDocumento extends javax.swing.JInternalFrame {

    CITipoDocumento ctrl;
    List listaCmbBox;
    /**
     * Creates new form cadastroTipoDocumento
     */
    public InterfaceTipoDocumento(CITipoDocumento ctrl) {
        this.ctrl = ctrl;
        listaCmbBox = new ArrayList();
        initComponents();
        atualizarListCadastro();
        panelTab.addChangeListener(new javax.swing.event.ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
               limpartTodasInterfaces();
                preencherCmbBoxTipoDocumento(ctrl.carregarCmbBoxTipoDocumento());
                atualizarListCadastro();
            }
        });    
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTab = new javax.swing.JTabbedPane();
        paneCadastro = new javax.swing.JPanel();
        lblNomeTipoDocumento = new javax.swing.JLabel();
        txtNomeTipoDocumentoCadastro = new javax.swing.JTextField();
        lblDescricaoTipoDocumento = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaDescricaoTipoDocumentoCadastro = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        listTipoDocumento = new javax.swing.JList<>();
        btnSalvarCadastro = new javax.swing.JButton();
        btnCancelarTipoDocumento = new javax.swing.JButton();
        paneConsulta = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cmbTipoDocumentoConsulta = new javax.swing.JComboBox<>();
        txtNomeTipoDocumentoConsulta = new javax.swing.JTextField();
        lblNomeTipoDocumentoConsulta = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAreaDescricaoTipoDocumentoConsulta = new javax.swing.JTextArea();
        lblDescricaoTipoDocumentoConsulta = new javax.swing.JLabel();
        btnOK = new javax.swing.JButton();
        panelAlterar = new javax.swing.JPanel();
        txtNomeTipoDocumentoAlteracao = new javax.swing.JTextField();
        lblNomeTipoDocumentoAlteracao = new javax.swing.JLabel();
        lblDescricaoTipoDocumentoAlteracao = new javax.swing.JLabel();
        sctrollPaneAlteracao = new javax.swing.JScrollPane();
        txtAreaDescricaoTipoDocumentoAlteracao = new javax.swing.JTextArea();
        btnSalvarAlteracao = new javax.swing.JButton();
        lblTipoDocumentoAlteracao = new javax.swing.JLabel();
        cmbTipoDocumentoAlteracao = new javax.swing.JComboBox<>();
        panelExclusao = new javax.swing.JPanel();
        sctrollPaneAlteracao1 = new javax.swing.JScrollPane();
        txtAreaDescricaoTipoDocumentoExclusao = new javax.swing.JTextArea();
        lblDescricaoTipoDocumentoExclusao = new javax.swing.JLabel();
        lblNomeTipoDocumentoExclusao = new javax.swing.JLabel();
        txtNomeTipoDocumentoExclusao = new javax.swing.JTextField();
        lblTipoDocumentoExclusao = new javax.swing.JLabel();
        cmbTipoDocumentoExclusao = new javax.swing.JComboBox<>();
        btnSalvarExclusao = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        lblNomeTipoDocumento.setText("Nome");

        lblDescricaoTipoDocumento.setText("Descrição");

        txtAreaDescricaoTipoDocumentoCadastro.setColumns(20);
        txtAreaDescricaoTipoDocumentoCadastro.setRows(5);
        jScrollPane1.setViewportView(txtAreaDescricaoTipoDocumentoCadastro);

        jScrollPane2.setViewportView(listTipoDocumento);

        btnSalvarCadastro.setText("Salvar");
        btnSalvarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarCadastroActionPerformed(evt);
            }
        });

        btnCancelarTipoDocumento.setText("Cancelar");
        btnCancelarTipoDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarTipoDocumentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paneCadastroLayout = new javax.swing.GroupLayout(paneCadastro);
        paneCadastro.setLayout(paneCadastroLayout);
        paneCadastroLayout.setHorizontalGroup(
            paneCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneCadastroLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(paneCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDescricaoTipoDocumento)
                    .addGroup(paneCadastroLayout.createSequentialGroup()
                        .addComponent(lblNomeTipoDocumento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNomeTipoDocumentoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paneCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, paneCadastroLayout.createSequentialGroup()
                            .addComponent(btnSalvarCadastro)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCancelarTipoDocumento))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        paneCadastroLayout.setVerticalGroup(
            paneCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeTipoDocumento)
                    .addComponent(txtNomeTipoDocumentoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDescricaoTipoDocumento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(paneCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvarCadastro)
                    .addComponent(btnCancelarTipoDocumento))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        panelTab.addTab("Cadastro", paneCadastro);

        jLabel1.setText("Tipo de Documento");

        txtNomeTipoDocumentoConsulta.setEditable(false);

        lblNomeTipoDocumentoConsulta.setText("Nome");

        txtAreaDescricaoTipoDocumentoConsulta.setEditable(false);
        txtAreaDescricaoTipoDocumentoConsulta.setColumns(20);
        txtAreaDescricaoTipoDocumentoConsulta.setRows(5);
        jScrollPane3.setViewportView(txtAreaDescricaoTipoDocumentoConsulta);

        lblDescricaoTipoDocumentoConsulta.setText("Descrição");

        btnOK.setText("OK");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paneConsultaLayout = new javax.swing.GroupLayout(paneConsulta);
        paneConsulta.setLayout(paneConsultaLayout);
        paneConsultaLayout.setHorizontalGroup(
            paneConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneConsultaLayout.createSequentialGroup()
                .addGroup(paneConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneConsultaLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(paneConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3)
                            .addGroup(paneConsultaLayout.createSequentialGroup()
                                .addGroup(paneConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDescricaoTipoDocumentoConsulta)
                                    .addGroup(paneConsultaLayout.createSequentialGroup()
                                        .addComponent(lblNomeTipoDocumentoConsulta)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtNomeTipoDocumentoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(paneConsultaLayout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(26, 26, 26)
                                        .addComponent(cmbTipoDocumentoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 129, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneConsultaLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnOK)))
                .addContainerGap())
        );
        paneConsultaLayout.setVerticalGroup(
            paneConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbTipoDocumentoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(paneConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeTipoDocumentoConsulta)
                    .addComponent(txtNomeTipoDocumentoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDescricaoTipoDocumentoConsulta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnOK)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        panelTab.addTab("Consulta", paneConsulta);

        lblNomeTipoDocumentoAlteracao.setText("Nome");

        lblDescricaoTipoDocumentoAlteracao.setText("Descrição");

        txtAreaDescricaoTipoDocumentoAlteracao.setColumns(20);
        txtAreaDescricaoTipoDocumentoAlteracao.setRows(5);
        sctrollPaneAlteracao.setViewportView(txtAreaDescricaoTipoDocumentoAlteracao);

        btnSalvarAlteracao.setText("Salvar");
        btnSalvarAlteracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarAlteracaoActionPerformed(evt);
            }
        });

        lblTipoDocumentoAlteracao.setText("Tipo de Documento");

        javax.swing.GroupLayout panelAlterarLayout = new javax.swing.GroupLayout(panelAlterar);
        panelAlterar.setLayout(panelAlterarLayout);
        panelAlterarLayout.setHorizontalGroup(
            panelAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAlterarLayout.createSequentialGroup()
                .addGroup(panelAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAlterarLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(panelAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sctrollPaneAlteracao)
                            .addGroup(panelAlterarLayout.createSequentialGroup()
                                .addGroup(panelAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDescricaoTipoDocumentoAlteracao)
                                    .addGroup(panelAlterarLayout.createSequentialGroup()
                                        .addComponent(lblNomeTipoDocumentoAlteracao)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtNomeTipoDocumentoAlteracao, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelAlterarLayout.createSequentialGroup()
                                        .addComponent(lblTipoDocumentoAlteracao)
                                        .addGap(26, 26, 26)
                                        .addComponent(cmbTipoDocumentoAlteracao, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 129, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAlterarLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalvarAlteracao)))
                .addContainerGap())
        );
        panelAlterarLayout.setVerticalGroup(
            panelAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAlterarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipoDocumentoAlteracao)
                    .addComponent(cmbTipoDocumentoAlteracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeTipoDocumentoAlteracao)
                    .addComponent(txtNomeTipoDocumentoAlteracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDescricaoTipoDocumentoAlteracao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sctrollPaneAlteracao, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalvarAlteracao)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        panelTab.addTab("Alteração", panelAlterar);

        txtAreaDescricaoTipoDocumentoExclusao.setEditable(false);
        txtAreaDescricaoTipoDocumentoExclusao.setColumns(20);
        txtAreaDescricaoTipoDocumentoExclusao.setRows(5);
        sctrollPaneAlteracao1.setViewportView(txtAreaDescricaoTipoDocumentoExclusao);

        lblDescricaoTipoDocumentoExclusao.setText("Descrição");

        lblNomeTipoDocumentoExclusao.setText("Nome");

        txtNomeTipoDocumentoExclusao.setEditable(false);

        lblTipoDocumentoExclusao.setText("Tipo de Documento");

        btnSalvarExclusao.setText("Salvar");
        btnSalvarExclusao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarExclusaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelExclusaoLayout = new javax.swing.GroupLayout(panelExclusao);
        panelExclusao.setLayout(panelExclusaoLayout);
        panelExclusaoLayout.setHorizontalGroup(
            panelExclusaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelExclusaoLayout.createSequentialGroup()
                .addGroup(panelExclusaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelExclusaoLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(panelExclusaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sctrollPaneAlteracao1)
                            .addGroup(panelExclusaoLayout.createSequentialGroup()
                                .addGroup(panelExclusaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDescricaoTipoDocumentoExclusao)
                                    .addGroup(panelExclusaoLayout.createSequentialGroup()
                                        .addComponent(lblNomeTipoDocumentoExclusao)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtNomeTipoDocumentoExclusao, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelExclusaoLayout.createSequentialGroup()
                                        .addComponent(lblTipoDocumentoExclusao)
                                        .addGap(26, 26, 26)
                                        .addComponent(cmbTipoDocumentoExclusao, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 129, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelExclusaoLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalvarExclusao)))
                .addContainerGap())
        );
        panelExclusaoLayout.setVerticalGroup(
            panelExclusaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelExclusaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelExclusaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipoDocumentoExclusao)
                    .addComponent(cmbTipoDocumentoExclusao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelExclusaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeTipoDocumentoExclusao)
                    .addComponent(txtNomeTipoDocumentoExclusao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDescricaoTipoDocumentoExclusao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sctrollPaneAlteracao1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalvarExclusao)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        panelTab.addTab("Exclusão", panelExclusao);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTab)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelTab, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarTipoDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarTipoDocumentoActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarTipoDocumentoActionPerformed

    private void btnSalvarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarCadastroActionPerformed
        String nome = txtNomeTipoDocumentoCadastro.getText();
        String desc = txtAreaDescricaoTipoDocumentoCadastro.getText();
        ctrl.cadastrarTipoDocumento(nome, desc);
        ctrl.exibirMenssagemInformativa("Cadastro concluido com sucesso");
    }//GEN-LAST:event_btnSalvarCadastroActionPerformed

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        ctrl.consultarTipoDocumento(cmbTipoDocumentoConsulta.getSelectedItem().toString());
    }//GEN-LAST:event_btnOKActionPerformed

    private void btnSalvarAlteracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarAlteracaoActionPerformed
        String nome = txtNomeTipoDocumentoAlteracao.getText();
        String desc = txtAreaDescricaoTipoDocumentoAlteracao.getText();
        Object objId = encontrarElmento(cmbTipoDocumentoAlteracao.getSelectedItem().toString());
        ctrl.alterarTipoDocumento(objId, nome, desc);
        ctrl.exibirMenssagemInformativa("Alteração de dado concluida");
    }//GEN-LAST:event_btnSalvarAlteracaoActionPerformed

    private void btnSalvarExclusaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarExclusaoActionPerformed
        ctrl.excluirTipoDocumento(encontrarElmento(
                cmbTipoDocumentoExclusao.getSelectedItem().toString())
        );
        ctrl.exibirMenssagemInformativa("Tipo de Documento excluido com sucesso");
    }//GEN-LAST:event_btnSalvarExclusaoActionPerformed


    private Object encontrarElmento(String nome){
        for(Object item : listaCmbBox){
            if(item.toString().equals(nome))
                return item;
        }
        return null;
    }
    
    public void iniciarInterfaceConsulta(){
        limparInterfaceConsulta();
        txtNomeTipoDocumentoConsulta.setEnabled(false);
        txtAreaDescricaoTipoDocumentoConsulta.setEnabled(false);
    }
    
    public void limparInterfaceConsulta(){
        txtNomeTipoDocumentoConsulta.setText("");
        txtAreaDescricaoTipoDocumentoConsulta.setText("");
    }
    
    public void limparInterfaceAlteracao(){
        txtNomeTipoDocumentoAlteracao.setText("");
        txtAreaDescricaoTipoDocumentoAlteracao.setText("");
    }
    
    public void limparInterfaceExclusao(){
        txtNomeTipoDocumentoExclusao.setText("");
        txtAreaDescricaoTipoDocumentoExclusao.setText("");
    }
    
    public void limparInterfaceCadastro(){
        txtNomeTipoDocumentoCadastro.setText("");
        txtAreaDescricaoTipoDocumentoCadastro.setText("");
    }
    
    public void limpartTodasInterfaces(){
        limparInterfaceAlteracao();
        limparInterfaceCadastro();
        limparInterfaceConsulta();
        limparInterfaceExclusao();
    }
    
    public void preencherCamposConsulta(String nome, String desc){
        txtNomeTipoDocumentoConsulta.setText(nome);
        txtAreaDescricaoTipoDocumentoConsulta.setText(desc);
    }
    
     public void preencherCamposAlteracao(String nome, String desc){
        txtNomeTipoDocumentoAlteracao.setText(nome);
        txtAreaDescricaoTipoDocumentoAlteracao.setText(desc);
    }
     
    public void preencherCmbBoxTipoDocumento(List lista){
        cmbTipoDocumentoAlteracao.removeAllItems();
        cmbTipoDocumentoConsulta.removeAllItems();
        cmbTipoDocumentoExclusao.removeAllItems();
        if(lista != null){
            for(Object item : lista){
                listaCmbBox.add(item);
                cmbTipoDocumentoConsulta.addItem(item.toString());
                cmbTipoDocumentoAlteracao.addItem(item.toString());
                cmbTipoDocumentoExclusao.addItem(item.toString());
            }
        }
    }
    
    
    public void atualizarListCadastro(){
        List lista = ctrl.listarTipoDocumento();
        DefaultListModel mod = new DefaultListModel<String>();
        for(Object item : lista)
            mod.addElement(item);
        listTipoDocumento.setModel(mod);
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarTipoDocumento;
    private javax.swing.JButton btnOK;
    private javax.swing.JButton btnSalvarAlteracao;
    private javax.swing.JButton btnSalvarCadastro;
    private javax.swing.JButton btnSalvarExclusao;
    private javax.swing.JComboBox<String> cmbTipoDocumentoAlteracao;
    private javax.swing.JComboBox<String> cmbTipoDocumentoConsulta;
    private javax.swing.JComboBox<String> cmbTipoDocumentoExclusao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblDescricaoTipoDocumento;
    private javax.swing.JLabel lblDescricaoTipoDocumentoAlteracao;
    private javax.swing.JLabel lblDescricaoTipoDocumentoConsulta;
    private javax.swing.JLabel lblDescricaoTipoDocumentoExclusao;
    private javax.swing.JLabel lblNomeTipoDocumento;
    private javax.swing.JLabel lblNomeTipoDocumentoAlteracao;
    private javax.swing.JLabel lblNomeTipoDocumentoConsulta;
    private javax.swing.JLabel lblNomeTipoDocumentoExclusao;
    private javax.swing.JLabel lblTipoDocumentoAlteracao;
    private javax.swing.JLabel lblTipoDocumentoExclusao;
    private javax.swing.JList<String> listTipoDocumento;
    private javax.swing.JPanel paneCadastro;
    private javax.swing.JPanel paneConsulta;
    private javax.swing.JPanel panelAlterar;
    private javax.swing.JPanel panelExclusao;
    private javax.swing.JTabbedPane panelTab;
    private javax.swing.JScrollPane sctrollPaneAlteracao;
    private javax.swing.JScrollPane sctrollPaneAlteracao1;
    private javax.swing.JTextArea txtAreaDescricaoTipoDocumentoAlteracao;
    private javax.swing.JTextArea txtAreaDescricaoTipoDocumentoCadastro;
    private javax.swing.JTextArea txtAreaDescricaoTipoDocumentoConsulta;
    private javax.swing.JTextArea txtAreaDescricaoTipoDocumentoExclusao;
    private javax.swing.JTextField txtNomeTipoDocumentoAlteracao;
    private javax.swing.JTextField txtNomeTipoDocumentoCadastro;
    private javax.swing.JTextField txtNomeTipoDocumentoConsulta;
    private javax.swing.JTextField txtNomeTipoDocumentoExclusao;
    // End of variables declaration//GEN-END:variables
}
