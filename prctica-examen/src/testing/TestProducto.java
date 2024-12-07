package testing;

import javabeans.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto producto = new Producto();
		
		producto.setNumeroProducto(10);
		producto.setDescripcion("Bragas de calidad");
		producto.setPrecioUnitario(7.50);
		producto.setCantidadStock(27);
		producto.setTalla("XL");
		producto.setColor("Amarillo");

		Producto producto1 = new Producto(11, "Gallumbos de seda", 25.50, 15, "L", "Rojo");
		Producto producto2 = new Producto(12, "Calcetinos de navidad", 15.50, 21, "xs", "Azules");

		System.out.println(
							"El producto2 tiene un precio unitario de: " 
							+ producto2.getPrecioUnitario());//15.5
		System.out.println(
							"Si le aplicamos el iva del 10% se quedaria "
							+ "un precio de: " + producto2.precioConIva(10)
							+ "\n"
							);//17.05
		
		System.out.println(
				"El producto2 tiene un stock de: " 
				+ producto2.getCantidadStock());//21
		producto2.aumentarStock(12);
		System.out.println(
						"Aumentamos el stock de producto2 en 12 se quedaria "
						+ "un stock " + producto2.getCantidadStock()
						+ "\n"
						);//33
		
		System.out.println(
				"El producto2 tiene un stock de: " 
				+ producto2.getCantidadStock());//33
		producto2.disminuirStock(20);
		System.out.println(
						"Disminuimos el stock de producto2 en 20 se quedaria "
						+ "un stock " + producto2.getCantidadStock()
						+ "\n"
						);//12
		
		System.out.println(
				"Intentamos disminuir el stock más de lo posible: "
				+ "ahora tenemos: " + producto2.getCantidadStock());//12
		producto2.disminuirStock(20);
		System.out.println(
						"Esto nos devolvera un: " + producto2.disminuirStock(20)
						+ "y el stock sera de: " + producto2.getCantidadStock() 
						+ "\n"
						);//12
		
		Producto[] productos = {producto, producto1, producto2};
		
		for(Producto prod : productos) {
			System.out.println(
								"El precio de este " + prod.getDescripcion() +
								" en la talla " + prod.getTalla() + " es: "
								+ prod.precioAplicado()
								);
		}
	}

}
