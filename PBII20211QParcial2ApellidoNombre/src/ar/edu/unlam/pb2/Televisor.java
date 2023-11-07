package ar.edu.unlam.pb2;

public class Televisor extends Electrodomestico {

	private String descripcion;
	private String marca;
	private Integer pulgadas;

	public Televisor(Integer id, String descripcion, Integer pulgadas, Integer garantia, String marca, Double precio) {
		super(id, garantia, precio);
		this.setDescripcion(descripcion);
		this.marca = marca;
		this.setPulgadas(pulgadas);
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

	public Integer getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(Integer pulgadas) {
		this.pulgadas = pulgadas;
	}

}
