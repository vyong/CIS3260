/************************* Rules.java ****************************
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
import java.io.IOException;
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Rules{

	
	public Rules(){

	}

	//Rules Method's
	
	public boolean validAttack(Piece p1, Piece p2, int x1, int y1, int x2, int y2){
		//Checks whether the attack is valid, returns true or false.


		/* DEV NOTES
		Assumptions of parameters:
		p1: current player's piece
		p2: opponent's piece
		x1, y1: current player's piece coordinate
		x2, y2: opponent's piece on the board
		*/

		Piece thirdCell;
		int xDiff, yDiff;


		// //check to make sure cell 1 has a piece of current player
		// cellPiece = checkCell(x1, y1);
		// if(cellPiece.getColour() != p1.getColour() || cellPiece == null) {
		// 	return false;
		// }

		// //Check if cell 2 has opponent piece
		// cellPiece = checkCell(x2, y2);
		// if(cellPiece.getColour() != p2.getColour() || cellPiece == null) {
		// 	return false;
		// }

		//check if pieces are different
		if(p1.getColour() == p2.getColour()) {
			return false;
		}

		xDiff = x2 - x1;
		yDiff = y2 - y1;

		//check if cell 1 is beside cell 2
		if(xDiff == 1 && yDiff == 0){
			return true;
		}
		else if (xDiff == -1 && yDiff == 0){
			return true;
		}
		else if(xDiff == 0 && yDiff == 1){
			return true;
		}
		else if(xDiff == 0 && yDiff == -1){
			return true;
		}
		else {
			return false;
		}

	}

	public boolean vaildMove(Piece p1, int x1, int y1, int x2, int y2){
		//Checks whether the move is valid, return true or false.

		/* DEV NOTES
		Assumption of variables:
		p1: piece of current player
		x1, y1:current location of piece
		x2, y2: destination of current player's piece
		*/
		Piece cellPiece;
		int xDiff, yDiff;

		//check to make sure cell 1 has a piece of current player
		cellPiece = checkCell(x1, y1);
		if(cellPiece.getColour() != p1.getColour() || cellPiece == null) {
			return false;
		}

		xDiff = x2 - x1;
		yDiff = y2 - y1;
		//check if cell 1 is beside cell 2
		if(xDiff == 1 && yDiff == 0){
			return true;
		}
		else if (xDiff == -1 && yDiff == 0){
			return true;
		}
		else if(xDiff == 0 && yDiff == 1){
			return true;
		}
		else if(xDiff == 0 && yDiff == -1){
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean validPlace(Piece p1, int x, int y){
		//Checks whether the placement is valid, returns true or false.

		/* DEV NOTES
		Assumption of variables:
		player1: current player
		p1: piece of current player
		x1, y1:location of where current player wants to place
		*/
		Piece cellPiece;

		//check to make sure cell 1 doesn't have a piece
		cellPiece = checkCell(x, y);
		if(cellPiece == null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean validTake(Piece p1, int x, int y){
		//Checks whether the removal is valid, returns true or false

		/* DEV NOTES
		Assumption of variables:
		p1: piece of current player
		x1, y1:location of where current player wants to take piece from
		*/
		

		//check to make sure cell 1 has a piece of opponent
		Piece cellPiece = checkCell(x, y);
		if(cellPiece.getColour() != p1.getColour() || cellPiece == null) {
			return false;
		}
		else {
			return true;
		}
	}
}