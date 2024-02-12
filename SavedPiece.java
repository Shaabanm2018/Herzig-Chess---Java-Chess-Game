// class savedpiece to save piece data 
public class SavedPiece {
// variables corresponding to the piece variables	
	private int rowSaved;
	private  int columnSaved;
	private String pieceName;
	private int pieceNumber;
	private int vbit = 0;
	public void setPieceNumber(int i){
		pieceNumber = i;
		
	}
	// to bet bit id of the piece
	public int getvbit(){
		return vbit;
	}
	
	//to set bit id of the piece
	public void setvbit(int i){
		vbit = i;
	}
	
	// to get piece number 
	public int getPieceNumber(){
		return pieceNumber;
	}
	
	// set row saved of piece 
	public void setRowSaved(int i){
		rowSaved = i;
	}
	
	// to get the saved row
	public int getRowsaved(){
		return rowSaved;
	}
	
	// to get the column saved of the piece
	public void setColumnSaved(int i){
		columnSaved = i;
	}
	
	// to get the number of the column saved 
	public int getColumnSaved(){
		return columnSaved;
	}
	// to get the name of the piece saved 
	public String getPieceName(){
		return pieceName;
	}
	//to set the name of the piece saved
	public void setPieceName(String name){
		this.pieceName = name;
	}
	
	
	
}