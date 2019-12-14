
package fightinggame;

public class Battle extends javax.swing.JFrame {
    StartGame firstWindow;
    private Endgame otherWindow;
    
    Cutlass enemy = new Cutlass("Dobby", 100, 5);
    Fighter player = new Fighter("Chris", 40, 5);
    public Battle(StartGame s) {
        initComponents();
        firstWindow = s;
        
        enemyHealthBar.setValue(enemy.getHp());
        playerHealthBar.setValue(player.getHp());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnAttack = new javax.swing.JButton();
        playerHealthBar = new javax.swing.JProgressBar();
        enemyHealthBar = new javax.swing.JProgressBar();
        btnSpecialAttack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fightinggame/cutlass.gif"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fightinggame/fighter.gif"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 180, 250, 250));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fightinggame/cutlass.gif"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 180, 250));

        btnAttack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fightinggame/attakBtn.png"))); // NOI18N
        btnAttack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAttackActionPerformed(evt);
            }
        });
        getContentPane().add(btnAttack, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 460, 210, 100));
        getContentPane().add(playerHealthBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 50, 220, 60));
        getContentPane().add(enemyHealthBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 220, 60));

        btnSpecialAttack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fightinggame/attakBtn.png"))); // NOI18N
        btnSpecialAttack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSpecialAttackActionPerformed(evt);
            }
        });
        getContentPane().add(btnSpecialAttack, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 460, 210, 100));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fightinggame/backgroundBattle.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAttackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAttackActionPerformed
        player.normalAttack(enemy);
        updateInfo();
        
        if(enemy.getHp() <= 0 || player.getHp() <= 0){
        if(otherWindow == null){
            otherWindow = new Endgame(this);
        }
        otherWindow.setVisible(true);
        this.setVisible(false);
        }
    }//GEN-LAST:event_btnAttackActionPerformed
    
    private void updateInfo(){
        enemyHealthBar.setValue(enemy.getHp());
        playerHealthBar.setValue(player.getHp());
    }
    private void btnSpecialAttackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSpecialAttackActionPerformed
        player.specialAttack(enemy);
        updateInfo();
    }//GEN-LAST:event_btnSpecialAttackActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAttack;
    private javax.swing.JButton btnSpecialAttack;
    private javax.swing.JProgressBar enemyHealthBar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JProgressBar playerHealthBar;
    // End of variables declaration//GEN-END:variables
}
