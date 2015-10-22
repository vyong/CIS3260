/************************* Board.java ****************************
Student Name: 						Student Number: 
Devin Dagg							0852134
Erik Zorn - Wallentin 				0864583
Taha Ansari							0849535
Vincent Yong						0744993
 
Date: Wed, Oct.21 / 2015			Course Name: CIS3260
I have exclusive control over this submission via my password.
By including this statement in this header comment, I certify that:
1) I have read and understood the University policy on academic integrity;
2) I have completed the Computing with Integrity Tutorial on Moodle; and
3) I have achieved at least 80% in the Computing with Integrity Self Test.
I assert that this work is my own. I have appropriately acknowledged any and all material
(data, images, ideas or words) that I have used, whether directly quoted or paraphrased.
Furthermore, I certify that this assignment was prepared by me specifically for this course.
****************************************************************************/

import java.io.*;
import java.util.*;

public class Board{
	
	private int length;
	private int width;
	public Cell[][] cells;
	public Rules rules = new Rules(); 
	 // implied in spec but not written  
	//Document says Board() but the class name says gameBoard --> We decided to change class name to Board
	public Board(){
		length = 0;
		width = 0;
	}
	
	public Board(int length, int width){
		this.length = length;
		this.width = width;
		this.cells = new Cell[length][width];
		System.out.println(length +" : "+ width);
		//for loop for testing purposes
		for(int i=0; i<length;i++)
		{
			for(int k=0;k<width;k++)
			{ 
				//cells[i][k] = new Cell(); 
				//System.out.print(cells[i][k]); 
			}
		}
	}
	
	//Board Method's
	
	public Piece checkCell(int x, int y){
		//Checks a cell to see if it is occupied, returns either NULL or the piece occupying the cell.

		if(cells[x][y] != null){		
			return cells[x][y].getOccupant(); 
		}
		else{
			return null;
		}
	}
	
	public boolean checkPlacement(int x, int y){
		//Checks the cell the player is trying to place their piece on, then uses the rules class to check if the placement is valid.
		
		//Created an instance variable of Piece to make this method possible to use from requirements
		Piece currPiece = new Piece(); 
		currPiece = cells[x][y].getOccupant(); 
		if(cells[x][y] == null || cells[x][y].getOccupant() == null){
			if(rules.validPlace(currPiece, x, y) == true){
				return true; 
			}
		}
		
		return false;
	}
	
	public boolean checkAttack(int x1, int y1, int x2, int y2){
		//Checks the cell the player is attacking from and the cell the player is attacking, 
		//then uses the rules class to check if the attack is valid.
		Piece attackPiece = new Piece(); 
		Piece defendPiece = new Piece(); 

		attackPiece = cells[x1][y1].getOccupant(); 
		defendPiece = cells[x2][y2].getOccupant(); 

		if(attackPiece != null && defendPiece != null){
			if(rules.validAttack(attackPiece, defendPiece, attackPiece.getX(), attackPiece.getY(), defendPiece.getX(), defendPiece.getY()) == true){
				return true; 
			}
		}
		
		return false;
	}
	
	public boolean checkMove(int x1, int y1, int x2, int y2){
		//Checks the cell the player is moving from and the cell the player is moving to, then uses the rules class to check if the attack is valid.
		Piece moveFrom = new Piece(); 
		Piece moveTo = new Piece(); 

		moveFrom = cells[x1][y1].getOccupant(); 
		moveTo = cells[x2][y2].getOccupant(); 

		if(moveFrom != null && moveTo == null){
			if(rules.validMove(moveFrom, moveFrom.getX(), moveFrom.getY(), x2, y2) == true){
				return true; 
			}		
		}
		
		return false;
	}
	
	public boolean checkTake(int x, int y){
		//Checks the cell player is trying to take the piece from, then uses the rules class to check if the removal is valid.
		Piece currPiece2 = new Piece(); 

		currPiece2 = cells[x][y].getOccupant(); 

		if(rules.validTake(currPiece2, x, y) == true){
			return true; 
		}
		
		return false;
	}
}