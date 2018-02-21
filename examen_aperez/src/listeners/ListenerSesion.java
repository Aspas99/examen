package listeners;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;



/**
 * Application Lifecycle Listener implementation class ListenerSesion
 *
 */
@WebListener
public class ListenerSesion implements HttpSessionListener {

    /**
     * Default constructor. 
     */
    public ListenerSesion() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent arg0)  { 
    	HttpSession sesion = arg0.getSession();
    	/*List<Libro> libros=new ArrayList<>();
    	sesion.setAttribute("carrito", libros);*/
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent arg0)  { 
         // TODO Auto-generated method stub
    }
	
}
