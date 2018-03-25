package DBAccess;

import FunctionLayer.Order;
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
            String SQL = "INSERT INTO `order` (length, height, width, users_id) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, order.getHeight());
            ps.setInt(2, order.getWidth());
            ps.setInt(3, order.getLength());
            ps.setInt(4, userId);
            ps.executeUpdate();
            ResultSet ids = ps.getGeneratedKeys();
            ids.next();
            int id = ids.getInt(1);
            order.setOrderId(id);
        } catch (SQLException | ClassNotFoundException ex)
        {
            //throw new OrderException(ex.getMessage());
        }
    }

    public static ArrayList<Order> getOrders(int userId) throws OrderException
    {
        try
        {
            Connection con = Connector.connection();

            String SQL = "select * from `order` where user_id = ?;";
            PreparedStatement ps = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, userId);
            ArrayList<Order> orders = new ArrayList<Order>();
            Order order = null;
            ResultSet rs = null;
            rs = ps.executeQuery();

            while (rs.next())
            {
                int id = rs.getInt("id");
                int height = rs.getInt("height");
                int width = rs.getInt("width");
                int length = rs.getInt("length");
                order = new Order(id, height, width, length);
                orders.add(order);
            }

            return orders;
        } catch (SQLException | ClassNotFoundException ex)
        {
            throw new OrderException(ex.getMessage());
        }
    }

    public static Order getOrder(int orderId) throws OrderException
    {
        try
        {
            Connection con = Connector.connection();
            String SQL = "select * from `order` where id = ?;";
            PreparedStatement ps = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, orderId);
            Order order = null;
            ResultSet rs = ps.executeQuery();
            if (rs.next())
            {
                int height = rs.getInt("height");
                int width = rs.getInt("width");
                int length = rs.getInt("length");
                order = new Order(height, width, length);
            }
            return order;
        } catch (ClassNotFoundException | SQLException ex)
        {
            throw new OrderException(ex.getMessage());
        }
    }
    
}
