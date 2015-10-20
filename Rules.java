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
		
		/*
		Check if piece 1 is current player's piece, return false if not
		check to make sure cell 1 has a piece of current player

		Check if piece 2 is opponent's piece, return false if not
		Check if cell 2 has opponent piece

		check if cell 1 is beside cell 2

		check third cell to make sure it's empty
		*/
		return false;
	}

	public boolean vaildMove(Piece p1, int x1, int y1, int x2, int y2){
		//Checks whether the move is valid, return true or false.
		
		/*
		check if piece 1 is current player's piece, return false if not
		check to make sure cell 1 is piece of current player

		check is cell 2 is beside cell 1, return false if not
		*/
		return false;
	}
	
	public boolean validPlace(Piece p1, int x, int y){
		//Checks whether the placement is valid, returns true or false.
		
		/*
		check if player has pieces and right color, return false if no more pieces
		check if cell is empty, return false if cell isn't empty
		
		if empty cell, placement is valid, return true

		if cell isn't empty return false
		*/
		return false;
	}
	
	public boolean validTake(Piece p1, int x, int y){
		//Checks whether the removal is valid, returns true or false
		
		/*
		check if piece is correct color of opponents, return false if not enemy color

		check if piece in cell contains opponent's piece, return false if not

		*/
		return false;
	}
}