/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import classes.ImovelAluguel;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bruna
 */
public class FormConsultarImovelAluguel extends javax.swing.JFrame {

    DefaultTableModel modelo;

    /**
     * Creates new form FormConsultarAluguel
     */
    public FormConsultarImovelAluguel() {
        initComponents();
        this.modelo = (DefaultTableModel) tImovelAluguel.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTipo = new javax.swing.JLabel();
        txtTipo = new javax.swing.JTextField();
        btBuscarImovelA = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tImovelAluguel = new javax.swing.JTable();
        btEditar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        btnAluguel = new javax.swing.JButton();
        ckTodos = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblTipo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTipo.setText("Tipo");

        btBuscarImovelA.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btBuscarImovelA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icBuscarImovel2.png"))); // NOI18N
        btBuscarImovelA.setText("Buscar Imóvel");
        btBuscarImovelA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarImovelAActionPerformed(evt);
            }
        });

        tImovelAluguel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Tipo", "Area", "Quartos", "Suítes", "Banheiro", "Garagens", "Endereço", "Valor do Aluguel", "Prazo Contrato"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Float.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tImovelAluguel.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tImovelAluguel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tImovelAluguelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tImovelAluguel);
        if (tImovelAluguel.getColumnModel().getColumnCount() > 0) {
            tImovelAluguel.getColumnModel().getColumn(0).setPreferredWidth(120);
            tImovelAluguel.getColumnModel().getColumn(1).setPreferredWidth(50);
            tImovelAluguel.getColumnModel().getColumn(2).setPreferredWidth(50);
            tImovelAluguel.getColumnModel().getColumn(3).setPreferredWidth(50);
            tImovelAluguel.getColumnModel().getColumn(4).setPreferredWidth(50);
            tImovelAluguel.getColumnModel().getColumn(5).setPreferredWidth(50);
            tImovelAluguel.getColumnModel().getColumn(6).setPreferredWidth(200);
            tImovelAluguel.getColumnModel().getColumn(7).setPreferredWidth(100);
            tImovelAluguel.getColumnModel().getColumn(8).setPreferredWidth(100);
        }

        btEditar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icEditarImovel.png"))); // NOI18N
        btEditar.setText("Editar");
        btEditar.setEnabled(false);
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        btExcluir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icDeletarImovel.png"))); // NOI18N
        btExcluir.setText("Excluir");
        btExcluir.setEnabled(false);
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btSair.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icSairImovel.png"))); // NOI18N
        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        btnAluguel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAluguel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icAluguelImovel.png"))); // NOI18N
        btnAluguel.setText("Realizar Aluguel");
        btnAluguel.setEnabled(false);
        btnAluguel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAluguelActionPerformed(evt);
            }
        });

        ckTodos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ckTodos.setText("Buscar Todos");
        ckTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckTodosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTipo)
                        .addContainerGap(757, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAluguel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btEditar)
                        .addGap(43, 43, 43)
                        .addComponent(btExcluir)
                        .addGap(118, 118, 118)
                        .addComponent(btSair)
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btBuscarImovelA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ckTodos)
                        .addGap(117, 117, 117))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 765, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblTipo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscarImovelA)
                    .addComponent(ckTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAluguel)
                    .addComponent(btEditar)
                    .addComponent(btExcluir)
                    .addComponent(btSair))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btBuscarImovelAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarImovelAActionPerformed
        limparTabela();

        if (ckTodos.isSelected()) {
            List<ImovelAluguel> lista = FormPrincipal.daoAluguelImovel.todosImoveisDsiponiveis();
            for (ImovelAluguel ia : lista) {
                incluirImovelTabela(ia);
            }
        } else // buscar um só
        {
            if (txtTipo.getText().trim().length() != 0) //verifica-se se o codigo foi digitado
            {
                List<ImovelAluguel> imoveis = FormPrincipal.daoAluguelImovel.buscarImovelDisponivelPorTipo(txtTipo.getText());
                if (imoveis != null && imoveis.size() > 0) {
                    for (ImovelAluguel ia : imoveis) {
                        incluirImovelTabela(ia);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Imóvel não encontrado!", "Atenção!", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Favor preencher o Tipo do Imóvel!", "Atenção!", JOptionPane.ERROR_MESSAGE);
                txtTipo.requestFocus();
            }
        }
    }//GEN-LAST:event_btBuscarImovelAActionPerformed

    private void ckTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckTodosActionPerformed
        // habilitando e desabilitando o campo de codigo com a seleção da busca de todos
        if (ckTodos.isSelected()) {
            txtTipo.setEnabled(false);
        } else {
            txtTipo.setEnabled(true);
            txtTipo.requestFocus();
            txtTipo.setText("");
        }
    }//GEN-LAST:event_ckTodosActionPerformed

    private void tImovelAluguelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tImovelAluguelMouseClicked
        btEditar.setEnabled(true);
        btExcluir.setEnabled(true);
        btnAluguel.setEnabled(true);
    }//GEN-LAST:event_tImovelAluguelMouseClicked

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btSairActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        ImovelAluguel imovel = getImovel();
        FormImovelAluguel frm = new FormImovelAluguel();
        frm.setVisible(true);
        frm.imovel = imovel;
        this.dispose();
    }//GEN-LAST:event_btEditarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        ImovelAluguel imovel = getImovel();
        FormPrincipal.daoAluguelImovel.removerImovel(imovel.getId());
        modelo.removeRow(tImovelAluguel.getSelectedRow());
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btnAluguelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAluguelActionPerformed
        ImovelAluguel imovel = getImovel();
        RealizarAluguel frm = new RealizarAluguel();
        frm.setVisible(true);
        frm.imovel = imovel;
        this.dispose();
    }//GEN-LAST:event_btnAluguelActionPerformed

    private void incluirImovelTabela(ImovelAluguel imovel) {
        modelo.addRow(new Object[]{imovel.getId(), imovel.getTipo(), imovel.getArea(), imovel.getQuartos(), imovel.getSuites(), imovel.getBanheiros(),
            imovel.getVagasGaragem(), imovel.getLogradouro(), imovel.valorAluguel, imovel.prazoContrato});
    }

    private void limparTabela() {
        for (int i = tImovelAluguel.getRowCount() - 1; i >= 0; --i) {
            modelo.removeRow(i);
        }
    }

    private ImovelAluguel getImovel() {
        ImovelAluguel imovel = new ImovelAluguel();
        int linha = tImovelAluguel.getSelectedRow();
        imovel = FormPrincipal.daoAluguelImovel.buscarImovel((Integer) modelo.getValueAt(linha, 0));

        return imovel;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormConsultarImovelAluguel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormConsultarImovelAluguel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormConsultarImovelAluguel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormConsultarImovelAluguel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormConsultarImovelAluguel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscarImovelA;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btSair;
    private javax.swing.JButton btnAluguel;
    private javax.swing.JCheckBox ckTodos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JTable tImovelAluguel;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables
}
