package FunctionLayer;

import java.util.ArrayList;

/**
 *
 * @author wtfak
 */
public class House {

    private int smallBrick = 1;
    private int mediumBrick = 2;
    private int largeBrick = 4;
    private int smallQty = 0;
    private int mediumQty = 0;
    private int largeQty;
    private int brickThickness = 2;

    public Brick houseCalculator(int height, int width, int length) {

        if (length % 4 == 0) {
            largeQty -= 4;
            mediumQty += 4;
        }else{
            
        largeQty += (width / largeBrick) * 2;
        width = width % largeBrick;
        mediumQty += (width / mediumBrick) * 2;
        width = width % mediumBrick;
        smallQty += (width / smallBrick) * 2;
                    }
        return new Brick(height, largeQty, mediumQty, smallQty);

        }
    }


