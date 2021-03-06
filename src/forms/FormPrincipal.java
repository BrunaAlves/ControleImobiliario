/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

//Aceitar somente numero. Ir em propriedade do TextField, > Codigo> Código de pós criação
try{
 javax.swing.text.MaskFormatter data = new javax.swing.text.MaskFormatter("##/##/####");

 tfDataPublicacao = new javax.swing.JFormattedTextField(data);
 }catch(Exception e){
}
 */
package forms;

import dao.AluguelDAO;
import dao.ClienteDAO;
import dao.ImovelAluguelDAO;
import dao.ImovelVendaDAO;
import dao.VendaDAO;
/**
 *
 * @author alunoces
 */
public class FormPrincipal extends javax.swing.JFrame {

    public static ClienteDAO daoCliente = new ClienteDAO();
    public static ImovelAluguelDAO daoAluguelImovel = new ImovelAluguelDAO();
    public static ImovelVendaDAO daoVendaImovel = new ImovelVendaDAO();
    public static AluguelDAO daoAluguel = new AluguelDAO();
    public static VendaDAO daoVenda = new VendaDAO();

    /**
     * Creates new form FormPrincipal
     */
    public FormPrincipal() {
        initComponents();
        this.setExtendedState(this.MAXIMIZED_BOTH);
        
        daoCliente = new ClienteDAO();
        daoAluguelImovel = new ImovelAluguelDAO();
        daoVendaImovel = new ImovelVendaDAO();
        daoAluguel = new AluguelDAO();
        daoVenda = new VendaDAO();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemCadCliente = new javax.swing.JMenuItem();
        jMenuItemCadImovelAluguel = new javax.swing.JMenuItem();
        jMenuItemCadImovelVenda = new javax.swing.JMenuItem();
        jMenuConsultas = new javax.swing.JMenu();
        jMenuItemConsuClientes = new javax.swing.JMenuItem();
        jMenuItemConsuImovelAluguel = new javax.swing.JMenuItem();
        jMenuItemConsuImovelVenda = new javax.swing.JMenuItem();
        jMenuSuporte = new javax.swing.JMenu();
        jMenuItemSuporteAjuda = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItemSuporteSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Eletrônico de Livraria");
        setExtendedState(6);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo.png"))); // NOI18N
        jPanel1.add(jLabel1, java.awt.BorderLayout.CENTER);

        jMenu2.setText("Cadastros");

        jMenuItemCadCliente.setText("Cliente");
        jMenuItemCadCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadClienteActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemCadCliente);

        jMenuItemCadImovelAluguel.setText("Imóvel Aluguel");
        jMenuItemCadImovelAluguel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadImovelAluguelActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemCadImovelAluguel);

        jMenuItemCadImovelVenda.setText("Imóvel Venda");
        jMenuItemCadImovelVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadImovelVendaActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemCadImovelVenda);

        jMenuBar1.add(jMenu2);

        jMenuConsultas.setText("Consultas");

        jMenuItemConsuClientes.setText("Clientes");
        jMenuItemConsuClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConsuClientesActionPerformed(evt);
            }
        });
        jMenuConsultas.add(jMenuItemConsuClientes);

        jMenuItemConsuImovelAluguel.setText("Imóveis Aluguel");
        jMenuItemConsuImovelAluguel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConsuImovelAluguelActionPerformed(evt);
            }
        });
        jMenuConsultas.add(jMenuItemConsuImovelAluguel);

        jMenuItemConsuImovelVenda.setText("Imóveis Venda");
        jMenuItemConsuImovelVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConsuImovelVendaActionPerformed(evt);
            }
        });
        jMenuConsultas.add(jMenuItemConsuImovelVenda);

        jMenuBar1.add(jMenuConsultas);

        jMenuSuporte.setText("Suporte");

        jMenuItemSuporteAjuda.setText("Ajuda");
        jMenuSuporte.add(jMenuItemSuporteAjuda);
        jMenuSuporte.add(jSeparator2);

        jMenuItemSuporteSobre.setText("Sobre");
        jMenuSuporte.add(jMenuItemSuporteSobre);

        jMenuBar1.add(jMenuSuporte);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(634, 451));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemConsuClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConsuClientesActionPerformed
        new FormConsultaCliente().setVisible(true);
    }//GEN-LAST:event_jMenuItemConsuClientesActionPerformed

    private void jMenuItemConsuImovelAluguelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConsuImovelAluguelActionPerformed
        new FormConsultarImovelAluguel().setVisible(true);
    }//GEN-LAST:event_jMenuItemConsuImovelAluguelActionPerformed

    private void jMenuItemCadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadClienteActionPerformed
        new FormCliente().setVisible(true);
    }//GEN-LAST:event_jMenuItemCadClienteActionPerformed

    private void jMenuItemCadImovelAluguelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadImovelAluguelActionPerformed
        new FormImovelAluguel().setVisible(true);
    }//GEN-LAST:event_jMenuItemCadImovelAluguelActionPerformed

    private void jMenuItemCadImovelVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadImovelVendaActionPerformed
        new FormImovelVenda().setVisible(true);
    }//GEN-LAST:event_jMenuItemCadImovelVendaActionPerformed

    private void jMenuItemConsuImovelVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConsuImovelVendaActionPerformed
        new FormConsultarImovelVenda().setVisible(true);
    }//GEN-LAST:event_jMenuItemConsuImovelVendaActionPerformed

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
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuConsultas;
    private javax.swing.JMenuItem jMenuItemCadCliente;
    private javax.swing.JMenuItem jMenuItemCadImovelAluguel;
    private javax.swing.JMenuItem jMenuItemCadImovelVenda;
    private javax.swing.JMenuItem jMenuItemConsuClientes;
    private javax.swing.JMenuItem jMenuItemConsuImovelAluguel;
    private javax.swing.JMenuItem jMenuItemConsuImovelVenda;
    private javax.swing.JMenuItem jMenuItemSuporteAjuda;
    private javax.swing.JMenuItem jMenuItemSuporteSobre;
    private javax.swing.JMenu jMenuSuporte;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
