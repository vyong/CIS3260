/************************* viewBoard.java ****************************
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

public class viewBoard{
	
	private int length;
	private int width;
	
	//Document says Board() but the class name says gameBoard --> We decided to change class name to Board
	public viewBoard(){
		length = 0;
		width = 0;
	}
	
	public viewBoard(int length, int width){
		this.length = length;
		this.width = width;
	}
		
	//viewBoard Method's
	
	public Piece checkCell(int x, int y){
		//Checks a cell to see if it is occupied, returns either NULL or the piece occupying the cell.
		
		return null;
	}
	
}