package ejercicio;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

	private int numero;
	private EstadoPedido estado;
	private List<Producto> productos;

	public Pedido(int numero) {
		this.numero = numero;
		this.estado = EstadoPedido.PENDIENTE;
		this.productos = new ArrayList<>();
	}

	public void agregarProducto(Producto p) {
		productos.add(p);
	}

	public double calcularTotal() {
		double total = 0;
		for (Producto p : productos) {
			total += p.getPrecio();
		}
		return total;
	}

	public int getNumero() {
		return numero;
	}

	public EstadoPedido getEstado() {
		return estado;
	}

	public void setEstado(EstadoPedido estado) {
		this.estado = estado;
	}
}
