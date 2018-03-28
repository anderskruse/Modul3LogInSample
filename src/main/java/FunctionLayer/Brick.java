package FunctionLayer;

/**
 *
 * @author wtfak
 */
public class Brick {

    private int qty;
    private int dotWidth;
    private int dotLength;

    public Brick(int height, int smallQty, int mediumQty) {
        this.qty = height;
        this.dotWidth = smallQty;
        this.dotLength = mediumQty;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getDotWidth() {
        return dotWidth;
    }

    public void setDotWidth(int dotWidth) {
        this.dotWidth = dotWidth;
    }

    public int getDotLength() {
        return dotLength;
    }

    public void setDotLength(int dotLength) {
        this.dotLength = dotLength;
    }



    @Override
    public String toString()
    {
        if (dotLength == 1)
        {
            return dotWidth + "x" + dotLength + " [:]";
        }
        if (dotLength == 2)
        {
            return dotWidth + "x" + dotLength + " [::]";
        } else
        {
            return dotWidth + "x" + dotLength + " [::::]";
        }
    }





}
