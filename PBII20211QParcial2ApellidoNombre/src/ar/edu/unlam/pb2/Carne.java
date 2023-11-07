package ar.edu.unlam.pb2;

public class Carne extends Comestible {

	private String descripcion;
	private String marca;
	private Double kilos;

	public Carne(Integer id, String descripcion, String fechaDeElaboracion, String fechaDeVencimiento, Double kilos,
			String marca, Double precio) {
		super(id, fechaDeElaboracion, fechaDeVencimiento, precio);
		this.setDescripcion(descripcion);
		this.marca = marca;
		this.setKilos(kilos);
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

	public Double getKilos() {
		return kilos;
	}

	public void setKilos(Double kilos) {
		this.kilos = kilos;
	}

}
