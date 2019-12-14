
package fightinggame;

public class Battle extends javax.swing.JFrame {
    StartGame firstWindow;
    /**
     * Creates new form Battle
     */
    public Battle(StartGame s) {
        initComponents();
        firstWindow = s;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        PlayerProgressBar = new javax.swing.JProgressBar();
        enemyProgressBar = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fightinggame/cutlass.gif"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fightinggame/fighter.gif"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 180, 250, 250));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fightinggame/cutlass.gif"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 180, 250));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fightinggame/attakBtn.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 480, 210, 100));
        getContentPane().add(PlayerProgressBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 50, 220, 60));
        getContentPane().add(enemyProgressBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 220, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fightinggame/backgroundBattle.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar PlayerProgressBar;
    private javax.swing.JProgressBar enemyProgressBar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
