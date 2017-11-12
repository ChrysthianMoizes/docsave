package cih.mobilia;

import cdp.Local;
import cci.CIMobilia;
import cdp.Compartimento;
import cih.util.JTableUtil;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.event.ChangeEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class IFrameMobilia extends javax.swing.JInternalFrame {

    CIMobilia ctrl;
    List      listaCmbBox;
    
    public IFrameMobilia(CIMobilia ctrl) {
        this.ctrl = ctrl;
        listaCmbBox = new ArrayList();
        initComponents();
        panelTab.addChangeListener(new javax.swing.event.ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
               limpartTodasInterfaces();
               preencherCmbBoxMobilias(ctrl.carregarCmbBoxMobilias());
            }
        });
        preencherCmbBoxLocais(ctrl.carregarCmbBoxLocais());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTab = new javax.swing.JTabbedPane();
        panelCadastro = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        txtNomeCadastro = new javax.swing.JTextField();
        lblIdentificador = new javax.swing.JLabel();
        btnSalvarCadastro = new javax.swing.JButton();
        btnCancelarCadastro = new javax.swing.JButton();
        txtIdCadastro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        spnCapacidadeCadastro = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        cmbLocaisCadastro = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCompartimentosCadastro = new javax.swing.JTable();
        btnAddCompartimento = new javax.swing.JButton();
        btnRemoverCompartimento = new javax.swing.JButton();
        panelConsulta = new javax.swing.JPanel();
        lblCmbConsulta = new javax.swing.JLabel();
        cmbConsulta = new javax.swing.JComboBox<>();
        txtNomeConsulta = new javax.swing.JTextField();
        lblNomeConsulta = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAreaDescricaoConsulta = new javax.swing.JTextArea();
        lblDescricaoConsulta = new javax.swing.JLabel();
        btnOkConsulta = new javax.swing.JButton();
        panelAlterar = new javax.swing.JPanel();
        txtNomeAlteracao = new javax.swing.JTextField();
        lblNomeAlteracao = new javax.swing.JLabel();
        lblDescricaoAlteracao = new javax.swing.JLabel();
        sctrollPaneAlteracao = new javax.swing.JScrollPane();
        txtAreaDescricaoAlteracao = new javax.swing.JTextArea();
        btnSalvarAlteracao = new javax.swing.JButton();
        lblCmbAlteracao = new javax.swing.JLabel();
        cmbAlteracao = new javax.swing.JComboBox<>();
        panelExclusao = new javax.swing.JPanel();
        sctrollPaneAlteracao1 = new javax.swing.JScrollPane();
        txtAreaDescricaoExclusao = new javax.swing.JTextArea();
        lblDescricaoExclusao = new javax.swing.JLabel();
        lblNomeExclusao = new javax.swing.JLabel();
        txtNomeExclusao = new javax.swing.JTextField();
        lblExclusao = new javax.swing.JLabel();
        cmbExclusao = new javax.swing.JComboBox<>();
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

        lblNome.setText("Nome");

        lblIdentificador.setText("Identificador");

        btnSalvarCadastro.setText("Salvar");
        btnSalvarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarCadastroActionPerformed(evt);
            }
        });

        btnCancelarCadastro.setText("Cancelar");
        btnCancelarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarCadastroActionPerformed(evt);
            }
        });

        jLabel3.setText("Capacidade");

        jLabel1.setText("Local");

        cmbLocaisCadastro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Compartimentos"));

        tblCompartimentosCadastro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Código"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCompartimentosCadastro.setToolTipText("");
        jScrollPane1.setViewportView(tblCompartimentosCadastro);

        btnAddCompartimento.setText("Adicionar");
        btnAddCompartimento.setEnabled(false);
        btnAddCompartimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCompartimentoActionPerformed(evt);
            }
        });

        btnRemoverCompartimento.setText("Remover");
        btnRemoverCompartimento.setEnabled(false);
        btnRemoverCompartimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverCompartimentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAddCompartimento, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRemoverCompartimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddCompartimento)
                    .addComponent(btnRemoverCompartimento))
                .addContainerGap())
        );

        javax.swing.GroupLayout panelCadastroLayout = new javax.swing.GroupLayout(panelCadastro);
        panelCadastro.setLayout(panelCadastroLayout);
        panelCadastroLayout.setHorizontalGroup(
            panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCadastroLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCadastroLayout.createSequentialGroup()
                        .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCadastroLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(spnCapacidadeCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelCadastroLayout.createSequentialGroup()
                                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblIdentificador)
                                    .addComponent(lblNome))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNomeCadastro)
                                    .addComponent(txtIdCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelCadastroLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(54, 54, 54)
                                .addComponent(cmbLocaisCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 5, Short.MAX_VALUE))
                    .addGroup(panelCadastroLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSalvarCadastro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelarCadastro)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panelCadastroLayout.setVerticalGroup(
            panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCadastroLayout.createSequentialGroup()
                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCadastroLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNome)
                            .addComponent(txtNomeCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblIdentificador)
                            .addComponent(txtIdCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(spnCapacidadeCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(cmbLocaisCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelCadastroLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvarCadastro)
                    .addComponent(btnCancelarCadastro))
                .addContainerGap(158, Short.MAX_VALUE))
        );

        panelTab.addTab("Cadastro", panelCadastro);

        lblCmbConsulta.setText("Mobília");

        txtNomeConsulta.setEditable(false);

        lblNomeConsulta.setText("Nome");

        txtAreaDescricaoConsulta.setEditable(false);
        txtAreaDescricaoConsulta.setColumns(20);
        txtAreaDescricaoConsulta.setRows(5);
        jScrollPane3.setViewportView(txtAreaDescricaoConsulta);

        lblDescricaoConsulta.setText("Descrição");

        btnOkConsulta.setText("OK");
        btnOkConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkConsultaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelConsultaLayout = new javax.swing.GroupLayout(panelConsulta);
        panelConsulta.setLayout(panelConsultaLayout);
        panelConsultaLayout.setHorizontalGroup(
            panelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConsultaLayout.createSequentialGroup()
                .addGroup(panelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelConsultaLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(panelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3)
                            .addGroup(panelConsultaLayout.createSequentialGroup()
                                .addGroup(panelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDescricaoConsulta)
                                    .addGroup(panelConsultaLayout.createSequentialGroup()
                                        .addComponent(lblNomeConsulta)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtNomeConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelConsultaLayout.createSequentialGroup()
                                        .addComponent(lblCmbConsulta)
                                        .addGap(26, 26, 26)
                                        .addComponent(cmbConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 143, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelConsultaLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnOkConsulta)))
                .addContainerGap())
        );
        panelConsultaLayout.setVerticalGroup(
            panelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCmbConsulta)
                    .addComponent(cmbConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeConsulta)
                    .addComponent(txtNomeConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDescricaoConsulta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnOkConsulta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelTab.addTab("Consulta", panelConsulta);

        lblNomeAlteracao.setText("Nome");

        lblDescricaoAlteracao.setText("Descrição");

        txtAreaDescricaoAlteracao.setColumns(20);
        txtAreaDescricaoAlteracao.setRows(5);
        sctrollPaneAlteracao.setViewportView(txtAreaDescricaoAlteracao);

        btnSalvarAlteracao.setText("Salvar");
        btnSalvarAlteracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarAlteracaoActionPerformed(evt);
            }
        });

        lblCmbAlteracao.setText("Mobília");

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
                                    .addComponent(lblDescricaoAlteracao)
                                    .addGroup(panelAlterarLayout.createSequentialGroup()
                                        .addComponent(lblNomeAlteracao)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtNomeAlteracao, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelAlterarLayout.createSequentialGroup()
                                        .addComponent(lblCmbAlteracao)
                                        .addGap(26, 26, 26)
                                        .addComponent(cmbAlteracao, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 143, Short.MAX_VALUE))))
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
                    .addComponent(lblCmbAlteracao)
                    .addComponent(cmbAlteracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeAlteracao)
                    .addComponent(txtNomeAlteracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDescricaoAlteracao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sctrollPaneAlteracao, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalvarAlteracao)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelTab.addTab("Alteração", panelAlterar);

        txtAreaDescricaoExclusao.setEditable(false);
        txtAreaDescricaoExclusao.setColumns(20);
        txtAreaDescricaoExclusao.setRows(5);
        sctrollPaneAlteracao1.setViewportView(txtAreaDescricaoExclusao);

        lblDescricaoExclusao.setText("Descrição");

        lblNomeExclusao.setText("Nome");

        txtNomeExclusao.setEditable(false);

        lblExclusao.setText("Mobília");

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
                                    .addComponent(lblDescricaoExclusao)
                                    .addGroup(panelExclusaoLayout.createSequentialGroup()
                                        .addComponent(lblNomeExclusao)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtNomeExclusao, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelExclusaoLayout.createSequentialGroup()
                                        .addComponent(lblExclusao)
                                        .addGap(26, 26, 26)
                                        .addComponent(cmbExclusao, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 143, Short.MAX_VALUE))))
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
                    .addComponent(lblExclusao)
                    .addComponent(cmbExclusao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelExclusaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeExclusao)
                    .addComponent(txtNomeExclusao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDescricaoExclusao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sctrollPaneAlteracao1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalvarExclusao)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addGap(0, 252, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 251, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelTab, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 215, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 216, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOkConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkConsultaActionPerformed
        ctrl.consultar(cmbConsulta.getSelectedItem().toString());
    }//GEN-LAST:event_btnOkConsultaActionPerformed

    private void btnSalvarAlteracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarAlteracaoActionPerformed
        String nome = txtNomeAlteracao.getText();
        String desc = txtAreaDescricaoAlteracao.getText();
        Object objId = encontrarElmento(cmbAlteracao.getSelectedItem().toString());
        ctrl.alterar(objId, nome, desc);
        ctrl.exibirMenssagemInformativa("Alteração de dado concluáda");
    }//GEN-LAST:event_btnSalvarAlteracaoActionPerformed

    private void btnSalvarExclusaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarExclusaoActionPerformed
        ctrl.excluir(encontrarElmento(
                cmbExclusao.getSelectedItem().toString())
        );
        ctrl.exibirMenssagemInformativa("Mobília excluido com sucesso");
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

    private void btnCancelarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarCadastroActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarCadastroActionPerformed

    private void btnSalvarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarCadastroActionPerformed
        String nome = txtNomeCadastro.getText();
        String identificador = txtIdCadastro.getText();
        int capacidade = (int)spnCapacidadeCadastro.getValue();
        Local local = (Local) cmbLocaisCadastro.getSelectedItem();
        Collection<Compartimento> comparts = JTableUtil.toList(tblCompartimentosCadastro);
        boolean cadastrou = ctrl.cadastrar(nome, identificador, capacidade, local, comparts);
        if (cadastrou) {
            btnAddCompartimento.setEnabled(true);
            btnRemoverCompartimento.setEnabled(true);
        }
    }//GEN-LAST:event_btnSalvarCadastroActionPerformed

    private void btnAddCompartimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCompartimentoActionPerformed
        JOptionPane.showMessageDialog(this, "PRECISA DO MÓDULO COMPARTIMENTO!");
    }//GEN-LAST:event_btnAddCompartimentoActionPerformed

    private void btnRemoverCompartimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverCompartimentoActionPerformed
        try {
            JTableUtil.removeLinhaSelecionada(tblCompartimentosCadastro);
        } catch (Exception ex){
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_btnRemoverCompartimentoActionPerformed

    private Object encontrarElmento(String nome) {
        for(Object item : listaCmbBox){
            if(item.toString().equals(nome))
                return item;
        }
        return null;
    }
    
    public void iniciarInterfaceConsulta(){
        limparInterfaceConsulta();
        txtNomeConsulta.setEnabled(false);
        txtAreaDescricaoConsulta.setEnabled(false);
    }
    
    public void limparInterfaceConsulta(){
        txtNomeConsulta.setText("");
        txtAreaDescricaoConsulta.setText("");
    }
    
    public void limparInterfaceAlteracao(){
        txtNomeAlteracao.setText("");
        txtAreaDescricaoAlteracao.setText("");
    }
    
    public void limparInterfaceExclusao(){
        txtNomeExclusao.setText("");
        txtAreaDescricaoExclusao.setText("");
    }
    
    public void limparInterfaceCadastro(){
        txtNomeCadastro.setText("");
//        txtAreaDescricaoCadastro.setText("");
    }
    
    public void limpartTodasInterfaces(){
        limparInterfaceAlteracao();
        limparInterfaceCadastro();
        limparInterfaceConsulta();
        limparInterfaceExclusao();
    }
    
    public void preencherCamposConsulta(String nome, String desc){
        txtNomeConsulta.setText(nome);
        txtAreaDescricaoConsulta.setText(desc);
    }
    
     public void preencherCamposAlteracao(String nome, String desc) {
        txtNomeAlteracao.setText(nome);
        txtAreaDescricaoAlteracao.setText(desc);
    }
     
    public void preencherCmbBoxMobilias(List lista) {
        cmbAlteracao.removeAllItems();
        cmbConsulta.removeAllItems();   
        cmbExclusao.removeAllItems();
        if (lista != null) {
            for (Object item : lista) {
                listaCmbBox.add(item);
                cmbConsulta.addItem(item.toString());
                cmbAlteracao.addItem(item.toString());
                cmbExclusao.addItem(item.toString());
            }
        }
    }
    
    public void preencherCmbBoxLocais(List<Local> lista) {
        cmbLocaisCadastro.setModel(new DefaultComboBoxModel(lista.toArray()));
    }
    
    /**
     * TODO: NÃO ESTÁ EM USO!
     */
    public void preencherTableCompartimentos(List<Compartimento> lista) {
        for (Compartimento compartimento : lista)
            JTableUtil.addLinha(tblCompartimentosCadastro, compartimento.toArray());
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCompartimento;
    private javax.swing.JButton btnCancelarCadastro;
    private javax.swing.JButton btnCancelarTipoDocumento1;
    private javax.swing.JButton btnOK1;
    private javax.swing.JButton btnOkConsulta;
    private javax.swing.JButton btnRemoverCompartimento;
    private javax.swing.JButton btnSalvarAlteracao;
    private javax.swing.JButton btnSalvarAlteracao1;
    private javax.swing.JButton btnSalvarCadastro;
    private javax.swing.JButton btnSalvarCadastro1;
    private javax.swing.JButton btnSalvarExclusao;
    private javax.swing.JButton btnSalvarExclusao1;
    private javax.swing.JComboBox<String> cmbAlteracao;
    private javax.swing.JComboBox<String> cmbConsulta;
    private javax.swing.JComboBox<String> cmbExclusao;
    private javax.swing.JComboBox<String> cmbLocaisCadastro;
    private javax.swing.JComboBox<String> cmbTipoDocumentoAlteracao1;
    private javax.swing.JComboBox<String> cmbTipoDocumentoConsulta1;
    private javax.swing.JComboBox<String> cmbTipoDocumentoExclusao1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JLabel lblCmbAlteracao;
    private javax.swing.JLabel lblCmbConsulta;
    private javax.swing.JLabel lblDescricaoAlteracao;
    private javax.swing.JLabel lblDescricaoConsulta;
    private javax.swing.JLabel lblDescricaoExclusao;
    private javax.swing.JLabel lblDescricaoTipoDocumento1;
    private javax.swing.JLabel lblDescricaoTipoDocumentoAlteracao1;
    private javax.swing.JLabel lblDescricaoTipoDocumentoConsulta1;
    private javax.swing.JLabel lblDescricaoTipoDocumentoExclusao1;
    private javax.swing.JLabel lblExclusao;
    private javax.swing.JLabel lblIdentificador;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNomeAlteracao;
    private javax.swing.JLabel lblNomeConsulta;
    private javax.swing.JLabel lblNomeExclusao;
    private javax.swing.JLabel lblNomeTipoDocumento1;
    private javax.swing.JLabel lblNomeTipoDocumentoAlteracao1;
    private javax.swing.JLabel lblNomeTipoDocumentoConsulta1;
    private javax.swing.JLabel lblNomeTipoDocumentoExclusao1;
    private javax.swing.JLabel lblTipoDocumentoAlteracao1;
    private javax.swing.JLabel lblTipoDocumentoExclusao1;
    private javax.swing.JList<String> listTipoDocumento1;
    private javax.swing.JPanel paneCadastro1;
    private javax.swing.JPanel paneConsulta1;
    private javax.swing.JPanel panelAlterar;
    private javax.swing.JPanel panelAlterar1;
    private javax.swing.JPanel panelCadastro;
    private javax.swing.JPanel panelConsulta;
    private javax.swing.JPanel panelExclusao;
    private javax.swing.JPanel panelExclusao1;
    private javax.swing.JTabbedPane panelTab;
    private javax.swing.JTabbedPane panelTab1;
    private javax.swing.JScrollPane sctrollPaneAlteracao;
    private javax.swing.JScrollPane sctrollPaneAlteracao1;
    private javax.swing.JScrollPane sctrollPaneAlteracao2;
    private javax.swing.JScrollPane sctrollPaneAlteracao3;
    private javax.swing.JSpinner spnCapacidadeCadastro;
    private javax.swing.JTable tblCompartimentosCadastro;
    private javax.swing.JTextArea txtAreaDescricaoAlteracao;
    private javax.swing.JTextArea txtAreaDescricaoConsulta;
    private javax.swing.JTextArea txtAreaDescricaoExclusao;
    private javax.swing.JTextArea txtAreaDescricaoTipoDocumentoAlteracao1;
    private javax.swing.JTextArea txtAreaDescricaoTipoDocumentoCadastro1;
    private javax.swing.JTextArea txtAreaDescricaoTipoDocumentoConsulta1;
    private javax.swing.JTextArea txtAreaDescricaoTipoDocumentoExclusao1;
    private javax.swing.JTextField txtIdCadastro;
    private javax.swing.JTextField txtNomeAlteracao;
    private javax.swing.JTextField txtNomeCadastro;
    private javax.swing.JTextField txtNomeConsulta;
    private javax.swing.JTextField txtNomeExclusao;
    private javax.swing.JTextField txtNomeTipoDocumentoAlteracao1;
    private javax.swing.JTextField txtNomeTipoDocumentoCadastro1;
    private javax.swing.JTextField txtNomeTipoDocumentoConsulta1;
    private javax.swing.JTextField txtNomeTipoDocumentoExclusao1;
    // End of variables declaration//GEN-END:variables
}
