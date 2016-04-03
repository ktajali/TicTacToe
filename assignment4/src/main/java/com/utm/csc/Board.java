package com.utm.csc;

public class Board {
  
  private final int size = 3;
  private Cell [][] board;
  
/*
 *  constructor
 */
  public Board()
  {
    board = new Cell [size][size];
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
        board [i][j] = new Cell(' ', i, j);
      }
    }
  }
  /*
   *  set the cell in the board to the player character only if the cell is empty
   */
  public boolean setCell(int row, int col, char player)
  {
    if (row >= 0 && row < 3 && col >=0 && col < 3)
    {
      if (board [row][col].getCell() == ' ')
      {
        board [row][col].setCell(player);
        return true;
      }
      else
      {
        System.err.println("(" + row + "," + col + ") is already taken. Enter '<row>,<col>' to play a position. For example, '0,2'.");
        return false;
      }
    }
    else
    {
      System.err.println("(" + row + "," + col + ") is not on the board. Enter '<row>,<col>' to play a position. For example, '0,2'.");
      return false;
    }
  }
  
  /*
   *  returns true if the player win
   */
  public boolean won(int row, int col, char ch)
  {
    if (board[row][0].getCell() == ch && board[row][1].getCell() == ch && board[row][2].getCell() == ch ||
        board[0][col].getCell() == ch && board[1][col].getCell() == ch && board[2][col].getCell() == ch ||
        board[0][0].getCell() == ch && board[1][1].getCell() == ch && board[2][2].getCell() == ch ||
        board[0][2].getCell() == ch && board[1][1].getCell() == ch && board[2][0].getCell() == ch)
      return true;
    else
    {
      return false;
    }
  }
  //check if the board is full
  public boolean full()
  {
    for (int i = 0 ; i < size ; i ++)
    {
      for (int j = 0 ; j < size ; j++)
      {
        if (board [i][j].getCell() == ' ')
          return false;
      }
    }
    return true;
  }
  //
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
