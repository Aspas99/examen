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
 * Servlet implementation class MovimientosAction
 */
@WebServlet("/MovimientosAction")
public class MovimientosAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int numCuenta=Integer.parseInt((String)request.getSession().getAttribute("idCliente"));
		RequestDispatcher rd;
		GestionCajero gcajero=new GestionCajero();
		request.setAttribute("movimientos",gcajero.obtenerMovimientos(numCuenta));
		request.setAttribute("saldo", gcajero.recuperaSaldoCuenta(numCuenta));
		rd=request.getRequestDispatcher("movimientos.jsp");
		rd.forward(request,response);
		
		
	}

	
}
