
package fightinggame;

import java.awt.Image;
import javax.swing.ImageIcon;


public class Endgame extends javax.swing.JFrame {
    Battle firstWindow;
    boolean playerVictory;
    
    private Image player1 = new ImageIcon("src\\fightinggame\\cutlass.gif").getImage();
    
    public Endgame(Battle s, boolean victory) {
        initComponents();
        firstWindow = s;
        playerVictory = victory;
        
        if(playerVictory == true){
            player1Won();
        }else if(playerVictory == false){
            player2Won();
        }
        
        
    }
    public void player1Won(){
        label1.setVisible(true);
        labelWin1.setVisible(true);
        
        label2.setVisible(false);
        labelWin2.setVisible(false);
    }
    public void player2Won(){
        label1.setVisible(false);
        labelWin1.setVisible(false);
        
        label2.setVisible(true);
        labelWin2.setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        labelWin2 = new javax.swing.JLabel();
        labelWin1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fightinggame/EndGame.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 10, 500, 120));

        label2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fightinggame/fighter.gif"))); // NOI18N
        getContentPane().add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 260, 250));

        label1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fightinggame/cutlass.gif"))); // NOI18N
        getContentPane().add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 190, 250));

        labelWin2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fightinggame/player2Victory.png"))); // NOI18N
        getContentPane().add(labelWin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 200, 80));

        labelWin1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fightinggame/player1Victory.png"))); // NOI18N
        getContentPane().add(labelWin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 200, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fightinggame/hyperspace.gif"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel labelWin1;
    private javax.swing.JLabel labelWin2;
    // End of variables declaration//GEN-END:variables
}
