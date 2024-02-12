// class to be used to add button to the boeard
import javax.swing.*;
public class Square{	
// variables to be assigned to the buttons
	private JButton button = new JButton();
	private int  button_row_number = 0;
	private int button_column_number = 0;
	private boolean state = true;
	
	public Square (){
	}
	
	// to get number of row of the button 
	public void set_Row_Number(int number){
		button_row_number = number;
	}
	// to bet number of column of the button
	public int get_Row_Number(){
		return button_row_number;
	}
	//to set column number of th button 
	public void set_Column_Number(int number){
		button_column_number = number;
	}
	// to get column number of the button
	public int get_Column_Number(){
		return  button_column_number;
	}
	
	// to set state for the button 
	public void set_Button_State(boolean state){
		this.state = state;
	}
	// to bet button state
	public boolean get_Button_State(){
		return state;
	}
	
	// to return button 
	public JButton get_Button(){
		return button;
	}
	// to set button
	public void set_Button(JButton button){
		this.button = button;
	}
	
	
}