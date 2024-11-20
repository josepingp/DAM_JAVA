package algoritmos;

import java.util.Scanner;

public class Ejercicio02Scanner {

	public static void main(String[] args) {
	Scanner leer = new Scanner(System.in);
	
	System.out.println("Dame un número entero");
	int numero = leer.nextInt();
	System.out.println("El número es: " + numero);
	
	System.out.println("Dame un número decimal");
	double numeroDecimal = leer.nextDouble();
	System.out.println("El número decimal es: " + numeroDecimal);
	
	leer.close();
	
	System.out.println("Fin del programa");

	}

}
