/*handles the game board,*/
package com.utm.csc;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GamePanel extends JPanel{
  
  //creating buttons in the game panel
  private JButton[][] gameButtons;
  private TicTacToe game;
  private ToolPanel toolPanel;
  
  //initializing the panel
  public GamePanel(TicTacToe g){
    game = g;
    gameButtons = new JButton [3][3];
    this.setPreferredSize(new Dimension(300,300));
    setLayout(new GridLayout(3,3));
    setButtons();
  }
 
  //initialize the buttons in the panel
  public void setButtons(){
    for (int i = 0 ; i < gameButtons.length ; i++){
      for (int j = 0 ; j < gameButtons[i].length ; j++){
        gameButtons[i][j] = new JButton();
        gameButtons[i][j].setText("");
        gameButtons[i][j].addActionListener(new ButtonListener());
        
        this.add(gameButtons[i][j]);
      }
    }
  }
  
  //get the ToolPanel object
  public void setToolPanel(ToolPanel tp){
    toolPanel = tp;
  }
  
  //reset the buttons in the game panel and tool panel nad game state
  public void reset(){
    game = new TicTacToe('X');
    for (int i = 0 ; i < gameButtons.length ; i++){
      for (int j = 0 ; j < gameButtons[i].length ; j++){
        gameButtons[i][j].setText("");
        gameButtons[i][j].setEnabled(true);
      }
    }
    toolPanel.setLabel(game.getPlayer()+" turn");
  }
 
  //class handles the events when the board buttons are being being called
  private class ButtonListener implements ActionListener{
    
    public void actionPerformed(ActionEvent event){
      
      JButton clicked = (JButton)event.getSource();
      clicked.setText(game.getPlayer());
      
      for (int i = 0 ; i < 3 ; i++){
        for (int j = 0 ; j < 3 ; j++){
          if (clicked == gameButtons[i][j]){
            boolean ch = game.play(i, j);
            toolPanel.setLabel(game.getPlayer() + " turn");
            gameButtons[i][j].setEnabled(false);
            //if player win the game it restarts the game
            if(game.win()){
              JOptionPane.showMessageDialog(null, "Player "+game.getPlayer()+" won!");
              reset();
            }
            //if tie condition happens, it restarts the game
            if(game.tie()){
              JOptionPane.showMessageDialog(null, "Tie! Nobody won the game :)");
              reset();
            }
          }
        }
      }
    }
  }
  
}
