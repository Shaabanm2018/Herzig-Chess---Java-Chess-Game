// boxmove up to implements Subermove 
// to implements startegy dessing patter 
public class BoxmoveUp implements SuperMovement{
	// to move box to up
	public boolean move(int different_column, int different_row){
			  if ((different_column) == 0 && ((different_row) == 2 ||(different_row) == 1))
				return true;
			   
			return false;
		
	}
}