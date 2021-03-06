/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mathgame.UI;
import mathgame.Questions.Question;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JMenuItem;
import mathgame.*;
/**
 *
 * @author devinbost
 */
public class GameUI extends javax.swing.JFrame {
    Gamer _Gamer = null;
    QandABot _QandABot = null;
    /**
     * Creates new form GameUI
     */
    public GameUI() {
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

        jLabel1 = new javax.swing.JLabel();
        jDifficultySpinner = new javax.swing.JSpinner();
        jAnswer = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jQuestion = new javax.swing.JLabel();
        jCheckAnswer = new javax.swing.JButton();
        jNextQuestion = new javax.swing.JButton();
        jCorrect = new javax.swing.JLabel();
        jScore = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jUsername = new javax.swing.JTextField();
        jMainMenuBar = new javax.swing.JMenuBar();
        jMainMenu = new javax.swing.JMenu();
        jStartGame = new javax.swing.JMenuItem();
        jPauseMenu = new javax.swing.JMenu();
        jHelpMenu = new javax.swing.JMenu();
        jMenuItemHelp = new javax.swing.JMenuItem();
        jMenuItemAbout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Difficulty Level:");

        jAnswer.setText("Math Question Answer");
        jAnswer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAnswerActionPerformed(evt);
            }
        });

        jLabel2.setText("Enter your answer here:");

        jLabel3.setText("Question:");

        jQuestion.setText("Question for you to answer");

        jCheckAnswer.setEnabled(false);
        jCheckAnswer.setLabel("Check Answer");
        jCheckAnswer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckAnswerActionPerformed(evt);
            }
        });

        jNextQuestion.setText("Next Question");
        jNextQuestion.setEnabled(false);
        jNextQuestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNextQuestionActionPerformed(evt);
            }
        });

        jCorrect.setText("Correct?");

        jScore.setText("Current Score");

        jLabel4.setText("Score:");

        jLabel5.setText("What's your name?");

        jUsername.setText("Enter Name Here.");

        jMainMenu.setText("Main");

        jStartGame.setText("Start Game");
        jStartGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jStartGameActionPerformed(evt);
            }
        });
        jMainMenu.add(jStartGame);

        jMainMenuBar.add(jMainMenu);

        jPauseMenu.setText("Pause");
        jMainMenuBar.add(jPauseMenu);

        jHelpMenu.setText("Help");

        jMenuItemHelp.setText("Display Help");
        jMenuItemHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemHelpActionPerformed(evt);
            }
        });
        jHelpMenu.add(jMenuItemHelp);

        jMenuItemAbout.setText("About");
        jMenuItemAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAboutActionPerformed(evt);
            }
        });
        jHelpMenu.add(jMenuItemAbout);

        jMainMenuBar.add(jHelpMenu);

        setJMenuBar(jMainMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jDifficultySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jNextQuestion))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jQuestion)
                            .addComponent(jAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCheckAnswer)
                                .addGap(18, 18, 18)
                                .addComponent(jCorrect)))))
                .addContainerGap(57, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScore))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jScore)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDifficultySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jQuestion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckAnswer)
                    .addComponent(jNextQuestion)
                    .addComponent(jCorrect))
                .addContainerGap(109, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jStartGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jStartGameActionPerformed
// // Lambda expressions require JDK 1.8+
//       Component[] menuComponents = jHelpMenu.getComponents();
//        for (Component instance : jHelpMenu.getComponents()) {
//            if (instance instanceof JMenuItem) {
//                menuItemInstance -> {
//                    JMenuItem myItem = (JMenuItem)menuItemInstance;
//                    myItem.addActionListener((e) ->{
//                        System.out.print(myItem.getName());
//                    })
//                }
//            }
//        }
        // TODO add your handling code here:
        // This is the event handler method that starts the game.
        int difficulty = (int)jDifficultySpinner.getValue();
        if(difficulty > 3 || difficulty < 0){
            //throw new IllegalArgumentException("Error: The difficulty level cannot be set below 0 or above 3!");
        }
        // We need some error handling on the getText method to ensure that the gamer has entered their name!
        String name = jUsername.getText();
        _Gamer = new Gamer(difficulty, 3, name);
        _QandABot = new QandABot(_Gamer);
        // set gamer and bot to properties
        // enable answer button when the game is started
        jCheckAnswer.setEnabled(true);
        jNextQuestion.setEnabled(true);
        // When button is clicked, update 
        // jQuestion is where the question appears
        // jAnswer is where the user enters their answer
        
    }//GEN-LAST:event_jStartGameActionPerformed

    private void jAnswerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAnswerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAnswerActionPerformed

    private void jCheckAnswerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckAnswerActionPerformed
        // TODO add your handling code here:
        double userAnswer = Double.parseDouble(jAnswer.getText());
        Question currentQuestion = _QandABot.GetCurrentQuestion();
        if(currentQuestion.CheckAnswer(userAnswer) == true){
            _Gamer.ScoreUp();
            jCorrect.setText("Correct!!!");
            jScore.setText(Integer.toString(_Gamer.GetScore()));
        }
        
        
    }//GEN-LAST:event_jCheckAnswerActionPerformed

    private void jNextQuestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNextQuestionActionPerformed
        // TODO add your handling code here:
        jQuestion.setText("What is " + _QandABot.GetNextQuestion() + " ?");
        // Gets the next question.
        jCorrect.setText("Correct?");
    }//GEN-LAST:event_jNextQuestionActionPerformed

    private void jMenuItemHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemHelpActionPerformed
        // TODO add your handling code here:
        MenuView view = MenuView.getInstance();
        view.HandleMenuItemClick("jMenuItemHelp");
        //displayHelp();
        // pass "jMenuItemHelp" to MenuView.
    }//GEN-LAST:event_jMenuItemHelpActionPerformed

    private void jMenuItemAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAboutActionPerformed
        // TODO add your handling code here:
        MenuView view = MenuView.getInstance();
        view.HandleMenuItemClick("jMenuItemAbout");
    }//GEN-LAST:event_jMenuItemAboutActionPerformed
//    private void displayHelp(){
//        System.out.println("Display help");
//    }
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
            java.util.logging.Logger.getLogger(GameUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jAnswer;
    private javax.swing.JButton jCheckAnswer;
    private javax.swing.JLabel jCorrect;
    private javax.swing.JSpinner jDifficultySpinner;
    private javax.swing.JMenu jHelpMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMainMenu;
    private javax.swing.JMenuBar jMainMenuBar;
    private javax.swing.JMenuItem jMenuItemAbout;
    private javax.swing.JMenuItem jMenuItemHelp;
    private javax.swing.JButton jNextQuestion;
    private javax.swing.JMenu jPauseMenu;
    private javax.swing.JLabel jQuestion;
    private javax.swing.JLabel jScore;
    private javax.swing.JMenuItem jStartGame;
    private javax.swing.JTextField jUsername;
    // End of variables declaration//GEN-END:variables
}
