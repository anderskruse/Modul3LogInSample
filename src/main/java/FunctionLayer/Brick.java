package FunctionLayer;

/**
 *
 * @author wtfak
 */


public class Brick {
    
    private int width;
    private int length;
    private int height;
    private int qty;

    public Brick(int width, int length, int height, int qty) {
        this.width = width;
        this.length = length;
        this.height = height;
        this.qty = qty;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
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

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

 

    
    //prints a nice overview of the bricks used
    @Override
    public String toString() {
        
        
        if(length == 1)
        {
            return width + "*" + length + " [:]";
        }
        
        if(length == 2){
            return width + "*" + length + " [::]";
            
        } else {
            return width + "*" + length + " [::::]";
        }
        
            
    }
    
    

 
    

    
    
}
