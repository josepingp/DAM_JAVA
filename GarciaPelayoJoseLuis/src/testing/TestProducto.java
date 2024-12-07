package testing;

import javabeans.Producto;

public class TestProducto {
	
	private static Producto camiseta = new Producto(); 
	private static Producto pantalon = new Producto(
													8899348855l, 
													"Pantalon de fardar",
													15.5,
													20,
													"xl",
													"amarillo"
													);
	private static Producto sudadera = new Producto(
													889934223345l, 
													"Sudadera muy guapa",
													30.5,
													21,
													"L",
													"Rojo"
													);
	
	public static void main(String[] args) {
		camiseta.setCódigoDeBarras(342348589324l);
		camiseta.setDescripcion("Camiseta Rolling Stones");
		camiseta.setPrecioUnitario(20.75);
		camiseta.setCantidadStock(12);
		camiseta.setTalla("M");
		camiseta.setColor("Verde");
		
		precioConIva();
		aumentarStock();
		disminuirStock();
		disminuirStockMal();
		precioAplicado();
	}
	
	public static void precioConIva() {
		System.out.println(
				"El pantalon tiene un precio unitario de: " 
				+ pantalon.getPrecioUnitario());//15.5
		System.out.println(
						"Si le aplicamos el iva del 10% se quedaria "
						+ "un precio de: " + pantalon.precioConIva(10)
						+ "\n"
						);//17.05
	}
	
	public static void aumentarStock() {
		System.out.println(
							"La sudadera tiene un stock de: " 
							+ sudadera.getCantidadStock()
							);//21
		sudadera.aumentarStock(12);
		System.out.println(
							"Aumentamos el stock de sudadera en 12 se quedaria "
							+ "un stock " + sudadera.getCantidadStock()
							+ "\n"
							);//33
	}
	
	public static void disminuirStock() {
		System.out.println(
							"La sudadera tiene un stock de: " 
							+ sudadera.getCantidadStock()
							);//33
		sudadera.disminuirStock(20);
		System.out.println(
						"Disminuimos el stock de sudadera en 20 se quedaria "
						+ "un stock " + sudadera.getCantidadStock()
						+ "\n"
						);//12
	}
	
	public static void disminuirStockMal() {
		System.out.println(
				"Intentamos disminuir el stock más de lo posible: "
				+ "ahora tenemos: " + sudadera.getCantidadStock());//12
		sudadera.disminuirStock(20);
		System.out.println(
						"Esto nos devolvera un: " + sudadera.disminuirStock(20)
						+ " y el stock sera de: " + sudadera.getCantidadStock() 
						+ "\n"
						);//12
	}
	
	public static void precioAplicado() {
		String[] tallas = {"xs", "s", "m", "l", "xl", "xxl", "xxxl"};
		
		for(String talla : tallas) {
			camiseta.setTalla(talla);
			System.out.println(
								"El precio de este " + camiseta.getDescripcion() +
								" en la talla " + camiseta.getTalla() + " es: "
								+ camiseta.precioAplicado()
								);
		}
	}

}
