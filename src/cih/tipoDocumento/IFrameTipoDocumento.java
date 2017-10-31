package cih.tipoDocumento;

import java.util.List;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.event.ChangeEvent;
import cci.CITipoDocumento;

public class IFrameTipoDocumento extends javax.swing.JInternalFrame {

    CITipoDocumento ctrl;
    List listaCmbBox;
    
    public IFrameTipoDocumento(CITipoDocumento ctrl) {
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
        jInternalFrame1 = new javax.swing.JInternalFrame();
        panelTab1 = new javax.swing.JTabbedPane();
        paneCadastro1 = new javax.swing.JPanel();
        lblNomeTipoDocumento1 = new javax.swing.JLabel();
        txtNomeTipoDocumentoCadastro1 = new javax.swing.JTextField();
        lblDescricaoTipoDocumento1 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtAreaDescricaoTipoDocumentoCadastro1 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        listTipoDocumento1 = new javax.swing.JList<>();
        btnSalvarCadastro1 = new javax.swing.JButton();
        btnCancelarTipoDocumento1 = new javax.swing.JButton();
        paneConsulta1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cmbTipoDocumentoConsulta1 = new javax.swing.JComboBox<>();
        txtNomeTipoDocumentoConsulta1 = new javax.swing.JTextField();
        lblNomeTipoDocumentoConsulta1 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtAreaDescricaoTipoDocumentoConsulta1 = new javax.swing.JTextArea();
        lblDescricaoTipoDocumentoConsulta1 = new javax.swing.JLabel();
        btnOK1 = new javax.swing.JButton();
        panelAlterar1 = new javax.swing.JPanel();
        txtNomeTipoDocumentoAlteracao1 = new javax.swing.JTextField();
        lblNomeTipoDocumentoAlteracao1 = new javax.swing.JLabel();
        lblDescricaoTipoDocumentoAlteracao1 = new javax.swing.JLabel();
        sctrollPaneAlteracao2 = new javax.swing.JScrollPane();
        txtAreaDescricaoTipoDocumentoAlteracao1 = new javax.swing.JTextArea();
        btnSalvarAlteracao1 = new javax.swing.JButton();
        lblTipoDocumentoAlteracao1 = new javax.swing.JLabel();
        cmbTipoDocumentoAlteracao1 = new javax.swing.JComboBox<>();
        panelExclusao1 = new javax.swing.JPanel();
        sctrollPaneAlteracao3 = new javax.swing.JScrollPane();
        txtAreaDescricaoTipoDocumentoExclusao1 = new javax.swing.JTextArea();
        lblDescricaoTipoDocumentoExclusao1 = new javax.swing.JLabel();
        lblNomeTipoDocumentoExclusao1 = new javax.swing.JLabel();
        txtNomeTipoDocumentoExclusao1 = new javax.swing.JTextField();
        lblTipoDocumentoExclusao1 = new javax.swing.JLabel();
        cmbTipoDocumentoExclusao1 = new javax.swing.JComboBox<>();
        btnSalvarExclusao1 = new javax.swing.JButton();

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

        jInternalFrame1.setClosable(true);
        jInternalFrame1.setIconifiable(true);
        jInternalFrame1.setMaximizable(true);
        jInternalFrame1.setResizable(true);

        lblNomeTipoDocumento1.setText("Nome");

        lblDescricaoTipoDocumento1.setText("Descrição");

        txtAreaDescricaoTipoDocumentoCadastro1.setColumns(20);
        txtAreaDescricaoTipoDocumentoCadastro1.setRows(5);
        jScrollPane4.setViewportView(txtAreaDescricaoTipoDocumentoCadastro1);

        jScrollPane5.setViewportView(listTipoDocumento1);

        btnSalvarCadastro1.setText("Salvar");
        btnSalvarCadastro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarCadastro1ActionPerformed(evt);
            }
        });

        btnCancelarTipoDocumento1.setText("Cancelar");
        btnCancelarTipoDocumento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarTipoDocumento1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paneCadastro1Layout = new javax.swing.GroupLayout(paneCadastro1);
        paneCadastro1.setLayout(paneCadastro1Layout);
        paneCadastro1Layout.setHorizontalGroup(
            paneCadastro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneCadastro1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(paneCadastro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDescricaoTipoDocumento1)
                    .addGroup(paneCadastro1Layout.createSequentialGroup()
                        .addComponent(lblNomeTipoDocumento1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNomeTipoDocumentoCadastro1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paneCadastro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, paneCadastro1Layout.createSequentialGroup()
                            .addComponent(btnSalvarCadastro1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCancelarTipoDocumento1))
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        paneCadastro1Layout.setVerticalGroup(
            paneCadastro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneCadastro1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneCadastro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeTipoDocumento1)
                    .addComponent(txtNomeTipoDocumentoCadastro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDescricaoTipoDocumento1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(paneCadastro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvarCadastro1)
                    .addComponent(btnCancelarTipoDocumento1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelTab1.addTab("Cadastro", paneCadastro1);

        jLabel2.setText("Tipo de Documento");

        txtNomeTipoDocumentoConsulta1.setEditable(false);

        lblNomeTipoDocumentoConsulta1.setText("Nome");

        txtAreaDescricaoTipoDocumentoConsulta1.setEditable(false);
        txtAreaDescricaoTipoDocumentoConsulta1.setColumns(20);
        txtAreaDescricaoTipoDocumentoConsulta1.setRows(5);
        jScrollPane6.setViewportView(txtAreaDescricaoTipoDocumentoConsulta1);

        lblDescricaoTipoDocumentoConsulta1.setText("Descrição");

        btnOK1.setText("OK");
        btnOK1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOK1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paneConsulta1Layout = new javax.swing.GroupLayout(paneConsulta1);
        paneConsulta1.setLayout(paneConsulta1Layout);
        paneConsulta1Layout.setHorizontalGroup(
            paneConsulta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneConsulta1Layout.createSequentialGroup()
                .addGroup(paneConsulta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneConsulta1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(paneConsulta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane6)
                            .addGroup(paneConsulta1Layout.createSequentialGroup()
                                .addGroup(paneConsulta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDescricaoTipoDocumentoConsulta1)
                                    .addGroup(paneConsulta1Layout.createSequentialGroup()
                                        .addComponent(lblNomeTipoDocumentoConsulta1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtNomeTipoDocumentoConsulta1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(paneConsulta1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(26, 26, 26)
                                        .addComponent(cmbTipoDocumentoConsulta1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneConsulta1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnOK1)))
                .addContainerGap())
        );
        paneConsulta1Layout.setVerticalGroup(
            paneConsulta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneConsulta1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneConsulta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbTipoDocumentoConsulta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(paneConsulta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeTipoDocumentoConsulta1)
                    .addComponent(txtNomeTipoDocumentoConsulta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDescricaoTipoDocumentoConsulta1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnOK1)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        panelTab1.addTab("Consulta", paneConsulta1);

        lblNomeTipoDocumentoAlteracao1.setText("Nome");

        lblDescricaoTipoDocumentoAlteracao1.setText("Descrição");

        txtAreaDescricaoTipoDocumentoAlteracao1.setColumns(20);
        txtAreaDescricaoTipoDocumentoAlteracao1.setRows(5);
        sctrollPaneAlteracao2.setViewportView(txtAreaDescricaoTipoDocumentoAlteracao1);

        btnSalvarAlteracao1.setText("Salvar");
        btnSalvarAlteracao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarAlteracao1ActionPerformed(evt);
            }
        });

        lblTipoDocumentoAlteracao1.setText("Tipo de Documento");

        javax.swing.GroupLayout panelAlterar1Layout = new javax.swing.GroupLayout(panelAlterar1);
        panelAlterar1.setLayout(panelAlterar1Layout);
        panelAlterar1Layout.setHorizontalGroup(
            panelAlterar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAlterar1Layout.createSequentialGroup()
                .addGroup(panelAlterar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAlterar1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(panelAlterar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sctrollPaneAlteracao2)
                            .addGroup(panelAlterar1Layout.createSequentialGroup()
                                .addGroup(panelAlterar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDescricaoTipoDocumentoAlteracao1)
                                    .addGroup(panelAlterar1Layout.createSequentialGroup()
                                        .addComponent(lblNomeTipoDocumentoAlteracao1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtNomeTipoDocumentoAlteracao1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelAlterar1Layout.createSequentialGroup()
                                        .addComponent(lblTipoDocumentoAlteracao1)
                                        .addGap(26, 26, 26)
                                        .addComponent(cmbTipoDocumentoAlteracao1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAlterar1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalvarAlteracao1)))
                .addContainerGap())
        );
        panelAlterar1Layout.setVerticalGroup(
            panelAlterar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAlterar1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAlterar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipoDocumentoAlteracao1)
                    .addComponent(cmbTipoDocumentoAlteracao1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelAlterar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeTipoDocumentoAlteracao1)
                    .addComponent(txtNomeTipoDocumentoAlteracao1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDescricaoTipoDocumentoAlteracao1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sctrollPaneAlteracao2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalvarAlteracao1)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        panelTab1.addTab("Alteração", panelAlterar1);

        txtAreaDescricaoTipoDocumentoExclusao1.setEditable(false);
        txtAreaDescricaoTipoDocumentoExclusao1.setColumns(20);
        txtAreaDescricaoTipoDocumentoExclusao1.setRows(5);
        sctrollPaneAlteracao3.setViewportView(txtAreaDescricaoTipoDocumentoExclusao1);

        lblDescricaoTipoDocumentoExclusao1.setText("Descrição");

        lblNomeTipoDocumentoExclusao1.setText("Nome");

        txtNomeTipoDocumentoExclusao1.setEditable(false);

        lblTipoDocumentoExclusao1.setText("Tipo de Documento");

        btnSalvarExclusao1.setText("Salvar");
        btnSalvarExclusao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarExclusao1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelExclusao1Layout = new javax.swing.GroupLayout(panelExclusao1);
        panelExclusao1.setLayout(panelExclusao1Layout);
        panelExclusao1Layout.setHorizontalGroup(
            panelExclusao1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelExclusao1Layout.createSequentialGroup()
                .addGroup(panelExclusao1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelExclusao1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(panelExclusao1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sctrollPaneAlteracao3)
                            .addGroup(panelExclusao1Layout.createSequentialGroup()
                                .addGroup(panelExclusao1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDescricaoTipoDocumentoExclusao1)
                                    .addGroup(panelExclusao1Layout.createSequentialGroup()
                                        .addComponent(lblNomeTipoDocumentoExclusao1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtNomeTipoDocumentoExclusao1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelExclusao1Layout.createSequentialGroup()
                                        .addComponent(lblTipoDocumentoExclusao1)
                                        .addGap(26, 26, 26)
                                        .addComponent(cmbTipoDocumentoExclusao1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelExclusao1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalvarExclusao1)))
                .addContainerGap())
        );
        panelExclusao1Layout.setVerticalGroup(
            panelExclusao1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelExclusao1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelExclusao1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipoDocumentoExclusao1)
                    .addComponent(cmbTipoDocumentoExclusao1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelExclusao1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeTipoDocumentoExclusao1)
                    .addComponent(txtNomeTipoDocumentoExclusao1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDescricaoTipoDocumentoExclusao1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sctrollPaneAlteracao3, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalvarExclusao1)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        panelTab1.addTab("Exclusão", panelExclusao1);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTab1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addComponent(panelTab1, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTab)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelTab, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
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

    private void btnSalvarCadastro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarCadastro1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalvarCadastro1ActionPerformed

    private void btnCancelarTipoDocumento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarTipoDocumento1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarTipoDocumento1ActionPerformed

    private void btnOK1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOK1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOK1ActionPerformed

    private void btnSalvarAlteracao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarAlteracao1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalvarAlteracao1ActionPerformed

    private void btnSalvarExclusao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarExclusao1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalvarExclusao1ActionPerformed

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
    private javax.swing.JButton btnCancelarTipoDocumento1;
    private javax.swing.JButton btnOK;
    private javax.swing.JButton btnOK1;
    private javax.swing.JButton btnSalvarAlteracao;
    private javax.swing.JButton btnSalvarAlteracao1;
    private javax.swing.JButton btnSalvarCadastro;
    private javax.swing.JButton btnSalvarCadastro1;
    private javax.swing.JButton btnSalvarExclusao;
    private javax.swing.JButton btnSalvarExclusao1;
    private javax.swing.JComboBox<String> cmbTipoDocumentoAlteracao;
    private javax.swing.JComboBox<String> cmbTipoDocumentoAlteracao1;
    private javax.swing.JComboBox<String> cmbTipoDocumentoConsulta;
    private javax.swing.JComboBox<String> cmbTipoDocumentoConsulta1;
    private javax.swing.JComboBox<String> cmbTipoDocumentoExclusao;
    private javax.swing.JComboBox<String> cmbTipoDocumentoExclusao1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JLabel lblDescricaoTipoDocumento;
    private javax.swing.JLabel lblDescricaoTipoDocumento1;
    private javax.swing.JLabel lblDescricaoTipoDocumentoAlteracao;
    private javax.swing.JLabel lblDescricaoTipoDocumentoAlteracao1;
    private javax.swing.JLabel lblDescricaoTipoDocumentoConsulta;
    private javax.swing.JLabel lblDescricaoTipoDocumentoConsulta1;
    private javax.swing.JLabel lblDescricaoTipoDocumentoExclusao;
    private javax.swing.JLabel lblDescricaoTipoDocumentoExclusao1;
    private javax.swing.JLabel lblNomeTipoDocumento;
    private javax.swing.JLabel lblNomeTipoDocumento1;
    private javax.swing.JLabel lblNomeTipoDocumentoAlteracao;
    private javax.swing.JLabel lblNomeTipoDocumentoAlteracao1;
    private javax.swing.JLabel lblNomeTipoDocumentoConsulta;
    private javax.swing.JLabel lblNomeTipoDocumentoConsulta1;
    private javax.swing.JLabel lblNomeTipoDocumentoExclusao;
    private javax.swing.JLabel lblNomeTipoDocumentoExclusao1;
    private javax.swing.JLabel lblTipoDocumentoAlteracao;
    private javax.swing.JLabel lblTipoDocumentoAlteracao1;
    private javax.swing.JLabel lblTipoDocumentoExclusao;
    private javax.swing.JLabel lblTipoDocumentoExclusao1;
    private javax.swing.JList<String> listTipoDocumento;
    private javax.swing.JList<String> listTipoDocumento1;
    private javax.swing.JPanel paneCadastro;
    private javax.swing.JPanel paneCadastro1;
    private javax.swing.JPanel paneConsulta;
    private javax.swing.JPanel paneConsulta1;
    private javax.swing.JPanel panelAlterar;
    private javax.swing.JPanel panelAlterar1;
    private javax.swing.JPanel panelExclusao;
    private javax.swing.JPanel panelExclusao1;
    private javax.swing.JTabbedPane panelTab;
    private javax.swing.JTabbedPane panelTab1;
    private javax.swing.JScrollPane sctrollPaneAlteracao;
    private javax.swing.JScrollPane sctrollPaneAlteracao1;
    private javax.swing.JScrollPane sctrollPaneAlteracao2;
    private javax.swing.JScrollPane sctrollPaneAlteracao3;
    private javax.swing.JTextArea txtAreaDescricaoTipoDocumentoAlteracao;
    private javax.swing.JTextArea txtAreaDescricaoTipoDocumentoAlteracao1;
    private javax.swing.JTextArea txtAreaDescricaoTipoDocumentoCadastro;
    private javax.swing.JTextArea txtAreaDescricaoTipoDocumentoCadastro1;
    private javax.swing.JTextArea txtAreaDescricaoTipoDocumentoConsulta;
    private javax.swing.JTextArea txtAreaDescricaoTipoDocumentoConsulta1;
    private javax.swing.JTextArea txtAreaDescricaoTipoDocumentoExclusao;
    private javax.swing.JTextArea txtAreaDescricaoTipoDocumentoExclusao1;
    private javax.swing.JTextField txtNomeTipoDocumentoAlteracao;
    private javax.swing.JTextField txtNomeTipoDocumentoAlteracao1;
    private javax.swing.JTextField txtNomeTipoDocumentoCadastro;
    private javax.swing.JTextField txtNomeTipoDocumentoCadastro1;
    private javax.swing.JTextField txtNomeTipoDocumentoConsulta;
    private javax.swing.JTextField txtNomeTipoDocumentoConsulta1;
    private javax.swing.JTextField txtNomeTipoDocumentoExclusao;
    private javax.swing.JTextField txtNomeTipoDocumentoExclusao1;
    // End of variables declaration//GEN-END:variables
}
