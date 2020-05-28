package DTO;

public class Servicio {

	private Integer id;
	private String nombre;
	private String descripcion;
	private Integer tienda;
	
	
	public Servicio() {
		super();
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public Integer getTienda() {
		return tienda;
	}


	public void setTienda(Integer tienda) {
		this.tienda = tienda;
	}
	
	
}
