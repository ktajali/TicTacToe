package com.utm.csc;

import java.util.Scanner;

public class AppConsole
{
    public static void run()
    {
      //scanner to scan the user inputs
      Scanner scan = new Scanner(System.in);

      TicTacToe game = new TicTacToe('X');
      
      //change is true if the player moved successfully
      boolean change = false;
      System.out.println("Enter '<row>,<col>' to play a position. For example, '0,2'.");
      
      //x and y holding the row and col temporarily
      int x = 0 , y = 0;

      while (!game.win() && !game.tie()){
        
        System.out.print("Player " + game.getPlayer() + " [row,col]: ");
        //get the string user inputs-handles if user enter a wrong format
        try{
          String [] line = scan.nextLine().split(",");
          x = Integer.parseInt(line[0]);
          y = Integer.parseInt(line[1]);
          change = game.play(x, y);
        
        }catch (Exception ex)
        {
          System.err.println("Wrong input format! Enter '<row>,<col>' to play a position. For example, '0,2'.");
        }

          //printing the game board*/
        if(change)
          System.out.println(game.getBoard());
        else
          System.out.println("");
  
      }
      if(game.win())
        System.out.println("Player " + game.getPlayer() + " won");
      else
        System.out.println("Nobody won the game :(");
      
    }

}
