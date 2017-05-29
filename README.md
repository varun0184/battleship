1.	Assumption
  a.	There are two players
  b.	Each player has only two ships
  c.	Player 1 will always start the game.

2.	How to Run 
  a.	Import the zip file into java IDE.
  b.	Run as java project


3.	Design
  a.	MainClass.java is the entry point. It create a context object containing input file.
  b.	Then this object is pass to GameController.java
  c.	GameController calls the Façade class GameManager.java
  d.	GameManager convert input to objects and initialize player1 and player2 and then starts the game by calling GameService.java
  e.	GameService.java has the algorithm to run the game.
