package FunctionLayer;

/**
 *
 * @author wtfak
 */


public class Order {
    
    //everything needed for the order
    private int orderId;
    private int length;
    private int height;
    private int width;

    public Order(int length, int width, int height) {
        this.length = length;
        this.height = height;
        this.width = width;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    
    
}
