package ar.edu.unlam.pb2;

public class Galletitas extends Comestible {

	private String descripcion;
	private String marca;

	public Galletitas(Integer id, String descripcion, String fechaDeElaboracion, String fechaDeVencimiento,
			String marca, Double precio) {
		super(id, fechaDeElaboracion, fechaDeVencimiento, precio);
		this.setDescripcion(descripcion);
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
