all: 
	javac -cp . Piece.java Cell.java Board.java Player.java Rules.java View.java viewBoard.java Driver.java 

run:
	java -cp . Driver

