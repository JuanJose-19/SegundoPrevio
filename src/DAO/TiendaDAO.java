package DAO;




import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import DTO.Tienda;
import Modelo.Conexion;

public class TiendaDAO {
	
	private Tienda tienda;
	private List<Tienda> tiendas = new ArrayList<Tienda>();
	private Conexion con;

	
	public TiendaDAO(){
		// TODO Auto-generated constructor stub
		this.con = Conexion.getConexion();
	}
	
	
	public void insertar(Tienda tienda){
		String sql = "INSERT INTO tienda (id, nombre, "
				+ "lema, descripcion, email, clave, propietario, facebook, web, imagen) VALUES('"+tienda.getId()+"',"
				+ " '"+tienda.getNombre()+"', "
				+ "'"+tienda.getLema()+"', "
				+ "'"+tienda.getDescripcion()+"', "
				+ "'"+tienda.getEmail()+"', "
				+ "'"+tienda.getClave()+"', "
				+ "'"+tienda.getPropietario()+"', "
				+ "'"+tienda.getFacebook()+"', "
				+ "'"+tienda.getWeb()+"', "
				+ "'"+tienda.getImagen()+"')";
		
		try {
			con.insert(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
