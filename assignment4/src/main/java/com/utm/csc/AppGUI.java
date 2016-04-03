package com.utm.csc;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class AppGUI{
  
  public static void main(String[] arg)
  {
    JFrame frame = new JFrame("Tic-Tac-Toe");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    TicTacToe g = new TicTacToe('X');
    GamePanel gp = new GamePanel(g);
    ToolPanel tp = new ToolPanel(g,gp);
    gp.setToolPanel(tp);
    
    frame.add(gp,BorderLayout.CENTER);
    frame.add(tp,BorderLayout.SOUTH);
    frame.pack();
    frame.setVisible(true);
    frame.setSize(300, 350);
  }

}
