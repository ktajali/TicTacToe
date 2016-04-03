package com.utm.csc;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GamePanel extends JPanel{
  
  private JButton[][] gameButtons;
  private JButton reset;
  private JButton quit;
  private JButton label;
  private TicTacToe game;
  private ToolPanel toolPanel;
  
  public GamePanel(TicTacToe g){
    
    game = g;
    gameButtons = new JButton [3][3];
    reset = new JButton();
    quit = new JButton();
    label = new JButton();
    this.setPreferredSize(new Dimension(300,300));
    setLayout(new GridLayout(3,3));
    setButtons();
  }
  
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
  
  public void setToolPanel(ToolPanel tp){
    toolPanel = tp;
  }
  
  public void reset(){
    game = new TicTacToe('X');
    for (int i = 0 ; i < gameButtons.length ; i++){
      for (int j = 0 ; j < gameButtons[i].length ; j++){
        gameButtons[i][j].setText("");
        gameButtons[i][j].setEnabled(true);
      }
    }
    toolPanel.setLabel(game.getPlayer());
  }
 
  
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
            if(game.win()){
              JOptionPane.showMessageDialog(null, "Player "+game.getPlayer()+" won!");
              reset();
            }
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
