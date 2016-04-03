package com.utm.csc;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import javax.swing.JButton;

public class ToolPanelTest {
  
  private ToolPanel toolPanel;


    @Before
    public void setUp()
    {
    }
    
    @Test
    public void testReset()
    {
      TicTacToe game = mock(TicTacToe.class);
      GamePanel gp = mock(GamePanel.class);
      
      toolPanel = new ToolPanel(game,gp);
     
      //get one of the buttons in the panel
      JButton myReset = toolPanel.getResetButton();
      JButton myQuit = toolPanel.getQuitButton();
      
      //click one of the buttons in the panel
      myReset.doClick();
      
      verify(gp).reset();
      
      
    }
    

 
}
