package FunctionLayer;

import DBAccess.OrderMapper;
import DBAccess.UserMapper;
import java.util.ArrayList;
import java.util.List;

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

    public static Order createOrder(int length, int width, int height, int userId) throws OrderException {
        Order order = new Order(length, width, height);
        OrderMapper.createOrder(order, userId);
        return order;
    }

    public static ArrayList<Brick> orderToBrick(Order order, boolean doorWindow) {
        House house = new House();
        ArrayList<Brick> brickList = house.calculateWall(order.getHeight(), order.getLength(), order.getWidth());
        return brickList;

    }

    public static ArrayList<Order> orders(User user) throws OrderException {
        return OrderMapper.getOrders(user.getId());
    }

    public static List<Order> showOrder(int orderId) throws LoginSampleException {
        List<Order> showOrder = UserMapper.showOrder(orderId);
        return showOrder;
    }
}
