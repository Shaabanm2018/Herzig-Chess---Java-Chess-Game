// to implements startegy desing pattern
// to change move of box to down
public class BoxmoveDwon implements SuperMovement{
	// to change move the box to down
	public boolean move(int different_column, int different_row){
			  if ((different_column) == 0 && ((different_row) == -2 ||(different_row) == -1))
				return true;
			   
			return false;
		
	}
}