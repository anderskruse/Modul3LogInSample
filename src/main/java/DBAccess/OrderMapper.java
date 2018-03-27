package DBAccess;

import FunctionLayer.LoginSampleException;
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

public static void createOrder(Order order, int userId) throws LoginSampleException
    {
        try
        {
            Connection con = Connector.connection();
                String SQL = "INSERT INTO `order` (length, width, height, user_userId) VALUES (?, ?, ?, ?)";
                PreparedStatement ps = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
                ps.setInt(1, order.getHeight());
                ps.setInt(2, order.getWidth());
                ps.setInt(3, order.getLength());
                ps.setInt(4, userId);
                ps.executeUpdate();
                ResultSet ids = ps.getGeneratedKeys();
                ids.next();
                int id = ids.getInt(1);
                order.setId(id);
            
        } catch (SQLException | ClassNotFoundException ex)
        {
            throw new LoginSampleException(ex.getMessage());
        }
    }

public static Order getOrder(int orderId) throws LoginSampleException
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
                int id = rs.getInt("id");
                int height = rs.getInt("height");
                int width = rs.getInt("width");
                int length = rs.getInt("length");
                String shipped = rs.getString("shipped");
                order = new Order(id, length, width, height, shipped);
            }
            return order;
        } catch (ClassNotFoundException | SQLException ex)
        {
            throw new LoginSampleException(ex.getMessage());
        }
    }

    public static void updateStatus(Order order, int userId) throws LoginSampleException {
        try {
            Connection con = Connector.connection();
            String SQL = "UPDATE `legoHouse`.`order` SET `shipped`='Shipped' WHERE `id`=? and`user_userId`=?";
            PreparedStatement ps = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, order.getId());
            ps.setInt(2, userId);
            ps.executeUpdate();
        } catch (SQLException | ClassNotFoundException ex) {
            throw new LoginSampleException(ex.getMessage());
        }
    }

}
