package FunctionLayer;

import DBAccess.UserMapper;

/**
 * The purpose of LogicFacade is to...
 * @author kasper
 */
public class LogicFacade {

    public static User login( String email, String password ) throws LoginSampleException {
        return UserMapper.login( email, password );
    } 

    public static User createUser( String email, String password ) throws LoginSampleException {
        User user = new User(email, password, "customer");
        UserMapper.createUser( user );
        return user;
    }

    


    public static Order createOrder(int length, int width, int height) {
        Order order = new Order(length, width, height);
        
        return order;
        
    }

    public static Brick createBrickList(Order order) {
        Brick brickList = new Brick(order);
        
        return brickList;
    }
}
