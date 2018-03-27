package FunctionLayer;

import DBAccess.OrderMapper;
import DBAccess.UserMapper;

/**
 *
 * @author wtfakm
 */
public class LogicFacade {

    public static User login(String email, String password) throws LoginSampleException {
        return UserMapper.login(email, password);
    }

    public static User createUser(String email, String password) throws LoginSampleException {
        User user = new User(email, password, "customer");
        UserMapper.createUser(user);
        return user;
    }

    public static Order createOrder(int length, int width, int height, int userId) throws LoginSampleException {
        Order order = new Order(length, width, height);
        OrderMapper.createOrder(order, userId);
        return order;
    }

    public static Order showOrder(int orderId) throws LoginSampleException {
        Order showOrder = OrderMapper.getOrder(orderId);
        return showOrder;
    }
}
