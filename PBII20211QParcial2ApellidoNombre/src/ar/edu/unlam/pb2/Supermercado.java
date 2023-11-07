package ar.edu.unlam.pb2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Supermercado {
	
	String nombre; // Nombre del supermercado
	private Set<Producto> productosExistentes; // Listado de productos que se comercializan
	private List<Producto> productosDisponibles; // Detalle de cada producto ingresado
	private Map<Integer, Venta> ventasRealizadas; // Listado de ventas realizadas (identificadas por el n�mero de venta)
	Integer contadorDeVentas; // Identificador del n�mero de venta
	
	public Supermercado(String nombre) {
		this.nombre = nombre;
		productosDisponibles = new LinkedList<>();
		productosExistentes = new HashSet<>();
		contadorDeVentas=0;
		ventasRealizadas = new HashMap<>();
	}

	public void ingresarProducto(Producto nuevo) {
		productosDisponibles.add(nuevo);
		productosExistentes.add(nuevo);
	}

	public Set<Producto> getOfertaDeProductos() {
		return productosExistentes;
	}
	
	public Integer getStock(Integer codigo) {
		Integer contador = 0;
		for(Producto p: productosDisponibles) {
			if(p.getId().equals(codigo))
				contador++;
		}
		return contador;
	}
	
	private Boolean productoExiste(Integer codigoDeProducto) throws ProductoInexistente{
		// Verifica si un producto existe
		for(Producto p: productosExistentes) {
			if(p.getId().equals(codigoDeProducto))
				return true;
		}
		throw new ProductoInexistente();
	}
	
	private Producto getProductoPorCodigo(Integer codigoDeProducto) throws ProductoSinStock, ProductoInexistente {
		// Busca la disponibilidad de un producto
		productoExiste(codigoDeProducto);
		for(Producto p: productosDisponibles) {
			if(p.getId().equals(codigoDeProducto))
				return p;
		}
		throw new ProductoSinStock();
	}
	
	public Integer registrarNuevaVenta(Integer dniDelComprador, String nombreDelComprador) {
		// Registra una nueva venta
		ventasRealizadas.put(++contadorDeVentas, new Venta(dniDelComprador, nombreDelComprador));
		return contadorDeVentas;
	}
	
	public Venta getVenta(Integer numeroDeVenta) {
		// Devuelve una venta en funci�n de su n�mero identificatorio
		return ventasRealizadas.get(numeroDeVenta);
	}

	public void agregarAlCarrito(Integer numeroDeVenta, Integer codigoDeProducto) throws ProductoSinStock, ProductoInexistente {
		// Incorpora al carrito de compras de la venta identificada por el "numeroDeVenta", el producto identificado por el "codigoDeProducto"
		Producto producto = getProductoPorCodigo(codigoDeProducto);
		Venta venta = getVenta(numeroDeVenta);
		venta.getProductos().add(producto);
		retirarProductoVendido(codigoDeProducto);
		return;
	}

	private void retirarProductoVendido(Integer codigoDeProducto) {
		for(Producto p: productosDisponibles) {
			if(p.getId().equals(codigoDeProducto)) {
				productosDisponibles.remove(p);
				return;				
			}
		}
	}

	public HashSet<Producto> obtenerProductosComestibles() {
		HashSet<Producto> productosComestibles = new HashSet<>();
		for(Producto p: productosExistentes) {
			if(p instanceof Comestible)
				productosComestibles.add(p);
		}
		return productosComestibles;
	}
	

}
