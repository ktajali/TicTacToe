package com.utm.csc;

public class Board {
  
  private final int size = 3;
  private char [][] board;
  
/*
 *  constructor
 */
  public Board()
  {
    board = new char [size][size];
  }
 /*
  *  initializing the instance variable board
  *  cells in the board are going to be ' ' at first
  */  
  public void init()
  {
    for (int i = 0 ; i < size ; i++)
    {
      for (int j = 0 ; j < size ; j++)
      {
        board [i][j] = ' ';
      }
    }
  }
  /*
   *  set the cell in the board to the player character
   */
  public void setCell(int row, int col, char player)
  {
    board [row][col]= player;
  }
  
  /*
   *  returns true if the player win
   */
  public boolean won(int row, int col, char ch)
  {
    if (board[row][0] == ch && board[row][1] == ch && board[row][2] == ch ||
        board[0][col] == ch && board[1][col] == ch && board[2][col] == ch ||
        board[0][0] == ch && board[1][1] == ch && board[2][2] == ch ||
        board[0][2] == ch && board[1][1] == ch && board[2][0] == ch)
      return true;
    else
    {
      return false;
    }
  }
  
  public String toString()
  {
    String result = "";
    for(int i = 0 ; i < size ; i++)
    {
      for (int j = 0 ; j < size ; j++)
      {
        if(j == size - 1)
          result += board[i][j] + "\n";
        else
          result += board[i][j] + "|";
      }
      if (i == size - 1)
        result += "\n";
      else
        result += "-+-+-\n";
    }
    return result;
  }
}
