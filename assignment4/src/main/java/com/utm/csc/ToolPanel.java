/*makes the tool panel including reset, quit*/
package com.utm.csc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ToolPanel extends JPanel{

  //objects for reseting, quitting and showing each turn
  private JButton reset;
  private JButton quit;
  private JButton label;
  private GamePanel gamePanel;
  private TicTacToe game;
  
  //initializing the game object and game panel object
  public ToolPanel(TicTacToe g, GamePanel gp){
    
    gamePanel = gp;
    game = g;
    reset = new JButton("New");
    quit = new JButton("Quit");
    label = new JButton(game.getPlayer()+" turn");
    
    label.setEnabled(false);
    reset.addActionListener(new ToolListener());
    quit.addActionListener(new ToolListener());
    
    this.add(reset);
    this.add(label);
    this.add(quit);
  }
  
  //shows the player turn in the label
  public void setLabel(String str){
    label.setText(str);
  }
  
  //handles events when reset or quit buttons are being called
  private class ToolListener implements ActionListener{
    
    public void actionPerformed(ActionEvent event){
      
      JButton clicked = (JButton)event.getSource();
      
      if (clicked.getText() == "New"){
        gamePanel.reset();
      }
      if(clicked.getText() == "Quit"){
        System.exit(0);
      }
    }
    
  }
  
}
