package com.utm.csc;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import javax.swing.JButton;

public class GamePanelTest {
  
  private GamePanel gamePanel;


    @Before
    public void setUp()
    {
    }
    
    @Test
    public void testReset()
    {
      TicTacToe game = mock(TicTacToe.class);
      ToolPanel tool = mock(ToolPanel.class);
      
      gamePanel = new GamePanel(game);
      gamePanel.setToolPanel(tool);
      //get one of the buttons in the panel
      JButton my = gamePanel.getGameButtons()[0][0];
      
      when(game.getPlayer()).thenReturn("X");
      when(game.win()).thenReturn(false);
      when(game.tie()).thenReturn(false);
      //click one of the buttons in the panel
      my.doClick();
      
      assertEquals("X",my.getText());
      //reseting the game
      gamePanel.reset();
      
      assertEquals("",my.getText());
    }
    

 
}
