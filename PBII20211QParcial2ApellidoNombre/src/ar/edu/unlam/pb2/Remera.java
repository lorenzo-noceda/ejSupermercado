package ar.edu.unlam.pb2;

public class Remera extends Indumentaria {
	private String descripcion;
	private String marca;

	public Remera(Integer id, String descripcion, String talle, String marca, String color, Double precio) {
		super(id, talle, precio, color);
		this.descripcion = descripcion;
		this.marca = marca;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

}
