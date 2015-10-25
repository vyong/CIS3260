import java.io.*;
import java.util.*;


public class test{


public static void main(String [ ] args)
	{
		System.out.println("\n---- Piece ----");
		Piece piece1 = new Piece(); 
		System.out.println("Piece default data: ");
		System.out.println("Colour: " + piece1.getColour() + "     X Coordinate: " + piece1.getX() + "     Y Coordinate: " + piece1.getY());
		System.out.println("Changing data ...");
		piece1.setX(2);
		piece1.setY(3);
		//piece1.setColour(BLACK); does not work
		System.out.println("Updated piece data: ");
		System.out.println("Colour: " + piece1.getColour() + "     X Coordinate: " + piece1.getX() + "     Y Coordinate: " + piece1.getY());
		System.out.println("Note: could not change piece color as the enum for color could not be found \n");
		
		System.out.println("---- Cell ----");
		Cell testCell = new Cell(); 
		System.out.println("Setting cells occupant to already created piece ...");
		testCell.setOccupant(piece1); 
		System.out.println("Cells occupant: " + testCell.getOccupant());
 		System.out.println("Accessing piece data from cell: ");
 		System.out.println("Colour: " + testCell.getOccupant().getColour() + "     X Coordinate: " + testCell.getOccupant().getX() + "     Y Coordinate: " + testCell.getOccupant().getY() + "\n");
		
 		System.out.println("---- Rules ----");
 		Rules rules = new Rules(); 
		Piece piece2 = new Piece(); 
		Boolean result = false; 
		piece2.setX(3);
		piece2.setY(4);

		System.out.println("Testing valid attack method ");
		result = rules.validAttack(piece1,piece2,piece1.getX(),piece1.getY(),piece2.getX(),piece2.getY()); 
		System.out.println("result: " + result);
		System.out.println("Testing valid move method ");
		result = rules.validMove(piece1, piece1.getX(), piece1.getY(), 3, 2); 
		System.out.println("result: " + result);
		System.out.println("Testing valid place method ");
		result = rules.validPlace(piece1,piece1.getX(), piece1.getY());
		System.out.println("result: " + result);
		System.out.println("Testing valid take method ");
		result = rules.validTake(piece1, piece1.getX(), piece1.getY()); 
		System.out.println("result: " + result);
		System.out.println("");

 		System.out.println("---- Board ----"); 
 		Board testBoard = new Board(5,6); 
 		System.out.println("Putting Piece in grid position x:2 y:3");
 		testBoard.cells[2][3] = testCell; 

 		for(int i=0;i<5;i++)
 		{
 			for(int k=0;k<6;k++)
 			{
 				System.out.print("testBoard cells["+i+"]["+k+"] = " + testBoard.cells[i][k]);
 				if(testBoard.cells[i][k] != null){System.out.println("-> Cell occupant = " + testBoard.cells[i][k].getOccupant());}
 				else {System.out.println("");}
 			}
 		}

 		System.out.println("\nTesting checkCell method at 2,3..."); 
 		Piece testPiece = new Piece();
 		testPiece = testBoard.checkCell(2,3); 
 		if(testPiece != null)
 		{
 			System.out.println("Found an occupant: " + testPiece);
 		}
 		else
 		{
 			System.out.println("No piece in selected cell");
 		}

 		System.out.println("Testing checkCell method at 3,4..."); 

 		testPiece = testBoard.checkCell(3,4); 
 		if(testPiece != null)
 		{
 			System.out.println("Found an occupant: " + testPiece);
 		}
 		else
 		{
 			System.out.println("No piece in selected cell");
 		}

 		System.out.println("\nTesting checkPlacement at 2,3"); 
 		result = testBoard.checkPlacement(2,3); 
 		System.out.println("result: " + result);
 		// check attack giving exception 
  		/*System.out.println("Testing checkAttack at 2,3 -> 0,0"); 
 		result = testBoard.checkAttack(2,3,0,0); 
 		System.out.println("result: " + result);	*/ 	
 		//check move giving exception
		/*System.out.println("Testing checkMove at 2,3 -> 0,0"); 
 		result = testBoard.checkMove(2,3,2,4); 
 		System.out.println("result: " + result);	*/	

 		System.out.println("Testing checkTake at 2,3"); 
 		result = testBoard.checkTake(2,3); 
 		System.out.println("result: " + result);

 		System.out.println("\n---- View ----"); 
 		View testView = new View();
 		System.out.println("Displaying gameboard"); 
 		testView.displayViewBoard();

 		System.out.println("\nDisplaying board pieces: \n");

		for(int i=0;i<5;i++)
 		{
 			for(int k=0;k<6;k++)
 			{ 				
 				System.out.print(testBoard.cells[i][k] + " ");
 			}
			System.out.println("");
 		}

 		System.out.println("\n---- Player ----"); 
 		Player p1 = new Player(); 

 		p1.setPieceCount(12); 
 		p1.setTurn(true); 

 		System.out.println(p1.getColour() + " Player piece count: " + p1.getPieceCount() + " Current turn = " + p1.getTurn());

	}

}