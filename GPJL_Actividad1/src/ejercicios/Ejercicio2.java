package ejercicios;

public class Ejercicio2 {

	public static void main(String[] args) {
		/*
		 * Diseñar un programa que muestre el producto y la suma de los 10 primeros
		 * números impares. El producto de los 10 primeros número impares es: 654729075
		 * El suma de los 10 primeros número impares es: 100 Fin algoritmo
		 */

		int producto = 1;
		int suma = 0;
		int numero = 1;
		
		for (int i = 0; i < 10; i++) {
			suma += numero;
			producto *= numero;
			numero += 2;
		}
		
		System.out.println("El suma de los 10 primeros número impares es: " + suma);
		System.out.println("El producto de los 10 primeros número impares es: " + producto);

		System.out.println("Fin algoritmo");
	}

}
