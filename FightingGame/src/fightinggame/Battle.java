
package fightinggame;

public class Battle extends javax.swing.JFrame {
    StartGame firstWindow;
    private Endgame otherWindow;
    private boolean turn;
    
    static int p1HealNum = 3;
    static int p2HealNum = 3;
    
    static int p1Spec = 5;
    static int p2Spec = 5;
    
    public boolean playerVictory;
    
    Cutlass enemy = new Cutlass("Dobby", 100, 5);
    Fighter player = new Fighter("Chris", 100, 5);
    public Battle(StartGame s) {
        initComponents();
        firstWindow = s;
        
        turnP1.setVisible(false);
        turnP2.setVisible(false);
        
        enemyHealthBar.setValue(enemy.getHp());
        playerHealthBar.setValue(player.getHp());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        player1Attack = new javax.swing.JButton();
        playerHealthBar = new javax.swing.JProgressBar();
        enemyHealthBar = new javax.swing.JProgressBar();
        player1SpecialAttack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtBattle = new javax.swing.JTextArea();
        player2Attack = new javax.swing.JButton();
        player2SpecialAttack = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        turnP1 = new javax.swing.JLabel();
        turnP2 = new javax.swing.JLabel();
        healP2 = new javax.swing.JButton();
        healP1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fightinggame/cutlass.gif"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fightinggame/fighter.gif"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 170, 250, 250));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fightinggame/cutlass.gif"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 180, 250));

        player1Attack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fightinggame/attakBtn.png"))); // NOI18N
        player1Attack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player1AttackActionPerformed(evt);
            }
        });
        getContentPane().add(player1Attack, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 440, 210, 70));

        playerHealthBar.setBackground(new java.awt.Color(51, 255, 0));
        playerHealthBar.setForeground(new java.awt.Color(0, 204, 255));
        getContentPane().add(playerHealthBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 40, 230, 40));

        enemyHealthBar.setBackground(new java.awt.Color(0, 255, 0));
        enemyHealthBar.setForeground(new java.awt.Color(0, 204, 255));
        getContentPane().add(enemyHealthBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 230, 40));

        player1SpecialAttack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fightinggame/specialAttack.png"))); // NOI18N
        player1SpecialAttack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player1SpecialAttackActionPerformed(evt);
            }
        });
        getContentPane().add(player1SpecialAttack, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 530, 260, 80));

        txtBattle.setColumns(20);
        txtBattle.setRows(5);
        jScrollPane1.setViewportView(txtBattle);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 420, 280));

        player2Attack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fightinggame/attakBtn.png"))); // NOI18N
        player2Attack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player2AttackActionPerformed(evt);
            }
        });
        getContentPane().add(player2Attack, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, 210, 70));

        player2SpecialAttack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fightinggame/specialAttack.png"))); // NOI18N
        player2SpecialAttack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player2SpecialAttackActionPerformed(evt);
            }
        });
        getContentPane().add(player2SpecialAttack, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 530, 260, 80));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fightinggame/player2.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 90, 170, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fightinggame/player1.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 160, 40));

        turnP1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fightinggame/player1Turn.png"))); // NOI18N
        getContentPane().add(turnP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 200, 80));

        turnP2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fightinggame/player2Turn.png"))); // NOI18N
        getContentPane().add(turnP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 250, 80));

        healP2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fightinggame/heal.png"))); // NOI18N
        healP2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                healP2ActionPerformed(evt);
            }
        });
        getContentPane().add(healP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 450, 90, 40));

        healP1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fightinggame/heal.png"))); // NOI18N
        healP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                healP1ActionPerformed(evt);
            }
        });
        getContentPane().add(healP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 450, 90, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fightinggame/backgroundBattle.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void switcher(){
        if(otherWindow == null){
            otherWindow = new Endgame(this, playerVictory);
        }
            otherWindow.setVisible(true);
            this.setVisible(false);
    }

    private void player1AttackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player1AttackActionPerformed
        player.normalAttack(enemy);
        txtBattle.append("Player2 dealt " + player.getAtk() + " to Player1\n");
        updateInfo();
        
        if(enemy.getHp() <= 0){
            playerVictory = false;
            switcher();
        }
        if(player.getHp() <= 0){
            playerVictory = true;
            switcher();
        }
        
        player2Attack.setEnabled(true);
        player2SpecialAttack.setEnabled(true);
        if(p2HealNum > 0){
        healP2.setVisible(true);
        }else{
            healP2.setVisible(false);
        }
        
        turnP1.setVisible(true);
        turnP2.setVisible(false);
        
        player1Attack.setEnabled(false);
        player1SpecialAttack.setEnabled(false);
        if(p1HealNum > 0){
        healP1.setVisible(true);
        }else{
            healP1.setVisible(false);
        }
        
    }//GEN-LAST:event_player1AttackActionPerformed
    
    private void updateInfo(){
        enemyHealthBar.setValue(enemy.getHp());
        playerHealthBar.setValue(player.getHp());
    }
    private void player1SpecialAttackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player1SpecialAttackActionPerformed
        if(p2Spec > 0){
        player.specialAttack(enemy);
        updateInfo();
        txtBattle.append("Player2 used Special attack and dealt " + player.getRand() + " to Player1\n");
        
        if(enemy.getHp() <= 0){
            playerVictory = false;
            switcher();
        }
        if(player.getHp() <= 0){
            playerVictory = true;
            switcher();
        }
        
        player2Attack.setEnabled(true);
        player2SpecialAttack.setEnabled(true);
        if(p2HealNum > 0){
        healP2.setVisible(true);
        }else{
            healP2.setVisible(false);
        }
        
        turnP1.setVisible(true);
        turnP2.setVisible(false);
        
        player1Attack.setEnabled(false);
        player1SpecialAttack.setEnabled(false);
        if(p1HealNum > 0){
        healP1.setVisible(true);
        }else{
            healP1.setVisible(false);
        }
        
        p2Spec--;
        }else{
            txtBattle.append("Player2 is out of special attacks!\n");
        }
    }//GEN-LAST:event_player1SpecialAttackActionPerformed

    private void player2AttackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player2AttackActionPerformed
        enemy.normalAttack(player);
        txtBattle.append("Player1 dealt " + enemy.getAtk() + " to Player2 \n");
        updateInfo();
        
        if(enemy.getHp() <= 0){
            playerVictory = false;
            switcher();
        }
        if(player.getHp() <= 0){
            playerVictory = true;
            switcher();
        }
        
        player1Attack.setEnabled(true);
        player1SpecialAttack.setEnabled(true);
        if(p1HealNum > 0){
        healP1.setVisible(true);
        }else{
            healP1.setVisible(false);
        }
        
        turnP1.setVisible(false);
        turnP2.setVisible(true);
        
        player2Attack.setEnabled(false);
        player2SpecialAttack.setEnabled(false);
        if(p2HealNum > 0){
        healP2.setVisible(true);
        }else{
            healP2.setVisible(false);
        }
    }//GEN-LAST:event_player2AttackActionPerformed

    private void player2SpecialAttackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player2SpecialAttackActionPerformed
        if(p1Spec > 0){
        enemy.specialAttack(player);
        updateInfo();
        txtBattle.append("Player1 used Special attack and dealt " + enemy.getRand() + " to Player2\n");
        
        if(enemy.getHp() <= 0){
            playerVictory = false;
            switcher();
        }
        if(player.getHp() <= 0){
            playerVictory = true;
            switcher();
        }
        
        
        player1Attack.setEnabled(true);
        player1SpecialAttack.setEnabled(true);
        if(p1HealNum > 0){
        healP1.setVisible(true);
        }else{
            healP1.setVisible(false);
        }
        turnP1.setVisible(false);
        turnP2.setVisible(true);
        
        player2Attack.setEnabled(false);
        player2SpecialAttack.setEnabled(false);
        if(p2HealNum > 0){
        healP2.setVisible(true);
        }else{
            healP2.setVisible(false);
        }
        
        p1Spec--;
        }else{
            txtBattle.append("Player1 is out of special attacks! \n");
        }
    }//GEN-LAST:event_player2SpecialAttackActionPerformed

    private void healP2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_healP2ActionPerformed
        if(p2HealNum > 0 && player.getHp() < 100){
            player.heal(player);
            txtBattle.append("Player 2 healed, " + p2HealNum + " heals remain.\n");
            p2HealNum--;
        }else if(player.getHp() >= 100){
            txtBattle.append("P2 health is already at max\n");
        }else{
        txtBattle.append("Player 2 is out of heals\n");
        }
        updateInfo();
    }//GEN-LAST:event_healP2ActionPerformed

    private void healP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_healP1ActionPerformed
        if(p1HealNum > 0 && enemy.getHp() < 100){
            enemy.heal(enemy);
            txtBattle.append("Player 1 healed, " + p1HealNum + " heals remain.\n");
            p1HealNum--;
        }else if(enemy.getHp() >= 100){
            txtBattle.append("P1 health is already max\n");
        }else{
        txtBattle.append("Player 1 is out of heals\n");
        }
        updateInfo();
    }//GEN-LAST:event_healP1ActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar enemyHealthBar;
    private javax.swing.JButton healP1;
    private javax.swing.JButton healP2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton player1Attack;
    private javax.swing.JButton player1SpecialAttack;
    private javax.swing.JButton player2Attack;
    private javax.swing.JButton player2SpecialAttack;
    private javax.swing.JProgressBar playerHealthBar;
    private javax.swing.JLabel turnP1;
    private javax.swing.JLabel turnP2;
    private javax.swing.JTextArea txtBattle;
    // End of variables declaration//GEN-END:variables
}
