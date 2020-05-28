package Pruebas;

import DAO.ClienteDAO;
import DAO.ServicioDAO;
import DAO.TiendaDAO;
import DTO.Cliente;
import DTO.Servicio;
import DTO.Tienda;

public class pruebas {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente cliente = new Cliente();
		ClienteDAO cDAO = new ClienteDAO();
		
		cliente.setId(3);	
		cliente.setNombre("Juan Jose");
		cliente.setEmail("juanjose@gmail.com");
		cliente.setClave("1234");
		
		System.out.println(cDAO.listar().size());
		
		cDAO.insertar(cliente);
		
		//Cliente c2 = cDAO.buscar(100);
		//if(c2!=null){
			//System.out.println(c2.getNombre());
	//	c2.setNombre("Juan");
		//cDAO.actualizar(c2);
			//c2 = cDAO.buscar(120);
			//System.out.println(c2.getNombre());
		//cDAO.eliminar(cliente);
	//}	
		
		Tienda tienda = new Tienda();
		TiendaDAO tDAO = new TiendaDAO();
		
		tienda.setId(5);
		tienda.setNombre("Justo Y Bueno");
		tienda.setLema("Mas Barato Imposible");
		tienda.setDescripcion("Lo Mejor");
		tienda.setEmail("justoybueno@gmail.com");
		tienda.setClave("1234");
		tienda.setPropietario("JuanJose");
		tienda.setFacebook("facebook");
		tienda.setWeb("Web");
		tienda.setImagen("La Imagen");
		
		tDAO.insertar(tienda);
		
		Servicio servicio = new Servicio();
		ServicioDAO sDAO = new ServicioDAO();
		
		servicio.setId(6);	
		servicio.setNombre("Juan Jose");
		servicio.setDescripcion("La Mejor Tienda De Cucuta");
		servicio.setTienda(1234);
		
		sDAO.insertar(servicio);
		
		
		
		
		
}
	}


