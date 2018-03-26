package FunctionLayer;

import java.util.ArrayList;

/**
 *
 * @author wtfak
 */
public class BrickCalculator {

    private final int smallBrick = 1;
    private final int mediumBrick = 2;
    private final int largeBrick = 4;
    private int smallQty = 0;
    private int mediumQty = 0;
    private int largeQty = 0;
    private int foundation;

    public Brick brickCalc(int width, int length, int height) {
        
        

        //Starts with width - the sides with no windows or doors. 
        //Changes to length, when i == height, and runs through the loop again. 
        foundation = width;
        if (length % 4 == 0) {
            largeQty -= 4;
            mediumQty += 4;
        } else {

            largeQty += (foundation / largeBrick) * 2;
            foundation = foundation % largeBrick;
            mediumQty += (foundation / mediumBrick) * 2;
            foundation = foundation % mediumBrick;
            smallQty += (foundation / smallBrick) * 2;
        }

        return new Brick(height, largeQty, mediumQty, smallQty);
    }

}
