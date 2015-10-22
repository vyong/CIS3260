/************************* Piece.java ****************************
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

public class Piece{

	public enum Colour {
		WHITE, BLACK
	}

	private Colour colour;
	private int x; 
	private int y; 
	
	public Piece(){
		colour = Colour.WHITE;
		int x = 0; 
		int y = 0; 
	}
	
	public Piece(Colour colour, int x, int y){
		this.colour = colour;
		this.x = x;
		this.y = y; 
	}
	
	//Getter's
	
	public Colour getColour(){
		return colour;
	}

	public int getX(){
		return this.x; 
	}

	public int getY(){
		return this.y;
	}

	//Setter's
	
	public void setColour(Colour pColour){
		colour = pColour;
	}

	public void setX(int x){
		this.x = x; 
	}

	public void setY(int y){
		this.y = y; 
	}
}