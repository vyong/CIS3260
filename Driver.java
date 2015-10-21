/************************* Driver.java ****************************
Student Name: 						Student Number: 
Devin Dagg
Erik Zorn - Wallentin 				0864583
Taha Ansari							0849535
Vincent Yong						0744993
 
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

public class Driver{
	public enum Turn {
		//Document does not specify what Turn Enum values should be, we figured it should be playerOne and playerTwo
		playerOne, playerTwo
	}
	
	private Turn turn;
	private boolean isOver;
	
	
	public Driver(){

	}
	
	//Main Program
	public static void main(String [ ] args)
	{
    	System.out.println("**** Yote Program ****");
    	
    	View vb = new View();
    	Driver driver = new Driver();
    	Player[] player = new Player[2];
    	
    	Rules rules = new Rules();
    	
    	//User Input Variable
    	Scanner input = new Scanner( System.in );
    	
    	int choosePlayerTurn = 0;
    	boolean checker = true;
		
		while (checker){
       		System.out.print("Enter number of the first player to move ( 1 or 2 ): ");
        	try {
            	choosePlayerTurn = input.nextInt();
            	
            	if (choosePlayerTurn == 1 || choosePlayerTurn == 2){
            		checker = true;
            		break;
            	}
        	}
        	catch (Throwable t) {
            	System.out.println("Crashing program, user input was not an int! Please try again...");
            	System.exit(-1);
            	break;
       		}
        }
        
        //Setup Players
        
        if (choosePlayerTurn == 1){
        	//Player one goes first!
        	player[0] = new Player(Player.Colour.WHITE, true);
        	player[1] = new Player(Player.Colour.BLACK, false);
        }else{
        	//Player two goes first!
        	player[0] = new Player(Player.Colour.WHITE, false);
        	player[1] = new Player(Player.Colour.BLACK, true);
        }
		
		System.out.println("\nSelected Player: Player_" + choosePlayerTurn);
    	
    	
    	vb.displayViewBoard();
    	
    	
    	//This should be called when wanting to find a new player!
    	//Find next player turn
    	boolean checkPlayer = false;
    	for (int i = 0; i < 2; i++){
    		System.out.println("Turn: " + player[i].getTurn());
    		checkPlayer = driver.playerTurn(player[i]);
    		if (checkPlayer){
    			//Set Player Turn of i
    			System.out.println("Players Turn: Player_" + i );
    			
    			if (i == 0){
    				driver.setTurn(Turn.playerOne);
    			}else if (i == 1){
    				driver.setTurn(Turn.playerTwo);
    			}
    		}else{
    			//System.out.println("Not Players Turn");
    		}
    	} 	
    	
    	
	}
	
	
	//Driver Method's
	public boolean playerTurn(Player player){
		//Lets player know it is their turn.
		
		if (player.getTurn()){
			return true;
		}
		
		return false;
	}
	
	//Getter's
	public Turn getTurn(){
		return turn;
	}
	
	
	//Setter's
	public void setTurn(Turn t){
		turn = t;
	}
	
	
	//This method does not work properly with document specs, they want to return a colour and this class does not have any
	//colour instance to use it properly!
	//Document needs Colour enum!!
	
	//public Colour chooseColour(Player player){
		//Allows players to choose their colour, returns the colour that was chosen.
		
		//return null;
	//}
	
}