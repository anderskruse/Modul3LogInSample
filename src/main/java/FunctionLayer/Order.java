package FunctionLayer;

/**
 *
 * @author wtfak
 */


public class Order {

    private int length;
    private int height;
    private int width;
    private int orderid;
    private int userid;
    private int status;

    public Order(int length, int height, int width, int userid, int status) {
        this.length = length;
        this.height = height;
        this.width = width;
        this.userid = userid;
        this.status = status;
    }

    public Order(int orderid, int length, int height, int width, int userid, int status) {
        this.orderid = orderid;
        this.length = length;
        this.height = height;
        this.width = width;
        this.userid = userid;
        this.status = status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getOrderid() {
        return orderid;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
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

    public int getStatus() {
        return status;
    }

}
