package ejercicio;

public class Main {

	@SuppressWarnings("resource")
	public void main() {

		Pedido pedido = new Pedido(1);

		Producto teclado = new Producto("Teclado", 25.50);
		Producto raton = new Producto("Ratón", 15.00);

		pedido.agregarProducto(teclado);
		pedido.agregarProducto(raton);

		System.out.println("Número de pedido: " + pedido.getNumero());
		System.out.println("Estado del pedido: " + pedido.getEstado());
		System.out.println("Total del pedido: " + pedido.calcularTotal());

		pedido.setEstado(EstadoPedido.ENVIADO);

		System.out.println("Nuevo estado del pedido: " + pedido.getEstado());
	}

	public static void main(String[] args) {

		new Main().main();
	}
}

/*
¿Qué tipo de relación se define en el diagrama UML entre Pedido y Producto?
Es una composición, ya que los productos forman parte del pedido y no tienen sentido sin él.

¿Qué significa la cardinalidad indicada en esa relación?
Un pedido puede tener cero o muchos productos (0..*)
Cada producto pertenece a un único pedido (1)

¿Qué otros tipos de cardinalidad se pueden definir en UML?
Investiga y explica al menos tres ejemplos distintos.
1..1 → exactamente uno
0..1 → cero o uno
1..* → uno o muchos
0..* → cero o muchos

¿Qué diferencias existen entre una asociación, una agregación y una composición?
No es necesario profundizar, solo una explicación básica.
Asociación: relación básica entre clases
Agregación: las clases pueden existir separadas
Composición: si el objeto principal desaparece, los demás también.
*/