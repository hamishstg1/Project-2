/**
 * This class models piece-boxes in 1010!.
 * 
 * @author Lyndon While
 * @version 1.00
 */
import java.awt.Color;

public class Box
{
    private boolean full; // whether the box is occupied 
    private Piece piece;  // the piece currently stored in the box, if any 

    // set up an empty box 
    public Box()
    {
        full = false;
        piece = null;
    }
    
    // return true if the box currently holds a piece 
    public boolean occupied()
    {
        return full;
    }
    
    // return the current piece 
    public Piece getPiece()
    {
        return piece;
    }

    // return the current piece, and set the box to empty - i.e. consume the piece 
    public Piece useBox()
    {
        full = false;
        return piece;
    }
    
    // place a piece in the box 
    public void fillBox(Piece p)
    {
        full = true;
        piece = p;
    }
}
