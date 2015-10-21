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

		//Check if piece 1 is current player's piece, return false if not
		Player playerColour = getColour();
		if (p1.getColour() != playerColour) {
			return false;
		}

		//Check if piece 2 is opponent's piece, return false if not
		if (p2.getColour() == playerColour) {
			return false;
		}

		//check to make sure cell 1 has a piece of current player
		Piece cellPiece = checkCell(x1, y1);
		if(cellpiece.colour != playerColour || cellPiece == NULL) {
			return false;
		}

		//Check if cell 2 has opponent piece
		cellPiece = checkCell(x2, y2);
		if(cellpiece.colour == playerColour || cellPiece == NULL) {
			return false;
		}

		int xDiff = x2 - x1;
		int yDiff = y2 - y1;

		//check if cell 1 is beside cell 2
		if(xDiff == 1 && yDiff == 0){
			Piece thirdCell = checkCell(x2 + 1, y2);

			if (thirdCell == NULL) {
				return true;
			}

			else {
				return false;
			}
		}

		else if (xdiff == -1 && yDiff == 0){
			Piece thirdCell = checkCell(x2 - 1, y2);

			if (thirdCell == NULL) {
				return true;
			}

			else {
				return false;
			}
		}
		else if( xDiff == 0 && yDiff == 1){
			Piece thirdCell = checkCell(x2, y2 + 1);

			if (thirdCell == NULL) {
				return true;
			}

			else {
				return false;
			}
		}
		else if( xDiff == 0 && yDiff == -1){
			Piece thirdCell = checkCell(x2, y2 - 1);

			if (thirdCell == NULL) {
				return true;
			}

			else {
				return false;
			}
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
		
		//Check if piece 1 is current player's piece, return false if not
		Player playerColour = getColour();
		if (p1.getColour() != playerColour) {
			return false;
		}

		//check to make sure cell 1 has a piece of current player
		Piece cellPiece = checkCell(x1, y1);
		if(cellpiece.colour != playerColour || cellPiece == NULL) {
			return false;
		}

		int xDiff = x2 - x1;
		int yDiff = y2 - y1;
		//check if cell 1 is beside cell 2
		if(xDiff == 1 && yDiff == 0){
			return true;
		}

		else if (xdiff == -1 && yDiff == 0){
			return true;
		}
		else if( xDiff == 0 && yDiff == 1){
			return true;
		}
		else if( xDiff == 0 && yDiff == -1){
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean validPlace(Player player1, Piece p1, int x, int y){
		//Checks whether the placement is valid, returns true or false.

		/* DEV NOTES
		Assumption of variables:
		player1: current player
		p1: piece of current player
		x1, y1:location of where current player wants to place
		*/

		if(player1.pieceCount > 12) {
			return false;
		}
		
		//Check if piece 1 is current player's piece, return false if not
		Player playerColour = getColour();
		if (p1.getColour() != playerColour) {
			return false;
		}

		//check to make sure cell 1 doesn't have a piece
		Piece cellPiece = checkCell(x1, y1);
		if(cellPiece == NULL) {
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
		Piece cellPiece = checkCell(x1, y1);
		if(cellpiece.colour != p1.colour || cellPiece == NULL) {
			return false;
		}
		else {
			return true;
		}
	}
}