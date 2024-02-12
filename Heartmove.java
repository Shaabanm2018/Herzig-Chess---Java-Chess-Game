// to move heart piece 
// class Heartmove implements SuperMovement to implements stratigy desing pattern
public class Heartmove implements SuperMovement{
	// to set move of heart
	public boolean move(int different_column, int different_row){
		  if (  (Math.abs(different_row) == 1 || Math.abs(different_row) == 0) && (Math.abs(different_column) == 1)  || 
               (Math.abs(different_row) == 1) && (Math.abs(different_column) == 1 || Math.abs(different_column) == 0) )
			   return true;
			   return false;
	}
}