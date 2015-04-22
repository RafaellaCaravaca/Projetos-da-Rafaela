package Admin;
public class Principal extends javax.swing.JFrame {
    public Principal() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        mPessoa = new javax.swing.JMenu();
        pGerenciar = new javax.swing.JMenuItem();
        pListar = new javax.swing.JMenuItem();
        mCidade = new javax.swing.JMenu();
        cGerenciar = new javax.swing.JMenuItem();
        cListar = new javax.swing.JMenuItem();

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mPessoa.setText("Pessoa");

        pGerenciar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        pGerenciar.setText("Gerenciar");
        pGerenciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pGerenciarActionPerformed(evt);
            }
        });
        mPessoa.add(pGerenciar);

        pListar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        pListar.setText("Listar");
        pListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pListarActionPerformed(evt);
            }
        });
        mPessoa.add(pListar);

        jMenuBar1.add(mPessoa);

        mCidade.setText("Cidade");

        cGerenciar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.ALT_MASK));
        cGerenciar.setText("Gerenciar");
        cGerenciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cGerenciarActionPerformed(evt);
            }
        });
        mCidade.add(cGerenciar);

        cListar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_MASK));
        cListar.setText("Listar");
        cListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cListarActionPerformed(evt);
            }
        });
        mCidade.add(cListar);

        jMenuBar1.add(mCidade);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pGerenciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pGerenciarActionPerformed
        pessoaManter tela = new pessoaManter();
        //fechar só a janela:
        tela.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        tela.setVisible(true);
    }//GEN-LAST:event_pGerenciarActionPerformed

    private void pListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pListarActionPerformed
        pessoaListar tela = new pessoaListar();
        tela.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        tela.setVisible(true);
    }//GEN-LAST:event_pListarActionPerformed

    private void cListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cListarActionPerformed
        cidadeListar tela = new cidadeListar();
        tela.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        tela.setVisible(true);
    }//GEN-LAST:event_cListarActionPerformed

    private void cGerenciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cGerenciarActionPerformed
        cidadeManter tela = new cidadeManter();
        tela.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        tela.setVisible(true);
    }//GEN-LAST:event_cGerenciarActionPerformed

    public static void main(String args[]) {
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

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem cGerenciar;
    private javax.swing.JMenuItem cListar;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenu mCidade;
    private javax.swing.JMenu mPessoa;
    private javax.swing.JMenuItem pGerenciar;
    private javax.swing.JMenuItem pListar;
    // End of variables declaration//GEN-END:variables
}
