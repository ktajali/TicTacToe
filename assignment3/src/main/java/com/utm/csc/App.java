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
      char mainPlayer = 'X';
      int row = 0;
      int col = 0;
      //if the player played his round successfully, change becomes true to change the player
      boolean change = false;
      System.out.println("Enter '<row>,<col>' to play a position. For example, '0,2'.");
      //x and y holding the row and col temporarily
      int x = 0 , y = 0;

      while (!board.won(row , col, mainPlayer) && !board.full()){
        //switch the player every time if the last player inserted successfully
        if (change){
          mainPlayer = (mainPlayer == 'X') ? 'O' : 'X';
        }
      
        System.out.print("Player " + mainPlayer + " [row,col]: ");
        //get the string user inputs-handles if user enter a wrong format
        try{
          String [] line = scan.nextLine().split(",");
          x = Integer.parseInt(line[0]);
          y = Integer.parseInt(line[1]);
          change = board.setCell(x,y, mainPlayer);
        }catch (Exception ex)
        {
          change = false;
          System.err.println("Wrong input format! Enter '<row>,<col>' to play a position. For example, '0,2'.");
        }
        //set the cell in the game board
        
        if(change)
        {
          row = x;
          col = y;
          //printing the game board
          System.out.println(board);
        }
        else
          System.out.println("");


        
      }
      if(board.won(row , col, mainPlayer))
        System.out.println("Player " + mainPlayer + " won");
      else
        System.out.println("Nobody won the game :(");
      
    }

}
