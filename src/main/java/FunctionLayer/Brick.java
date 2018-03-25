package FunctionLayer;

/**
 *
 * @author wtfak
 */


public class Brick {
    
    private int brickWidth;
    private int brickLength;
    private int qty;

    public Brick(int brickWidth, int brickLength, int qty) {
        this.brickWidth = brickWidth;
        this.brickLength = brickLength;
        this.qty = qty;
    }

    public int getBrickWidth() {
        return brickWidth;
    }

    public void setBrickWidth(int brickWidth) {
        this.brickWidth = brickWidth;
    }

    public int getBrickLength() {
        return brickLength;
    }

    public void setBrickLength(int brickLength) {
        this.brickLength = brickLength;
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
        
        
        if(brickLength == 1)
        {
            return brickWidth + "*" + brickLength + " [:]";
        }
        
        if(brickLength == 2){
            return brickWidth + "*" + brickLength + " [::]";
            
        } else {
            return brickWidth + "*" + brickLength + " [::::]";
        }
        
            
    }
    
    

 
    

    
    
}
