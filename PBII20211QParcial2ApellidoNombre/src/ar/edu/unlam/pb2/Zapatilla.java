package ar.edu.unlam.pb2;

public class Zapatilla extends Indumentaria {
	private String descripcion;
	private String marca;

	public Zapatilla(Integer id, String descripcion, Integer talle, String marca, String color, Double precio) {
		super(id, talle.toString(), precio, color);
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
