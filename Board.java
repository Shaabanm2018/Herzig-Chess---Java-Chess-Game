import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.table.*;
import java.io.*;
import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.table.*;


 class Board{	
	// variables to be used to intilaze game 
	public JPanel panel = new JPanel();
	static public Square[][] grid = new Square[8][5];
	static public ArrayList<SavedGame> savedgame = new ArrayList<SavedGame>();
	PiecesFactory factory = new PiecesFactory();
	public static Player firstPlayer = new Player();
	public static Player secondPlayer = new Player();
	boolean boxstate = true;
	boolean boxstate2 = true;
	boolean dontTurn = true;
	boolean notturn = true;
	
	// variables to save row and column for each piece 
		public int greenStarRow1 = 0;
		public int greenStarColumn1 = 0;
		
		public int greenStarRow2 = 0;
		public int greenStarColumn2 = 4;
		
		public int greenCrossRow1 = 0;
		public int greenCrossColumn1 = 1;
		
		public int greenCrossColumn2 = 3;
		public int greenCrossRow2 = 0;
		
		public int greenHeartRow = 0;
		public int greenHeartCoulmn = 2;
		
		public int greenBox1Row = 1;
		public int greenBox1Column = 1;
		
		public int greenBox2Row = 1;
		public int greenBox2Column = 2;
		
		public int greenBox3Row = 1;
		public int greenBox3Column = 3;
		
		public int redStarRow1 = 7;
		public int redStarColumn1 = 0;
		
		public int redStarRow2 = 7;
		public int redStarColumn2 = 4;
		
		public int redCrossRow1 = 7;
		public int redCrossColumn1 = 1;
		
		public int redCrossColumn2 = 3;
		public int redCrossRow2 = 7;
		
		public int redHeartRow = 7;
		public int redHeartCoulmn = 2;
		
		public int redBox1Row = 6;
		public int redBox1Column = 1;
		
		public int redBox2Row = 6;
		public int redBox2Column = 2;
		
		public int redBox3Row = 6;
		public int redBox3Column = 3;
		
		
		// variables to save name of pieces
		String star1 = "star.png";
		String cross1 = "cross.png";
		String heart1 = "heart.png";
	
	String boxname1 = "Box.png";
		String boxname1_1  = "Box.png";
		String boxname1_2 = "Box.png";
		String boxname1_3  = "Box.png";
// create buttons of the board
	public JButton savebtn = new JButton("Save");
	public JButton helpbtn = new JButton("Help");
	public JButton quitbtn = new JButton("Quit");
	// create button contain the pieces using abstract factory desing pattern
	JButton star_green1 = factory.createPiece(1, "star.png").getButton();
	JButton star_green2 = factory.createPiece(1, "star.png").getButton();
	JButton cross_green1 = factory.createPiece(2, "cross.png").getButton();
	JButton cross_green2 = factory.createPiece(2, "cross.png").getButton();
	JButton heart_green = factory.createPiece(3, "heart.png").getButton();
	JButton box_green1 = factory.createPiece(4, "Box.png").getButton();
	JButton box_green2 = factory.createPiece(4, "Box.png").getButton();
	JButton box_green3 = factory.createPiece(4, "Box.png").getButton();
	//variables to save the name of the pieces
	String star2 = "starRed.png";
		String cross2 = "crossRed.png";
		String heart2 = "heartRed.png";

		
			String boxname2 = "RedBox.png";
	String boxname2_1  = "RedBox.png";
		String boxname2_2 = "RedBox.png";
		String boxname2_3  = "RedBox.png";
	
	// create button contain the pieces using abstract factory desing pattern
	JButton star_Red1 = factory.createPiece(1, "starRed.png").getButton();
	JButton star_Red2 = factory.createPiece(1, "starRed.png").getButton();
	JButton cross_Red1 = factory.createPiece(2, "crossRed.png").getButton();
	JButton cross_Red2 = factory.createPiece(2, "crossRed.png").getButton();
	JButton heart_Red = factory.createPiece(3, "heartRed.png").getButton();
	JButton box_Red1 = factory.createPiece(4, "RedBox.png").getButton();
	JButton box_Red2 = factory.createPiece(4, "RedBox.png").getButton();
	JButton box_Red3 = factory.createPiece(4, "RedBox.png").getButton();
	
	// create objects of the pieces
	Star star = new Star();
	Cross cross = new Cross();
	Heart heart = new Heart();
	Box box1 = new Box();
	Box box1_1 = new Box();
	Box box1_2 = new Box();
	Box box1_3 = new Box();
	Box box2 = new Box();
	Box box2_1 = new Box();
	Box box2_2 = new Box();
	Box box2_3 = new Box();

	
	Board(){
		box2_3.setmove(new BoxmoveDwon());
					 box2_1.setmove(new BoxmoveDwon());
				   box2_2.setmove(new BoxmoveDwon());
				   // intilaze data for the players 
	firstPlayer.setId(1);
	secondPlayer.setId(2);
	savebtn.addActionListener(saveListener);
	helpbtn.addActionListener(saveListener);
	quitbtn.addActionListener(saveListener);
		panel.setLayout(new GridLayout(8,5));
	
		firstPlayer.setState(true);
		secondPlayer.setState(false);
		
		load();
		
		
	
		
		
		// to add buttons into the board
	for(int i=0; i< 8; i++)
	{
		for(int j =0; j < 5; j++){
			grid[i][j] = new Square();
		
			grid[i][j].set_Row_Number(i);
			grid[i][j].set_Column_Number(j);
			
		
			
			if(i == 0 && j == 0){
			
			// to add button into the board and set the piece to be from first player pieces
				grid[i][j].set_Button(star_green1);
				firstPlayer.setButton(0, star_green1);
			}
			
			else if(i == 0 && j == 4){
					// to add button into the board and set the piece to be from first player pieces
				grid[i][j].set_Button(star_green2);
				firstPlayer.setButton(1, star_green2);
			}
			
			else if(i == 0 &&j == 1){
					// to add button into the board and set the piece to be from first player pieces
				grid[i][j].set_Button(cross_green1);
				firstPlayer.setButton(2, cross_green1);
			}
			else if(i == 0 && j == 3){
					// to add button into the board and set the piece to be from first player pieces
				grid[i][j].set_Button(cross_green2);
				firstPlayer.setButton(3, cross_green2);
			}
			
			
			else if(i == 0 && j == 2){
					// to add button into the board and set the piece to be from first player pieces
				grid[i][j].set_Button(heart_green);
				firstPlayer.setButton(4, heart_green);
			}
			
			
			else if(i == 1 && j == 1){
					// to add button into the board and set the piece to be from first player pieces
				grid[i][j].set_Button(box_green1);
				firstPlayer.setButton(5, box_green1);
			}
			else if(i == 1 && j == 2){
					// to add button into the board and set the piece to be from first player pieces
				grid[i][j].set_Button(box_green2);
				firstPlayer.setButton(6, box_green2);
			}
			else if(i == 1 && j == 3){
					// to add button into the board and set the piece to be from first player pieces
				grid[i][j].set_Button(box_green3);
				firstPlayer.setButton(7, box_green3);
			}
			
			
			
			else if(i == 7 && j == 0)
			{
					// to add button into the board and set the piece to be from Secondplayer pieces
				grid[i][j].set_Button(star_Red1);
				secondPlayer.setButton(0, star_Red1);
				
			}
			else if(i == 7 && j == 4){
				// to add button into the board and set the piece to be from Secondplayer pieces
				grid[i][j].set_Button(star_Red2);
				secondPlayer.setButton(1, star_Red2);
			}
			
			
			else if(i == 7 && j == 1){
				// to add button into the board and set the piece to be from Secondplayer pieces
				grid[i][j].set_Button(cross_Red1);
				secondPlayer.setButton(2, cross_Red1);
			}
			else if(i == 7 && j == 3){
				// to add button into the board and set the piece to be from Secondplayer pieces
				grid[i][j].set_Button(cross_Red2);
				secondPlayer.setButton(3, cross_Red2);
			}
			
			
			else if(i == 7 && j == 2){
				// to add button into the board and set the piece to be from Secondplayer pieces
				grid[i][j].set_Button(heart_Red);
				secondPlayer.setButton(4, heart_Red);
			}
				
				else if(i == 6 && j == 1){
					// to add button into the board and set the piece to be from Secondplayer pieces
				grid[i][j].set_Button(box_Red1);
				secondPlayer.setButton(5, box_Red1);
			}
			
				else if(i == 6 && j == 2){
					// to add button into the board and set the piece to be from Secondplayer pieces
				grid[i][j].set_Button(box_Red2);
				secondPlayer.setButton(6, box_Red2);
			}
			
				else if(i == 6 && j == 3){
					// to add button into the board and set the piece to be from Secondplayer pieces
				grid[i][j].set_Button(box_Red3);
				secondPlayer.setButton(7, box_Red3);
			}
			
			
			
			
			
			else 
				// to add the button the board
				grid[i][j].set_Button(new JButton(""));
			grid[i][j].get_Button().addActionListener(listener);
			// to set colour of the button in the board
			if(i % 2 == 0){
				if(j == 1 || j == 3)
			grid[i][j].get_Button().setBackground(new Color(255,245,213));
		else 
			grid[i][j].get_Button().setBackground(Color.white);
			}
			else{
				if(j == 0 || j == 2 || j == 4)
			grid[i][j].get_Button().setBackground(new Color(255,245,213));
		else 
			grid[i][j].get_Button().setBackground(Color.white);
			}
			panel.add(grid[i][j].get_Button());
		
			
		}
	}
  
	}
	// to return jpanel
	public JPanel getJPanel(){
		return panel;
	}
	
	
	// to loead data for saved game 
		public void load(){
			savedgame.clear();
		java.io.File file = new java.io.File("save.txt");
		try{
			
			Scanner input1 = new Scanner (file);
			while(input1.hasNext())
			{
			SavedGame game = new SavedGame();
			game.setGameId(input1.nextInt());
			game.getFirstplayer().setplayerId(input1.nextInt());
			
			game.getFirstplayer().setSavedRole(input1.nextInt());
			int boo1 = input1.nextInt();
			
			if(boo1 == 1)
				game.getFirstplayer().setSavedState(true);
			else 
				game.getFirstplayer().setSavedState(false);
			// to loead first player data
			for(int i=0; i < 8; i++){
			game.getFirstplayer().getPiece(i).setvbit(input1.nextInt());
			game.getFirstplayer().getPiece(i).setPieceNumber(input1.nextInt());
			game.getFirstplayer().getPiece(i).setRowSaved(input1.nextInt());
			game.getFirstplayer().getPiece(i).setColumnSaved(input1.nextInt());
			game.getFirstplayer().getPiece(i).setPieceName(input1.next());
			}
			
			game.getSecondplayer().setplayerId(input1.nextInt());
			game.getSecondplayer().setSavedRole(input1.nextInt());
			int boo2 = input1.nextInt();
			
			if(boo2 == 1)
				game.getSecondplayer().setSavedState(true);
			else 
				game.getSecondplayer().setSavedState(false);
			// to lead seond player data 
			for(int i=0; i < 8; i++){
			game.getSecondplayer().getPiece(i).setvbit(input1.nextInt());
			game.getSecondplayer().getPiece(i).setPieceNumber(input1.nextInt());
			game.getSecondplayer().getPiece(i).setRowSaved(input1.nextInt());
			game.getSecondplayer().getPiece(i).setColumnSaved(input1.nextInt());
			game.getSecondplayer().getPiece(i).setPieceName(input1.next());
			}
			
			savedgame.add(game);
				
			
			}
		
		input1.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		}
		
		
		
			int temp = 0;
			// to load the name of the players form the file info
		java.io.File file1 = new java.io.File("info.txt");
		try{
			
			Scanner input2 = new Scanner (file1);
			
			while(input2.hasNext())
			{
			
				String firstName = input2.next();
				String seconName = input2.next();
				
				if(temp < savedgame.size()){
					savedgame.get(temp).getFirstplayer().setSavedName(firstName);
					savedgame.get(temp).getSecondplayer().setSavedName(seconName);
				}
				temp++;
			}
			input2.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		}
		
		
	}
	
	
	
	// north jpanel ot add the north jpanel
	public JPanel northPanel(){
				JPanel dashboard = new JPanel(new BorderLayout());		
		
		JPanel elapsedTime = new JPanel();
		
		JLabel minute = new JLabel();
        JLabel hour = new JLabel();
        JLabel millisecond = new JLabel();
        JLabel second = new JLabel();
		// to add the timer for the game
		minute.setText("00 :");
		hour.setText("00 :");
		
		second.setText("00");
		
		elapsedTime.add(hour);
		elapsedTime.add(minute);	
		elapsedTime.add(second);	
		elapsedTime.add(millisecond);

		Thread t = new Thread()
        {
           int milliseconds = 0;
			int seconds = 0;
			int minutes = 0;
			int hours = 0;
			boolean state = true;
		   @Override
       
           public void run()
           {
              for(;;)
              {
                if (state == true)
                {
                  try
                  {
                    sleep(1);
                    if(milliseconds > 650)
                    {
                       milliseconds = 0;
                       seconds ++;
                    }
                    if(seconds > 60)
                    {
                       milliseconds = 0;
                       seconds = 0;
                       minutes ++;
                    }
                    if(minutes > 60)
                    {
                       milliseconds = 0;
                       seconds = 0; 
                       minutes = 0;
                       hours ++;
                    }
                  
                    milliseconds ++;
                    second.setText(" : " + seconds);
                    minute.setText(" : " + minutes);
                    hour.setText("" + hours);
                  }
                  catch(Exception e)
                  {
                     
                  }
                }
                else break;
              }
           }
        };
		// to start the timer
        t.start();
	GameInitializer.re(this);
	if(firstPlayer.getName().equals(" ") == true && secondPlayer.getName().equals(" ") == true)
	GameInitializer.re2(this);
		JPanel players = new JPanel(new FlowLayout());
		JLabel player1 = new JLabel(firstPlayer.getName()+"");
		System.out.println(firstPlayer.getName());
		JLabel player2 = new JLabel(secondPlayer.getName()+"");
		player2.setForeground(Color.red);
		player1.setForeground(new Color(0,100,0));
		players.add(player1);
		players.add(new JLabel(" VS "));
		players.add(player2);		
	
		JPanel menu = new JPanel(new FlowLayout());
		menu.add(savebtn);
		menu.add(helpbtn);
		menu.add(quitbtn);
		
		dashboard.add(elapsedTime, BorderLayout.WEST);
		dashboard.add(players, BorderLayout.CENTER);
		dashboard.add(menu, BorderLayout.EAST);		
		return dashboard;
	}
	
	// to check if the sart able to move the selected button 
	public boolean starAblbleToMove(int column,int  row, int source_row, int source_column){
		 for(int i = 0; i < 8; i++){
						   for(int j=0; j < 5; j++){
							   if((firstPlayer.check(grid[i][j].get_Button()) == true)||(secondPlayer.check(grid[i][j].get_Button()) == true)){
								   if((row - i == 1)&&(i - source_row == 1)&&(column == j)&&(j == source_column)){
									   return false;
									  
								   }
								   else if((source_row - i == 1) && (i - row == 1)&&(column == j)&&(j == source_column)){
									    return  false;
										 
								   }
									  else if((source_column - j == 1) && (j - column == 1)&&(row == i)&&(i == source_row)){
									    return  false;
										
									  }
									  else if((column - j == 1) && (j - source_column == 1)&&(row == i)&&(i == source_row)){
									    return  false;
										 
									  }
										else  if((column - j == 1)&&(j - source_column == 1)&&(row - i == 1) && (i - source_row == 1))
									   return false;
								   else if((source_column - j == 1) && (j - column == 1) && (source_row - i == 1) &&(i - row == 1))
									   return false;
								   else if((row - i == -1) && (i - source_row == -1) && (column - j == 1) &&(j - source_column == 1))
									   return false;
								   else if((source_column - j == 1)&&(j - column == 1) && (row - i == 1) && ( i - source_row == 1))
									   return false;
							   }
						   }
					   }
					      return true;
	}
	
	// to check if the box able to mvoe the selected button 
	public boolean boxupAblbleToMove(int column,int  row, int source_row, int source_column){
		 for(int i = 0; i < 8; i++){
						   for(int j=0; j < 5; j++){
							   if((firstPlayer.check(grid[i][j].get_Button()) == true)||secondPlayer.check(grid[i][j].get_Button())){
								   if((row - i == 1)&&(i - source_row == 1)&&(column == j)&&(j == source_column))
									   return false;
							   }
						   }
					   }
					      return true;
	}
	
	// to check if the box able to move the selected button
	public boolean boxdwonAblbleToMove(int column,int  row, int source_row, int source_column){
		 for(int i = 0; i < 8; i++){
						   for(int j=0; j < 5; j++){
							   if((secondPlayer.check(grid[i][j].get_Button()) == true)|| (firstPlayer.check(grid[i][j].get_Button()) == true)){
								 if((source_row - i == 1) && (i - row == 1)&&(column == j)&&(j == source_column)){
									    return  false;
										 
								   }
							   }
						   }
					   }
					      return true;
	}
	
	// to check if the cross able to move the selecte button 
	public boolean crossAbleToMove(int column,int  row, int source_row, int source_column){
		 	   for(int i = 0; i < 8; i++){
						   for(int j=0; j < 5; j++){
							   if((firstPlayer.check(grid[i][j].get_Button()) == true)||(secondPlayer.check(grid[i][j].get_Button()) == true)){
								   if((column - j == 1)&&(j - source_column == 1)&&(row - i == 1) && (i - source_row == 1))
									   return false;
								   else if((source_column - j == 1) && (j - column == 1) && (source_row - i == 1) &&(i - row == 1))
									   return false;
								   else if((row - i == -1) && (i - source_row == -1) && (column - j == 1) &&(j - source_column == 1))
									   return false;
								   else if((source_column - j == 1)&&(j - column == 1) && (row - i == 1) && ( i - source_row == 1))
									   return false;
								   else if((Math.abs(source_column - j) == 2)&&(Math.abs(source_row - i ) == 2) && (Math.abs(column - j) == 1) && (Math.abs(row - i ) == 1)
									   &&(Math.abs(source_column - column) == 3) && (Math.abs(source_row - row) == 3)) {
									   System.out.println(source_column + " " + j);
									   return false;
								   }
								    else if((Math.abs(source_column - j) == 2)&&(Math.abs(source_row - i ) == 2) && (Math.abs(column - j) == 2) && (Math.abs(row - i ) == 2)
									   &&(Math.abs(source_column - column) == 4) && (Math.abs(source_row - row) == 4)) {
									   System.out.println(source_column + " " + j);
									   return false;
								   }
								    else if((Math.abs(source_column - j) == 1)&&(Math.abs(source_row - i ) == 1) && (Math.abs(column - j) == 2) && (Math.abs(row - i ) == 2)
									   &&(Math.abs(source_column - column) == 3) && (Math.abs(source_row - row) == 3)) {
									   System.out.println(source_column + " " + j);
									   return false;
								   }
								     else if((Math.abs(source_column - j) == 1)&&(Math.abs(source_row - i ) == 1) && (Math.abs(column - j) == 3) && (Math.abs(row - i ) == 3)
									   &&(Math.abs(source_column - column) == 4) && (Math.abs(source_row - row) == 4)) {
									   System.out.println(source_column + " " + j);
									   return false;
								   }
								     else if((Math.abs(source_column - j) == 3)&&(Math.abs(source_row - i ) == 3) && (Math.abs(column - j) == 1) && (Math.abs(row - i ) == 1)
									   &&(Math.abs(source_column - column) == 4) && (Math.abs(source_row - row) == 4)) {
									   System.out.println(source_column + " " + j);
									   return false;
								   }
							
							   }
						   }
					   }
					   return true;
	}
	// to change the cross to start and start to cross of first player after turn 4
	public void turn1(int greenStarColumn1, int greenStarColumn2,int greenStarRow1, int greenStarRow2,int greenCrossColumn1,int greenCrossColumn2,int greenCrossRow1,int greenCrossRow2){
		if(firstPlayer.getButton(0) != null)
	     	grid[greenStarRow1][greenStarColumn1].get_Button().setIcon(new ImageIcon("cross.png"));
		if(firstPlayer.getButton(1) != null)
			grid[greenStarRow2][greenStarColumn2].get_Button().setIcon(new ImageIcon("cross.png"));
		if(firstPlayer.getButton(2) != null){
			grid[greenCrossRow1][greenCrossColumn1].get_Button().setIcon(new ImageIcon("star.png"));
			System.out.println("1h");
		}
		if(firstPlayer.getButton(3) != null)	{	
			grid[greenCrossRow2][greenCrossColumn2].get_Button().setIcon(new ImageIcon("star.png"));
			System.out.println(greenCrossRow2 + " " + greenCrossColumn2);
		}

				
						
				// to change the star movement to cross movement and cross  movement to star movement.
			star.setmove(new Crossmove());
			cross.setmove(new Starmove());
			if(firstPlayer.getButton(0) != null)
			firstPlayer.setButton(0,grid[greenStarRow1][greenStarColumn1].get_Button());
		if(firstPlayer.getButton(1) != null)
			firstPlayer.setButton(1, grid[greenStarRow2][greenStarColumn2].get_Button());
		if(firstPlayer.getButton(2) != null)
				firstPlayer.setButton(2,grid[greenCrossRow1][greenCrossColumn1].get_Button());
			if(firstPlayer.getButton(3) != null)
			firstPlayer.setButton(3, grid[greenCrossRow2][greenCrossColumn2].get_Button());
		
	}
	// // to change the cross to start and start to cross of first player after turn 4
		public void turn2(int redStarColumn1, int redStarColumn2, int redStarRow1, int redStarRow2, int redCrossColumn1,int redCrossColumn2,int redCrossRow1,int redCrossRow2){
		if(secondPlayer.getButton(0) != null)
		grid[redStarRow1][redStarColumn1].get_Button().setIcon(new ImageIcon("crossRed.png"));
	     if(secondPlayer.getButton(1) != null)
			grid[redStarRow2][redStarColumn2].get_Button().setIcon(new ImageIcon("crossRed.png"));
		if(secondPlayer.getButton(2) != null)
			grid[redCrossRow1][redCrossColumn1].get_Button().setIcon(new ImageIcon("starRed.png"));	
		if(secondPlayer.getButton(3) != null)
			grid[redCrossRow2][redCrossColumn2].get_Button().setIcon(new ImageIcon("starRed.png"));
		
		
			// to change the star movement to cross movement and cross  movement to star movement.
			star.setmove(new Crossmove());
			cross.setmove(new Starmove());
		
			if(secondPlayer.getButton(0) != null)
			secondPlayer.setButton(0,grid[redStarRow1][redStarColumn1].get_Button());
		if(secondPlayer.getButton(1) != null)
			secondPlayer.setButton(1, grid[redStarRow2][redStarColumn2].get_Button());
		if(secondPlayer.getButton(2) != null)
				secondPlayer.setButton(2,grid[redCrossRow1][redCrossColumn1].get_Button());
			if(secondPlayer.getButton(3) != null);
				secondPlayer.setButton(3, grid[redCrossRow2][redCrossColumn2].get_Button());
		}
		
	
	// to kill the piece of player and declear the winer for first player 
	public void Killed1(int row, int column){
		int pieceKilled;
		  if(secondPlayer.check(grid[row][column].get_Button()) == true){
			  StringBuilder mo3  = new StringBuilder (firstPlayer.getName());
					for(int i = 0 ; i < mo3.length(); i++)
						if(mo3.charAt(i) == '_')
						{
								mo3.setCharAt(i , ' ');
						}
		
							   pieceKilled = secondPlayer.getpieceNumber(grid[row][column].get_Button());
							   if(pieceKilled == 4){
								  JOptionPane.showMessageDialog(null,mo3 +" win");
								  System.exit(0);
							   }
							   secondPlayer.setButton(pieceKilled, null);
							  System.out.println("Dd");
							   secondPlayer.setbit(pieceKilled, 3);
							     
						   }
	}
	
	// to kill the piece of player and declear the winer for second Player
	public void Killed2(int row, int column){
		int pieceKilled;
		  if(firstPlayer.check(grid[row][column].get_Button()) == true){
			  StringBuilder mo4  = new StringBuilder (secondPlayer.getName());
					for(int i = 0 ; i < mo4.length(); i++)
						if(mo4.charAt(i) == '_')
						{
								mo4.setCharAt(i , ' ');
						}
							   pieceKilled = firstPlayer.getpieceNumber(grid[row][column].get_Button());
							     if(pieceKilled == 4){
								  JOptionPane.showMessageDialog(null,mo4 + " win");
								  System.exit(0);
							   }
							   firstPlayer.setButton(pieceKilled, null);
							   
							 firstPlayer.setbit(pieceKilled, 3);
							  
						   }
	}
	
	
	// acction listener to be add the the buttons in the board
	 public ActionListener listener = new ActionListener() {
        
		JButton move1 = new JButton();
		
		
		int number = 20;
		
	// intial variables of the board
		int different_column = 0;
		int different_columnSource = 0;
		int different_row =0;
		int different_rowsource = 0;
		boolean notturn2 = true;
		
		

		int source_column = 3;
		int source_row = 3;
		boolean ableToMove;
	
		@Override
		// to check if action perfromed 
        public void actionPerformed(ActionEvent e) {
			
			JButton b = (JButton)e.getSource();
			if(dontTurn == true && firstPlayer.getRole() >= 4 && secondPlayer.getRole() >= 4){
		star.setmove(new Crossmove());
			cross.setmove(new Starmove());
			
	}
	dontTurn = false;
	// to intialze the name of the players 
			StringBuilder mo2  = new StringBuilder (secondPlayer.getName());
					for(int i = 0 ; i < mo2.length(); i++)
						if(mo2.charAt(i) == '_')
						{
								mo2.setCharAt(i , ' ');
						}
						
						StringBuilder mo  = new StringBuilder (firstPlayer.getName());
					for(int i = 0 ; i < mo.length(); i++)
						if(mo.charAt(i) == '_')
						{
								mo.setCharAt(i , ' ');
						}
			for(int row = 0; row < 8; row++){
				
				for(int column = 0; column < 5; column++){
					

					// to get the source of the selected piece 
					if(e.getSource() == grid[row][column].get_Button()){
						if(firstPlayer.getState() == false )
		if(firstPlayer.check(grid[row][column].get_Button()) == true&&secondPlayer.check(grid[source_row][source_column].get_Button()) == false)
						JOptionPane.showMessageDialog(null," Sorry " + mo2 + "'s Turn ");
		
						
				// to check if the first player role
		     	if(firstPlayer.getState() == true&& secondPlayer.getState() == false  ){
			
					 if(secondPlayer.check(grid[row][column].get_Button()) == true &&firstPlayer.check(grid[source_row][source_column].get_Button()) == false)
						JOptionPane.showMessageDialog(null," Sorry" + mo + "'s Turn ");
							  
			   if(firstPlayer.check(grid[row][column].get_Button()) == true){
				  
				  // to save the data of the selected piece 
			   move1 = grid[row][column].get_Button();
		 
			   source_row = row;
			  
			   source_column = column;
			   notturn = false;
			// to save the nameber of the piece 
			   number = firstPlayer.getpieceNumber(grid[row][column].get_Button());  
			 
		   }
       
		   
		   else 
       {
         different_column = column - source_column;
				 different_row = row - source_row;
// to check if number equal ot 0 or 1 
         if(number == 0 || number == 1){
         // to check if the start can move
				  if(star.move(different_column, different_row) == true)
				   {
					   
					   
					      ableToMove = true;
					   if(firstPlayer.getRole() < 4){
					ableToMove = starAblbleToMove(column, row, source_row, source_column);
					   }
					   else
					   {
						ableToMove = crossAbleToMove(column,  row,  source_row, source_column);
					   }
					   
					
					   if(ableToMove == true){
						// to check if first player role more than 4
						   if(firstPlayer.getRole() < 4){
							   // to change name of piece 
			   grid[row][column].get_Button().setIcon(new ImageIcon("star.png"));
			   star1 = "star.png";
						   }
		   else {
			   // to change name of piece 
			    grid[row][column].get_Button().setIcon(new ImageIcon("cross.png"));
				
		
		   }
			   // to set the source button to null image 
			   grid[source_row][source_column].get_Button().setIcon(new ImageIcon(" "));
			
			   firstPlayer.setButton(number, b);
			 
			
			   firstPlayer.setState(false);
			      secondPlayer.setState(true);
				  firstPlayer.setRole(firstPlayer.getRole() + 1);
				  if(number == 0){
					  greenStarColumn1 = column;
					  greenStarRow1 = row;
				  }
				  else if(number == 1){
					  greenStarColumn2 = column;
					  greenStarRow2 = row;
				  }
				  // implement kill method
				  Killed1(row, column);
				  
				     number = 20;
					 
					   }
				   }
			   }
			   // to check if number equal to 2 or 3
			         else if(number == 2 || number == 3){ 
				// to check if cross can move to the selected piece 
				   if(cross.move(different_column, different_row) == true)
				   {
					   
					   ableToMove = true;
					   if(firstPlayer.getRole() < 4){
					 ableToMove = crossAbleToMove(column,  row,  source_row, source_column);
					   }
					  else
					   {
						ableToMove = starAblbleToMove(column,  row,  source_row, source_column);
					   }
					   
					
					   if(ableToMove == true){
						   // to check if the role less than 4
						   if(secondPlayer.getRole() < 4){
			   grid[row][column].get_Button().setIcon(new ImageIcon("cross.png"));
			   cross1 = "cross.png";
						   }
		   else {
			   // to move the piece 
			   grid[row][column].get_Button().setIcon(new ImageIcon("star.png"));
			  
			  
		   }
			   // to set the button of source button to null image 
			   grid[source_row][source_column].get_Button().setIcon(new ImageIcon(""));
			  
			   firstPlayer.setButton(number, b);
			 
			   // to set stat of first player to false 
			   firstPlayer.setState(false);
			      secondPlayer.setState(true);
				  firstPlayer.setRole(firstPlayer.getRole() + 1);
				  // to save data of the cross 
				  if(number == 2){
					  greenCrossColumn1 = column;
					  greenCrossRow1 = row;
				  }
				  else if(number == 3){
					  greenCrossColumn2 = column;
					  greenCrossRow2 = row;
				  }
				   Killed1(row, column);
				  number = 20;
					   }
				   }
			   }
			   
			        else if(number == 4) 
          { 
				  
				   if(heart.move(different_column, different_row) == true) {
					    grid[row][column].get_Button().setIcon(new ImageIcon("heart.png"));
			        grid[source_row][source_column].get_Button().setIcon(new ImageIcon(" "));
			        firstPlayer.setButton(number, b);
			        
			        firstPlayer.setState(false);
			        secondPlayer.setState(true);
				 firstPlayer.setRole(firstPlayer.getRole() + 1);
				 greenHeartRow = row;
		 greenHeartCoulmn = column;
		 Killed1(row,column);
				 number = 20;
				    }
			     
				  }
				  
				  // to check if the number of piece is 5, 6, or 7
				  else if(number == 5 || number == 7 || number == 6){
					  	if (number == 5){
					box1 = box1_1;
					boxname1 = boxname1_1;
						}
				else if(number == 6){
					box1 = box1_2;
					boxname1 = boxname1_2;
				}
				else {
					box1 = box1_3;
					boxname1 = boxname1_3;
				}
				// to check if box can move
					   if(box1.move(different_column, different_row) == true){ 
					   ableToMove = true;
					   if(boxstate == true)
						   ableToMove = boxupAblbleToMove(column,  row,  source_row, source_column);
					   else 
						   ableToMove = boxdwonAblbleToMove(column,  row,  source_row, source_column);
					   
						   	   if(ableToMove == true){
						   if(row == 7){
							   boxstate = false;
							   // to change box image 
			   
			   if(number == 5){
				   box1_1.setmove(new BoxmoveDwon());
				   boxname1_1 = "Box2.png";
				   boxname1 = boxname1_1;
			   }
			   else if(number == 6){
				   box1_2.setmove(new BoxmoveDwon());
				   boxname1_2 = "Box2.png";
				   boxname1 = boxname1_2;
			   }
			   else {
				    box1_3.setmove(new BoxmoveDwon());
					boxname1_3 = "Box2.png";
					boxname1 = boxname1_3;
			   }
			   
			   
						   }
						   if(row == 0){
							   
							    if(number == 5){
				   box1_1.setmove(new BoxmoveUp());
				   boxname1_1 = "Box.jpg";
				   boxname1 = boxname1_1;
								}
			   else if(number == 6){
				   box1_2.setmove(new BoxmoveUp());
				 boxname1_2  = "Box.jpg";
				 boxname1 = boxname1_2;
			   }
			   else {
				    box1_3.setmove(new BoxmoveUp());
					boxname1_3 = "Box.jpg";
					boxname1 = boxname1_3;
			   }
							   boxstate = true;
						   }
		  
			   grid[row][column].get_Button().setIcon(new ImageIcon(boxname1));
			  
		   System.out.println(boxname1);
		
			   grid[source_row][source_column].get_Button().setIcon(new ImageIcon(""));
			  
			   firstPlayer.setButton(number, b);
			 
			   
			   firstPlayer.setState(false);
			      secondPlayer.setState(true);
				  firstPlayer.setRole(firstPlayer.getRole() + 1);
				  if(number == 5){
					  greenBox1Column = column;
					  greenBox1Row = row;
				  }
				  else if(number == 6){
					  greenBox2Column = column;
					  greenBox2Row = row;
				  }
				   else if(number == 7){
					  greenBox3Column = column;
					  greenBox3Row = row;
				  }
				  Killed1(row,column);
				  number = 20;
					   }
					   }
				  }
				  
         
       
      
         }
		 
		 
          
        }
		
				if(secondPlayer.getState() == true && firstPlayer.getState() == false){
				
						if(secondPlayer.check(grid[row][column].get_Button()) == true){
			   move1 = grid[row][column].get_Button();
			   source_row = row;
			   source_column = column;
			   number = secondPlayer.getpieceNumber(grid[row][column].get_Button());
			   
		   }
		   		   else{  
             different_column = column - source_column;
				     different_row = row - source_row;
				    
                    
				   if(number == 0 || number == 1){
       
				  if(star.move(different_column, different_row) == true)
				   {
					      if(secondPlayer.getRole() < 4){
					 ableToMove = starAblbleToMove(column, row, source_row, source_column);
					   }
					   else
					   {
						ableToMove = crossAbleToMove(column,  row,  source_row, source_column);
					   }
					   if(ableToMove == true){
						
						   if(secondPlayer.getRole() < 4){
			       grid[row][column].get_Button().setIcon(new ImageIcon("starRed.png"));
				   star2 = "starRed.png";
						   }
			   else{
				     grid[row][column].get_Button().setIcon(new ImageIcon("crossRed.png"));
					 
				
			   }
			       grid[source_row][source_column].get_Button().setIcon(new ImageIcon(" "));
			   
			       secondPlayer.setButton(number, b);
			       secondPlayer.setState(false);
			       firstPlayer.setState(true);
				 secondPlayer.setRole(secondPlayer.getRole() + 1);
				  if(number == 0){
					  redStarColumn1 = column;
					  redStarRow1 = row;
					  
				  }
				  else if(number == 1){
					  redStarColumn2 = column;
					  redStarRow2 = row;
				  }
				  
				   if(firstPlayer.getRole() == 4 && secondPlayer.getRole() == 4){
		 turn1( greenStarColumn1, greenStarColumn2, greenStarRow1, greenStarRow2, greenCrossColumn1, greenCrossColumn2, greenCrossRow1, greenCrossRow2);
		 turn2( redStarColumn1, redStarColumn2, redStarRow1,  redStarRow2, redCrossColumn1, redCrossColumn2, redCrossRow1, redCrossRow2);
						 star1 = "cross.png";
						 cross1 = "star.png";
						 star2 = "crossRed.png";
						 cross2 = "starRed.png";
					 }
	Killed2(row,column);
				     number = 20;
					 
					   }
				   }
			   }
         
              
         else if(number == 2 || number == 3) 
          { 
				   if(cross.move(different_column, different_row) == true)
				    {
						boolean ableToMove = true;
						   if(secondPlayer.getRole() < 4){
					ableToMove = crossAbleToMove(column,  row,  source_row, source_column);
					   }
					   				else{
					ableToMove = starAblbleToMove(column,  row,  source_row, source_column);
					   }
					 
					 if(ableToMove == true){
						 
						 if(secondPlayer.getRole()< 4){
					    grid[row][column].get_Button().setIcon(new ImageIcon("crossRed.png"));
						cross2 = "crossRed.png";
						 }
					else{
					grid[row][column].get_Button().setIcon(new ImageIcon("starRed.png"));
						
				
					}
			        grid[source_row][source_column].get_Button().setIcon(new ImageIcon(""));
			        secondPlayer.setButton(number, b);
			        firstPlayer.setState(true);
			        secondPlayer.setState(false);
					secondPlayer.setRole(secondPlayer.getRole() + 1);
					  if(number == 2){
					  redCrossColumn1 = column;
					  redCrossRow1 = row;
				  }
				  else if(number == 3){
					  redCrossColumn2 = column;
					  redCrossRow2 = row;
				  }
				  
				   if(firstPlayer.getRole() == 4 && secondPlayer.getRole() == 4){
					   	
		 turn1( greenStarColumn1, greenStarColumn2, greenStarRow1, greenStarRow2, greenCrossColumn1, greenCrossColumn2, greenCrossRow1, greenCrossRow2);
		 turn2( redStarColumn1, redStarColumn2, redStarRow1,  redStarRow2, redCrossColumn1, redCrossColumn2, redCrossRow1, redCrossRow2);
		                 star1 = "cross.png";
						 cross1 = "star.png";
						 star2 = "crossRed.png";
						 cross2 = "starRed.png";
					
					 }
					Killed2(row,column);
				  number = 20;
				  
					 }
				    }
          }
   
            else if(number == 4) 
          { 
				  if(heart.move(different_column , different_row) == true)
				    {
						     Killed2(row, column);
					    grid[row][column].get_Button().setIcon(new ImageIcon("heartRed.png"));
			        grid[source_row][source_column].get_Button().setIcon(new ImageIcon(""));
			        secondPlayer.setButton(number, b);
			        number = 20;
			        firstPlayer.setState(true);
			        secondPlayer.setState(false);
					redHeartRow = row;
					redHeartCoulmn = column;
					secondPlayer.setRole(secondPlayer.getRole() + 1);
			 if(firstPlayer.getRole() == 4 && secondPlayer.getRole() == 4){
				 	 
		 turn1( greenStarColumn1, greenStarColumn2, greenStarRow1, greenStarRow2, greenCrossColumn1, greenCrossColumn2, greenCrossRow1, greenCrossRow2);
		 turn2( redStarColumn1, redStarColumn2, redStarRow1,  redStarRow2, redCrossColumn1, redCrossColumn2, redCrossRow1, redCrossRow2);
		 star1 = "cross.png";
						 cross1 = "star.png";
						 star2 = "crossRed.png";
						 cross2 = "starRed.png";
					
					 }
	
					
				    }
          }
		  
		    else if(number == 5 || number == 7 || number == 6){
					  	if (number == 5){
					box2 = box2_1;
					boxname2 = boxname2_1;
						}
				else if(number == 6){
					box2 = box2_2;
					boxname2 = boxname2_2;
				}
				else {
					box2 = box2_3;
					boxname2 = boxname2_3;
				}
					   if(box2.move(different_column, different_row) == true){ 
					   ableToMove = true;
					   if(boxstate2 == true)
						   ableToMove = boxdwonAblbleToMove(column,  row,  source_row, source_column);
					   else 
						   ableToMove = boxupAblbleToMove(column,  row,  source_row, source_column);
					   
						   	   if(ableToMove == true){
						   if(row == 7){
			   
			  if(number == 5){
				   box2_1.setmove(new BoxmoveDwon());
				   boxname2_1 = "RedBox2.png";
				   boxname2 = boxname2_1;
			   }
			   else if(number == 6){
				   box2_2.setmove(new BoxmoveDwon());
				   boxname2_2 = "RedBox2.png";
				   boxname2 = boxname2_2;
			   }
			   else {
				    box2_3.setmove(new BoxmoveDwon());
					boxname2_3 = "RedBox2.png";
					boxname2 = boxname2_3;
			   }
			  boxstate2 = true;
			   
			   
						   }
						   if(row == 0){
							   boxname2 = "RedBox2.png";
							    if(number == 5){
				   box2_1.setmove(new BoxmoveUp());
				   boxname2_1 = "RedBox2.png";
				   boxname2 = boxname2_1;
								}
			   else if(number == 6){
				   box2_2.setmove(new BoxmoveUp());
				 boxname2_2  = "RedBox2.png";
				 boxname2 = boxname2_2;
			   }
			   else {
				    box2_3.setmove(new BoxmoveUp());
					boxname2_3 = "RedBox2.png";
					boxname2 = boxname2_3;
			   }
							   boxstate2 = false;
						   }
		  
			   grid[row][column].get_Button().setIcon(new ImageIcon(boxname2));
			  
		   
			
			   grid[source_row][source_column].get_Button().setIcon(new ImageIcon(""));
			   
			   secondPlayer.setButton(number, b);
			  
			   
			   firstPlayer.setState(true);
			      secondPlayer.setState(false);
				  secondPlayer.setRole(secondPlayer.getRole() + 1);
				  if(number == 5){
					  redBox1Column = column;
					  redBox1Row = row;
				  }
				  else if(number == 6){
					  redBox2Column = column;
					  redBox2Row = row;
				  }
				   else if(number == 7){
					  redBox3Column = column;
					  redBox3Row = row;
				  }
				  
				  if(firstPlayer.getRole() == 4 && secondPlayer.getRole() == 4){
					  
		 turn1( greenStarColumn1, greenStarColumn2, greenStarRow1, greenStarRow2, greenCrossColumn1, greenCrossColumn2, greenCrossRow1, greenCrossRow2);
		 turn2( redStarColumn1, redStarColumn2, redStarRow1,  redStarRow2, redCrossColumn1, redCrossColumn2, redCrossRow1, redCrossRow2);
		 	 star1 = "cross.png";
						 cross1 = "star.png";
						 star2 = "crossRed.png";
						 cross2 = "starRed.png";
					
					 }
					 Killed2(row,column);
				  number = 20;
					   }
					   }
				  }
          
			  
          
         
       
          
		   }
					}
				

					
					
					
				}
				
				
				}
				
				
			}
			
        }
    };
	
	// to save the game data 
		ActionListener saveListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
			if(e.getSource() == savebtn){
			savedgame.add(new SavedGame());
			int last = savedgame.size()-1;
			
			
			savedgame.get(last).getFirstplayer().setplayerId(firstPlayer.getId());
		savedgame.get(last).getFirstplayer().setSavedState(firstPlayer.getState());
		savedgame.get(last).getFirstplayer().setSavedName(firstPlayer.getName());
		savedgame.get(last).getFirstplayer().setSavedRole(firstPlayer.getRole());
		
		savedgame.get(last).getFirstplayer().getPiece(0).setRowSaved(greenStarRow1);
		savedgame.get(last).getFirstplayer().getPiece(0).setColumnSaved(greenStarColumn1);
		savedgame.get(last).getFirstplayer().getPiece(0).setPieceName(star1);
	if(firstPlayer.getbit(0) == 3)
		savedgame.get(last).getFirstplayer().getPiece(0).setvbit(1);
	
		savedgame.get(last).getFirstplayer().getPiece(1).setRowSaved(greenStarRow2);
		savedgame.get(last).getFirstplayer().getPiece(1).setColumnSaved(greenStarColumn2);	
		savedgame.get(last).getFirstplayer().getPiece(1).setPieceName(star1);
		if(firstPlayer.getbit(1) == 3)
		savedgame.get(last).getFirstplayer().getPiece(1).setvbit(1);
	
	
		savedgame.get(last).getFirstplayer().getPiece(2).setRowSaved(greenCrossRow1);
		savedgame.get(last).getFirstplayer().getPiece(2).setColumnSaved(greenCrossColumn1);	
		savedgame.get(last).getFirstplayer().getPiece(2).setPieceName(cross1);
		if(firstPlayer.getbit(2) == 3)
		savedgame.get(last).getFirstplayer().getPiece(2).setvbit(1);
	
	
		savedgame.get(last).getFirstplayer().getPiece(3).setRowSaved(greenCrossRow2);
		savedgame.get(last).getFirstplayer().getPiece(3).setColumnSaved(greenCrossColumn2);	
		savedgame.get(last).getFirstplayer().getPiece(3).setPieceName(cross1);
		if(firstPlayer.getbit(3) == 3)
		savedgame.get(last).getFirstplayer().getPiece(3).setvbit(1);
	
		savedgame.get(last).getFirstplayer().getPiece(4).setRowSaved(greenHeartRow);
		savedgame.get(last).getFirstplayer().getPiece(4).setColumnSaved(greenHeartCoulmn);	
		savedgame.get(last).getFirstplayer().getPiece(4).setPieceName(heart1);
		
	
		savedgame.get(last).getFirstplayer().getPiece(5).setRowSaved(greenBox1Row);
		savedgame.get(last).getFirstplayer().getPiece(5).setColumnSaved(greenBox1Column);	
		savedgame.get(last).getFirstplayer().getPiece(5).setPieceName(boxname1_1);
		if(firstPlayer.getbit(5) == 3)
		savedgame.get(last).getFirstplayer().getPiece(5).setvbit(1);
		
			savedgame.get(last).getFirstplayer().getPiece(6).setRowSaved(greenBox2Row);
		savedgame.get(last).getFirstplayer().getPiece(6).setColumnSaved(greenBox2Column);
		savedgame.get(last).getFirstplayer().getPiece(6).setPieceName(boxname1_2);
		if(firstPlayer.getbit(6) == 3)
		savedgame.get(last).getFirstplayer().getPiece(6).setvbit(1);
	
	
		savedgame.get(last).getFirstplayer().getPiece(7).setRowSaved(greenBox3Row);
		savedgame.get(last).getFirstplayer().getPiece(7).setColumnSaved(greenBox3Column);	
		savedgame.get(last).getFirstplayer().getPiece(7).setPieceName(boxname1_3);
		if(firstPlayer.getbit(7) == 3)
		savedgame.get(last).getFirstplayer().getPiece(7).setvbit(1);
		
		
		
		
			savedgame.get(last).getSecondplayer().setplayerId(secondPlayer.getId());
		savedgame.get(last).getSecondplayer().setSavedState(secondPlayer.getState());
		savedgame.get(last).getSecondplayer().setSavedName(secondPlayer.getName());
		savedgame.get(last).getSecondplayer().setSavedRole(secondPlayer.getRole());
		
		savedgame.get(last).getSecondplayer().getPiece(0).setRowSaved(redStarRow1);
		savedgame.get(last).getSecondplayer().getPiece(0).setColumnSaved(redStarColumn1);
		savedgame.get(last).getSecondplayer().getPiece(0). setPieceName(star2);
		if(secondPlayer.getbit(0) == 3)
		savedgame.get(last).getSecondplayer().getPiece(0).setvbit(1);
	
		savedgame.get(last).getSecondplayer().getPiece(1).setRowSaved(redStarRow2);
		savedgame.get(last).getSecondplayer().getPiece(1).setColumnSaved(redStarColumn2);	
		savedgame.get(last).getSecondplayer().getPiece(1).setPieceName(star2);
		if(secondPlayer.getbit(1) == 3)
		savedgame.get(last).getSecondplayer().getPiece(1).setvbit(1);
	
		savedgame.get(last).getSecondplayer().getPiece(2).setRowSaved(redCrossRow1);
		savedgame.get(last).getSecondplayer().getPiece(2).setColumnSaved(redCrossColumn1);	
		savedgame.get(last).getSecondplayer().getPiece(2).setPieceName(cross2);
		if(secondPlayer.getbit(2) == 3)
		savedgame.get(last).getSecondplayer().getPiece(2).setvbit(1);
	
		savedgame.get(last).getSecondplayer().getPiece(3).setRowSaved(redCrossRow2);
		savedgame.get(last).getSecondplayer().getPiece(3).setColumnSaved(redCrossColumn2);	
		savedgame.get(last).getSecondplayer().getPiece(3).setPieceName(cross2);
		if(secondPlayer.getbit(3) == 3)
		savedgame.get(last).getSecondplayer().getPiece(3).setvbit(1);
	
		savedgame.get(last).getSecondplayer().getPiece(4).setRowSaved(redHeartRow);
		savedgame.get(last).getSecondplayer().getPiece(4).setColumnSaved(redHeartCoulmn);	
		savedgame.get(last).getSecondplayer().getPiece(4).setPieceName(heart2);
	
	
		savedgame.get(last).getSecondplayer().getPiece(5).setRowSaved(redBox1Row);
		savedgame.get(last).getSecondplayer().getPiece(5).setColumnSaved(redBox1Column);	
		savedgame.get(last).getSecondplayer().getPiece(5).setPieceName(boxname2_1);
		if(secondPlayer.getbit(5) == 3)
		savedgame.get(last).getSecondplayer().getPiece(5).setvbit(1);
		
			savedgame.get(last).getSecondplayer().getPiece(6).setRowSaved(redBox2Row);
		savedgame.get(last).getSecondplayer().getPiece(6).setColumnSaved(redBox2Column);
		savedgame.get(last).getSecondplayer().getPiece(6).setPieceName(boxname2_2);
		if(secondPlayer.getbit(6) == 3)
		savedgame.get(last).getSecondplayer().getPiece(6).setvbit(1);
		
		savedgame.get(last).getSecondplayer().getPiece(7).setRowSaved(redBox3Row);
		savedgame.get(last).getSecondplayer().getPiece(7).setColumnSaved(redBox3Column);	
		savedgame.get(last).getSecondplayer().getPiece(7).setPieceName(boxname2_3);
		if(secondPlayer.getbit(7) == 3)
		savedgame.get(last).getSecondplayer().getPiece(7).setvbit(1);
		
		
	
		write();
		JOptionPane.showMessageDialog(null," Your Game Has Been Successfully Saved ");
		
			}
			else if(e.getSource() == helpbtn){
			JFrame framehelp = new JFrame();
			JPanel north = new JPanel();
			JPanel south = new JPanel();
			north.setLayout(new BorderLayout());
			south.setLayout(new BorderLayout());
			JLabel help = new JLabel("                         HELP ");
			north.setBackground(new Color(208,231,255));
			south.setBackground(new Color(208,231,255));
			framehelp.setLayout(new BorderLayout());
			
		help.setFont(new java.awt.Font("Times New Roman", 1,55));
		north.add(new JLabel("  "), BorderLayout.NORTH);
		south.add(new JLabel("  "), BorderLayout.NORTH);
		south.add(new JLabel("  "), BorderLayout.CENTER);
		south.add(new JLabel("  "), BorderLayout.SOUTH);
		north.add(help, BorderLayout.SOUTH);
		framehelp.add(new JLabel(new ImageIcon("helppic.PNG")), BorderLayout.CENTER);
		framehelp.add(north, BorderLayout.NORTH);
		framehelp.add(south, BorderLayout.SOUTH);
			framehelp.setSize(900,500);
			framehelp.getContentPane().setBackground(new Color(208,231,255));
			 framehelp.setVisible(true);
		framehelp.setLocation(500, 180);
		framehelp.setResizable(false);
		}
		else if(e.getSource() == quitbtn)
			System.exit(1);
        }
		
		
		
    };
	
	// to write the data to save file 
		public void write(){
		
		try{
		BufferedWriter writer2 = new BufferedWriter(new FileWriter("save.txt"));
		
		for(int i=0; i < savedgame.size(); i++){
			int boo1 = 0;
			int boo2 = 0;
			if(savedgame.get(i).getFirstplayer().getSavedState() == true){
				boo1 = 1;
				
			}
			else boo1 = 0;
			if(savedgame.get(i).getSecondplayer().getSavedState() == true){
				boo2 = 1;
				
			}
			else boo2 = 0;
			writer2.write(i + " " + savedgame.get(i).getFirstplayer().getplayerId()+ " " + savedgame.get(i).getFirstplayer().getSavedRole()+" " +boo1+" ");
			for(int j = 0; j < 8; j++){
			writer2.write(savedgame.get(i).getFirstplayer().getPiece(j).getvbit() + " " + savedgame.get(i).getFirstplayer().getPiece(j).getPieceNumber() + " " + savedgame.get(i).getFirstplayer().getPiece(j).getRowsaved() + " " +  savedgame.get(i).getFirstplayer().getPiece(j).getColumnSaved() 
			+" " +savedgame.get(i).getFirstplayer().getPiece(j).getPieceName()+ " ");
			}
	
		
		writer2.write(savedgame.get(i).getSecondplayer().getplayerId()+ " " + savedgame.get(i).getSecondplayer().getSavedRole()+ " " + boo2+" ");
			for(int j = 0; j < 8; j++){
			writer2.write( savedgame.get(i).getSecondplayer().getPiece(j).getvbit() + " " + savedgame.get(i).getSecondplayer().getPiece(j).getPieceNumber() + " " + savedgame.get(i).getSecondplayer().getPiece(j).getRowsaved() + " " +  savedgame.get(i).getSecondplayer().getPiece(j).getColumnSaved() 
			+" " +savedgame.get(i).getSecondplayer().getPiece(j).getPieceName() +" " );
			}
	
		writer2.write("\n");
		
		}
	writer2.close();
	
	}		
				catch(IOException f)
		{
			System.out.println(f);
		}
		
		
		try{
			
		BufferedWriter writer3 = new BufferedWriter(new FileWriter("info.txt"));
		for(int i =0; i < savedgame.size(); i++){
			writer3.write(savedgame.get(i).getFirstplayer().getSavedName()+" " + savedgame.get(i).getSecondplayer().getSavedName());
		writer3.write("\n");
		
		}
	
	
	writer3.close();
	
	}		
				catch(IOException f2)
		{
			System.out.println(f2);
		}
	}
	
	
}
