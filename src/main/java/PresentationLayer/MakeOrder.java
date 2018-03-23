package PresentationLayer;

import FunctionLayer.Brick;
import FunctionLayer.LogicFacade;
import FunctionLayer.LoginSampleException;
import FunctionLayer.Order;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author wtfak
 */


public class MakeOrder extends Command{
    
    //gets parameters width, length and height from the form "makeorder" in order.jsp, and turns it into an order
    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException {
        int length = Integer.parseInt(request.getParameter("length"));
        int width = Integer.parseInt(request.getParameter( "width" ));
        int height = Integer.parseInt(request.getParameter( "height" ));
        Order order = LogicFacade.createOrder(length, width, height);
        Brick brickList = LogicFacade.createBrickList(order);
        request.setAttribute("brickList", brickList);
        return "ordercreated";
    }
    }
    

