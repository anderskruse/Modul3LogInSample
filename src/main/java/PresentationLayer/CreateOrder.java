package PresentationLayer;

import FunctionLayer.Brick;
import FunctionLayer.House;
import FunctionLayer.LogicFacade;
import FunctionLayer.LoginSampleException;
import FunctionLayer.Order;
import FunctionLayer.OrderException;
import FunctionLayer.User;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author wtfak
 */
public class CreateOrder extends Command {

    //gets parameters width, length and height from the form "makeorder" in order.jsp, and turns it into an order
    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws OrderException {
        int height = Integer.parseInt(request.getParameter("height"));
        int width = Integer.parseInt(request.getParameter("width"));
        int length = Integer.parseInt(request.getParameter("length"));
        boolean doorWindow = false;
        if (height >= 4 && width >= 4 && length >= 4) {
            House house = new House();

            ArrayList<Brick> brickList = house.calculateWall(height, length, width);
            HttpSession session = request.getSession();
            User user = ((User) session.getAttribute("user"));
            Order order = LogicFacade.createOrder(height, width, length, user.getId());
            session.setAttribute("brickList", brickList);
            session.setAttribute("order", order);
            session.setAttribute("height", height);
            session.setAttribute("length", length);
            session.setAttribute("width", width);
            return "orderconfirmation";
        } else {
            throw new OrderException("Please enter a value greater than 3");
        }
    }
}
