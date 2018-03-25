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
    private int shipped;

    public Order(int length, int width, int height, int shipped) {
        
        this.length = length;
        this.height = height;
        this.width = width;
        this.shipped = shipped;
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
