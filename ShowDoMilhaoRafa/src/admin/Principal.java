/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
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

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenuBar5 = new javax.swing.JMenuBar();
        jMenu9 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        imagem1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuPrincipal = new javax.swing.JMenu();
        menuListarJogador = new javax.swing.JMenuItem();
        menuGerenciarJogador = new javax.swing.JMenuItem();
        mnuPerguntaL = new javax.swing.JMenu();
        menuGerenciarPergunta = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        menuListarRanking = new javax.swing.JMenuItem();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenu2.setText("File");
        jMenuBar3.add(jMenu2);

        jMenu5.setText("Edit");
        jMenuBar3.add(jMenu5);

        jMenu6.setText("File");
        jMenuBar4.add(jMenu6);

        jMenu7.setText("Edit");
        jMenuBar4.add(jMenu7);

        jMenu9.setText("File");
        jMenuBar5.add(jMenu9);

        jMenu10.setText("Edit");
        jMenuBar5.add(jMenu10);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        imagem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/showimagem.jpg"))); // NOI18N
        imagem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagem1MouseClicked(evt);
            }
        });

        menuPrincipal.setText("Jogador");

        menuListarJogador.setText("Listar");
        menuListarJogador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuListarJogadorActionPerformed(evt);
            }
        });
        menuPrincipal.add(menuListarJogador);

        menuGerenciarJogador.setText("Gerenciar");
        menuGerenciarJogador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGerenciarJogadorActionPerformed(evt);
            }
        });
        menuPrincipal.add(menuGerenciarJogador);

        jMenuBar1.add(menuPrincipal);

        mnuPerguntaL.setText("Pergunta");

        menuGerenciarPergunta.setText("Gerenciar");
        menuGerenciarPergunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGerenciarPerguntaActionPerformed(evt);
            }
        });
        mnuPerguntaL.add(menuGerenciarPergunta);

        jMenuBar1.add(mnuPerguntaL);

        jMenu8.setText("Ranking");

        menuListarRanking.setText("Listar");
        menuListarRanking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuListarRankingActionPerformed(evt);
            }
        });
        jMenu8.add(menuListarRanking);

        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(imagem1)
                .addContainerGap(342, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(imagem1)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuListarJogadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuListarJogadorActionPerformed
        jogadorListar telalistarj = new jogadorListar();
        telalistarj.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        telalistarj.setVisible(true);        
    }//GEN-LAST:event_menuListarJogadorActionPerformed

    private void menuGerenciarJogadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGerenciarJogadorActionPerformed
        jogadorManter telaj = new jogadorManter();
        telaj.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        telaj.setVisible(true);
    }//GEN-LAST:event_menuGerenciarJogadorActionPerformed

    private void menuGerenciarPerguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGerenciarPerguntaActionPerformed
        perguntaManter telap = new perguntaManter();
        telap.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        telap.setVisible(true);
    }//GEN-LAST:event_menuGerenciarPerguntaActionPerformed

    private void menuListarRankingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuListarRankingActionPerformed
        try {
            rankingListar telar = new rankingListar();
            telar.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            telar.setVisible(true);
        } catch (ParseException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_menuListarRankingActionPerformed

    private void imagem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagem1MouseClicked
        imagem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/showimagem2.jpg")));
    }//GEN-LAST:event_imagem1MouseClicked

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imagem1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JMenuBar jMenuBar5;
    private javax.swing.JMenuItem menuGerenciarJogador;
    private javax.swing.JMenuItem menuGerenciarPergunta;
    private javax.swing.JMenuItem menuListarJogador;
    private javax.swing.JMenuItem menuListarRanking;
    private javax.swing.JMenu menuPrincipal;
    private javax.swing.JMenu mnuPerguntaL;
    // End of variables declaration//GEN-END:variables
}