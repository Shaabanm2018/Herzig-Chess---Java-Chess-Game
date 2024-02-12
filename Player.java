import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import javax.swing.*;

// class to represent player in the game
public class Player{
	// variables corresponding the player variables
	private int id;
	private String name;
	private int role;
	private boolean state;

	// piece of the player 8
	JButton[] button_piece = new JButton[8];
	int[] bit = new int[8];
	
	public Player(){
		for(int i=0; i < 8; i++)
			bit[i] = 0;
	}
	// return id of player 
	public int getId(){
		return id;
	}
	// set id of player 
	public void setId(int id){
		this.id = id;
	}
	// retunr bit id of player 
	public int getbit(int i){
		return bit[i];
	}
	// set bit id of player 
	public void setbit(int i, int j){
		bit[i] = j;
	}
	
	// to get player name
	public String getName(){
		return name;
	}
	// to gt player role
	public void setRole(int role){
		this.role = role;
	}
	
	// to set player role
	public int getRole(){
		return role;
	}
	
	// to player name
	public void setName(String name){
		this.name = name;
		
	}
	
	// to get state of player
	public boolean getState(){
		return state;
	}
	
	// to set sate of player 
	public void setState(boolean state){
		this.state = state;
	}
	
	// to set button  of piece 
	public void setButton(int i, JButton button){
		button_piece[i] = button;
	}
	// to get button of piece 
	public JButton getButton(int i){
		return button_piece[i];
	}
	
	 // to check if piece belong to the player pieces
	public boolean check(JButton button){
		boolean find;
		for(int i =0; i < 8; i++){
			if(button == button_piece[i])
				return true;
		}
		
			return false;
	
			
	}
	// to get piece number of player 
		public int getpieceNumber(JButton button){
		for(int i =0; i < 8; i++)
			if(button == button_piece[i])
				return i;
			 return 0;
	}
	
	
	
}