// starmove class implements SuperMovement interface to implement startigy desing pattern
public class Starmove implements SuperMovement{
	//move function to enable star class from moving
	public boolean move(int different_column, int different_row){
			  if (((Math.abs(different_column) == 1 || Math.abs(different_column) == 2) && (Math.abs(different_row) == 0)) || (((Math.abs(different_row) == 1) || Math.abs(different_row) == 2) && Math.abs(different_column) == 0) 
				  ||(Math.abs(different_row) == 1) && (Math.abs(different_column) == 1) || (Math.abs(different_row) == 2) && (Math.abs(different_column) == 2) )
				return true;
			   
			return false;
		
	}
}
