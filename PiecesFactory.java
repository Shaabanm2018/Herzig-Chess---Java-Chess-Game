
import java.util.*;
import java.awt.*;
import javax.swing.*;

// class PiecesFacotry to be used to implement abstract factory desing pattern
 public class PiecesFactory{
	// piece to be created 
	private Piece chunk;
	// variables corresponding to the pieces 
	public static final int cross = 2;
	public static final int star = 1;
	public static final int heart = 3;
	public static final int box = 4;
	
	// to create piece depend on the value of i
	public Piece createPiece(int i, String name){
		if(i == cross){
			chunk = new Cross();
			chunk.setButton(new JButton(new ImageIcon(name)));
			
		}
		else if (i == star){
			chunk = new Star();
			chunk.setButton(new JButton(new ImageIcon(name)));
			
		}
		else if (i == box){
			chunk = new Box();
			chunk.setButton(new JButton(new ImageIcon(name)));
			
		}
	
		else if( i == heart){
			chunk = new Heart();
			chunk.setButton(new JButton(new ImageIcon(name)));
			
		}
		else ;
		return chunk;
	
	}	
}