/**
 * This class models pieces in 1010!.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.awt.Color;
import java.util.LinkedList;

public class Piece
{
    // the maximum extent of any piece-type
    public static final int maxPieceSize = 5;
    
    
    private ArrayList<int[]> offsets; // the offsets for the actual squares in this piece 
    private Color colour;             // the colour used for this piece 
    private int xSize, ySize;         // the extent of this piece on each axis

    // initialise this piece by setting up the instance variables 
    // each entry on xs will be either 
    // - a two-digit number MN representing a square with x-offset = M and y-offset = N 
    // - a one-digit number  N representing a square with x-offset = 0 and y-offset = N 
    public Piece(int[] xs)
    {
       offsets = new ArrayList<int[]>();
       LinkedList<Integer> holder = new LinkedList<Integer>();
       for (int value:xs) {
          int[] array = new int[2];
          if (value >= 10) {
              holder.push(value % 10);
              value = value/10;
              holder.push(value % 10);
              array[0] = holder.pop();
              array[1] = holder.pop();
              offsets.add(array);
              System.out.println(array[0] + " " + array[1]);
            }
         
          else {
              array[0] = value%10;
              array[1] = 0;
              offsets.add(array);
          }
       }
       
       xSize = offsets.get(0)[0];
       ySize = offsets.get(0)[1];
       colour = Color.red;
       
       for (int i = 1; i < xs.length;i++) {
           if (xSize < offsets.get(i)[0]) {
               xSize = offsets.get(i)[0];
           }
           if (ySize < offsets.get(i)[1]) {
               ySize = offsets.get(i)[0];
           }
       }
       xSize = xSize + 1;
       ySize = ySize + 1;
    }

    public ArrayList<int[]> getOffsets()
    {
        return offsets;
    }

    public Color getColour()
    {
        return colour;
    }

    public int getxSize()
    {
        return xSize;
    }

    public int getySize()
    {
        return ySize;
    }
}
