// class to move cross
// to implement startegy dessing pattern
public class Crossmove implements SuperMovement{
	// to move cross 
	public boolean move(int different_column, int different_row){
		if ( (Math.abs(different_row) == 1) && (Math.abs(different_column) == 1) || (Math.abs(different_row) == 2) && (Math.abs(different_column) == 2) 
			|| (Math.abs(different_row) == 3) && (Math.abs(different_column) == 3)|| (Math.abs(different_row) == 4) && (Math.abs(different_column) == 4))
			return true;
		return false;
	}
}
