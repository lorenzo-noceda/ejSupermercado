package ar.edu.unlam.pb2;

public abstract class Indumentaria extends Producto {
	private String talle;
	private String color;
	
	public Indumentaria(Integer id, String talle, Double precio, String color) {
		setId(id);
		this.setTalle(talle);
		setPrecio(precio);
		this.setColor(color);
	}

	public String getTalle() {
		return talle;
	}

	public void setTalle(String talle) {
		this.talle = talle;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
}
