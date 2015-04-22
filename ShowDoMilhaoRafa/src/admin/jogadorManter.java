/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import dao1.JogadorDao;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Jogador;

public class jogadorManter extends javax.swing.JFrame {

    List<Jogador> lista;
    Integer posicao, ultimo;

    /**
     * Creates new form jogadorManter
     */
    public jogadorManter() {
        initComponents();
        //Buscar a lista no BD
        JogadorDao dao = new JogadorDao();
        lista = dao.Lista();
        posicao = 0;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jogador = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnoprimeiro2 = new javax.swing.JButton();
        btnanterior2 = new javax.swing.JButton();
        btnproximo2 = new javax.swing.JButton();
        btnultimo2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btninserir2 = new javax.swing.JButton();
        btnlimpar2 = new javax.swing.JButton();
        btnexcluir2 = new javax.swing.JButton();
        btncoonsultar2 = new javax.swing.JButton();
        btnIrListagem2 = new javax.swing.JButton();
        txtEmail = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jogador.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jogador.setText("Jogador");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Navegação", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        btnoprimeiro2.setBackground(new java.awt.Color(255, 255, 255));
        btnoprimeiro2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnoprimeiro2.setForeground(new java.awt.Color(255, 0, 0));
        btnoprimeiro2.setText("Primeiro");
        btnoprimeiro2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnoprimeiro2ActionPerformed(evt);
            }
        });

        btnanterior2.setBackground(new java.awt.Color(255, 255, 255));
        btnanterior2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnanterior2.setForeground(new java.awt.Color(255, 0, 0));
        btnanterior2.setText("Anterior");
        btnanterior2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnanterior2ActionPerformed(evt);
            }
        });

        btnproximo2.setBackground(new java.awt.Color(255, 255, 255));
        btnproximo2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnproximo2.setForeground(new java.awt.Color(255, 0, 0));
        btnproximo2.setText("Próximo");
        btnproximo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnproximo2ActionPerformed(evt);
            }
        });

        btnultimo2.setBackground(new java.awt.Color(255, 255, 255));
        btnultimo2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnultimo2.setForeground(new java.awt.Color(255, 0, 0));
        btnultimo2.setText("Último");
        btnultimo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnultimo2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnoprimeiro2)
                .addGap(18, 18, 18)
                .addComponent(btnanterior2)
                .addGap(18, 18, 18)
                .addComponent(btnproximo2)
                .addGap(18, 18, 18)
                .addComponent(btnultimo2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnoprimeiro2)
                    .addComponent(btnanterior2)
                    .addComponent(btnproximo2)
                    .addComponent(btnultimo2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Senha:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Login:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("E-mail:");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ações", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(255, 0, 0));

        btninserir2.setBackground(new java.awt.Color(255, 255, 255));
        btninserir2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btninserir2.setForeground(new java.awt.Color(255, 0, 0));
        btninserir2.setText("Inserir");
        btninserir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninserir2ActionPerformed(evt);
            }
        });

        btnlimpar2.setBackground(new java.awt.Color(255, 255, 255));
        btnlimpar2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnlimpar2.setForeground(new java.awt.Color(255, 0, 0));
        btnlimpar2.setText("Limpar");
        btnlimpar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpar2ActionPerformed(evt);
            }
        });

        btnexcluir2.setBackground(new java.awt.Color(255, 255, 255));
        btnexcluir2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnexcluir2.setForeground(new java.awt.Color(255, 0, 0));
        btnexcluir2.setText("Excluir");
        btnexcluir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexcluir2ActionPerformed(evt);
            }
        });

        btncoonsultar2.setBackground(new java.awt.Color(255, 255, 255));
        btncoonsultar2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btncoonsultar2.setForeground(new java.awt.Color(255, 0, 0));
        btncoonsultar2.setText("Consultar");
        btncoonsultar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncoonsultar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btninserir2)
                .addGap(18, 18, 18)
                .addComponent(btnlimpar2)
                .addGap(18, 18, 18)
                .addComponent(btnexcluir2)
                .addGap(18, 18, 18)
                .addComponent(btncoonsultar2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btninserir2)
                    .addComponent(btnlimpar2)
                    .addComponent(btnexcluir2)
                    .addComponent(btncoonsultar2))
                .addContainerGap())
        );

        btnIrListagem2.setBackground(new java.awt.Color(255, 255, 255));
        btnIrListagem2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnIrListagem2.setForeground(new java.awt.Color(255, 0, 0));
        btnIrListagem2.setText("Ir para a listagem");
        btnIrListagem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIrListagem2ActionPerformed(evt);
            }
        });

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel2)
                                                    .addComponent(jLabel4))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtEmail))))
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jogador)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(18, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnIrListagem2)
                            .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(20, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIrListagem2)
                    .addComponent(jogador))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnoprimeiro2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnoprimeiro2ActionPerformed
        btnoprimeiro2.setEnabled(true);
        btnanterior2.setEnabled(false);
        btnproximo2.setEnabled(true);
        btnultimo2.setEnabled(true);
        if (lista.size() > 0) {
            posicao = 0;
            Jogador elemento = lista.get(0);
            txtLogin.setText(elemento.getLogin());
            txtSenha.setText(elemento.getSenha());
            txtEmail.setText(elemento.getEmail());
        }
        if (lista.size() == 1) {
            btnproximo2.setEnabled(false);
        }
    }//GEN-LAST:event_btnoprimeiro2ActionPerformed

    private void btnanterior2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnanterior2ActionPerformed
        btnoprimeiro2.setEnabled(true);
        btnanterior2.setEnabled(true);
        btnproximo2.setEnabled(true);
        btnultimo2.setEnabled(true);
        if (lista.size() > 0) {
            posicao = posicao - 1;
            Jogador elemento = lista.get(posicao);
            txtLogin.setText(elemento.getLogin());
            txtSenha.setText(elemento.getSenha());
            txtEmail.setText(elemento.getEmail());
        }
        if (lista.size() == 1) {
            btnproximo2.setEnabled(false);
        }
        if (posicao == 0) {
            btnanterior2.setEnabled(false);
        }
    }//GEN-LAST:event_btnanterior2ActionPerformed

    private void btnproximo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnproximo2ActionPerformed
        btnoprimeiro2.setEnabled(true);
        btnanterior2.setEnabled(true);
        btnproximo2.setEnabled(true);
        btnultimo2.setEnabled(true);
        if (posicao < lista.size() - 1) {
            posicao = posicao + 1;
            Jogador elemento = lista.get(posicao);
            txtLogin.setText(elemento.getLogin());
            txtSenha.setText(elemento.getSenha());
            txtEmail.setText(elemento.getEmail());
        }
        if (lista.size() - 1 == posicao) {
            btnproximo2.setEnabled(false);
            btnultimo2.setEnabled(false);
        }
    }//GEN-LAST:event_btnproximo2ActionPerformed

    private void btnultimo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnultimo2ActionPerformed
        btnoprimeiro2.setEnabled(true);
        btnanterior2.setEnabled(true);
        btnproximo2.setEnabled(false);
        btnultimo2.setEnabled(false);
        if (lista.size() > 0) {
            posicao = lista.size() - 1;
            Jogador elemento = lista.get(posicao);
            txtLogin.setText(elemento.getLogin());
            txtSenha.setText(elemento.getSenha());
            txtEmail.setText(elemento.getEmail());
        }
        if (lista.size() - 1 == posicao && lista.size() == 1) {
            btnproximo2.setEnabled(false);
            btnultimo2.setEnabled(false);
            btnanterior2.setEnabled(false);
        }
    }//GEN-LAST:event_btnultimo2ActionPerformed

    private void btninserir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninserir2ActionPerformed
        Jogador obj = new Jogador();
        Boolean deu = false;
        if (txtSenha.getText().isEmpty() || txtLogin.getText().isEmpty() || txtEmail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos");
            deu = false;
        } else {
            deu = true;
        }
        if (deu == true) {
            obj.setLogin(txtLogin.getText());
            obj.setSenha(txtSenha.getText());
            obj.setEmail(txtEmail.getText());
            JogadorDao dao = new JogadorDao();
            dao.inserir(obj);
            lista = dao.Lista();
            Limpar();
            JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso :] ");
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar :[ ");
        }
    }//GEN-LAST:event_btninserir2ActionPerformed

    private void btnlimpar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpar2ActionPerformed
        Limpar();
        JOptionPane.showMessageDialog(null, "Limpeza efetuada com sucesso!");
    }//GEN-LAST:event_btnlimpar2ActionPerformed

    private void btnexcluir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexcluir2ActionPerformed
        if (txtLogin.getText().isEmpty() == false) {
            if (lista.size() >= 0) {
                JogadorDao dao = new JogadorDao();
                Boolean deucerto = dao.excluir(lista.get(posicao));
                if (deucerto == true) {
                    Limpar();
                    posicao = 0;
                    lista = dao.Lista();
                    JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao excluir!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao excluir!");
        }
    }//GEN-LAST:event_btnexcluir2ActionPerformed

    private void btncoonsultar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncoonsultar2ActionPerformed
        String login = JOptionPane.showInputDialog("Digite o login do jogador que deseja pesquisar: ");
        boolean encontrou = false;
        Integer posicaoachou = 0;
        for (Jogador jogador : lista) {
            if (login.equals(jogador.getLogin())) {
                encontrou = true;
                posicao = posicaoachou;
                txtLogin.setText(jogador.getLogin());
                txtSenha.setText(jogador.getSenha());
                txtEmail.setText(jogador.getEmail());
                posicao = posicaoachou;
                break;
            }
            posicaoachou++;
        }
        if (encontrou == true) {
            JOptionPane.showMessageDialog(null, "Encontrramos seu login.");
        } else {
            JOptionPane.showMessageDialog(null, "Não encontramos o seu login ou não há nenhum cadastrado.");
            Limpar();
        }
    }//GEN-LAST:event_btncoonsultar2ActionPerformed

    private void btnIrListagem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIrListagem2ActionPerformed
        jogadorListar lista = new jogadorListar();
        lista.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnIrListagem2ActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    public void Limpar() {
        txtLogin.setText("");
        txtSenha.setText("");
        txtEmail.setText("");
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
            java.util.logging.Logger.getLogger(jogadorManter.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jogadorManter.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jogadorManter.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jogadorManter.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jogadorManter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIrListagem2;
    private javax.swing.JButton btnanterior2;
    private javax.swing.JButton btncoonsultar2;
    private javax.swing.JButton btnexcluir2;
    private javax.swing.JButton btninserir2;
    private javax.swing.JButton btnlimpar2;
    private javax.swing.JButton btnoprimeiro2;
    private javax.swing.JButton btnproximo2;
    private javax.swing.JButton btnultimo2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jogador;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
