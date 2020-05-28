package DAO;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import DTO.Cliente;
import Modelo.Conexion;

public class ClienteDAO {
	
	private Cliente cliente;
	private List<Cliente> clientes = new ArrayList<Cliente>();
	private Conexion con;
	
	public ClienteDAO(){
		// TODO Auto-generated constructor stub
		this.con = Conexion.getConexion();
	}
	
	public void insertar(Cliente cliente){
		String sql = "INSERT INTO cliente (id, nombre, "
				+ "email, clave) VALUES('"+cliente.getId()+"',"
				+ " '"+cliente.getNombre()+"', "
				+ "'"+cliente.getEmail()+"', "
				+ "'"+cliente.getClave()+"')";
		
		try {
			con.insert(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void actualizar(Cliente cliente){
		String sql = "UPDATE cliente SET "
				+ "nombre = '"+cliente.getNombre()+"', "
				+ "email = "+cliente.getEmail()+", "
				+ "clave = "+cliente.getClave()+" "
				+ "WHERE id = '"+cliente.getId()+"'";
		try {
			con.insert(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public void eliminar(Cliente cliente){
		String sql = "DELETE FROM cliente "
				+ "WHERE id = '"+cliente.getId()+"'";
		try {
			con.insert(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
public Cliente buscar(Integer id){
		
		String sql = "SELECT * FROM cliente "
				+ "WHERE id = '"+id+"'";
		System.out.println(sql);
		
		cliente = null;
		ResultSet res;
		
		try {
			res = con.query(sql);
			while(res.next()){
        	    cliente = new Cliente();
        	    cliente.setId(res.getInt("id"));
        	    cliente.setNombre(res.getString("nombre"));
        	    cliente.setEmail(res.getString("email"));
        	    cliente.setClave(res.getString("clave"));
			}
	   	res.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return cliente;
	}


public List<Cliente> listar(){
	String sql = "SELECT * FROM cliente ";
	
	
	cliente = null;
	ResultSet res;
	
	try {
		res = con.query(sql);
		while(res.next()){
    	    cliente = new Cliente();
    	    cliente.setId(res.getInt("id"));
    	    cliente.setNombre(res.getString("nombre"));
    	    cliente.setEmail(res.getString("email"));
    	    cliente.setClave(res.getString("clave"));
    	    this.clientes.add(cliente);
		}
   	res.close();
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return this.clientes;
}
	
}
