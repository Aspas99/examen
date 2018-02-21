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
 * Servlet implementation class LoginAction
 */
@WebServlet("/LoginAction")
public class LoginAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String numCuenta=request.getParameter("numCuenta");
		
		
		RequestDispatcher rd;
		GestionCajero gcajero = new GestionCajero();
		
		//request.getSession().setAttribute("login", gusuarios.login(usuario, clave));
		if ( gcajero.comprobarCuenta(Integer.parseInt((numCuenta)))) {
			rd=request.getRequestDispatcher("Controller?op=toOperacion");//Transfiere una petición a una vista
			
			request.getSession().setAttribute("idCliente", numCuenta);//Al hacer login, salvamos un atributo de sesion para identificar al usuario
			
		}else {
			
			rd=request.getRequestDispatcher("noLogin.html");//Transfiere una petición a una vista
		}
			
			
			rd.forward(request,response);
			
		
		
	}

}
