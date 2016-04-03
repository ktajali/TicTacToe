package com.utm.csc;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BoardTest {
    public Board board;
    @Before
    public void setUp()
    {
       board = new Board(); 
       board.init();
    }
    //test the setCell method
    @Test
    public void testSetCell()
    {
        boolean outOfBound = false;
        boolean correct  = true;
        boolean answer = board.setCell(0,7,'X');
        boolean answer2 = board.setCell(0,0,'X');
        assertEquals(outOfBound, answer);
        assertEquals(correct, answer2);
    }
    
    @Test
    public void testWon()
    {
        board.setCell(0, 1, 'O');
        board.setCell(1, 1, 'O');
        board.setCell(2, 1, 'O');
        boolean correct  = true;
        boolean correct1 = false;
        boolean answer = board.won(0,1,'O');
        boolean answer2 = board.won(0,0,'X');
        assertEquals(correct, answer);
        assertEquals(correct1, answer2);
    }
  
    @Test
    public void testFull()
    {
      for(int i = 0 ; i < 3 ; ++i)
      {
        for(int j = 0 ; j < 3 ; ++j)
        {
          board.setCell(i, j, 'X');
        }
      }

        boolean correct  = true;
        boolean answer = board.full();
        assertEquals(correct, answer);
    }
}
