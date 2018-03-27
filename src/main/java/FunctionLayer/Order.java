package FunctionLayer;

/**
 *
 * @author wtfak
 */
public class Order {

    private int id;
    private int height;
    private int width;
    private int length;
    private String shipped;
    private int userId;
    private String email;

    //From the user, to be put into database
    public Order(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    // order from the database, used to show orders
    public Order(int id, int length, int width, int height, String shipped) {
        this.id = id;
        this.height = height;
        this.width = width;
        this.length = length;
        this.shipped = shipped;
    }

    public int getUserId() {
        return userId;
    }

    public String getEmail() {
        return email;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getId() {
        return id;
    }

    public String getShipped() {
        return shipped;
    }

    public void setShipped(String shipped) {
        this.shipped = shipped;
    }

    public void setId(int id) {
        this.id = id;
    }

}
