package com.utm.csc;

public class Cell {
  
  //instance varibale
  private char cell;
  private int row, col;
  //constructor
  public Cell(char c, int x, int y)
  {
    this.cell = c;
    this.row = x;
    this.col = y;
  }
  //getter method for row
  public int getRow()
  {
    return this.row;
  }
  //getter method for col
  public int getCol()
  {
    return this.col;
  }
  //setter for cell
  public void setCell(char c)
  {
    this.cell = c;
  }
  public char getCell()
  {
    return this.cell;
  }
  
  public String toString()
  {
    String result = "";
    result += this.cell;
    return result;
  }

}
