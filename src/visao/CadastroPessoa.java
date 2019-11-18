
package visao;

import Entidade.Cidade;
import Entidade.Pessoa;

import dao.HibernateUtil;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;


public class CadastroPessoa extends javax.swing.JFrame {

    TableRowSorter sorter = new TableRowSorter<DefaultTableModel>(null);
    private List<Cidade> listaCidades;
    private List<Pessoa> listaPessoas;

    private Pessoa cli;
    //metodos acessores
    public List<Pessoa> getListaPessoas() {
        return listaPessoas;
    }
    public void setListaPessoas(List<Pessoa> listaPessoas) {
        this.listaPessoas = listaPessoas;
    }
    public CadastroPessoa() {
        initComponents();
        setResizable(false);
        montaTabela();
        montaCombo();
        idCampo.setEnabled(false);
        validaCampos("inicio");
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        cidadeCombo = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        endereco = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        btNovo = new javax.swing.JButton();
        btSair = new javax.swing.JToggleButton();
        btSalvar = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        numero = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        idCampo = new javax.swing.JTextField();
        buscarPessoa = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cpf = new javax.swing.JFormattedTextField();
        telefone = new javax.swing.JFormattedTextField();
        rg = new javax.swing.JTextField();

        jButton2.setText("jButton2");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setText("Nome");

        cidadeCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cidadeCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cidadeComboActionPerformed(evt);
            }
        });

        jLabel3.setText("Selecione a Cidade");

        jLabel4.setText("CPF");

        nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeActionPerformed(evt);
            }
        });

        jLabel5.setText("RG");

        jLabel6.setText("Telefone");

        jLabel7.setText("Endereço");

        endereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enderecoActionPerformed(evt);
            }
        });

        tabela.setModel(new javax.swing.table.DefaultTableModel(
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
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);

        btNovo.setText("Novo");
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btAlterar.setText("Alterar");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        jLabel8.setText("Numero");

        numero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroActionPerformed(evt);
            }
        });

        jLabel9.setText("Codigo");

        idCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idCampoActionPerformed(evt);
            }
        });

        buscarPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarPessoaActionPerformed(evt);
            }
        });
        buscarPessoa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscarPessoaKeyReleased(evt);
            }
        });

        jLabel10.setText("Buscar");

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel12.setText("Cadastro de Pessoa");

        try {
            cpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            telefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        telefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefoneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(buscarPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(67, 67, 67))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(31, 31, 31)))
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(idCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addGap(36, 36, 36))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(endereco)
                                        .addComponent(cpf)
                                        .addComponent(telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(rg)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addGap(18, 18, 18)
                                            .addComponent(cidadeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addGap(44, 44, 44)
                                            .addComponent(numero, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(0, 0, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jLabel12)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(idCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cidadeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(rg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(buscarPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSair)
                    .addComponent(btNovo)
                    .addComponent(btAlterar)
                    .addComponent(btExcluir)
                    .addComponent(btCancelar)
                    .addComponent(btSalvar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeActionPerformed

    private void enderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enderecoActionPerformed

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        cli = new Pessoa();
        limpaCampos();
        validaCampos("novo");
    }//GEN-LAST:event_btNovoActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        dispose();
    }//GEN-LAST:event_btSairActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
            if(validaSalvar()){
            if (!idCampo.getText().equals("")) {
                cli.setId(Long.parseLong(idCampo.getText()));
            } else {
                cli.setId(null);
            }
            
            //captura o texto do campo nome e seta no atributo nome, da classe pessoa
            cli.setNome(nome.getText());
            //captura o texto do campo cpf e seta no atributo cpf, da classe pessoa
            cli.setCPF(cpf.getText());
            //captura o texto do campo rg e seta no atributo rg, da classe pessoa
            cli.setRG(rg.getText());
            //captura o texto do campo telefone e seta no atributo telefone, da classe pessoa
            cli.setTelefone(telefone.getText());
            //captura o texto do campo endereco e seta no atributo endereco, da classe pessoa
            cli.setEndereco(endereco.getText());
            //captura o texto do campo numero e seta no atributo numero, da classe pessoa
            cli.setNumero(numero.getText());
            //captura o index da cidade selecionada na combo, para setar o nome da cidade no atributo cidade da classe pessoa
            cli.setCidade(listaCidades.get(cidadeCombo.getSelectedIndex()));
            

            HibernateUtil.beginTransaction();
            HibernateUtil.getSession().merge(cli);
            HibernateUtil.commitTransaction();
            HibernateUtil.closeSession();
            //chama o metodo monta tablea para dar um refresh na tabela depois de salvar os dados do objeto cli
            montaTabela();
            //setando os dados como limpo (vaziol ou nao selecionado) dos campos da tela pessoa
            limpaCampos();
            //termina de limpar a tela aqui
                validaCampos("inicio");
         }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        
        validaCampos("novo");
        HibernateUtil.beginTransaction();
        HibernateUtil.getSession().update(cli);
        HibernateUtil.commitTransaction();
        HibernateUtil.closeSession();       
       
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        HibernateUtil.beginTransaction();
        HibernateUtil.getSession().delete(cli);
        HibernateUtil.commitTransaction();
        HibernateUtil.closeSession();
        montaTabela();
        limpaCampos();
        validaCampos("inicio");
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        montaTabela();
        limpaCampos();
        validaCampos("inicio");
    }//GEN-LAST:event_btCancelarActionPerformed

    private void numeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroActionPerformed

    private void idCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idCampoActionPerformed

    private void cidadeComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cidadeComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cidadeComboActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        Long p = (Long) tabela.getModel().getValueAt(tabela.getRowSorter().convertRowIndexToModel(tabela.getSelectedRow()), 0);
        cli = (Pessoa) HibernateUtil.getSession().get(Pessoa.class, p);
        HibernateUtil.closeSession();
        idCampo.setText(cli.getId().toString());
        nome.setText(cli.getNome());
        cpf.setText(cli.getCPF());
        rg.setText(cli.getRG());
        telefone.setText(cli.getTelefone());
        endereco.setText(cli.getEndereco());
        numero.setText(cli.getNumero());
        cidadeCombo.setSelectedItem(cli.getCidade().getNome());
        validaCampos("alterar");
    }//GEN-LAST:event_tabelaMouseClicked

    private void buscarPessoaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarPessoaKeyReleased
        busca();
        validaCampos("inicio");
        limpaCampos();
        
    }//GEN-LAST:event_buscarPessoaKeyReleased

    private void buscarPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarPessoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarPessoaActionPerformed

    private void telefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefoneActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroPessoa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btNovo;
    private javax.swing.JToggleButton btSair;
    private javax.swing.JButton btSalvar;
    private javax.swing.JTextField buscarPessoa;
    private javax.swing.JComboBox cidadeCombo;
    private javax.swing.JFormattedTextField cpf;
    private javax.swing.JTextField endereco;
    private javax.swing.JTextField idCampo;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField numero;
    private javax.swing.JTextField rg;
    private javax.swing.JTable tabela;
    private javax.swing.JFormattedTextField telefone;
    // End of variables declaration//GEN-END:variables

    private void limpaCampos() {
        idCampo.setText("");
        nome.setText("");
        cpf.setText("");
        rg.setText("");
        telefone.setText("");
        endereco.setText("");
        numero.setText("");
        cidadeCombo.setSelectedItem(null);
    }

    private void validaCampos(String acao) {
       if (acao.equals("inicio")) {
            nome.setEnabled(false);
            cpf.setEnabled(false);
            rg.setEnabled(false);
            telefone.setEnabled(false);
            endereco.setEnabled(false);
            numero.setEnabled(false);
            cidadeCombo.setEnabled(false);
            btNovo.setEnabled(true);
            btAlterar.setEnabled(false);
            btExcluir.setEnabled(false);
            btSalvar.setEnabled(false);
            btCancelar.setEnabled(false);
            btSair.setEnabled(true);
        } else if (acao.equals("novo")) {
            nome.setEnabled(true);
            cpf.setEnabled(true);
            rg.setEnabled(true);
            telefone.setEnabled(true);
            endereco.setEnabled(true);
            numero.setEnabled(true);
            cidadeCombo.setEnabled(true);
            btNovo.setEnabled(false);
            btAlterar.setEnabled(false);
            btExcluir.setEnabled(false);
            btSalvar.setEnabled(true);
            btCancelar.setEnabled(true);
            btSair.setEnabled(false);
        } else if (acao.equals("alterar")) {
            nome.setEnabled(false);
            cpf.setEnabled(false);
            rg.setEnabled(false);
            telefone.setEnabled(false);
            endereco.setEnabled(false);
            numero.setEnabled(false);
            cidadeCombo.setEnabled(false);
            btNovo.setEnabled(true);
            btAlterar.setEnabled(true);
            btExcluir.setEnabled(true);
            btSalvar.setEnabled(false);
            btCancelar.setEnabled(false);
            btSair.setEnabled(true);
        }
    }

     private void montaTabela() {
        listaPessoas = HibernateUtil.getSession().createCriteria(Pessoa.class).list();
        //instancia uma tabela modelo 
         Collections.sort(listaPessoas);
        DefaultTableModel modelo = new DefaultTableModel();
        //adiciona uma coluna na tabela modelo com o nome: nome
        modelo.addColumn("ID");
        modelo.addColumn("Nome");
        
        //adiciona uma coluna na tabela modelo com o nome: cpf
        modelo.addColumn("CPF");
        //adiciona uma coluna na tabela modelo com o nome: rg
        modelo.addColumn("RG");
        //adiciona uma coluna na tabela modelo com o nome: telefone
        modelo.addColumn("Telefone");
        //adiciona uma coluna na tabela modelo com o nome: endereço
        modelo.addColumn("Endereco");
        //adiciona uma coluna na tabela modelo com o nome: numero
        modelo.addColumn("Numero");
        //adiciona uma coluna na tabela modelo com o nome: cidade
        modelo.addColumn("Cidade");
        
       
        
        //for, responsavel por buscar dados existentes na lista que veio da classse principal, e popular a tabela caso haja algun registro
        for(Pessoa c: listaPessoas){
            modelo.addRow(new Object[]{c.getId(), c.getNome(), c.getCPF(), c.getRG(), c.getTelefone(), c.getEndereco(), c.getNumero(), c.getCidade()});
        }
        sorter = new TableRowSorter<TableModel>(modelo);
        tabela.setRowSorter(sorter);
        tabela.setModel(modelo);
        //popula a tabela da interface para a visao do usuario
        tabela.setModel(modelo);
    }

    private boolean validaSalvar() {
        if(nome.getText().equals("")){
            JOptionPane.showMessageDialog(null, "O campo Nome  é obrigatório!");
            return false;
        }
        if(cpf.getText().equals("")){
            JOptionPane.showMessageDialog(null, "O campo CPF  é obrigatório!");
            return false;
        }
        if(listaCidades.get(cidadeCombo.getSelectedIndex()).equals(null)){
            JOptionPane.showMessageDialog(null, "O campo Cidade  é obrigatório!");
            return false;
        }
        return true;
    }

    private void montaCombo() {
        listaCidades = HibernateUtil.getSession().createCriteria(Cidade.class).list();
        //remove todos os dados cadastrados na combo, para manter a combo atualizada
        cidadeCombo.removeAllItems();
        //seleciona todas os dados cadastrados na lista de cidades
        for(Cidade c: listaCidades){
            //vai adicionando as cidades na combo
            cidadeCombo.addItem(c.getNome());
        }
    }
    
    public void busca() {
        sorter.setRowFilter(RowFilter.regexFilter(buscarPessoa.getText()));
        tabela.clearSelection();
        validaCampos("novo");
    }
    
    
}
