/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import classes.Cliente;
import classes.ImovelVenda;
import javax.swing.JOptionPane;

/**
 *
 * @author Meu computador
 */
public class FormImovelVenda extends javax.swing.JFrame {

    public ImovelVenda imovel = null;
    public Cliente cliente = null;

    /**
     * Creates new form FormImovelAluguel
     */
    public FormImovelVenda() {
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
        lblSuites = new javax.swing.JLabel();
        txtSuites = new javax.swing.JTextField();
        lblVagasGaragem = new javax.swing.JLabel();
        txtVagasGaragem = new javax.swing.JTextField();
        lblBanheiros = new javax.swing.JLabel();
        txtBanheiros = new javax.swing.JTextField();
        txtNumeroParcelas = new javax.swing.JTextField();
        lblNumeroParcelas = new javax.swing.JLabel();
        lblValorParcela = new javax.swing.JLabel();
        txtValorParcela = new javax.swing.JTextField();
        lblValorTotal = new javax.swing.JLabel();
        txtValorTotal = new javax.swing.JTextField();
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

        lblSuites.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblSuites.setText("Suítes:");

        lblVagasGaragem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblVagasGaragem.setText("Vagas na garagem:");

        lblBanheiros.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblBanheiros.setText("Banheiros:");

        lblNumeroParcelas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNumeroParcelas.setText("Número de Parcelas:");

        lblValorParcela.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblValorParcela.setText("Valor da Parcela:");

        lblValorTotal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblValorTotal.setText("Valor Total:");

        javax.swing.GroupLayout pDadosImovelLayout = new javax.swing.GroupLayout(pDadosImovel);
        pDadosImovel.setLayout(pDadosImovelLayout);
        pDadosImovelLayout.setHorizontalGroup(
            pDadosImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDadosImovelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDadosImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pDadosImovelLayout.createSequentialGroup()
                        .addGroup(pDadosImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pDadosImovelLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(134, 134, 134)
                                .addComponent(lblArea)
                                .addGap(110, 110, 110)
                                .addComponent(lblQuartos))
                            .addGroup(pDadosImovelLayout.createSequentialGroup()
                                .addGroup(pDadosImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(pDadosImovelLayout.createSequentialGroup()
                                        .addComponent(txtVagasGaragem, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtBanheiros, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pDadosImovelLayout.createSequentialGroup()
                                        .addComponent(lblVagasGaragem)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblBanheiros))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pDadosImovelLayout.createSequentialGroup()
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(58, 58, 58)
                                        .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(53, 53, 53)
                                .addComponent(txtQuartos, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(47, 47, 47)
                        .addGroup(pDadosImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSuites, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSuites)))
                    .addGroup(pDadosImovelLayout.createSequentialGroup()
                        .addGroup(pDadosImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pDadosImovelLayout.createSequentialGroup()
                                .addComponent(lblValorTotal)
                                .addGap(95, 95, 95))
                            .addComponent(txtValorTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(pDadosImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtValorParcela, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblValorParcela))
                        .addGap(26, 26, 26)
                        .addGroup(pDadosImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNumeroParcelas)
                            .addComponent(txtNumeroParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(47, Short.MAX_VALUE))
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
                    .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSuites, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pDadosImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pDadosImovelLayout.createSequentialGroup()
                        .addGroup(pDadosImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblVagasGaragem)
                            .addComponent(lblBanheiros))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pDadosImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtBanheiros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pDadosImovelLayout.createSequentialGroup()
                                .addComponent(txtVagasGaragem, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                                .addGap(2, 2, 2)))
                        .addGap(18, 18, 18)
                        .addGroup(pDadosImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pDadosImovelLayout.createSequentialGroup()
                                .addComponent(lblValorTotal)
                                .addGap(15, 15, 15)
                                .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pDadosImovelLayout.createSequentialGroup()
                                .addComponent(lblValorParcela)
                                .addGap(18, 18, 18)
                                .addComponent(txtValorParcela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pDadosImovelLayout.createSequentialGroup()
                        .addComponent(lblNumeroParcelas)
                        .addGap(17, 17, 17)
                        .addComponent(txtNumeroParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        txrNomeProprietario.setEnabled(false);

        jLabel3.setText("Nome Proprietário");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(btBuscar))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txrNomeProprietario, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(btAtualizar)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(25, 25, 25))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tbDadosImovel, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscar)
                    .addComponent(txrNomeProprietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(tbDadosImovel)
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

    
    
    private boolean valida(){
        if(txtArea.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Campo Area é obrigatório!", "Atenção", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        
        if(txtBanheiros.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Campo Banheiros é obrigatório!", "Atenção", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        
        
        if(txtNumero.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Campo Numero é obrigatório!", "Atenção", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        
        
        if(txtQuartos.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Campo Quartos é obrigatório!", "Atenção", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if(txtSuites.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Campo Suites é obrigatório!", "Atenção", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if(txtVagasGaragem.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Campo Vagas na Garagem é obrigatório!", "Atenção", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if(txtValorTotal.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Campo Valor da Venda é obrigatório!", "Atenção", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if(txtValorParcela.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Campo Valor da Parcela é obrigatório!", "Atenção", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if(txtNumeroParcelas.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Campo Numero de Parcelas é obrigatório!", "Atenção", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        
        
        if(cliente == null){
            JOptionPane.showMessageDialog(null, "Necessário selecioar um cliente antes de continuar!", "Atenção", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }
    
    
    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if(valida()){
            ImovelVenda imovel = new ImovelVenda();


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
            imovel.setValorVenda(Float.parseFloat(txtValorTotal.getText()));
            imovel.setValorParcela(Float.parseFloat(txtValorParcela.getText()));
            imovel.setQuantidadeParcelas(Integer.parseInt(txtNumeroParcelas.getText()));
            imovel.setCliente(cliente);
            imovel.setDisponivel(true);

            FormPrincipal.daoVendaImovel.adicionarImovel(imovel);
            JOptionPane.showMessageDialog(null, "Imóvel para venda cadastrado com sucesso!", "Cadastro de imóvel para venda", JOptionPane.INFORMATION_MESSAGE);

            limpar();
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAreaActionPerformed

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
        if(valida()){
            ImovelVenda imovel = new ImovelVenda();


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
            imovel.setValorVenda(Float.parseFloat(txtValorTotal.getText()));
            imovel.setValorParcela(Float.parseFloat(txtValorParcela.getText()));
            imovel.setQuantidadeParcelas(Integer.parseInt(txtNumeroParcelas.getText()));
            imovel.setCliente(cliente);
            imovel.setDisponivel(true);

            FormPrincipal.daoVendaImovel.alterarImovel(imovel);
            JOptionPane.showMessageDialog(null, "Imóvel para venda atualizado com sucesso!", "Cadastro de imóvel para venda", JOptionPane.INFORMATION_MESSAGE);

            limpar();
        }
    }//GEN-LAST:event_btAtualizarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            txtValorTotal.setText(Float.toString(imovel.getValorVenda()));
            txtValorParcela.setText(Float.toString(imovel.getValorParcela()));
            txtNumeroParcelas.setText(Integer.toString(imovel.getQuantidadeParcelas()));
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
        if (!tfCodigo.getText().equals("")) {
            cliente = FormPrincipal.daoCliente.buscarCliente(tfCodigo.getText());
            if (cliente != null) {
                txrNomeProprietario.setText(cliente.getNome());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Informe um cpf válido para buscar o cliente!", "Cadastro de imóvel para venda", JOptionPane.INFORMATION_MESSAGE);
        }
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
        txtValorTotal.setText("");
        txtValorParcela.setText("");
        txtNumeroParcelas.setText("");
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
            java.util.logging.Logger.getLogger(FormImovelVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormImovelVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormImovelVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormImovelVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormImovelVenda().setVisible(true);
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
    private javax.swing.JLabel lblNumeroParcelas;
    private javax.swing.JLabel lblQuartos;
    private javax.swing.JLabel lblSuites;
    private javax.swing.JLabel lblVagasGaragem;
    private javax.swing.JLabel lblValorParcela;
    private javax.swing.JLabel lblValorTotal;
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
    private javax.swing.JTextField txtNumeroParcelas;
    private javax.swing.JTextField txtQuartos;
    private javax.swing.JTextField txtSuites;
    private javax.swing.JTextField txtVagasGaragem;
    private javax.swing.JTextField txtValorParcela;
    private javax.swing.JTextField txtValorTotal;
    // End of variables declaration//GEN-END:variables
}
