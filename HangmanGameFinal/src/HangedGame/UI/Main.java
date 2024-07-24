package HangedGame.UI;

import HangedGame.logic.HangedGameLogic;
import HangedGame.resources.HangedGameResources;
import HangedGame.UI.Frame2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;


public class Main extends javax.swing.JFrame {
    private HangedGameResources gameResources;
    private HangedGameLogic gameLogic;  
    private int player1Score = 0;
    private int player2Score = 0;

    public Main() {
        initComponents();
        gameResources = new HangedGameResources();
        gameLogic = new HangedGameLogic(gameResources.getWords());
        gameLogic.initializeGame(); // Inicializamos el juego
        initializeButtons();
        updateDisplay();
        updateAttemptsLabel();
    }
        
    private void initializeButtons() {
        JButton[] buttons = gameResources.getButtons();
        buttons[1] = jButton2;
        buttons[2] = jButton3;
        buttons[3] = jButton4;
        buttons[4] = jButton5;
        buttons[5] = jButton6;
        buttons[6] = jButton7;
        buttons[7] = jButton8;
        buttons[8] = jButton9;
        buttons[9] = jButton10;
        buttons[10] = jButton11;
        buttons[11] = jButton12;
        buttons[12] = jButton13;
        buttons[13] = jButton14;
        buttons[14] = jButton15;
        buttons[15] = jButton16;
        buttons[16] = jButton17;
        buttons[17] = jButton18;
        buttons[18] = jButton19;
        buttons[19] = jButton20;
        buttons[20] = jButton21;
        buttons[21] = jButton22;
        buttons[22] = jButton23;
        buttons[23] = jButton24;
        buttons[24] = jButton25;
        buttons[25] = jButton26;
        buttons[26] = jButton27;
        
        for (int i = 1; i < buttons.length; i++) {
            final int index = i;
        buttons[i].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                letterButtonClicked((char)('A' + index - 1));
            }
        });
      }
    }

     private void letterButtonClicked(char letter) {
        boolean correctGuess = gameLogic.guessLetter(letter);
    if (correctGuess) {
        updateWordDisplay();
    } else {
        updateHangmanImage();
    }
    
    updateAttemptsLabel(); 
    
    if (gameLogic.isGameOver()) {
        if (gameLogic.isWordGuessed()) {
            JOptionPane.showMessageDialog(this, "¡You won! The word was: " + gameLogic.getCurrentWord());
            if (gameLogic.isPlayer1Turn()) {
                player1Score += 100;
            } else {
                player2Score += 100;
            }
            gameLogic.startNewGame(); // Iniciamos un nuevo juego sin cambiar el turno
        } else {
            JOptionPane.showMessageDialog(this, "¡You lost your attempt! The word was: " + gameLogic.getCurrentWord());
            gameLogic.switchTurn(); // Cambiamos el turno solo si se agotaron los intentos
            gameLogic.startNewGame(); // Iniciamos un nuevo juego
        }
    }
    
    updateTurnDisplay();
    updateButtonStates();
    updateDisplay();
    }

     
    private void updateDisplay() {
        updateWordDisplay();
        updateHangmanImage();
        updateTurnDisplay();
        updateButtonStates();
    }
    
    private void updateWordDisplay() {
        StringBuilder display = new StringBuilder();
        for (char c : gameLogic.getCurrentWord().toCharArray()) {
            if (gameLogic.getGuessedLetters()[c - 'A']) {
                display.append(c);
            } else {
                display.append("_");
            }
            display.append(" ");
        }
        jTextPane1.setText(display.toString());
    }
   
    private void updateHangmanImage() {
        jButton1.setIcon(gameResources.getImages()[6 - gameLogic.getAttempts()]);
    }

    private void updateTurnDisplay() {
        jLabel2.setText("Turn: " + (gameLogic.isPlayer1Turn() ? "Player 1" : "Player 2"));
    }
    private void updateAttemptsLabel() {
    jLabel1.setText("Attempts: " + gameLogic.getAttempts());
    }

    private void updateButtonStates() {
        JButton[] buttons = gameResources.getButtons();
        boolean[] guessedLetters = gameLogic.getGuessedLetters();
        for (int i = 1; i < buttons.length; i++) {
            buttons[i].setEnabled(!guessedLetters[i - 1]);
        }
    }
    
    private void checkGameStatus() {
         if (gameLogic.isGameOver()) {
        if (gameLogic.isWordGuessed()) {
            JOptionPane.showMessageDialog(this, "¡Ganaste! La palabra era: " + gameLogic.getCurrentWord());
            if (gameLogic.isPlayer1Turn()) {
                player1Score += 100;
            } else {
                player2Score += 100;
            }
        } else {
            JOptionPane.showMessageDialog(this, "¡Perdiste tu turno! La palabra era: " + gameLogic.getCurrentWord());
        }
        gameLogic.startNewGame();
        updateDisplay();
    }
    }

    public void resetScores() {
        player1Score = 0;
        player2Score = 0;
    }
 
    public void updateFrame2Scores(Frame2 frame2) {
        frame2.updateScores(player1Score, player2Score);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Hanged Game");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jTextPane1.setEditable(false);
        jTextPane1.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jScrollPane1.setViewportView(jTextPane1);

        jButton2.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton2.setText("A");

        jButton3.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton3.setText("B");

        jButton4.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton4.setText("C");

        jButton5.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton5.setText("D");

        jButton6.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton6.setText("E");

        jButton7.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton7.setText("F");

        jButton8.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton8.setText("G");

        jButton9.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton9.setText("H");

        jButton10.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton10.setText("I");

        jButton11.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton11.setText("J");

        jButton12.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton12.setText("K");

        jButton13.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton13.setText("L");

        jButton14.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton14.setText("M");

        jButton15.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton15.setText("N");

        jButton16.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton16.setText("O");

        jButton17.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton17.setText("P");

        jButton18.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton18.setText("Q");

        jButton19.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton19.setText("R");

        jButton20.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton20.setText("S");

        jButton21.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton21.setText("T");

        jButton22.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton22.setText("U");

        jButton23.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton23.setText("V");

        jButton24.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton24.setText("W");

        jButton25.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton25.setText("X");

        jButton26.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton26.setText("Y");

        jButton27.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton27.setText("Z");

        jButton28.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton28.setText("Restart");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        jLabel3.setText(" ");

        jLabel1.setText("Attempts:");

        jLabel2.setText("Player:");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HangedGame/sources/1.jpg"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton29.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton29.setText("Score");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jButton1)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton9)
                                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton3)
                                            .addComponent(jButton10))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jButton11)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton12)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton13)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton14)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton15))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jButton4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton8))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton18)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton19)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton20)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton21)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton22)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton23)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton24)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton25))
                                    .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton26)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton27))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(45, 45, 45)
                                        .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 106, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(24, 24, 24)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4)
                            .addComponent(jButton2)
                            .addComponent(jButton3)
                            .addComponent(jButton5)
                            .addComponent(jButton6)
                            .addComponent(jButton7)
                            .addComponent(jButton8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton11)
                            .addComponent(jButton9)
                            .addComponent(jButton10)
                            .addComponent(jButton12)
                            .addComponent(jButton13)
                            .addComponent(jButton14)
                            .addComponent(jButton15))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton16)
                            .addComponent(jButton17)
                            .addComponent(jButton18)
                            .addComponent(jButton19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton20)
                            .addComponent(jButton21)
                            .addComponent(jButton22))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton23)
                    .addComponent(jButton24)
                    .addComponent(jButton25)
                    .addComponent(jButton26)
                    .addComponent(jButton27))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 17, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        gameLogic.startNewGame();
        updateDisplay();
        resetScores();
        updateAttemptsLabel();
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        Frame2 frame2 = Frame2.createInstance(this);
        updateFrame2Scores(frame2);
        frame2.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton29ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
