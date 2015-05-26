/**
 * This class models the 1010! set-up.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;

public class GameState
{
    public static final int noOfSquares = 10; // the extent of the board in both directions
    public static final int noOfBoxes   = 3;  // the number of boxes in the game 
    
    private Square[][] board; // the current state of the board 
    private Box[] boxes;      // the current state of the boxes 
    private int score;        // the current score

    // initialise the instance variables for board 
    // all squares and all boxes are initially empty 
    public GameState()
    {
        
    }
    
    // return the current state of the board 
    public Square[][] getBoard()
    {
        return board;
    }
  
    // return the current contents of Box i 
    public Box getBox(int i)
    {
        if (0 <= i && i < noOfBoxes) return boxes[i];
        else                         return null;
    }
    
    // return the current score
    public int getScore()
    {
        return score;
    }
  
    //     return "ok"       iff p can be legally placed with its (notional) top-left corner at Square x,y 
    // o/w return "offboard" iff any part of p would be off the board 
    // o/w return "occupied" iff any part of p would sit on an occupied square 
    public String canPlacePiece(Piece p, int x, int y)
    {
        ArrayList<String> offsets;
        
    }
    
    // return a list holding all legal moves using the current set of boxes on the current board 
    // each move is represented as an int[] of length 3: 
    // {i, x, y} denotes that the piece in Box i can be legally placed with its (notional) top-left corner at Square x,y 
    public ArrayList<int[]> allLegalMoves()
    {
        // TODO
        return null;
    }
    
    // place p on the board with its (notional) top-left corner at Square x,y 
    // clear columns and rows as appropriate 
    public void placePiece(Piece p, int x, int y)
    {
        // TODO
    }
}
