package FunctionLayer;

import java.util.ArrayList;

/**
 *
 * @author wtfak
 */
public class House {
    // read as ...Brick largeBrick = new Brick(qty, width, length)
    private final Brick smallBrick = new Brick(0, 1, 2);
    private final Brick mediumBrick = new Brick(0, 2, 2);
    private final Brick largeBrick = new Brick(0, 2, 4);
    ArrayList<Brick> brickList = new ArrayList();

    public ArrayList<Brick> calculateWall(int height, int length, int width) {
        int count = 1;
        while (count <= height) {
            int tempLength = length;
            int tempWidth = width;
            if (count < 4) {
                tempLength -= 4;
                tempWidth -= 2;
            }
            // ========== CALCULATE LENGTH =============
            //4 represents the number of dots the 2x4 brick is long, which is the longest brick.
            //Removing 4 dots from the length if the height is currently at an uneven number, otherwise it is deducted from the width.
            //adding by 2 everytime, as a house needs 2 walls to be even.
            //then % the longest brick, 4, to see how much space is left and add brick accordingly

            //used to make the bricks forbandt
            if (count % 2 != 0) // If it's an uneven layer
            {
                tempLength -= 4;
            } else { // if it's an even layer
                tempWidth -= 4;
            }
            if (tempLength % 4 == 1) {
                smallBrick.setQty(smallBrick.getQty() + 2);
                tempLength -= 1;
            }
            if (tempLength % 4 == 2) {
                mediumBrick.setQty(mediumBrick.getQty() + 2);
                tempLength -= 2;
            }
            if (tempLength % 4 == 3) {
                smallBrick.setQty(smallBrick.getQty() + 2);
                mediumBrick.setQty(mediumBrick.getQty() + 2);
                tempLength -= 3;
            }
            if (tempLength % 4 == 0) {
                largeBrick.setQty(largeBrick.getQty() + ((tempLength) / 4) * 2);
            }
            // ========== CALCULATE WIDTH =============
            if (tempWidth % 4 == 1) {
                smallBrick.setQty(smallBrick.getQty() + 2);
                tempWidth -= 1;
            }
            if (tempWidth % 4 == 2) {
                mediumBrick.setQty(mediumBrick.getQty() + 2);
                tempWidth -= 2;
            }
            if (tempWidth % 4 == 3) {
                smallBrick.setQty(smallBrick.getQty() + 2);
                mediumBrick.setQty(mediumBrick.getQty() + 2);
                tempWidth -= 3;
            }
            if (tempWidth % 4 == 0) {
                largeBrick.setQty(largeBrick.getQty() + (tempWidth / 4) * 2);
            }
            count++;
        }
        brickList.add(largeBrick);
        brickList.add(mediumBrick);
        brickList.add(smallBrick);
        return brickList;
    }
}
