package com.utm.csc;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
      if (args.length > 0){
        if (args[0].equalsIgnoreCase("-gui")){
          AppGUI.run();
        }
        else if(args[0].equalsIgnoreCase("-console")){
          AppConsole.run(); 
        }
        else{
          System.out.println("please use valid argument to run the application!");
          System.out.println("-gui or -console");
        }
      }
      else{
        AppConsole.run();
      }
      
      
    }

}
