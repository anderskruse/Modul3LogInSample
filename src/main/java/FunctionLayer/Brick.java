package FunctionLayer;

/**
 *
 * @author wtfak
 */
public class Brick {

    private int height;
    private int smallQty;
    private int mediumQty;
    private int largeQty;

    public Brick(int height, int smallQty, int mediumQty, int largeQty) {
        this.height = height;
        this.smallQty = smallQty;
        this.mediumQty = mediumQty;
        this.largeQty = largeQty;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getSmallQty() {
        return smallQty;
    }

    public void setSmallQty(int smallQty) {
        this.smallQty = smallQty;
    }

    public int getMediumQty() {
        return mediumQty;
    }

    public void setMediumQty(int mediumQty) {
        this.mediumQty = mediumQty;
    }

    public int getLargeQty() {
        return largeQty;
    }

    public void setLargeQty(int largeQty) {
        this.largeQty = largeQty;
    }

    @Override
    public String toString() {
        return "Brick{" + "height=" + height + ", smallQty=" + smallQty + ", mediumQty=" + mediumQty + ", largeQty=" + largeQty + '}';
    }

}
