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
 
 public class GameInitializer{
	 
	 // varablies to be used durning intialize game 
	private JFrame frame1 = new JFrame();
	private JFrame frame2 = new JFrame();
	private static int chose = 0;
	private JFrame saveFrame = new JFrame();
	private JButton newGame = new JButton("new Game");
	private JButton savedGame = new JButton("Saved Game");
	private JButton quit = new JButton("Quit");
	private Color color = new Color(255,245,213);
	private  Color color2 = new Color(208,231,255);
	public static JTextField name2 = new JTextField(10);
	public static JTextField name1 = new JTextField(10);
	private  JButton back = new JButton("Back");
	private  JButton start = new JButton("Start Game");
	private JButton delete = new JButton("Delete"); 
	private JButton play = new JButton("Play"); 
	private JButton back2 = new JButton("Back");
	private static Board board = new Board();
	private  int size =0;
	private JScrollPane scroll;
	
	// to seve name of players 
	static ArrayList<String> names = new ArrayList<String>();
	
	// to set the players name during intialize game 
	public static  void re(Board b){
		b.firstPlayer.setName(name1.getText() + "");
		b.secondPlayer.setName(name2.getText() + "");
	}
	public GameInitializer(){
		
		// to add action listener ot the buttons 
		newGame.addActionListener(actionlistener);
		savedGame.addActionListener(actionlistener);
		back.addActionListener(actionlistener);
		play.addActionListener(actionlistener);
		quit.addActionListener(actionlistener);
		back2.addActionListener(actionlistener);
		delete.addActionListener(actionlistener);
		start.addActionListener(actionlistener);
		firstScreen();
		
	}
	
	// to intialize the first screen
	public void firstScreen(){
		frame1 = new JFrame();


		frame1.setLayout(null);
		frame1.setSize(800, 600);
		frame1.getContentPane().setBackground(color2);
	name1.setText(" ");
		name2.setText(" ");
	// title of the game
		   JLabel title = new JLabel("Welcome To Herzig Chess");
		title.setFont(new java.awt.Font("Times New Roman", 1, 34));
		title.setForeground(Color.black);
		
		
		  frame1.addComponentListener(new ComponentAdapter() {
      public void componentResized(ComponentEvent evt) {
	// to set bounds of the buttons 
		title.setBounds((frame1.getWidth()/2) - 230, 80, 450, 50);
		newGame.setBounds((frame1.getWidth()/2)- 135,(frame1.getHeight()/4)+50, 250, 50);
		savedGame.setBounds((frame1.getWidth()/2)- 135, (frame1.getHeight()/2), 250, 50);
		quit.setBounds((frame1.getWidth()/2)- 135, (frame1.getHeight()- frame1.getHeight()/3) +10, 250, 50);
		
      }
    });
		

		
	
			
			frame1.add(title);
		// to set the fond of the buttons
		newGame.setFont(new java.awt.Font("Times New Roman", 1, 24));
		newGame.setBorder(BorderFactory.createLineBorder(Color.gray, 4));
		newGame.setBackground(color);
		
		savedGame.setFont(new java.awt.Font("Times New Roman", 1, 24));
		savedGame.setBorder(BorderFactory.createLineBorder(Color.gray, 4));
		savedGame.setBackground(color);
		quit.setFont(new java.awt.Font("Times New Roman", 1, 24));
		quit.setBorder(BorderFactory.createLineBorder(Color.gray, 4));
		quit.setBackground(color);
		frame1.add(newGame);
		frame1.add(savedGame);
		frame1.add(quit);
			frame1.add(new JLabel(" "));
	
		
	    frame1.setVisible(true);
		
		frame1.setLocation(500, 180);

	}
	
	// to add player to the game 
	public void addpalyer(){
		frame2 =new JFrame();
		// to add player 
	    JLabel title = new JLabel("Add Player");
		title.setFont(new java.awt.Font("Times New Roman", 1, 34));
		title.setForeground(Color.black);
		
		
	
	
	JButton blue = new JButton();
	blue.setBackground(Color.green);

	
	
	// to set the fond of the players button 
	JLabel player1 = new JLabel("Player1 :");
	player1.setFont(new java.awt.Font("Times New Roman", 1, 22));

	
	
	
		
			
	JButton red = new JButton();
    red.setBackground(Color.red);
	
	
	back.setBackground(color);
	
	
	
	JLabel player2 = new JLabel("Player2 :");
	player2.setFont(new java.awt.Font("Times New Roman", 1, 22));
	
	
	
	
	back.setFont(new java.awt.Font("Times New Roman", 1, 19));
		start.setFont(new java.awt.Font("Times New Roman", 1, 22));
		start.setBackground(color);
			  frame2.addComponentListener(new ComponentAdapter() {

      public void componentResized(ComponentEvent evt) {
		// to set bounds of the buttons 
		title.setBounds((frame2.getWidth()/2) - 100, 80, 450, 50);
		
		blue.setBounds(frame2.getWidth()/2 - 250, (frame2.getHeight()/4)+50, 30, 30);
		player1.setBounds((frame2.getWidth()/2)-200, (frame2.getHeight()/4)+50, 100, 30);
		name1.setBounds((frame2.getWidth()/2)-100, (frame2.getHeight()/4)+50, 300, 30);
		
		red.setBounds(frame2.getWidth()/2 - 250, (frame2.getHeight()/2)-30, 30, 30);
	player2.setBounds((frame2.getWidth()/2)-200, (frame2.getHeight()/2)-30, 100, 30);
		name2.setBounds((frame2.getWidth()/2)-100, (frame2.getHeight()/2)-30, 300, 30);
		
		back.setBounds((frame2.getWidth()/2)-150, (frame2.getHeight()/2) + 100, 80, 50);
		start.setBounds((frame2.getWidth()/2)-20, (frame2.getHeight()/2) + 100, 150, 50);
		
      }
    });
	// to add the varablies to the frame
	back.setBorder(BorderFactory.createLineBorder(Color.gray, 4));
	start.setBorder(BorderFactory.createLineBorder(Color.gray, 4));
		frame2.add(title);
		frame2.add(blue);
		frame2.add(player1);
		frame2.add(name1);
		frame2.add(start);
		frame2.add(red);
		frame2.add(player2);
		frame2.add(name2);
		frame2.add(back);
		frame2.add(new JLabel());
		
		frame2.setSize(800, 600);
		frame2.getContentPane().setBackground(color2);
		 frame2.setVisible(true);
		frame2.setLocation(500, 180);
		
	}
	
	
	
	// to close the frame and open new frame 
	 void close(JFrame f){
		WindowEvent winClosingEvent = new WindowEvent(f, WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
	}
	  
	  
	 // to intialize save frame 
	   void save(){
		  saveFrame = new JFrame();
		  
		  // data to be used during saved game 
		  
		  JPanel head = new JPanel();
		  head.setLayout(new BorderLayout());
		  
		  // title fo the frame
		  JLabel title = new JLabel("                                Saved Game ");
		  // set font title
		  title.setFont(new java.awt.Font("Times New Roman", 1, 35));
		  
		  // add component to the frame
		  head.add(title, BorderLayout.CENTER);
		  head.add(new JLabel(" "),BorderLayout.NORTH);
		  head.add(new JLabel("   "), BorderLayout.WEST); 
		  head.add(new JLabel("   "), BorderLayout.EAST); 
		  head.add(new JLabel("   "), BorderLayout.SOUTH);
		  head.setBackground(color2);
		  saveFrame.setLayout(new BorderLayout());
		  
		  saveFrame.add(head, BorderLayout.NORTH);
		  // adjust font of the buttons in the frame
		 play.setFont(new java.awt.Font("Times New Roman", 1, 24));
		play.setBorder(BorderFactory.createLineBorder(Color.gray, 4));
		play.setBackground(color);
		    // adjust font of the buttons in the frame
		delete.setFont(new java.awt.Font("Times New Roman", 1, 24));
		delete.setBorder(BorderFactory.createLineBorder(Color.gray, 4));
		delete.setBackground(color);
		    // adjust font of the buttons in the frame
		back2.setFont(new java.awt.Font("Times New Roman", 1, 24));
		back2.setBorder(BorderFactory.createLineBorder(Color.gray, 4));
		back2.setBackground(color);
		  
		  // intialize west Jpanel 
		  JPanel west = new JPanel(new GridLayout(1, 7, 3, 3));
		  west.setBackground(color2);
		  // add component to the frame
		  west.add(new JLabel("   "));
		  west.add(delete);
		  west.add(new JLabel("  "));
		  west.add(play);
		   west.add(new JLabel("  "));
		  west.add(back2);
		  	   
			   	   west.add(new JLabel("  "));
				   JPanel t = new JPanel(new BorderLayout());
				   t.add(new JLabel(" "), BorderLayout.NORTH);
				   t.add(west, BorderLayout.CENTER);
				   t.add(new JLabel(" "), BorderLayout.SOUTH);
				   t.setBackground(color2);
		  saveFrame.add(t, BorderLayout.SOUTH);
		  
		
		
		 
	java.io.File file3 = new java.io.File("info.txt");
	// to loead names of players from info file 
	size = 0;
		 try{
		
			Scanner input3 = new Scanner (file3);
				while(input3.hasNext()){
					
					StringBuilder p2 = new StringBuilder (input3.next());
					for(int i = 0 ; i < p2.length(); i++)
						// to change the name of the player to correct way
						if(p2.charAt(i) == '_')
						{
								p2.setCharAt(i , ' ');
						}
						
		StringBuilder p3 = new StringBuilder (input3.next());
					for(int i = 0 ; i < p3.length(); i++)
						if(p3.charAt(i) == '_')
						{
								p3.setCharAt(i , ' ');
						}
					
					names.add(p2.toString());
					names.add(p3.toString());
					size++;
				}
			
		 }
		
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		}
		
		
			ButtonGroup group = new ButtonGroup();
		 int temp = 0;
	// to add saved game to the table 
	Object[][] tr = new Object[size][3];
	for(int i =0; i < size; i++)
		for(int j =0; j < 3; j++)
		{
			// to adjust the table
			if(j == 0){
				JRadioButton radio = new JRadioButton(""+(i+1));
				radio.setActionCommand("R"+i);
				radio.addActionListener(radioListener);
				tr[i][j] = radio;
			
			}
			else{
				tr[i][j] = names.get(temp);
				temp++;
			}
		}
		
		
	// to create the table of saved game 
    DefaultTableModel dm = new DefaultTableModel();
    dm.setDataVector(tr,
      new Object[]{"Game", "Player1", "Player2"});
	  
	  JTable table = new JTable(dm) {
      public void tableChanged(TableModelEvent e) {
        super.tableChanged(e);
        repaint();
      }
    };
   
	for(int i=0; i< size; i++)
			group.add((JRadioButton)dm.getValueAt(i,0));
	
		
    table.getColumn("Game").setCellRenderer(new RadioButtonRenderer());
    table.getColumn("Game").setCellEditor(new RadioButtonEditor(new JCheckBox()));
	
			 scroll = new JScrollPane(table);
			 scroll.setBackground(color);
			 saveFrame.add(scroll, BorderLayout.CENTER);
			 
		 
		
		  // to adjust the frame of saved game
		 saveFrame.setSize(800, 600);
		saveFrame.getContentPane().setBackground(color2);
		 saveFrame.setVisible(true);
		saveFrame.setLocation(500, 180);
		
		  
	  }
	  // to resum game 
	    void resumeGame(){
		  boolean valid = true;
		  for(int i=0; i < size; i++){
			  if(board.savedgame.get(i).getGameId() == chose)
			  {
				   board.panel = new JPanel();
				  board.panel.setLayout(new GridLayout(8,5));
				  
				  for(int row = 0; row < 8; row++){
					  for(int column = 0; column < 5; column++){
						 valid = true; 
						  
						  
					  for(int j = 0; j < 8; j++){
						  // to chose which game to resum
						  
						  if((board.savedgame.get(chose).getFirstplayer().getPiece(j).getRowsaved() == row)&&
						     (board.savedgame.get(chose).getFirstplayer().getPiece(j).getColumnSaved() == column) &&
							 (board.savedgame.get(chose).getFirstplayer().getPiece(j).getPieceNumber() == j))
							 {
								 if(board.savedgame.get(chose).getFirstplayer().getPiece(j).getvbit() != 1) {
								 JButton button = new JButton(new ImageIcon(board.savedgame.get(chose).getFirstplayer().getPiece(j).getPieceName()));
								 board.grid[row][column].set_Button(button);
								 board.firstPlayer.setButton(board.savedgame.get(chose).getFirstplayer().getPiece(j).getPieceNumber(), button);
								 valid = false;
								 
								 }
								 else
									  board.firstPlayer.setButton(board.savedgame.get(chose).getFirstplayer().getPiece(j).getPieceNumber(), null);

							 }
							 
							 
							 else if((board.savedgame.get(chose).getSecondplayer().getPiece(j).getRowsaved() == row)&&
						  (board.savedgame.get(chose).getSecondplayer().getPiece(j).getColumnSaved() == column)&&
						  (board.savedgame.get(chose).getSecondplayer().getPiece(j).getPieceNumber() == j))
							 {
							if(board.savedgame.get(chose).getSecondplayer().getPiece(j).getvbit() != 1){
								 JButton button = new JButton(new ImageIcon(board.savedgame.get(chose).getSecondplayer().getPiece(j).getPieceName()));
								 board.grid[row][column].set_Button(button);
								 board.secondPlayer.setButton(board.savedgame.get(chose).getSecondplayer().getPiece(j).getPieceNumber(), button);
								 valid = false;
							}
							else 
							board.secondPlayer.setButton(board.savedgame.get(chose).getSecondplayer().getPiece(j).getPieceNumber(), null);
							 }
							 
					  }
					  
					  if(valid == true)
						   board.grid[row][column].set_Button(new JButton());
					 
					  			board.grid[row][column].get_Button().addActionListener(board.listener);
			board.grid[row][column].get_Button().setBackground(Color.white);
			// intialize game the board
			if(row % 2 == 0){
				if(column == 1 || column == 3)
			board.grid[row][column].get_Button().setBackground(new Color(255,245,213));
		else 
			board.grid[row][column].get_Button().setBackground(Color.white);
			}
			else{
				if(column == 0 || column == 2 || column == 4)
			board.grid[row][column].get_Button().setBackground(new Color(255,245,213));
		else 
			board.grid[row][column].get_Button().setBackground(Color.white);
			}
					  
					  board.panel.add(board.grid[row][column].get_Button());
					  
					  }
				  }
				  // intialize data for the first player 
				  board.firstPlayer.setId(board.savedgame.get(chose).getFirstplayer().getplayerId());
					    board.secondPlayer.setId(board.savedgame.get(chose).getSecondplayer().getplayerId());
				  board.firstPlayer.setRole(board.savedgame.get(chose).getFirstplayer().getSavedRole());
				  board.secondPlayer.setRole(board.savedgame.get(chose).getSecondplayer().getSavedRole());
				
				   board.firstPlayer.setState(board.savedgame.get(chose).getFirstplayer().getSavedState());
				  board.secondPlayer.setState(board.savedgame.get(chose).getSecondplayer().getSavedState());
				  
			Game game = Game.getInstance();	  
		game.add2(board.northPanel());
	game.add1(board.getJPanel());
		game.setVisible(true);
				  
				  
			// intialize data of the saved game to the board	  
		board.greenStarRow1 = board.savedgame.get(chose).getFirstplayer().getPiece(0).getRowsaved();
		board.greenStarColumn1 = board.savedgame.get(chose).getFirstplayer().getPiece(0).getColumnSaved();
		board.greenStarRow2 = board.savedgame.get(chose).getFirstplayer().getPiece(1).getRowsaved();
		board.greenStarColumn2 = board.savedgame.get(chose).getFirstplayer().getPiece(1).getColumnSaved();
		board.greenCrossRow1 = board.savedgame.get(chose).getFirstplayer().getPiece(2).getRowsaved();
		board.greenCrossColumn1 = board.savedgame.get(chose).getFirstplayer().getPiece(2).getColumnSaved();
		board.greenCrossColumn2 = board.savedgame.get(chose).getFirstplayer().getPiece(3).getColumnSaved();
		board.greenCrossRow2 = board.savedgame.get(chose).getFirstplayer().getPiece(3).getRowsaved();
		board.greenHeartRow = board.savedgame.get(chose).getFirstplayer().getPiece(4).getRowsaved();
		board.greenHeartCoulmn = board.savedgame.get(chose).getFirstplayer().getPiece(4).getColumnSaved();
		board.greenBox1Row = board.savedgame.get(chose).getFirstplayer().getPiece(5).getColumnSaved();
		board.greenBox1Column = board.savedgame.get(chose).getFirstplayer().getPiece(5).getRowsaved();
		board.greenBox2Row = board.savedgame.get(chose).getFirstplayer().getPiece(6).getRowsaved(); 
		board.greenBox2Column = board.savedgame.get(chose).getFirstplayer().getPiece(6).getColumnSaved();
		board.greenBox3Row = board.savedgame.get(chose).getFirstplayer().getPiece(7).getRowsaved(); 
		board.greenBox3Column = board.savedgame.get(chose).getFirstplayer().getPiece(7).getColumnSaved();
		
		
		board.redStarRow1 = board.savedgame.get(chose).getSecondplayer().getPiece(0).getRowsaved();
		board.redStarColumn1 = board.savedgame.get(chose).getSecondplayer().getPiece(0).getColumnSaved();
		board.redStarRow2 = board.savedgame.get(chose).getSecondplayer().getPiece(1).getRowsaved();
		board.redStarColumn2 = board.savedgame.get(chose).getSecondplayer().getPiece(1).getColumnSaved();
		board.redCrossRow1 = board.savedgame.get(chose).getSecondplayer().getPiece(2).getRowsaved();
		board.redCrossColumn1 = board.savedgame.get(chose).getSecondplayer().getPiece(2).getColumnSaved();
		board.redCrossColumn2 = board.savedgame.get(chose).getSecondplayer().getPiece(3).getColumnSaved();
		board.redCrossRow2 = board.savedgame.get(chose).getSecondplayer().getPiece(3).getRowsaved();
		board.redHeartRow = board.savedgame.get(chose).getSecondplayer().getPiece(4).getRowsaved();
		board.redHeartCoulmn = board.savedgame.get(chose).getSecondplayer().getPiece(4).getColumnSaved();
		board.redBox1Row = board.savedgame.get(chose).getSecondplayer().getPiece(5).getColumnSaved();
		board.redBox1Column = board.savedgame.get(chose).getSecondplayer().getPiece(5).getRowsaved();
		board.redBox2Row = board.savedgame.get(chose).getSecondplayer().getPiece(6).getRowsaved();
		board.redBox2Column = board.savedgame.get(chose).getSecondplayer().getPiece(6).getColumnSaved();
		board.redBox3Row = board.savedgame.get(chose).getSecondplayer().getPiece(7).getRowsaved();
		board.redBox3Column = board.savedgame.get(chose).getSecondplayer().getPiece(7).getColumnSaved();	  
				  
				  
				board.firstPlayer.setName(names.get(2*chose));
				board.secondPlayer.setName(names.get(2*chose+1));		
				  
			  }
		  }
		  
	  }
	  // to intialize the name of the players 
	  public static void re2(Board b){
		  board.firstPlayer.setName(names.get(2*chose));
				board.secondPlayer.setName(names.get(2*chose+1));
				b = board;
	  }
	  
	  // to aed action listener to the buttons in the table
	 	  ActionListener radioListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
			for(int i =0; i < size; i++){
			if(e.getActionCommand().equals("R"+i)){
				System.out.println(i);
				chose = i;
			}
        }
		}
    };
	// to add action listener the buttons 
	ActionListener actionlistener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
			if(e.getSource() == newGame){
				close(frame1);
				addpalyer();
			}
			else if(e.getSource() == quit)
				System.exit(1);
			else if(e.getSource() == back){
				close(frame2);
				firstScreen();
			}
			else if(e.getSource() == delete){
				board.savedgame.remove(chose);
				board.write();
				board.load();
				
				close(saveFrame);
				save();
				
			}
			
			
			else if(e.getSource() == play){
				close(saveFrame);
				resumeGame();
				
		
		
			}
			
			else if(e.getSource() == back2)
			{
				close(saveFrame);
				firstScreen();
			}
			
			else if(e.getSource() == start){
				if(name1.getText().equals(" ")|| name2.getText().equals(" ")){
		JOptionPane.showMessageDialog(null," Please Enter Valid Name");
				}
					else {
					
				close(frame2);
				Game game = Game.getInstance();
		
		game.add2(board.northPanel());
	game.add1(board.getJPanel());
		game.setVisible(true);
		
		StringBuilder p = new StringBuilder (name1.getText());
					for(int i = 0 ; i < name1.getText().length(); i++)
						if(name1.getText().charAt(i) == ' ')
						{
								p.setCharAt(i , '_');
						}
						
		board.firstPlayer.setName(p.toString());
		
		StringBuilder p2 = new StringBuilder (name2.getText());
					for(int i = 0 ; i < name2.getText().length(); i++)
						if(name2.getText().charAt(i) == ' ')
						{
								p2.setCharAt(i , '_');
						}
						
		board.firstPlayer.setName(p.toString());
		
		
		board.secondPlayer.setName(p2.toString());
				
			}
				}
			
			if(e.getSource() == savedGame){
				close(frame1);
				save();
			}
        }
    };
	
	
	
}