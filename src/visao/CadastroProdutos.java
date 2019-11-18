/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import Entidade.Produtos;
import dao.HibernateUtil;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author lukas
 */
public class CadastroProdutos extends javax.swing.JFrame {

    /**
     * Creates new form CadastroProdutos
     */
    TableRowSorter sorter = new TableRowSorter<DefaultTableModel>(null);
    private Produtos pro;
    private List<Produtos> listaProdutos;

    public List<Produtos> getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(List<Produtos> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }
    
    
    public CadastroProdutos() {
        initComponents();
     
        setResizable(false);
        montaTabela();
//        montaCombo();
        idCampo.setEnabled(false);
        validaCampos("inicio");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        idCampo1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        btNovo = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        btSair = new javax.swing.JToggleButton();
        jLabel12 = new javax.swing.JLabel();
        idCampo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        campoQuantidade = new javax.swing.JTextField();
        btNovo1 = new javax.swing.JButton();
        btAlterar1 = new javax.swing.JButton();
        btExcluir1 = new javax.swing.JButton();
        btSalvar1 = new javax.swing.JButton();
        btCancelar1 = new javax.swing.JButton();
        btSair1 = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        campoValor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        idCampo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idCampo1ActionPerformed(evt);
            }
        });

        jLabel10.setText("Codigo");

        jLabel4.setText("Nome");

        nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeActionPerformed(evt);
            }
        });

        btNovo.setText("Novo");
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
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

        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel12.setText("Cadastro de Produtos");

        idCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idCampoActionPerformed(evt);
            }
        });

        jLabel9.setText("Codigo");

        jLabel2.setText("Nome");

        campoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeActionPerformed(evt);
            }
        });

        jLabel3.setText("Quantidade");

        campoQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoQuantidadeActionPerformed(evt);
            }
        });

        btNovo1.setText("Novo");
        btNovo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovo1ActionPerformed(evt);
            }
        });

        btAlterar1.setText("Alterar");
        btAlterar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterar1ActionPerformed(evt);
            }
        });

        btExcluir1.setText("Excluir");
        btExcluir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluir1ActionPerformed(evt);
            }
        });

        btSalvar1.setText("Salvar");
        btSalvar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvar1ActionPerformed(evt);
            }
        });

        btCancelar1.setText("Cancelar");
        btCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelar1ActionPerformed(evt);
            }
        });

        btSair1.setText("Sair");
        btSair1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSair1ActionPerformed(evt);
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

        campoValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoValorActionPerformed(evt);
            }
        });

        jLabel5.setText("Valor");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addComponent(jLabel12))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel9)
                                            .addGap(31, 31, 31)))
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoValor, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(idCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btNovo1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btAlterar1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btExcluir1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btSalvar1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btCancelar1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btSair1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 27, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(idCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campoQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(campoValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btNovo1)
                    .addComponent(btAlterar1)
                    .addComponent(btExcluir1)
                    .addComponent(btSair1)
                    .addComponent(btCancelar1)
                    .addComponent(btSalvar1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void idCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idCampoActionPerformed

    private void campoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNomeActionPerformed

    private void campoQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoQuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoQuantidadeActionPerformed

    private void idCampo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idCampo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idCampo1ActionPerformed

    private void nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeActionPerformed

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        pro = new Produtos();
        limpaCampos();
        validaCampos("novo");
    }//GEN-LAST:event_btNovoActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed

        validaCampos("novo");
        HibernateUtil.beginTransaction();
        HibernateUtil.getSession().update(pro);
        HibernateUtil.commitTransaction();
        HibernateUtil.closeSession();

    }//GEN-LAST:event_btAlterarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        HibernateUtil.beginTransaction();
        HibernateUtil.getSession().delete(pro);
        HibernateUtil.commitTransaction();
        HibernateUtil.closeSession();
        montaTabela();
        limpaCampos();
        validaCampos("inicio");
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        if(validaSalvar()){
            if (!idCampo.getText().equals("")) {
                pro.setId(Long.parseLong(idCampo.getText()));
            } else {
                pro.setId(null);
            }

            //captura o texto do campo nome e seta no atributo nome, da classe pessoa
            pro.setNome(campoNome.getText());
            pro.setQuantidade_estoque(campoQuantidade.getText());
            pro.setValor(campoValor.getText());
            
           
            

            HibernateUtil.beginTransaction();
            HibernateUtil.getSession().merge(pro);
            HibernateUtil.commitTransaction();
            HibernateUtil.closeSession();
            //chama o metodo monta tablea para dar um refresh na tabela depois de salvar os dados do objeto pro
            montaTabela();
            //setando os dados como limpo (vaziol ou nao selecionado) dos campos da tela pessoa
            limpaCampos();
            //termina de limpar a tela aqui
            validaCampos("inicio");
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        montaTabela();
        limpaCampos();
        validaCampos("inicio");
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        dispose();
    }//GEN-LAST:event_btSairActionPerformed

    private void btNovo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovo1ActionPerformed
        pro = new Produtos();
        limpaCampos();
        validaCampos("novo");
    }//GEN-LAST:event_btNovo1ActionPerformed

    private void btAlterar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterar1ActionPerformed

        validaCampos("novo");
        HibernateUtil.beginTransaction();
        HibernateUtil.getSession().update(pro);
        HibernateUtil.commitTransaction();
        HibernateUtil.closeSession();

    }//GEN-LAST:event_btAlterar1ActionPerformed

    private void btExcluir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluir1ActionPerformed
        HibernateUtil.beginTransaction();
        HibernateUtil.getSession().delete(pro);
        HibernateUtil.commitTransaction();
        HibernateUtil.closeSession();
        montaTabela();
        limpaCampos();
        validaCampos("inicio");
    }//GEN-LAST:event_btExcluir1ActionPerformed

    private void btSalvar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvar1ActionPerformed
        if(validaSalvar()){
            if (!idCampo.getText().equals("")) {
                pro.setId(Long.parseLong(idCampo.getText()));
            } else {
                pro.setId(null);
            }

            
            pro.setNome(campoNome.getText());
            
            pro.setQuantidade_estoque(campoQuantidade.getText());
            
            pro.setValor(campoValor.getText());
            
          

            HibernateUtil.beginTransaction();
            HibernateUtil.getSession().merge(pro);
            HibernateUtil.commitTransaction();
            HibernateUtil.closeSession();
            //chama o metodo monta tablea para dar um refresh na tabela depois de salvar os dados do objeto pro
            montaTabela();
            //setando os dados como limpo (vaziol ou nao selecionado) dos campos da tela pessoa
            limpaCampos();
            //termina de limpar a tela aqui
            validaCampos("inicio");
        }
    }//GEN-LAST:event_btSalvar1ActionPerformed

    private void btCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelar1ActionPerformed
        montaTabela();
        limpaCampos();
        validaCampos("inicio");
    }//GEN-LAST:event_btCancelar1ActionPerformed

    private void btSair1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSair1ActionPerformed
        dispose();
    }//GEN-LAST:event_btSair1ActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        Long p = (Long) tabela.getModel().getValueAt(tabela.getRowSorter().convertRowIndexToModel(tabela.getSelectedRow()), 0);
        pro = (Produtos) HibernateUtil.getSession().get(Produtos.class, p);
        HibernateUtil.closeSession();
        idCampo.setText(pro.getId().toString());
        campoNome.setText(pro.getNome());
        campoQuantidade.setText(pro.getQuantidade_estoque());
        campoValor.setText(pro.getValor());
        
        validaCampos("alterar");
    }//GEN-LAST:event_tabelaMouseClicked

    private void campoValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoValorActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroProdutos().setVisible(true);
            }
        });
    }
    private void montaTabela() {
        listaProdutos = HibernateUtil.getSession().createCriteria(Produtos.class).list();
        //instancia uma tabela modelo 
        Collections.sort(listaProdutos);
        DefaultTableModel modelo = new DefaultTableModel();
        //adiciona uma coluna na tabela modelo com o nome: nome
        modelo.addColumn("ID");
        modelo.addColumn("Nome");
        
        modelo.addColumn("Quantidade_estoque");
        
        modelo.addColumn("Valor");
           
       
        
        //for, responsavel por buscar dados existentes na lista que veio da classse principal, e popular a tabela caso haja algun registro
        for(Produtos p: listaProdutos){
            modelo.addRow(new Object[]{p.getId(), p.getNome(), p.getQuantidade_estoque(), p.getValor()});
        }
        sorter = new TableRowSorter<TableModel>(modelo);
        tabela.setRowSorter(sorter);
        tabela.setModel(modelo);
        //popula a tabela da interface para a visao do usuario
        tabela.setModel(modelo);
    }
//    private void montaCombo() {
//        listaCidades = HibernateUtil.getSession().createCriteria(Cidade.class).list();
//        //remove todos os dados cadastrados na combo, para manter a combo atualizada
//        cidadeCombo.removeAllItems();
//        //seleciona todas os dados cadastrados na lista de cidades
//        for(Cidade c: listaCidades){
//            //vai adicionando as cidades na combo
//            cidadeCombo.addItem(c.getNome());
//        }
//    }
    private void validaCampos(String acao) {
       if (acao.equals("inicio")) {
            campoNome.setEnabled(false);
            campoQuantidade.setEnabled(false);
            campoValor.setEnabled(false);
            btNovo.setEnabled(true);
            btAlterar.setEnabled(false);
            btExcluir.setEnabled(false);
            btSalvar.setEnabled(false);
            btCancelar.setEnabled(false);
            btSair.setEnabled(true);
        } else if (acao.equals("novo")) {
            campoNome.setEnabled(true);
            campoQuantidade.setEnabled(true);
            campoValor.setEnabled(true);
            btNovo.setEnabled(false);
            btAlterar.setEnabled(false);
            btExcluir.setEnabled(false);
            btSalvar.setEnabled(true);
            btCancelar.setEnabled(true);
            btSair.setEnabled(false);
        } else if (acao.equals("alterar")) {
            campoNome.setEnabled(false);
            campoQuantidade.setEnabled(false);
            campoValor.setEnabled(false);
            btNovo.setEnabled(true);
            btAlterar.setEnabled(true);
            btExcluir.setEnabled(true);
            btSalvar.setEnabled(false);
            btCancelar.setEnabled(false);
            btSair.setEnabled(true);
        }
    }
    private void limpaCampos() {
        idCampo.setText("");
        campoNome.setText("");
        campoQuantidade.setText("");
        campoValor.setText("");
        
    }
    private boolean validaSalvar() {
        if(campoNome.getText().equals("")){
            JOptionPane.showMessageDialog(null, "O campo Nome  é obrigatório!");
            return false;
        }
        if(campoQuantidade.getText().equals("")){
            JOptionPane.showMessageDialog(null, "O campo Quantidade  é obrigatório!");
            return false;
        }
       if(campoQuantidade.getText().equals("")){
            JOptionPane.showMessageDialog(null, "O campo Valor  é obrigatório!");
            return false;
        }
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btAlterar1;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btCancelar1;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btExcluir1;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btNovo1;
    private javax.swing.JToggleButton btSair;
    private javax.swing.JToggleButton btSair1;
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton btSalvar1;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoQuantidade;
    private javax.swing.JTextField campoValor;
    private javax.swing.JTextField idCampo;
    private javax.swing.JTextField idCampo1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nome;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
