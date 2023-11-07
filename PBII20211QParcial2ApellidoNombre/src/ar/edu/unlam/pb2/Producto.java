package ar.edu.unlam.pb2;

import java.util.Objects;

public abstract class Producto {
	@Override
	public String toString() {
		return "Producto [id=" + id + ", precio=" + precio + "]";
	}
	private Integer id;
	private Double precio;
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Producto))
			return false;
		Producto other = (Producto) obj;
		return Objects.equals(id, other.id);
	}
	
}
