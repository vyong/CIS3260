/************************* Player.java ****************************
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
import java.util.*;
import java.util.Scanner;

public class Player{
	public enum Colour {
		WHITE, BLACK
	}
	
	private Colour colour;
	
	private boolean turn = false;
	
	public Player(){
		colour = Colour.WHITE;
		turn = false;
	}
	
	public Player(Colour colour){
		this.colour = colour;
	}
	
	//We added this to be able to know which players turn it is
	public Player(Colour colour, boolean turn){
		this.colour = colour;
		this.turn = turn;
	}
	
	
	//Player Method's
	
	
	//Document says "piece toPlace" should be "Piece toPlace"
	public boolean placePiece(Board gameBoard, Piece toPlace, int x, int y){
		//Using gameBoard call checkPlacment to see if the placement is valid, if return is true, 
		//sets the piece to the cell. Returns true or false.
		
		return false;
	}
	
	public boolean movePiece(Board gameBoard, int x1, int y1, int x2, int y2){
		//Using gameBoard call checkMove to see if the move is valid, if return is true, 
		//sets the piece to the cell. Returns true or false.
		
		return false;
	}
	
	public boolean attackPiece(Board gameBoard, int x1, int y1, int x2, int y2){
		//Using gameBoard call checkAttack to see if the attack is valid, if return is true, 
		//sets the piece to the cell. Calls takePiece to take remove pieces from the board. Returns true or false.
		
		return false;
	}
	
	public boolean takePiece(Board gameBoard, int x, int y){
		//Allows the player to choose what pieces they would like to remove and 
		//removes any pieces that have been attacked. Returns true or false
		
		return false;
	}
	
	
	
	//Getter's
	
	public Colour getColour(){
		return colour;
	}
	
	public boolean getTurn(){
		return turn;
	}

	//Setter's
	
	public void setColour(Colour pColour){
		colour = pColour;
	}
	
	public void setTurn(boolean t){
		turn = t;
	}
}