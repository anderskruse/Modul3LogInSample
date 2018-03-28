package DBAccess;

import FunctionLayer.LoginSampleException;
import FunctionLayer.Order;
import FunctionLayer.OrderException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author wtfak
 */
public class OrderMapper {

public static void createOrder(Order order, int userId) throws OrderException
    {
        try
        {
            Connection con = Connector.connection();
                String SQL = "INSERT INTO `order` (length, width, height, user_userId) VALUES (?, ?, ?, ?)";
                PreparedStatement ps = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
                ps.setInt(3, order.getLength());
                ps.setInt(2, order.getWidth());
                ps.setInt(1, order.getHeight());
                ps.setInt(4, userId);
                ps.executeUpdate();
                ResultSet ids = ps.getGeneratedKeys();
                ids.next();
                int id = ids.getInt(1);
                order.setId(id);
            
        } catch (SQLException | ClassNotFoundException ex)
        {
            throw new OrderException(ex.getMessage());
        }
    }

public static ArrayList<Order> getOrders(int userId) throws OrderException
    {
        try
        {
            Connection con = Connector.connection();
            String SQL = "select * from `order` where user_userId = ?";
            PreparedStatement ps = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, userId);
            ArrayList<Order> orders = new ArrayList<>();
            Order order = null;
            ResultSet rs = null;
            rs = ps.executeQuery();

            while (rs.next())
            {
                int id = rs.getInt("id");
                int height = rs.getInt("height");
                int width = rs.getInt("width");
                int length = rs.getInt("length");
                String status = rs.getString("shipped");
                order = new Order(id, length, width, height, status);
                orders.add(order);
            }
            return orders;
        } catch (SQLException | ClassNotFoundException ex)
        {
            throw new OrderException(ex.getMessage());
        }
    }

    public static void updateStatus(Order order, int userId) throws OrderException {
        try {
            Connection con = Connector.connection();
            String SQL = "UPDATE `legoHouse`.`order` SET `shipped`='Shipped' WHERE `id`=? and`user_userId`=?";
            PreparedStatement ps = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, order.getId());
            ps.setInt(2, userId);
            ps.executeUpdate();
        } catch (SQLException | ClassNotFoundException ex) {
            throw new OrderException(ex.getMessage());
        }
    }

}
