/************************* View.java ****************************
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

public class View{

	
	public View(){

	}

	//Rules Method's
	
	public Board updateViewBoard(Board gameBoard){
		//Updates the view board with the new state of the gameBoard.
		
		return null;
	}

	//Changed from private to public so the driver can see it
	public void displayViewBoard(){
		//Displays the board on the screen.
		
		//int rows = 5; 
	 	//int cols = 6; 
	 	
	 	System.out.println("\n**** Displaying Board ****");
	 	
	 	System.out.print(" _ _ _ _ _"); 
	 	System.out.print("\n"); 
		for(int y = 0; y<6; y++)
	 	{
		 	for(int i = 0; i<5;i++)
		 	{
		 		System.out.print("|");
		 		System.out.print("_");
		 	}	
	 		System.out.print("|"); 	
	 		System.out.print("\n");
	 	}
	 	
	 	System.out.println("\n**************************\n");
		
	}
}