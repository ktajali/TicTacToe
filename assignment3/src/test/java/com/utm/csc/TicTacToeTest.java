package com.utm.csc;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TicTacToeTest {
    public TicTacToe game;
    @Before
    public void setUp()
    {
      game = new TicTacToe('X');
    }
    
    @Test
    public void testPlay()
    {
      boolean correct  = false;
      game.getBoard().setCell(0,0,'X');
      boolean answer = game.play(0, 0);
      assertEquals(correct, answer);
    }
    
    @Test
    public void testWin()
    {
      boolean i = game.play(0, 0);
      boolean io = game.play(0, 1);
      boolean j = game.play(1, 1);
      boolean jo = game.play(1, 2);
      boolean k = game.play(2, 2);
      //System.out.println(game.getBoard());
      boolean correct  = true;
      boolean answer = game.win();
      assertEquals(correct, answer);

    }
  
    @Test
    public void testTie()
    {
      game.getBoard().setCell(0, 0, 'O');
      game.getBoard().setCell(0, 1, 'O');
      game.getBoard().setCell(1, 2, 'O');
      game.getBoard().setCell(2, 0, 'O');
      game.getBoard().setCell(2, 2, 'O');
      game.getBoard().setCell(0, 2, 'X');
      game.getBoard().setCell(1, 0, 'X');
      game.getBoard().setCell(1, 1, 'X');
      game.getBoard().setCell(2, 1, 'X');
      boolean correct  = true;
      boolean answer = game.tie();
      assertEquals(correct, answer);
    }
}
