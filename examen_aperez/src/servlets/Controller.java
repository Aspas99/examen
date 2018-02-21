package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String op=request.getParameter("op");
		String url="";
		
		switch(op) {
		case "toLogin":
				url="login.html";
				break;
		case "toOperacion":
				url="operacion.html";
				break;
		case "toNoLogin":
			    url="noLogin.html";
			    break;
		case "toIngreso":
		    	url="ingreso.html";
		    	break;
		case "toExtraccion":
				url="extraccion.html";
		    	break;	
		case "toMovimientos":
			url="movimientos.jsp";
			break;
		case "doLogin":
				url="LoginAction";
				break;
		case "doIngreso":
				url="IngresoAction";
				break;
		case "doExtraccion":
				url="ExtraccionAction";
				break;
		case "doLibros":
				url="LibrosAction";
				break;
		case "doMovimientos":
				url="MovimientosAction";
				break;
	
		}
		request.getRequestDispatcher(url).forward(request, response); //usamos la url para redirigir a la pagina/servlet corresp
	}

}
