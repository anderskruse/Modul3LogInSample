package PresentationLayer;

import FunctionLayer.Brick;
import FunctionLayer.LogicFacade;
import FunctionLayer.LoginSampleException;
import FunctionLayer.Order;
import FunctionLayer.User;
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
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException {
        int length = Integer.parseInt(request.getParameter("length"));
        int width = Integer.parseInt(request.getParameter("width"));
        int height = Integer.parseInt(request.getParameter("height"));
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        int userid = user.getId();
        
        Order order = LogicFacade.createOrder(length, width, height, userid);
        session.setAttribute("order", order);
        session.setAttribute("length", length);
        session.setAttribute("width", width);
        session.setAttribute("height", height);

        return "orderconfirmation";
    }
}
