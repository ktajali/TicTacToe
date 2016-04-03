package com.utm.csc;
//manages the whole game
public class TicTacToe {
  
  private char player;
  private Board board;
  private boolean won;
  
  //constructor
  public TicTacToe(char a)
  {
    player = a;
    board = new Board();
    board.init();
    won= false;
  }
  //play the requested move, return false if couldnt
  public boolean play(int x, int y)
  {
    boolean success = board.setCell(x, y, player);
    if (success)
    {
      if (board.won(x, y, this.player))
        won = true;
      else
        player = (player == 'X') ? 'O' : 'X';
      
      return true;
    }
    return false;
  }
  
  //getter for board
  public Board getBoard()
  {
    return board;
  }
  
  //getter for player
  public String getPlayer()
  {
    return (this.player+"");
  }
  
  //true if player win
  public boolean win()
  {
    return won;
  }
  
  //tie if game board gets full and noone win
  public boolean tie()
  {
    return (board.full() && !won);
  }

}
