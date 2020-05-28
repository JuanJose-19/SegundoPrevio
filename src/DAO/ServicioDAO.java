


package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import DTO.Servicio;
import Modelo.Conexion;


public class ServicioDAO {
	
	private Servicio servicio;
	private List<Servicio> servicios = new ArrayList<Servicio>();
	private Conexion con;
	
	public ServicioDAO(){
		// TODO Auto-generated constructor stub
		this.con = Conexion.getConexion();
	}
	
	public void insertar(Servicio servicio){
		String sql = "INSERT INTO servicio (id, nombre, "
				+ "descripcion, tienda) VALUES('"+servicio.getId()+"',"
				+ " '"+servicio.getNombre()+"', "
				+ "'"+servicio.getDescripcion()+"', "
				+ "'"+servicio.getTienda()+"')";
		
		try {
			con.insert(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void actualizar(Servicio servicio){
		String sql = "UPDATE servicio SET "
				+ "nombre = '"+servicio.getNombre()+"', "
				+ "descripcion = "+servicio.getDescripcion()+", "
				+ "tienda = "+servicio.getTienda()+" "
				+ "WHERE id = '"+servicio.getId()+"'";
		try {
			con.insert(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void eliminar(Servicio servicio){
		String sql = "DELETE FROM servicio "
				+ "WHERE id = '"+servicio.getId()+"'";
		try {
			con.insert(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
public Servicio buscar(Integer id){
		
		String sql = "SELECT * FROM servicio "
				+ "WHERE id = '"+id+"'";
		System.out.println(sql);
		
		servicio = null;
		ResultSet res;
		
		try {
			res = con.query(sql);
			while(res.next()){
				servicio = new Servicio();
				servicio.setId(res.getInt("id"));
        	    servicio.setNombre(res.getString("nombre"));
        	    servicio.setDescripcion(res.getString("descripcion"));
        	    servicio.setTienda(res.getInt("tienda"));
				
				
			}
	   	res.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return servicio;
	}




public List<Servicio> listar(){
	String sql = "SELECT * FROM servicio ";
	
	
	servicio = null;
	ResultSet res;
	
	try {
		res = con.query(sql);
		while(res.next()){
			servicio = new Servicio();
			servicio.setId(res.getInt("id"));
    	    servicio.setNombre(res.getString("nombre"));
    	    servicio.setDescripcion(res.getString("descripcion"));
    	    servicio.setTienda(res.getInt("tienda"));
    	    this.servicios.add(servicio);
		}
   	res.close();
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return this.servicios;
	}
}
