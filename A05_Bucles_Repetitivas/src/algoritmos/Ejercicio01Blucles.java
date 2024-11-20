package algoritmos;

public class Ejercicio01Blucles {

	public static void main(String[] args) {
		int numero = 1;

		while (numero <= 10) {
			System.out.println("El número es: " + numero);
			numero++;
		}
		
		numero = 1;
		
		do {
			System.out.println("El número es: " + numero);
			numero++;
		} while (numero <=10);
		
		for (int i = 0; i <= 10; i++) {
			System.out.println("El número es: " + i);
		}

		System.out.println("Fin del programa");

	}

}
