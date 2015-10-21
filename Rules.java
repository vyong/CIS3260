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
		Piece thirdCell;
		int xDiff, yDiff;

		//check if pieces are different
		if(p1.getColour() == p2.getColour()) {
			return false;
		}
		else if (p1 == null || p2 == null){
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
		int xDiff, yDiff;

		//check to make sure cell 1 has a piece of current player
		if(p1 == null){
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
		
		if(p1 == null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean validTake(Piece p1, int x, int y){
		//Checks whether the removal is valid, returns true or false

		//check to make sure cell 1 has a piece of opponent
		if(p1 == null) {
			return false;
		}
		else {
			return true;
		}
	}
}

/*
Assumptions from methods:

validAttack: both pieces(p1, p2) are actually taken from the board cells and the x and y are their respective location
function checks is pieces are same or null, then checks if the cells are beside each other.

validMove: The piece is grabbed from the board cell and the x,y location is source and destination respectively
function checks if piece is null and checks if cells are beside each other.

validPlace: piece are taken from the cell on the board and x,y is location of where it's placing
function just checks if piece is null or not

validTake: piece is from the cell on the board and x,y is the location of where the piece is removing from
function checks if piece is null or not

in both validPlace and validTake, x,y coordinates aren't used at all
*/