package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.GestionCajero;

/**
 * Servlet implementation class ExtraccionAction
 */
@WebServlet("/ExtraccionAction")
public class ExtraccionAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		double cantidad=Double.parseDouble(request.getParameter("cantidad"));
		int numCuenta=Integer.parseInt((String)request.getSession().getAttribute("idCliente"));
		RequestDispatcher rd;
		GestionCajero gcajero=new GestionCajero();
		gcajero.extraer(numCuenta, cantidad);
		rd=request.getRequestDispatcher("Controller?op=toOperacion");
		rd.forward(request,response);
	}

}
