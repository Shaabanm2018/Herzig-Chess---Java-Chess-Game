import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
// class to be used to save data of the game
public class SaveClass {
	
	
	public SaveClass(){
			for(int i=0; i < 8; i++){
			piece[i] = new SavedPiece();
			piece[i].setPieceNumber(i);
			}
	}
	// variables corresponding ot the game data
	private int playerId;
	private boolean savedState;
	private int savedRole;
	private String savedName;
	
	// array of piece of type savedPiece  class
	SavedPiece[] piece = new SavedPiece[8];
	
	// to get the saved piece
	public SavedPiece getPiece(int i){
		return piece[i];
	}
	
	// to get the name of saved piece
	public String getSavedName(){
		return savedName;
	}
	
	// to set the name of the saved piece
	public void setSavedName(String name){
		this.savedName = name;
	}
	// to set the piece
	public void setpiece(SavedPiece p, int i){
		piece[i] = p;
	}
	// to get player id
	public int getplayerId(){
		return playerId;
	}
	
	// to set player id
	public void setplayerId(int id){
		this.playerId = id;
	}
	
	// to get saved state
	public boolean getSavedState(){
		return savedState;
	}
	// to set saved state
	public void setSavedState(boolean state){
		this.savedState = state;
	}
	
	//to get the saved role
		public int getSavedRole(){
		return savedRole;
	}
	
	// to set the saved role
	public void setSavedRole(int id){
		this.savedRole = id;
	}
}