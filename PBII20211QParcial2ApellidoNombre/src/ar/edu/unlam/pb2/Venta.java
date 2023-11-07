package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.List;

public class Venta {
	Integer dniDelComprador;
	String nombreDelComprador;
	List<Producto> productos;
	
	public Venta(Integer dniDelComprador, String nombreDelComprador) {
		this.dniDelComprador = dniDelComprador;
		this.nombreDelComprador = nombreDelComprador;
		productos = new ArrayList<>();
	}

	public Integer getDniDelComprador() {
		return dniDelComprador;
	}

	public void setDniDelComprador(Integer dniDelComprador) {
		this.dniDelComprador = dniDelComprador;
	}

	public String getNombreDelComprador() {
		return nombreDelComprador;
	}

	public void setNombreDelComprador(String nombreDelComprador) {
		this.nombreDelComprador = nombreDelComprador;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	
	public Double getImporte() {
		Double suma=0.0;
		for(Producto p: productos) {
			suma+=p.getPrecio();
		}
		return suma;
	}
}
