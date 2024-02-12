import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
// game class to represent game 
public class Game extends JFrame{
	 
	Game(){
	// name of the frame 
		super("Herzig Chess");
		this.setLayout(new BorderLayout());		
	
	

		
		
		// adjust frame
		this.setResizable(true);
		this.setSize(500, 600);
		this.setLocation(500, 180);
				
		setDefaultCloseOperation(EXIT_ON_CLOSE);		
	}	
// to implement singleton desing pattern	
	private static Game instance = new Game();
	
	public static Game getInstance(){
		return instance;
	}
	
	// to add first jpanel
	public void add1(JPanel panel){
		this.add(panel);
	}
	
	// to add second jpanel
	public void add2(JPanel panel){
		this.add(panel , BorderLayout.NORTH);
	}
}
