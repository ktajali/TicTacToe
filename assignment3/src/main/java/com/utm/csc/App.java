package com.utm.csc;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      //System.out.println( "Welcome to Assignment3" );

      Scanner scan = new Scanner (System.in).useDelimiter(",");
      char [] [] board = new char [3][3];
      for (int p = 0 ; p < board.length ; p++)
      {
        for (int y = 0 ; y < 3 ; y++)
        {
          board [p][y] = ' ';
        }
      }
      char mainPlayer = 'O';
      int i = 0;
      int j = 0;
      while (!won(board, mainPlayer, i , j)){
        if (mainPlayer == 'X')
          mainPlayer = 'O';
        else
          mainPlayer = 'X';
        System.out.println("Enter '<row>,<col>' to play a position. For example, '0,2'.");
        System.out.println("Player " + mainPlayer + " [row,col]: ");
        String [] line = scan.nextLine().split(",");
        i = Integer.parseInt(line[0]);
        j = Integer.parseInt(line[1]);
        board [i][j] = mainPlayer;

        for(int k = 0 ; k < 3 ; k++)
        {
          for (int l = 0 ; l < 3 ; l++)
          {
            if(l == 2)
              System.out.println(board[k][l]);
            else
              System.out.print(board[k][l] + "|");
          }
          System.out.println("-+-+-");
        }
        
      }

      System.out.println("won");
      
    }
    public static boolean won(char [][] board, char ch, int row, int col)
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
}
