package com.utm.csc;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ToolPanel extends JPanel{

  private JButton reset;
  private JButton quit;
  private JButton label;
  private GamePanel gamePanel;
  private TicTacToe game;
  
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
  
  public void setLabel(String str){
    label.setText(str);
  }
  
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
