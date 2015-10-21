/************************* Piece.java ****************************
Student Name: Erik Zorn - Wallentin  Student Number: 0864583
Date: Thur, Oct.15 / 2015			 Course Name: CIS3260
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
	
	
	//We added the location for the piece (x and y)
	private int x;
	private int y;
	
	public Piece(){
		colour = Colour.WHITE;
	}
	
	public Piece(Colour colour){
		this.colour = colour;
	}
	
	//Getter's
	
	public Colour getColour(){
		return colour;
	}

	//Setter's
	
	public void setColour(Colour pColour){
		colour = pColour;
	}
}