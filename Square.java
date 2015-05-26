/**
 * This class models squares on a 1010! board.
 * 
 * @author Lyndon While
 * @version 1.00
 */
import java.awt.Color;

public class Square
{
    public static final Color bgColour = Color.white; 
    
    private boolean on;   // whether the square is occupied 
    private Color colour; // the current colour of the square 

    // set the square to unoccupied
    public Square()
    {
        unset();
    }
    
    // return the square's current colour 
    public Color getColour()
    {
        return colour;
    }

    // return the square's current status 
    public boolean status()
    {
        return on; 
    }
    
    // set the square to occupied with colour c 
    public void set(Color c)
    {
        on = true;
        colour = c;
    }
    
    // set the square to unoccupied 
    public void unset()
    {
        on = false;
        colour = bgColour;
    }
}
