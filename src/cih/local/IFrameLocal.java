package cih.local;

import cci.CILocal;
import cdp.Local;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.event.ChangeEvent;

// @author Erick

public class IFrameLocal extends javax.swing.JInternalFrame {

    CILocal ctrl;
    List listaCmbBox;
    
    public IFrameLocal(CILocal ctrl) {
        this.ctrl = ctrl;
        listaCmbBox = new ArrayList();
        initComponents();
        iniciarAbaConsulta();
        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
               limparConteudoModuloLocal();
               preencherCmbBoxLocal(ctrl.getListaLocais());
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelCadastro = new javax.swing.JPanel();
        jLabelNomeCadastro = new javax.swing.JLabel();
        jTextFieldNomeCadastro = new javax.swing.JTextField();
        jLabelCapacidadeCadastro = new javax.swing.JLabel();
        jTextFieldCapacidadeCadastro = new javax.swing.JTextField();
        jScrollPaneDescricaoCadastro = new javax.swing.JScrollPane();
        jTextPaneDescricaoCadastro = new javax.swing.JTextPane();
        jLabelDescricaoCadastro = new javax.swing.JLabel();
        jButtonSalvarCadastro = new javax.swing.JButton();
        jButtonCancelarCadastro = new javax.swing.JButton();
        jPanelConsulta = new javax.swing.JPanel();
        jLabelNomeConsulta = new javax.swing.JLabel();
        jTextFieldNomeConsulta = new javax.swing.JTextField();
        jLabelCapacidadeConsulta = new javax.swing.JLabel();
        jTextFieldCapacidadeConsulta = new javax.swing.JTextField();
        jScrollPaneDescricaoConsulta = new javax.swing.JScrollPane();
        jTextPaneDescricaoConsulta = new javax.swing.JTextPane();
        jLabelDescricaoConsulta = new javax.swing.JLabel();
        jButtonPesquisarConsulta = new javax.swing.JButton();
        jButtonCancelarConsulta = new javax.swing.JButton();
        jLabelNome = new javax.swing.JLabel();
        jComboBoxNome = new javax.swing.JComboBox<>();
        jPanelAlterar = new javax.swing.JPanel();
        jLabelNomeAlteracao = new javax.swing.JLabel();
        jTextFieldNomeAlteracao = new javax.swing.JTextField();
        jLabelCapacidadeAlteracao = new javax.swing.JLabel();
        jTextFieldCapacidadeAlteracao = new javax.swing.JTextField();
        jScrollPaneDescricaoAlteracao = new javax.swing.JScrollPane();
        jTextPaneDescricaoAlteracao = new javax.swing.JTextPane();
        jLabelDescricaoAlteracao = new javax.swing.JLabel();
        jButtonSalvarAlteracao = new javax.swing.JButton();
        jButtonCancelarAlteracao = new javax.swing.JButton();
        jLabelNome1 = new javax.swing.JLabel();
        jComboBoxNome1 = new javax.swing.JComboBox<>();
        jButtonAbrirAlteracao = new javax.swing.JButton();
        jPanelExclusao = new javax.swing.JPanel();
        jLabelNomeExclusao = new javax.swing.JLabel();
        jTextFieldNomeExclusao = new javax.swing.JTextField();
        jLabelCapacidadeExclusao = new javax.swing.JLabel();
        jTextFieldCapacidadeExclusao = new javax.swing.JTextField();
        jScrollPaneDescricaoExclusao = new javax.swing.JScrollPane();
        jTextPaneDescricaoExclusao = new javax.swing.JTextPane();
        jLabelDescricaoExclusao = new javax.swing.JLabel();
        jButtonSalvarExclusao = new javax.swing.JButton();
        jButtonCancelarExclusao = new javax.swing.JButton();
        jLabelNome2 = new javax.swing.JLabel();
        jComboBoxNome2 = new javax.swing.JComboBox<>();
        jButtonAbrirExclusao = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setPreferredSize(new java.awt.Dimension(564, 465));

        jLabelNomeCadastro.setText("Nome");

        jLabelCapacidadeCadastro.setText("Capacidade");

        jScrollPaneDescricaoCadastro.setViewportView(jTextPaneDescricaoCadastro);

        jLabelDescricaoCadastro.setText("Descrição");

        jButtonSalvarCadastro.setText("Salvar");
        jButtonSalvarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarCadastroActionPerformed(evt);
            }
        });

        jButtonCancelarCadastro.setText("Cancelar");
        jButtonCancelarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarCadastroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCadastroLayout = new javax.swing.GroupLayout(jPanelCadastro);
        jPanelCadastro.setLayout(jPanelCadastroLayout);
        jPanelCadastroLayout.setHorizontalGroup(
            jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneDescricaoCadastro)
                    .addGroup(jPanelCadastroLayout.createSequentialGroup()
                        .addComponent(jLabelNomeCadastro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldNomeCadastro))
                    .addGroup(jPanelCadastroLayout.createSequentialGroup()
                        .addComponent(jButtonSalvarCadastro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonCancelarCadastro))
                    .addGroup(jPanelCadastroLayout.createSequentialGroup()
                        .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelCadastroLayout.createSequentialGroup()
                                .addComponent(jLabelCapacidadeCadastro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldCapacidadeCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelDescricaoCadastro))
                        .addGap(0, 376, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelCadastroLayout.setVerticalGroup(
            jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomeCadastro)
                    .addComponent(jTextFieldNomeCadastro))
                .addGap(18, 18, 18)
                .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCapacidadeCadastro)
                    .addComponent(jTextFieldCapacidadeCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelDescricaoCadastro)
                .addGap(10, 10, 10)
                .addComponent(jScrollPaneDescricaoCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                .addGap(57, 57, 57)
                .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvarCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCancelarCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );

        jTabbedPane1.addTab("Cadastro", jPanelCadastro);

        jLabelNomeConsulta.setText("Nome");

        jLabelCapacidadeConsulta.setText("Capacidade");

        jScrollPaneDescricaoConsulta.setViewportView(jTextPaneDescricaoConsulta);

        jLabelDescricaoConsulta.setText("Descrição");

        jButtonPesquisarConsulta.setText("Pesquisar");
        jButtonPesquisarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarConsultaActionPerformed(evt);
            }
        });

        jButtonCancelarConsulta.setText("Cancelar");
        jButtonCancelarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarConsultaActionPerformed(evt);
            }
        });

        jLabelNome.setText("Nome");

        jComboBoxNome.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanelConsultaLayout = new javax.swing.GroupLayout(jPanelConsulta);
        jPanelConsulta.setLayout(jPanelConsultaLayout);
        jPanelConsultaLayout.setHorizontalGroup(
            jPanelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelConsultaLayout.createSequentialGroup()
                        .addComponent(jButtonPesquisarConsulta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 388, Short.MAX_VALUE)
                        .addComponent(jButtonCancelarConsulta))
                    .addComponent(jScrollPaneDescricaoConsulta)
                    .addGroup(jPanelConsultaLayout.createSequentialGroup()
                        .addComponent(jLabelNomeConsulta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldNomeConsulta))
                    .addGroup(jPanelConsultaLayout.createSequentialGroup()
                        .addGroup(jPanelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelConsultaLayout.createSequentialGroup()
                                .addComponent(jLabelCapacidadeConsulta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldCapacidadeConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelDescricaoConsulta))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelConsultaLayout.createSequentialGroup()
                        .addComponent(jLabelNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxNome, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelConsultaLayout.setVerticalGroup(
            jPanelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsultaLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNome)
                    .addComponent(jComboBoxNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomeConsulta)
                    .addComponent(jTextFieldNomeConsulta))
                .addGap(18, 18, 18)
                .addGroup(jPanelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCapacidadeConsulta)
                    .addComponent(jTextFieldCapacidadeConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelDescricaoConsulta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneDescricaoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPesquisarConsulta)
                    .addComponent(jButtonCancelarConsulta))
                .addGap(19, 19, 19))
        );

        jTabbedPane1.addTab("Consulta", jPanelConsulta);

        jLabelNomeAlteracao.setText("Nome");

        jLabelCapacidadeAlteracao.setText("Capacidade");

        jScrollPaneDescricaoAlteracao.setViewportView(jTextPaneDescricaoAlteracao);

        jLabelDescricaoAlteracao.setText("Descrição");

        jButtonSalvarAlteracao.setText("Salvar");
        jButtonSalvarAlteracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarAlteracaoActionPerformed(evt);
            }
        });

        jButtonCancelarAlteracao.setText("Cancelar");
        jButtonCancelarAlteracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarAlteracaoActionPerformed(evt);
            }
        });

        jLabelNome1.setText("Nome");

        jComboBoxNome1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButtonAbrirAlteracao.setText("Abrir");
        jButtonAbrirAlteracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAbrirAlteracaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelAlterarLayout = new javax.swing.GroupLayout(jPanelAlterar);
        jPanelAlterar.setLayout(jPanelAlterarLayout);
        jPanelAlterarLayout.setHorizontalGroup(
            jPanelAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAlterarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAlterarLayout.createSequentialGroup()
                        .addComponent(jButtonSalvarAlteracao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonCancelarAlteracao))
                    .addComponent(jScrollPaneDescricaoAlteracao)
                    .addGroup(jPanelAlterarLayout.createSequentialGroup()
                        .addComponent(jLabelNomeAlteracao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldNomeAlteracao))
                    .addGroup(jPanelAlterarLayout.createSequentialGroup()
                        .addGroup(jPanelAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelAlterarLayout.createSequentialGroup()
                                .addComponent(jLabelCapacidadeAlteracao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldCapacidadeAlteracao, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelDescricaoAlteracao))
                        .addGap(0, 376, Short.MAX_VALUE))
                    .addGroup(jPanelAlterarLayout.createSequentialGroup()
                        .addComponent(jLabelNome1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxNome1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonAbrirAlteracao)))
                .addContainerGap())
        );
        jPanelAlterarLayout.setVerticalGroup(
            jPanelAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAlterarLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanelAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNome1)
                    .addComponent(jComboBoxNome1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAbrirAlteracao))
                .addGap(18, 18, 18)
                .addGroup(jPanelAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomeAlteracao)
                    .addComponent(jTextFieldNomeAlteracao))
                .addGap(18, 18, 18)
                .addGroup(jPanelAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCapacidadeAlteracao)
                    .addComponent(jTextFieldCapacidadeAlteracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelDescricaoAlteracao)
                .addGap(10, 10, 10)
                .addComponent(jScrollPaneDescricaoAlteracao, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanelAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvarAlteracao)
                    .addComponent(jButtonCancelarAlteracao))
                .addGap(19, 19, 19))
        );

        jTabbedPane1.addTab("Alteração", jPanelAlterar);

        jLabelNomeExclusao.setText("Nome");

        jLabelCapacidadeExclusao.setText("Capacidade");

        jScrollPaneDescricaoExclusao.setViewportView(jTextPaneDescricaoExclusao);

        jLabelDescricaoExclusao.setText("Descrição");

        jButtonSalvarExclusao.setText("Salvar");
        jButtonSalvarExclusao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarExclusaoActionPerformed(evt);
            }
        });

        jButtonCancelarExclusao.setText("Cancelar");
        jButtonCancelarExclusao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarExclusaoActionPerformed(evt);
            }
        });

        jLabelNome2.setText("Nome");

        jComboBoxNome2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButtonAbrirExclusao.setText("Abrir");
        jButtonAbrirExclusao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAbrirExclusaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelExclusaoLayout = new javax.swing.GroupLayout(jPanelExclusao);
        jPanelExclusao.setLayout(jPanelExclusaoLayout);
        jPanelExclusaoLayout.setHorizontalGroup(
            jPanelExclusaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelExclusaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelExclusaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelExclusaoLayout.createSequentialGroup()
                        .addComponent(jButtonSalvarExclusao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonCancelarExclusao))
                    .addComponent(jScrollPaneDescricaoExclusao)
                    .addGroup(jPanelExclusaoLayout.createSequentialGroup()
                        .addComponent(jLabelNomeExclusao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldNomeExclusao))
                    .addGroup(jPanelExclusaoLayout.createSequentialGroup()
                        .addGroup(jPanelExclusaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelExclusaoLayout.createSequentialGroup()
                                .addComponent(jLabelCapacidadeExclusao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldCapacidadeExclusao, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelDescricaoExclusao))
                        .addGap(0, 376, Short.MAX_VALUE))
                    .addGroup(jPanelExclusaoLayout.createSequentialGroup()
                        .addComponent(jLabelNome2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxNome2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonAbrirExclusao)))
                .addContainerGap())
        );
        jPanelExclusaoLayout.setVerticalGroup(
            jPanelExclusaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelExclusaoLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanelExclusaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNome2)
                    .addComponent(jComboBoxNome2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAbrirExclusao))
                .addGap(18, 18, 18)
                .addGroup(jPanelExclusaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomeExclusao)
                    .addComponent(jTextFieldNomeExclusao))
                .addGap(18, 18, 18)
                .addGroup(jPanelExclusaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCapacidadeExclusao)
                    .addComponent(jTextFieldCapacidadeExclusao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelDescricaoExclusao)
                .addGap(10, 10, 10)
                .addComponent(jScrollPaneDescricaoExclusao, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanelExclusaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvarExclusao)
                    .addComponent(jButtonCancelarExclusao))
                .addGap(19, 19, 19))
        );

        jTabbedPane1.addTab("Exclusão", jPanelExclusao);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarCadastroActionPerformed
        this.dispose();    
    }//GEN-LAST:event_jButtonCancelarCadastroActionPerformed

    private void jButtonPesquisarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarConsultaActionPerformed
        String nome = jComboBoxNome.getSelectedItem().toString();
        Object obj = encontrarElmento(nome);
        preencherCamposConsulta((Local)obj);
    }//GEN-LAST:event_jButtonPesquisarConsultaActionPerformed

    private void jButtonSalvarAlteracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarAlteracaoActionPerformed
        String nome = jTextFieldNomeAlteracao.getText();
        String desc = jTextPaneDescricaoAlteracao.getText();
        String qtd  = jTextFieldCapacidadeAlteracao.getText();
        Object objId = encontrarElmento(jComboBoxNome1.getSelectedItem().toString());
        ctrl.alterarLocal(objId, nome, desc, qtd);
        ctrl.exibirMenssagemInformativa("Alteração de dado concluida");
    }//GEN-LAST:event_jButtonSalvarAlteracaoActionPerformed

    private void jButtonSalvarExclusaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarExclusaoActionPerformed
        ctrl.excluirLocal(encontrarElmento(jComboBoxNome2.getSelectedItem().toString()));
        ctrl.exibirMenssagemInformativa("Local excluido com sucesso");
    }//GEN-LAST:event_jButtonSalvarExclusaoActionPerformed

    private void jButtonCancelarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarConsultaActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarConsultaActionPerformed

    private void jButtonCancelarAlteracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarAlteracaoActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarAlteracaoActionPerformed

    private void jButtonCancelarExclusaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarExclusaoActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarExclusaoActionPerformed

    private void jButtonSalvarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarCadastroActionPerformed
        String nome = jTextFieldNomeCadastro.getText();
        String qtd  = jTextFieldCapacidadeCadastro.getText();
        String desc = jTextPaneDescricaoCadastro.getText();
        ctrl.cadastrarLocal(nome, desc, qtd);
        ctrl.exibirMenssagemInformativa("Cadastro concluido com sucesso");
    }//GEN-LAST:event_jButtonSalvarCadastroActionPerformed

    private void jButtonAbrirAlteracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAbrirAlteracaoActionPerformed
        String nome = jComboBoxNome1.getSelectedItem().toString();
        Object obj = encontrarElmento(nome);
        preencherCamposAlteracao((Local)obj);
    }//GEN-LAST:event_jButtonAbrirAlteracaoActionPerformed

    private void jButtonAbrirExclusaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAbrirExclusaoActionPerformed
        String nome = jComboBoxNome2.getSelectedItem().toString();
        Object obj = encontrarElmento(nome);
        preencherCamposExclusao((Local)obj);
    }//GEN-LAST:event_jButtonAbrirExclusaoActionPerformed
    
    public void limparConteudoModuloLocal(){
        limparConteudoAbaAlteracao();
        limparConteudoAbaCadastro();
        limparConteudoAbaConsulta();
        limparConteudoAbaExclusao();
    }

    private void limparConteudoAbaAlteracao() {
        jTextFieldNomeAlteracao.setText("");
        jTextFieldCapacidadeAlteracao.setText("");
        jTextPaneDescricaoAlteracao.setText("");
    }

    private void limparConteudoAbaCadastro() {
        jTextFieldNomeCadastro.setText("");
        jTextFieldCapacidadeCadastro.setText("");
        jTextPaneDescricaoCadastro.setText("");
    }

    private void limparConteudoAbaConsulta() {
        jTextFieldNomeConsulta.setText("");
        jTextFieldCapacidadeConsulta.setText("");
        jTextPaneDescricaoConsulta.setText("");
    }

    private void limparConteudoAbaExclusao() {
        jTextFieldNomeExclusao.setText("");
        jTextFieldCapacidadeExclusao.setText("");
        jTextPaneDescricaoExclusao.setText("");
    }
    
    private void preencherCmbBoxLocal(List lista){
        jComboBoxNome.removeAllItems();
        jComboBoxNome1.removeAllItems();
        jComboBoxNome2.removeAllItems();
        if(lista != null){
            for(Object item : lista){
                listaCmbBox.add(item);
                jComboBoxNome.addItem(item.toString());
                jComboBoxNome1.addItem(item.toString());
                jComboBoxNome2.addItem(item.toString());
            }
        }
    }
    
    private Object encontrarElmento(String nome) {
        for(Object item : listaCmbBox){
            if(item.toString().equals(nome))
                return item;
        }
        return null;
    }
    
    public void iniciarAbaConsulta(){
        limparConteudoAbaConsulta();
        jTextFieldNomeConsulta.setEnabled(false);
        jTextFieldCapacidadeConsulta.setEnabled(false);
        jTextPaneDescricaoConsulta.setEnabled(false);        
    }

    private void preencherCamposConsulta(Local localAux) {
        jTextFieldNomeConsulta.setText(localAux.getNome());
        jTextFieldCapacidadeConsulta.setText(Integer.toString(localAux.getCapacidade()));
        jTextPaneDescricaoConsulta.setText(localAux.getDescricao());
    }
    
    private void preencherCamposAlteracao(Local localAux) {
        jTextFieldNomeAlteracao.setText(localAux.getNome());
        jTextFieldCapacidadeAlteracao.setText(Integer.toString(localAux.getCapacidade()));
        jTextPaneDescricaoAlteracao.setText(localAux.getDescricao());
    }

    private void preencherCamposExclusao(Local localAux) {
        jTextFieldNomeExclusao.setText(localAux.getNome());
        jTextFieldCapacidadeExclusao.setText(Integer.toString(localAux.getCapacidade()));
        jTextPaneDescricaoExclusao.setText(localAux.getDescricao());
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAbrirAlteracao;
    private javax.swing.JButton jButtonAbrirExclusao;
    private javax.swing.JButton jButtonCancelarAlteracao;
    private javax.swing.JButton jButtonCancelarCadastro;
    private javax.swing.JButton jButtonCancelarConsulta;
    private javax.swing.JButton jButtonCancelarExclusao;
    private javax.swing.JButton jButtonPesquisarConsulta;
    private javax.swing.JButton jButtonSalvarAlteracao;
    private javax.swing.JButton jButtonSalvarCadastro;
    private javax.swing.JButton jButtonSalvarExclusao;
    private javax.swing.JComboBox<String> jComboBoxNome;
    private javax.swing.JComboBox<String> jComboBoxNome1;
    private javax.swing.JComboBox<String> jComboBoxNome2;
    private javax.swing.JLabel jLabelCapacidadeAlteracao;
    private javax.swing.JLabel jLabelCapacidadeCadastro;
    private javax.swing.JLabel jLabelCapacidadeConsulta;
    private javax.swing.JLabel jLabelCapacidadeExclusao;
    private javax.swing.JLabel jLabelDescricaoAlteracao;
    private javax.swing.JLabel jLabelDescricaoCadastro;
    private javax.swing.JLabel jLabelDescricaoConsulta;
    private javax.swing.JLabel jLabelDescricaoExclusao;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelNome1;
    private javax.swing.JLabel jLabelNome2;
    private javax.swing.JLabel jLabelNomeAlteracao;
    private javax.swing.JLabel jLabelNomeCadastro;
    private javax.swing.JLabel jLabelNomeConsulta;
    private javax.swing.JLabel jLabelNomeExclusao;
    private javax.swing.JPanel jPanelAlterar;
    private javax.swing.JPanel jPanelCadastro;
    private javax.swing.JPanel jPanelConsulta;
    private javax.swing.JPanel jPanelExclusao;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPaneDescricaoAlteracao;
    private javax.swing.JScrollPane jScrollPaneDescricaoCadastro;
    private javax.swing.JScrollPane jScrollPaneDescricaoConsulta;
    private javax.swing.JScrollPane jScrollPaneDescricaoExclusao;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldCapacidadeAlteracao;
    private javax.swing.JTextField jTextFieldCapacidadeCadastro;
    private javax.swing.JTextField jTextFieldCapacidadeConsulta;
    private javax.swing.JTextField jTextFieldCapacidadeExclusao;
    private javax.swing.JTextField jTextFieldNomeAlteracao;
    private javax.swing.JTextField jTextFieldNomeCadastro;
    private javax.swing.JTextField jTextFieldNomeConsulta;
    private javax.swing.JTextField jTextFieldNomeExclusao;
    private javax.swing.JTextPane jTextPaneDescricaoAlteracao;
    private javax.swing.JTextPane jTextPaneDescricaoCadastro;
    private javax.swing.JTextPane jTextPaneDescricaoConsulta;
    private javax.swing.JTextPane jTextPaneDescricaoExclusao;
    // End of variables declaration//GEN-END:variables

}
