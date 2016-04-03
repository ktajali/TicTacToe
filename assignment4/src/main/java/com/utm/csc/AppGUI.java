/*runs the gui vesion of the game 
 it uses GamePanel and ToolPanel object */
package com.utm.csc;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class AppGUI{
  
  public static void run() 
  {
    //making a frame for game
    JFrame frame = new JFrame("Tic-Tac-Toe");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    frame.setLocation(dim.width/2,dim.height/2);
    //creating game object, game panel and a tool panel
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
