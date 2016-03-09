package com.utm.csc;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
      //scanner to scan the user inputs
      Scanner scan = new Scanner(System.in);
      //game board
      Board board = new Board();
      //initializing the game board-set the cells to empty char
      board.init();
      //put main player as O 
      char mainPlayer = 'O';
      int row = 0;
      int col = 0;
      
      System.out.println("Enter '<row>,<col>' to play a position. For example, '0,2'.");
      
      while (!board.won(row , col, mainPlayer)){
        //switch the player every time
        if (mainPlayer == 'X')
          mainPlayer = 'O';
        else
          mainPlayer = 'X';
      
        System.out.print("Player " + mainPlayer + " [row,col]: ");
        //get the string user inputs
        String [] line = scan.nextLine().split(",");
        row = Integer.parseInt(line[0]);
        col = Integer.parseInt(line[1]);
        //set the cell in the game board
        board.setCell(row,col, mainPlayer);

        //printing the game board
        System.out.println(board);
        
      }

      System.out.println("won");
      
    }

}
