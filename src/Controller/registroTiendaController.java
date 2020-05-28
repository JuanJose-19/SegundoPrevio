package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DTO.Tienda;

/**
 * Servlet implementation class registroTiendaController
 */
@WebServlet("/registroTiendaController")
public class registroTiendaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public registroTiendaController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		String nombre = request.getParameter("nombre");
		String lema = request.getParameter("lema");
		String descripcion = request.getParameter("descripcion");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String propietario = request.getParameter("propietario");
		String facebook = request.getParameter("facebook");
		String web = request.getParameter("web");
		String imagen = request.getParameter("imagen");
		
		Tienda tienda = new Tienda();
		
		tienda.setNombre(nombre);
		tienda.setLema(lema);
		tienda.setDescripcion(descripcion);
		tienda.setEmail(email);
		tienda.setClave(password);
		tienda.setPropietario(propietario);
		tienda.setFacebook(facebook);
		tienda.setWeb(web);
		tienda.setImagen(imagen);
		
		
	}

}
