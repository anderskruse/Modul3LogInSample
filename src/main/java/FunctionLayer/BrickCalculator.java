package FunctionLayer;

import java.util.ArrayList;

/**
 *
 * @author wtfak
 */
public class BrickCalculator {

    private Brick b2x4 = new Brick(0, 2, 4);
    private Brick b2x2 = new Brick(0, 2, 2);
    private Brick b1x2 = new Brick(0, 1, 2);
    ArrayList<Brick> brickList = new ArrayList();

    public ArrayList<Brick> houseSide(int length, int width, int height, boolean doorWindow) {
        
        int needThisForWhileLoop = 1;
        
        //when the height is > 1
        while (needThisForWhileLoop <= height) {
            int tempLength = length;
            int tempWidth = width;
            // ========== CALCULATE LENGTH =============
            //4 represents the number of dots the 2x4 brick is long, which is the longest brick.
            //Removing 4 dots from the length if the height is currently at an uneven number, otherwise it is deducted from the width.
            //Multiplicating and adding by 2 everytime, as we are building a "house", we need a wall
            //for 2 sides, so the house is not uneven

            if (needThisForWhileLoop % 2 != 0) // If it's an uneven layer
            {
                tempLength -= 4;
            } else { // if it's an even layer
                tempWidth -= 4;
            }
            if (tempLength % 4 == 1) {
                b1x2.setQty(b1x2.getQty() + 2);
                tempLength -= 1;
            }
            if (tempLength % 4 == 2) {
                b2x2.setQty(b2x2.getQty() + 2);
                tempLength -= 2;
            }
            if (tempLength % 4 == 3) {
                b1x2.setQty(b1x2.getQty() + 2);
                b2x2.setQty(b2x2.getQty() + 2);
                tempLength -= 3;
            }
            if (tempLength % 4 == 0) {
                b2x4.setQty(b2x4.getQty() + ((tempLength) / 4) * 2);
            }
            // ========== CALCULATE WIDTH =============
            if (tempWidth % 4 == 1) {
                b1x2.setQty(b1x2.getQty() + 2);
                tempWidth -= 1;
            }
            if (tempWidth % 4 == 2) {
                b2x2.setQty(b2x2.getQty() + 2);
                tempWidth -= 2;
            }
            if (tempWidth % 4 == 3) {
                b1x2.setQty(b1x2.getQty() + 2);
                b2x2.setQty(b2x2.getQty() + 2);
                tempWidth -= 3;
            }
            if (tempWidth % 4 == 0) {
                b2x4.setQty(b2x4.getQty() + (tempWidth / 4) * 2);
            }
            needThisForWhileLoop++;
        }
        brickList.add(b2x4);
        brickList.add(b2x2);
        brickList.add(b1x2);
        return brickList;
    }
}
