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
		
		return false;
	}

	public boolean vaildMove(Piece p1, int x1, int y1, int x2, int y2){
		//Checks whether the move is valid, return true or false.
		
		return false;
	}
	
	public boolean validPlace(Piece p1, int x, int y){
		//Checks whether the placement is valid, returns true or false.
		
		return false;
	}
	
	public boolean validTake(Piece p1, int x, int y){
		//Checks whether the removal is valid, returns true or false
		
		return false;
	}
}