/************************* Board.java ****************************
Student Name: 						Student Number: 
Devin Dagg
Erik Zorn - Wallentin 				0864583
Taha Ansari
Vincent Yong
 
Date: Thur, Oct.15 / 2015			Course Name: CIS3260
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
	
	//Document says Board() but the class name says gameBoard --> We decided to change class name to Board
	public Board(){
		length = 0;
		width = 0;
	}
	
	public Board(int length, int width){
		this.length = length;
		this.width = width;
	}
	
	//Board Method's
	
	public Piece checkCell(int x, int y){
		//Checks a cell to see if it is occupied, returns either NULL or the piece occupying the cell.
		
		return null;
	}
	
	public boolean checkPlacement(int x, int y){
		//Checks the cell the player is trying to place their piece on, then uses the rules class to check if the placement is valid.
		
		return false;
	}
	
	public boolean checkAttack(int x1, int y1, int x2, int y2){
		//Checks the cell the player is attacking from and the cell the player is attacking, 
		//then uses the rules class to check if the attack is valid.
		
		return false;
	}
	
	public boolean checkMove(int x1, int y1, int x2, int y2){
		//Checks the cell the player is moving from and the cell the player is moving to, then uses the rules class to check if the attack is valid.
		
		return false;
	}
	
	public boolean checkTake(int x, int y){
		//Checks the cell player is trying to take the piece from, then uses the rules class to check if the removal is valid.
		
		return false;
	}
}