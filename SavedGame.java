// class to be used to save game data
public class SavedGame{
	// variables corresponding the game data
	 private int gameId;
	 private SaveClass savedFirstPlayer = new SaveClass();
	 private SaveClass savedSecondPlayer = new SaveClass();
	 
	 //to get game id 
	 	public int getGameId(){
		return gameId;
	}
	// to set game id
	public void setGameId(int id){
		this.gameId = id;
	}
	// to get first player
	public SaveClass getFirstplayer(){
		return savedFirstPlayer;
	}
	// to set firstplayer
	public void setFirstPlayer(SaveClass i){
		savedFirstPlayer = i;
	}
	// to set second player 
	public void setSecondPlayer(SaveClass i){
		savedSecondPlayer = i;
	}
	// to get second player
	public SaveClass getSecondplayer(){
		return savedSecondPlayer;
	}
 }
 
 
