package FunctionLayer;

/**
 *
 * @author wtfak
 */
public class Brick
{

    private int brickWidth;
    private int brickLength;
    private int qty;

    public Brick(int qty, int dotsWidth, int dotsLength)
    {
        this.qty = qty;
        this.brickWidth = dotsWidth;
        this.brickLength = dotsLength;
    }

    public int getDotsWidth()
    {
        return brickWidth;
    }

    public int getDotsLength()
    {
        return brickLength;
    }

    public int getQty()
    {
        return qty;
    }

    public void setQty(int qty)
    {
        this.qty = qty;
    }

    @Override
    public String toString()
    {
        if (brickLength == 1)
        {
            return brickWidth + "x" + brickLength + " [:]";
        }
        if (brickLength == 2)
        {
            return brickWidth + "x" + brickLength + " [::]";
        } else
        {
            return brickWidth + "x" + brickLength + " [::::]";
        }
    }

}
