/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View.Estoque;

import DAO.DepositoAreaDAO;
import DAO.EstoqueDAO;
import View.*;
import DAO.ProdutoDAO;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author forster
 */
public class FrmMovimentarEstoque extends javax.swing.JFrame {

    /**
     * Creates new form FrmFornecedor
     */
    public FrmMovimentarEstoque() {
        initComponents();
        
        for(var produto: new ProdutoDAO().readComboBox()){
            comboBoxProduto.addItem(produto);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        comboBoxProduto = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        fieldQuantidade = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        comboBoxAreaDestino = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        comboBoxAreaOrigem = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 400));
        setResizable(false);
        setSize(new java.awt.Dimension(700, 400));

        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Produto");

        comboBoxProduto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                comboBoxProdutoFocusLost(evt);
            }
        });

        jLabel8.setText("Quantidade");

        fieldQuantidade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fieldQuantidadeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fieldQuantidadeFocusLost(evt);
            }
        });

        jLabel9.setText("Área Destino");

        jButton2.setText("Salvar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel10.setText("Área Origem");

        comboBoxAreaOrigem.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                comboBoxAreaOrigemFocusLost(evt);
            }
        });
        comboBoxAreaOrigem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxAreaOrigemActionPerformed(evt);
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
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 455, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel10)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboBoxAreaDestino, 0, 561, Short.MAX_VALUE)
                            .addComponent(fieldQuantidade)
                            .addComponent(comboBoxAreaOrigem, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboBoxProduto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(comboBoxProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(comboBoxAreaOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxAreaDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(31, 31, 31))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void comboBoxAreaOrigemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxAreaOrigemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxAreaOrigemActionPerformed

    private void comboBoxProdutoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_comboBoxProdutoFocusLost
        comboBoxAreaOrigem.removeAllItems();
        
        int idProduto = Integer.parseInt(comboBoxProduto.getSelectedItem().toString().split(" - ")[0]);
        
        String [] areas = new DepositoAreaDAO().readComboBoxByProduto(idProduto);
        
        for(var area : areas){
            comboBoxAreaOrigem.addItem(area);
        }
        
        comboBoxProduto.setEnabled(false);
    }//GEN-LAST:event_comboBoxProdutoFocusLost

    private void comboBoxAreaOrigemFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_comboBoxAreaOrigemFocusLost
            fieldQuantidade.setModel(new SpinnerNumberModel(
                1.00, 
                1.00, 
                Double.parseDouble(comboBoxAreaOrigem.getSelectedItem().toString().split(" - ")[2].replace(" Kg", "")), 
                1));
            
            double quantidade = Double.parseDouble(comboBoxAreaOrigem.getSelectedItem().toString().split(" - ")[2].replace(" Kg", ""));
                  
            String[] areas = new DepositoAreaDAO().readComboBoxByQuantidadeDisponivel(quantidade);
        
            for(var area : areas){
                comboBoxAreaDestino.addItem(area);
            }
            
            comboBoxAreaOrigem.setEnabled(false);
    }//GEN-LAST:event_comboBoxAreaOrigemFocusLost

    private void fieldQuantidadeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldQuantidadeFocusGained
        
    }//GEN-LAST:event_fieldQuantidadeFocusGained

    private void fieldQuantidadeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldQuantidadeFocusLost
        
    }//GEN-LAST:event_fieldQuantidadeFocusLost

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        int idProduto = Integer.parseInt(comboBoxProduto.getSelectedItem().toString().split(" - ")[0]);
        
        int idAreaOrigem = Integer.parseInt(comboBoxAreaOrigem.getSelectedItem().toString().split(" - ")[0]);
        
        int idAreaDestino = Integer.parseInt(comboBoxAreaDestino.getSelectedItem().toString().split(" - ")[0]);
        
        double quantidade = Double.parseDouble(fieldQuantidade.getValue().toString());
        
        boolean sucesso = new EstoqueDAO().movimentarEstoque(idProduto, idAreaOrigem, idAreaDestino, quantidade);
        
        if(sucesso){
            JOptionPane.showMessageDialog(null, "Sucesso ao realizar operação.", "SUCESSO", 1);
        }else{
            JOptionPane.showMessageDialog(null, "Erro ao realizar operação.", "ERRO", 1);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMovimentarEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMovimentarEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMovimentarEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMovimentarEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMovimentarEstoque().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboBoxAreaDestino;
    private javax.swing.JComboBox<String> comboBoxAreaOrigem;
    private javax.swing.JComboBox<String> comboBoxProduto;
    private javax.swing.JSpinner fieldQuantidade;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}