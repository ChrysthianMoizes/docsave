package cih.local;

import cci.CILocal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.event.ChangeEvent;

/**
 *
 * @author Erick
 */
public class IFrameLocal extends javax.swing.JInternalFrame {

    CILocal ctrl;
    List listaCmbBoxMobliaLocal;
    
    public IFrameLocal(CILocal ctrl) {
        this.ctrl = ctrl;
        listaCmbBoxMobliaLocal = new ArrayList();
        initComponents();
        preencherCmbBoxMobiliaLocal(ctrl.carregarCmbBoxMobiliaLocal());
        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
               //colocar os metodos que devem ser executados quando ouver troca de aba
            }
        });
        //verificar do que se trata o metodo changeListener
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
        jLabelQtdMobiliaCadastro = new javax.swing.JLabel();
        jSpinnerQtdMobiliaCadastro = new javax.swing.JSpinner();
        jScrollPaneDescricaoCadastro = new javax.swing.JScrollPane();
        jTextPaneDescricaoCadastro = new javax.swing.JTextPane();
        jLabelDescricaoCadastro = new javax.swing.JLabel();
        jLabelMobiliaCadastro = new javax.swing.JLabel();
        jComboBoxMobiliaCadastro = new javax.swing.JComboBox<>();
        jScrollPaneMobiliaCadastro = new javax.swing.JScrollPane();
        jTableMobiliaCadastro = new javax.swing.JTable();
        jButtonSalvarCadastro = new javax.swing.JButton();
        jButtonCancelarCadastro = new javax.swing.JButton();
        jPanelConsulta = new javax.swing.JPanel();
        jLabelNomeConsulta = new javax.swing.JLabel();
        jTextFieldNomeConsulta = new javax.swing.JTextField();
        jScrollPaneLocalConsulta = new javax.swing.JScrollPane();
        jTableLocalConsulta = new javax.swing.JTable();
        jButtonPesquisarConsulta = new javax.swing.JButton();
        jButtonCancelarConsulta = new javax.swing.JButton();
        jPanelAlterar = new javax.swing.JPanel();
        jLabelNomeAlteracao = new javax.swing.JLabel();
        jTextFieldNomeAlteracao = new javax.swing.JTextField();
        jScrollPaneLocalAlteracao = new javax.swing.JScrollPane();
        jTableLocalAlteracao = new javax.swing.JTable();
        jButtonPesquisarAlteracao = new javax.swing.JButton();
        jButtonCancelarAlteracao = new javax.swing.JButton();
        jPanelExclusao = new javax.swing.JPanel();
        jLabelNomeExclusao = new javax.swing.JLabel();
        jTextFieldNomeExclusao = new javax.swing.JTextField();
        jScrollPaneLocalExclusao = new javax.swing.JScrollPane();
        jTableLocalExclusao = new javax.swing.JTable();
        jButtonPesquisarExclusao = new javax.swing.JButton();
        jButtonCancelarExclusao = new javax.swing.JButton();

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

        jLabelNomeCadastro.setText("Nome");

        jLabelCapacidadeCadastro.setText("Capacidade");

        jLabelQtdMobiliaCadastro.setText("Quantidade de Mobília");

        jScrollPaneDescricaoCadastro.setViewportView(jTextPaneDescricaoCadastro);

        jLabelDescricaoCadastro.setText("Descrição");

        jLabelMobiliaCadastro.setText("Mobília");

        jComboBoxMobiliaCadastro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxMobiliaCadastro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxMobiliaCadastroItemStateChanged(evt);
            }
        });

        jTableMobiliaCadastro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Capacidade", "Compartimento", "Quant. Compart."
            }
        ));
        jScrollPaneMobiliaCadastro.setViewportView(jTableMobiliaCadastro);

        jButtonSalvarCadastro.setText("Salvar");

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
                    .addComponent(jScrollPaneMobiliaCadastro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPaneDescricaoCadastro)
                    .addGroup(jPanelCadastroLayout.createSequentialGroup()
                        .addComponent(jLabelNomeCadastro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldNomeCadastro))
                    .addGroup(jPanelCadastroLayout.createSequentialGroup()
                        .addComponent(jLabelCapacidadeCadastro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldCapacidadeCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelQtdMobiliaCadastro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSpinnerQtdMobiliaCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                    .addGroup(jPanelCadastroLayout.createSequentialGroup()
                        .addComponent(jButtonSalvarCadastro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonCancelarCadastro))
                    .addGroup(jPanelCadastroLayout.createSequentialGroup()
                        .addComponent(jLabelDescricaoCadastro)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelCadastroLayout.createSequentialGroup()
                        .addComponent(jLabelMobiliaCadastro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxMobiliaCadastro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                    .addComponent(jTextFieldCapacidadeCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelQtdMobiliaCadastro)
                    .addComponent(jSpinnerQtdMobiliaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelDescricaoCadastro)
                .addGap(10, 10, 10)
                .addComponent(jScrollPaneDescricaoCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                .addGap(3, 3, 3)
                .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabelMobiliaCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addComponent(jComboBoxMobiliaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jScrollPaneMobiliaCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvarCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCancelarCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );

        jTabbedPane1.addTab("Cadastro", jPanelCadastro);

        jLabelNomeConsulta.setText("Nome");

        jTableLocalConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Capacidade", "Quant. Mob."
            }
        ));
        jScrollPaneLocalConsulta.setViewportView(jTableLocalConsulta);

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

        javax.swing.GroupLayout jPanelConsultaLayout = new javax.swing.GroupLayout(jPanelConsulta);
        jPanelConsulta.setLayout(jPanelConsultaLayout);
        jPanelConsultaLayout.setHorizontalGroup(
            jPanelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneLocalConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                    .addGroup(jPanelConsultaLayout.createSequentialGroup()
                        .addComponent(jLabelNomeConsulta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldNomeConsulta))
                    .addGroup(jPanelConsultaLayout.createSequentialGroup()
                        .addComponent(jButtonPesquisarConsulta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonCancelarConsulta)))
                .addContainerGap())
        );
        jPanelConsultaLayout.setVerticalGroup(
            jPanelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomeConsulta)
                    .addComponent(jTextFieldNomeConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPaneLocalConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                .addGap(26, 26, 26)
                .addGroup(jPanelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPesquisarConsulta)
                    .addComponent(jButtonCancelarConsulta))
                .addGap(19, 19, 19))
        );

        jTabbedPane1.addTab("Consulta", jPanelConsulta);

        jLabelNomeAlteracao.setText("Nome");

        jTableLocalAlteracao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Capacidade", "Quant. Mob."
            }
        ));
        jScrollPaneLocalAlteracao.setViewportView(jTableLocalAlteracao);

        jButtonPesquisarAlteracao.setText("Pesquisar");
        jButtonPesquisarAlteracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarAlteracaoActionPerformed(evt);
            }
        });

        jButtonCancelarAlteracao.setText("Cancelar");
        jButtonCancelarAlteracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarAlteracaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelAlterarLayout = new javax.swing.GroupLayout(jPanelAlterar);
        jPanelAlterar.setLayout(jPanelAlterarLayout);
        jPanelAlterarLayout.setHorizontalGroup(
            jPanelAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAlterarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneLocalAlteracao, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                    .addGroup(jPanelAlterarLayout.createSequentialGroup()
                        .addComponent(jLabelNomeAlteracao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldNomeAlteracao))
                    .addGroup(jPanelAlterarLayout.createSequentialGroup()
                        .addComponent(jButtonPesquisarAlteracao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonCancelarAlteracao)))
                .addContainerGap())
        );
        jPanelAlterarLayout.setVerticalGroup(
            jPanelAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAlterarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomeAlteracao)
                    .addComponent(jTextFieldNomeAlteracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPaneLocalAlteracao, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                .addGap(26, 26, 26)
                .addGroup(jPanelAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPesquisarAlteracao)
                    .addComponent(jButtonCancelarAlteracao))
                .addGap(19, 19, 19))
        );

        jTabbedPane1.addTab("Alteração", jPanelAlterar);

        jLabelNomeExclusao.setText("Nome");

        jTableLocalExclusao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Capacidade", "Quant. Mob."
            }
        ));
        jScrollPaneLocalExclusao.setViewportView(jTableLocalExclusao);

        jButtonPesquisarExclusao.setText("Pesquisar");
        jButtonPesquisarExclusao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarExclusaoActionPerformed(evt);
            }
        });

        jButtonCancelarExclusao.setText("Cancelar");
        jButtonCancelarExclusao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarExclusaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelExclusaoLayout = new javax.swing.GroupLayout(jPanelExclusao);
        jPanelExclusao.setLayout(jPanelExclusaoLayout);
        jPanelExclusaoLayout.setHorizontalGroup(
            jPanelExclusaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelExclusaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelExclusaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneLocalExclusao, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                    .addGroup(jPanelExclusaoLayout.createSequentialGroup()
                        .addComponent(jLabelNomeExclusao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldNomeExclusao))
                    .addGroup(jPanelExclusaoLayout.createSequentialGroup()
                        .addComponent(jButtonPesquisarExclusao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonCancelarExclusao)))
                .addContainerGap())
        );
        jPanelExclusaoLayout.setVerticalGroup(
            jPanelExclusaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelExclusaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelExclusaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomeExclusao)
                    .addComponent(jTextFieldNomeExclusao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPaneLocalExclusao, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                .addGap(26, 26, 26)
                .addGroup(jPanelExclusaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPesquisarExclusao)
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
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxMobiliaCadastroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxMobiliaCadastroItemStateChanged
        //adiciono o item clicado na tabela abaixo
        Object obj = encontrarElmento(jComboBoxMobiliaCadastro.getSelectedItem().toString());
        
    }//GEN-LAST:event_jComboBoxMobiliaCadastroItemStateChanged

    private void jButtonCancelarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarCadastroActionPerformed
        this.dispose();    
    }//GEN-LAST:event_jButtonCancelarCadastroActionPerformed

    private void jButtonPesquisarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarConsultaActionPerformed
        ctrl.consultarLocal(jTextFieldNomeConsulta.getText());
    }//GEN-LAST:event_jButtonPesquisarConsultaActionPerformed

    private void jButtonPesquisarAlteracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarAlteracaoActionPerformed
        ctrl.consultarLocal(jTextFieldNomeConsulta.getText());
    }//GEN-LAST:event_jButtonPesquisarAlteracaoActionPerformed

    private void jButtonPesquisarExclusaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarExclusaoActionPerformed
        ctrl.consultarLocal(jTextFieldNomeConsulta.getText());
    }//GEN-LAST:event_jButtonPesquisarExclusaoActionPerformed

    private void jButtonCancelarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarConsultaActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarConsultaActionPerformed

    private void jButtonCancelarAlteracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarAlteracaoActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarAlteracaoActionPerformed

    private void jButtonCancelarExclusaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarExclusaoActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarExclusaoActionPerformed
    
    public void preencheTabelaConsulta(Object obj){
        
    }
    
    private void preencherCmbBoxMobiliaLocal(List lista){
        jComboBoxMobiliaCadastro.removeAllItems();
        if(lista != null){
            for(Object item : lista){
                listaCmbBoxMobliaLocal.add(item);
                jComboBoxMobiliaCadastro.addItem(item.toString());
            }
        }
    }
    
    public void limparConteudoModuloLocal(){
        limparConteudoAbaAlteracao();
        limparConteudoAbaCadastro();
        limparConteudoAbaConsulta();
        limparConteudoAbaExclusao();
    }

    private void limparConteudoAbaAlteracao() {
        jTextFieldNomeAlteracao.setText("");
        jTableLocalAlteracao.removeAll();
    }

    private void limparConteudoAbaCadastro() {
        preencherCmbBoxMobiliaLocal(ctrl.carregarCmbBoxMobiliaLocal());
        jTextFieldNomeCadastro.setText("");
        jTextFieldCapacidadeCadastro.setText("");
        //quantidade mobilia
        jTextPaneDescricaoCadastro.setText("");
        jTableMobiliaCadastro.removeAll();
    }

    private void limparConteudoAbaConsulta() {
        jTextFieldNomeConsulta.setText("");
        jTableLocalConsulta.removeAll();
    }

    private void limparConteudoAbaExclusao() {
        jTextFieldNomeExclusao.setText("");
        jTableLocalExclusao.removeAll();
    }
    
    private Object encontrarElmento(String nome){
        for(Object item : listaCmbBoxMobliaLocal){
            if(item.toString().equals(nome))
                return item;
        }
        return null;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelarAlteracao;
    private javax.swing.JButton jButtonCancelarCadastro;
    private javax.swing.JButton jButtonCancelarConsulta;
    private javax.swing.JButton jButtonCancelarExclusao;
    private javax.swing.JButton jButtonPesquisarAlteracao;
    private javax.swing.JButton jButtonPesquisarConsulta;
    private javax.swing.JButton jButtonPesquisarExclusao;
    private javax.swing.JButton jButtonSalvarCadastro;
    private javax.swing.JComboBox<String> jComboBoxMobiliaCadastro;
    private javax.swing.JLabel jLabelCapacidadeCadastro;
    private javax.swing.JLabel jLabelDescricaoCadastro;
    private javax.swing.JLabel jLabelMobiliaCadastro;
    private javax.swing.JLabel jLabelNomeAlteracao;
    private javax.swing.JLabel jLabelNomeCadastro;
    private javax.swing.JLabel jLabelNomeConsulta;
    private javax.swing.JLabel jLabelNomeExclusao;
    private javax.swing.JLabel jLabelQtdMobiliaCadastro;
    private javax.swing.JPanel jPanelAlterar;
    private javax.swing.JPanel jPanelCadastro;
    private javax.swing.JPanel jPanelConsulta;
    private javax.swing.JPanel jPanelExclusao;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPaneDescricaoCadastro;
    private javax.swing.JScrollPane jScrollPaneLocalAlteracao;
    private javax.swing.JScrollPane jScrollPaneLocalConsulta;
    private javax.swing.JScrollPane jScrollPaneLocalExclusao;
    private javax.swing.JScrollPane jScrollPaneMobiliaCadastro;
    private javax.swing.JSpinner jSpinnerQtdMobiliaCadastro;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableLocalAlteracao;
    private javax.swing.JTable jTableLocalConsulta;
    private javax.swing.JTable jTableLocalExclusao;
    private javax.swing.JTable jTableMobiliaCadastro;
    private javax.swing.JTextField jTextFieldCapacidadeCadastro;
    private javax.swing.JTextField jTextFieldNomeAlteracao;
    private javax.swing.JTextField jTextFieldNomeCadastro;
    private javax.swing.JTextField jTextFieldNomeConsulta;
    private javax.swing.JTextField jTextFieldNomeExclusao;
    private javax.swing.JTextPane jTextPaneDescricaoCadastro;
    // End of variables declaration//GEN-END:variables

}
