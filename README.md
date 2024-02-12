# Overview:
Herzig Chess is a multiplayer chess game developed in Java. This interactive and strategic game features unique chess pieces and rules, offering an engaging experience for players. The game includes functionalities for starting new games, adding players, loading pre-saved games, playing the game, and terminating the game with a declared winner.

# Instructions:
1- Extract the ZIP file to any location on your PC.
2- Run the command prompt from the extracted location.
3- Compile with "javac Driver.java" and run with "java Driver" to start the program.

# Functional Requirements:
## Initialize Game:
### Start New Game
Press the 'New Game' button to initiate a new game.
Press 'Saved Game' to load pre-saved games.
Press 'Quit' to exit the game.

![initiate app](https://github.com/Shaabanm2018/Herzig-Chess---Java-Chess-Game/assets/76607364/2c7814a1-9de3-48ad-954d-dfa4eded415a)


### Add Players
Input player names in the game menu.
System saves player credentials and assigns chess piece colors.

### Load Pre-saved Game
Display list of pre-saved games.
Press 'Delete' to remove a saved game.
Press 'Play' to continue a pre-saved game.
Press 'Back' to return to the initial screen.

### Declare Player's Turn
Indicate which player's turn it is during the game.
Disallow moves when it's not a player's turn.


### Record Time
Display elapsed time from the beginning of the game

![declare winner](https://github.com/Shaabanm2018/Herzig-Chess---Java-Chess-Game/assets/76607364/7c91b76d-8bb3-431c-b8b8-79fe87174984)

## Play Game:
### Select and Unselect Piece
Players can select valid pieces during their turn.
Disallow selection of opponent's pieces.
Toggle selected/unselected states.

### Move Piece
Move a selected piece to a valid destination box.
Toggle turns between players

![movepiece](https://github.com/Shaabanm2018/Herzig-Chess---Java-Chess-Game/assets/76607364/91ba2445-e770-4d1b-99a1-5f4c0be76ecf)


### Transform Piece
Pieces transform after 3 turns.
Star transforms into a Cross, and vice versa


## Terminate Game:
#### Declare Winner
Game terminates when one player captures the opponent's Heart piece.
Declare the winner and end the game.
![transer1](https://github.com/Shaabanm2018/Herzig-Chess---Java-Chess-Game/assets/76607364/b07097cc-4441-414f-ad21-d9c8f9ba700b)

![transfer 2](https://github.com/Shaabanm2018/Herzig-Chess---Java-Chess-Game/assets/76607364/b08c6708-e3e8-4614-9eb8-1c5fb5113b3a)



### Save Game
Allow players to save the current game state.
Display a confirmation message upon successful saving.

![save game](https://github.com/Shaabanm2018/Herzig-Chess---Java-Chess-Game/assets/76607364/315bd431-e57a-40cb-861a-9475c7243650)


## Git Help (How to Play)
Display information about game rules and how to play.


# Game Rules:
The game is multiplayer, with the green player as Player 1 and the red player as Player 2.
Arrow Box moves forward 1 or 2 steps and turns around at the board's end.
Star moves one or two steps in any direction.
Cross moves diagonally any distance.
Heart moves one step in any direction.
The game ends when the opponent captures the Heart.
Pieces transform after 4 turns: Star turns into Cross, and Cross turns into Star.

# How To Run The Game
1.	Step 1: Open command prompt and locate the file of the program. At the file destination, type exactly  “javac Driver.java” in the command prompt and then press Enter to compile the whole program as show in the screenshot below. Then run the program with the command “java Driver” and then press Enter.
   
# Enjoy playing Herzig Chess, and may the best strategist win!
