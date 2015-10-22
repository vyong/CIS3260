/************************* View.java ****************************
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
import java.io.IOException;
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

public class View{

	
	public View(){

	}

	//Rules Method's
	
	public Board updateViewBoard(Board gameBoard){
		//Updates the view board with the new state of the gameBoard.
		
		return null;
	}

	public void displayViewBoard(){
		//Displays the board on the screen.
	 	System.out.print("___________"); 
	 	System.out.print("\n"); 
		for(int y = 0; y<6; y++){
		 	for(int i = 0; i<5;i++){
		 		System.out.print("|");
		 		System.out.print("_");
		 	}	
	 		System.out.print("|"); 	
	 		System.out.print("\n");
	 	}
		//printing out cells on grid
		for(int k = 0; k < 6; k++){
			for(int j = 0; j < 5; j++){
				//System.out.print(cells[k][j]);
			}
		}
	}
}
