package ar.edu.unlam.pb2;

public class Heladera extends Electrodomestico {

	private String descripcion;
	private String marca;
	private Boolean noFrost;

	public Heladera(Integer id, String descripcion, Boolean noFrost, Integer garantia, String marca, Double precio) {
		super(id, garantia, precio);
		this.setDescripcion(descripcion);
		this.marca = marca;
		this.setNoFrost(noFrost);
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

	public Boolean isNoFrost() {
		return noFrost;
	}

	public void setNoFrost(Boolean noFrost) {
		this.noFrost = noFrost;
	}

}
