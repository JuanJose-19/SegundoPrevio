package Pruebas;

import DAO.ClienteDAO;
import DTO.Cliente;

public class pruebas {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente cliente = new Cliente();
		ClienteDAO cDAO = new ClienteDAO();
		
	//	cliente.setId(100);	
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
}
	}


