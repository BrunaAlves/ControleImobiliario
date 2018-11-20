/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import classes.ImovelAluguel;
import javax.swing.JOptionPane;

/**
 *
 * @author Meu computador
 */
public class FormImovelAluguel extends javax.swing.JFrame {

    public ImovelAluguel imovel = null;

    /**
     * Creates new form FormImovelAluguel
     */
    public FormImovelAluguel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JTextField();
        btBuscar = new javax.swing.JButton();
        tbDadosImovel = new javax.swing.JTabbedPane();
        pDadosImovel = new javax.swing.JPanel();
        lblArea = new javax.swing.JLabel();
        txtArea = new javax.swing.JTextField();
        lblQuartos = new javax.swing.JLabel();
        txtQuartos = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        lblPrazoContrato = new javax.swing.JLabel();
        txtPrazoContrato = new javax.swing.JTextField();
        lblValorAluguel = new javax.swing.JLabel();
        txtValorAluguel = new javax.swing.JTextField();
        lblSuites = new javax.swing.JLabel();
        txtSuites = new javax.swing.JTextField();
        lblVagasGaragem = new javax.swing.JLabel();
        txtVagasGaragem = new javax.swing.JTextField();
        lblBanheiros = new javax.swing.JLabel();
        txtBanheiros = new javax.swing.JTextField();
        pEnderecoImovel = new javax.swing.JPanel();
        lblLogradouro = new javax.swing.JLabel();
        txtLogradouro = new javax.swing.JTextField();
        lblComplemento = new javax.swing.JLabel();
        txtComplemento = new javax.swing.JTextField();
        lblCidade = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cbEstado = new javax.swing.JComboBox<>();
        lblBairro = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        lblNumero = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        lblCep = new javax.swing.JLabel();
        txtCep = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btAtualizar = new javax.swing.JButton();
        txrNomeProprietario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icSalvarImovel.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setEnabled(false);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icCancelImovel.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("CÓDIGO:");

        btBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icBuscarImovel.png"))); // NOI18N
        btBuscar.setText("Buscar");
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        lblArea.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblArea.setText("Área:");

        txtArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAreaActionPerformed(evt);
            }
        });

        lblQuartos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblQuartos.setText("Quartos:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Tipo:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Apartamento", "Casa", "Flat", "Kitnet", "Loft", "Sobrado" }));

        lblPrazoContrato.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblPrazoContrato.setText("Prazo do Contrato:");

        lblValorAluguel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblValorAluguel.setText("Valor do Aluguel:");

        lblSuites.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblSuites.setText("Suítes:");

        lblVagasGaragem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblVagasGaragem.setText("Vagas na garagem:");

        lblBanheiros.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblBanheiros.setText("Banheiros:");

        javax.swing.GroupLayout pDadosImovelLayout = new javax.swing.GroupLayout(pDadosImovel);
        pDadosImovel.setLayout(pDadosImovelLayout);
        pDadosImovelLayout.setHorizontalGroup(
            pDadosImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDadosImovelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDadosImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pDadosImovelLayout.createSequentialGroup()
                        .addComponent(lblVagasGaragem)
                        .addGap(74, 74, 74)
                        .addComponent(lblBanheiros))
                    .addGroup(pDadosImovelLayout.createSequentialGroup()
                        .addGroup(pDadosImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtVagasGaragem, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPrazoContrato))
                        .addGroup(pDadosImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pDadosImovelLayout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(txtBanheiros, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pDadosImovelLayout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addGroup(pDadosImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtValorAluguel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblValorAluguel)))))
                    .addGroup(pDadosImovelLayout.createSequentialGroup()
                        .addGroup(pDadosImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pDadosImovelLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(134, 134, 134)
                                .addComponent(lblArea)
                                .addGap(110, 110, 110)
                                .addComponent(lblQuartos))
                            .addGroup(pDadosImovelLayout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(txtQuartos, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(55, 55, 55)
                        .addGroup(pDadosImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSuites, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSuites)))
                    .addComponent(txtPrazoContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        pDadosImovelLayout.setVerticalGroup(
            pDadosImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDadosImovelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pDadosImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuartos)
                    .addComponent(lblArea)
                    .addComponent(jLabel2)
                    .addComponent(lblSuites))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDadosImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQuartos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSuites, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(pDadosImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBanheiros)
                    .addComponent(lblVagasGaragem))
                .addGap(12, 12, 12)
                .addGroup(pDadosImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBanheiros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtVagasGaragem, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pDadosImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrazoContrato)
                    .addComponent(lblValorAluguel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDadosImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrazoContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValorAluguel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbDadosImovel.addTab("Dados do Imóvel", pDadosImovel);

        lblLogradouro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblLogradouro.setText("Logradouro:");

        lblComplemento.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblComplemento.setText("Complemento:");

        lblCidade.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCidade.setText("Cidade:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Estado:");

        cbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MG", "SP", "RJ", "ES", "AM", "AC", "AL", "BA", "CE", "MS", "MT" }));

        lblBairro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblBairro.setText("Bairro:");

        lblNumero.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNumero.setText("Número:");

        lblCep.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCep.setText("CEP:");

        javax.swing.GroupLayout pEnderecoImovelLayout = new javax.swing.GroupLayout(pEnderecoImovel);
        pEnderecoImovel.setLayout(pEnderecoImovelLayout);
        pEnderecoImovelLayout.setHorizontalGroup(
            pEnderecoImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEnderecoImovelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pEnderecoImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pEnderecoImovelLayout.createSequentialGroup()
                        .addGroup(pEnderecoImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBairro)
                            .addComponent(lblLogradouro)
                            .addComponent(txtLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pEnderecoImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pEnderecoImovelLayout.createSequentialGroup()
                                .addGroup(pEnderecoImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNumero)
                                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(46, 46, 46)
                                .addGroup(pEnderecoImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblComplemento)
                                    .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(63, 63, 63))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pEnderecoImovelLayout.createSequentialGroup()
                                .addGroup(pEnderecoImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addGap(129, 129, 129))))
                    .addGroup(pEnderecoImovelLayout.createSequentialGroup()
                        .addGroup(pEnderecoImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCep)
                            .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pEnderecoImovelLayout.createSequentialGroup()
                                .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addGroup(pEnderecoImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCidade)
                                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pEnderecoImovelLayout.setVerticalGroup(
            pEnderecoImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEnderecoImovelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pEnderecoImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLogradouro)
                    .addComponent(lblComplemento)
                    .addComponent(lblNumero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pEnderecoImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pEnderecoImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBairro)
                    .addComponent(lblCidade)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pEnderecoImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblCep)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbDadosImovel.addTab("Endereço", pEnderecoImovel);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icSairImovel.png"))); // NOI18N
        jButton1.setText("Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icEditarImovel.png"))); // NOI18N
        btAtualizar.setText("Atualizar");
        btAtualizar.setEnabled(false);
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarActionPerformed(evt);
            }
        });

        jLabel3.setText("Nome Proprietário");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(btBuscar)
                        .addGap(104, 104, 104)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txrNomeProprietario))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSalvar)
                .addGap(18, 18, 18)
                .addComponent(btAtualizar)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tbDadosImovel, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btBuscar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txrNomeProprietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(tbDadosImovel, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btAtualizar)
                    .addComponent(btnCancelar)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        ImovelAluguel imovel = new ImovelAluguel();

        imovel.setTipo(jComboBox1.getActionCommand());
        imovel.setArea(Float.parseFloat(txtArea.getText()));
        imovel.setBairro(txtBairro.getText());
        imovel.setBanheiros(Integer.parseInt(txtBanheiros.getText()));
        imovel.setCep(txtCep.getText());
        imovel.setCidade(txtCidade.getText());
        imovel.setComplemento(txtComplemento.getText());
        imovel.setEstado(cbEstado.getActionCommand());
        imovel.setLogradouro(txtLogradouro.getText());
        imovel.setNumero(Integer.parseInt(txtNumero.getText()));
        imovel.setQuartos(Integer.parseInt(txtQuartos.getText()));
        imovel.setSuites(Integer.parseInt(txtSuites.getText()));
        imovel.setVagasGaragem(Integer.parseInt(txtVagasGaragem.getText()));
        imovel.setValorAluguel(Float.parseFloat(txtValorAluguel.getText()));
        imovel.setPrazoContrato(Integer.parseInt(txtPrazoContrato.getText()));

        FormPrincipal.daoAluguelImovel.adicionarImovel(imovel);
        JOptionPane.showMessageDialog(null, "Imóvel para locação cadastrado com sucesso!", "Cadastro de imóvel para aluguel", JOptionPane.INFORMATION_MESSAGE);

        limpar();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAreaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
                ImovelAluguel imovel = new ImovelAluguel();

        imovel.setTipo(jComboBox1.getActionCommand());
        imovel.setArea(Float.parseFloat(txtArea.getText()));
        imovel.setBairro(txtBairro.getText());
        imovel.setBanheiros(Integer.parseInt(txtBanheiros.getText()));
        imovel.setCep(txtCep.getText());
        imovel.setCidade(txtCidade.getText());
        imovel.setComplemento(txtComplemento.getText());
        imovel.setEstado(cbEstado.getActionCommand());
        imovel.setLogradouro(txtLogradouro.getText());
        imovel.setNumero(Integer.parseInt(txtNumero.getText()));
        imovel.setQuartos(Integer.parseInt(txtQuartos.getText()));
        imovel.setSuites(Integer.parseInt(txtSuites.getText()));
        imovel.setVagasGaragem(Integer.parseInt(txtVagasGaragem.getText()));
        imovel.setValorAluguel(Float.parseFloat(txtValorAluguel.getText()));
        imovel.setPrazoContrato(Integer.parseInt(txtValorAluguel.getText()));

        FormPrincipal.daoAluguelImovel.alterarImovel(imovel);
        JOptionPane.showMessageDialog(null, "Imóvel para locação atualizado com sucesso!", "Cadastro de imóvel para aluguel", JOptionPane.INFORMATION_MESSAGE);

        limpar();
    }//GEN-LAST:event_btAtualizarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        if (imovel != null) {
            btAtualizar.setEnabled(true);
            btnSalvar.setEnabled(false);
            
            txtArea.setText(Float.toString(imovel.getArea()));
            txtBairro.setText(imovel.getBairro());
            txtBanheiros.setText(Integer.toString(imovel.getBanheiros()));
            txtCep.setText(imovel.getCep());
            txtCidade.setText(imovel.getCidade());
            txtComplemento.setText(imovel.getComplemento());
            txtLogradouro.setText(imovel.getLogradouro());
            txtNumero.setText(Integer.toString(imovel.getNumero()));
            txtQuartos.setText(Integer.toString(imovel.getQuartos()));
            txtSuites.setText(Integer.toString(imovel.getSuites()));
            txtVagasGaragem.setText(Integer.toString(imovel.getVagasGaragem()));
            txtValorAluguel.setText(Float.toString(imovel.getValorAluguel()));
            txtPrazoContrato.setText(Integer.toString(imovel.getPrazoContrato()));
            for (int i = 0; i < jComboBox1.getItemCount(); i++) {
                if (jComboBox1.getItemAt(i).equals(imovel.getTipo())) {
                    jComboBox1.setSelectedIndex(i);
                }
            }

            for (int i = 0; i < cbEstado.getItemCount(); i++) {
                if (cbEstado.getItemAt(i).equals(imovel.getEstado())) {
                    cbEstado.setSelectedIndex(i);
                }
            }
        } else {
            btnSalvar.setEnabled(true);
            btAtualizar.setEnabled(false);
        }
    }//GEN-LAST:event_formWindowOpened

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btBuscarActionPerformed

    private void limpar() {
        txtArea.setText("");
        txtBairro.setText("");
        txtBanheiros.setText("");
        txtCep.setText("");
        txtCidade.setText("");
        txtComplemento.setText("");
        jComboBox1.setSelectedIndex(-1);
        cbEstado.setSelectedIndex(-1);
        txtLogradouro.setText("");
        txtNumero.setText("");
        txtQuartos.setText("");
        txtSuites.setText("");
        txtVagasGaragem.setText("");
        txtValorAluguel.setText("");
        txtPrazoContrato.setText("");
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
            java.util.logging.Logger.getLogger(FormImovelAluguel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormImovelAluguel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormImovelAluguel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormImovelAluguel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormImovelAluguel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cbEstado;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblArea;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblBanheiros;
    private javax.swing.JLabel lblCep;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblComplemento;
    private javax.swing.JLabel lblLogradouro;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblPrazoContrato;
    private javax.swing.JLabel lblQuartos;
    private javax.swing.JLabel lblSuites;
    private javax.swing.JLabel lblVagasGaragem;
    private javax.swing.JLabel lblValorAluguel;
    private javax.swing.JPanel pDadosImovel;
    private javax.swing.JPanel pEnderecoImovel;
    private javax.swing.JTabbedPane tbDadosImovel;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField txrNomeProprietario;
    private javax.swing.JTextField txtArea;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtBanheiros;
    private javax.swing.JTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JTextField txtLogradouro;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtPrazoContrato;
    private javax.swing.JTextField txtQuartos;
    private javax.swing.JTextField txtSuites;
    private javax.swing.JTextField txtVagasGaragem;
    private javax.swing.JTextField txtValorAluguel;
    // End of variables declaration//GEN-END:variables
}
