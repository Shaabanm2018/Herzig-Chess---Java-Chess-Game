import java.util.*;
import java.awt.*;
import javax.swing.*;
// class Piece to represent pieces
public class Piece 
{
	
	// variables corresponding to the piece variables
  private int ID;
  private String name;
  private boolean state;
  private JButton button;
  static int num;
  private SuperMovement m;
  ImageIcon img;
  
  public Piece() 
  {}
  
  // to move piece 
  public boolean move(int different_column, int different_row){
	  return m.move(different_column, different_row);
  }
  // to change move of piece
  public void setmove(SuperMovement m){
	  this.m  = m;
  }
  // to get id of piece
  public int getID ()
  {
    return ID;
  }
  // to set id of piece
  public void setID (int ID)
  {
    this.ID = ID;
  }
  // to get name of piece
  public String getName ()
  {
    return name;
  }
  // to set name of piece
  public void setName(String name)
  {
    this.name = name;
  }
  // to get state of piece
  public boolean getState()
  {
    return state;
  }
  // to set state of piece
  public void setState(boolean state)
  {
    this.state = state;
  }
  // to get button of piece
  public JButton getButton ()
  {
    return button;
  }
  // to set button of piece
  public void setButton(JButton button)
  {
    this.button = button;
  }  
}

