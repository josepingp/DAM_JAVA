package algoritmos;

import java.util.Scanner;

public class Ejercicio03LeerDosNumerosWhile2WhileTrue {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);

		int num1 = 0, num2 = 0, contIguales = 0, contMayores = 0, contMenores = 0;


		while (true) {
			System.out.println("Dame dos números, -1 en ambos para terminar");
			num1 = leer.nextInt();
			num2 = leer.nextInt();
			
			if (num1 == -1 && num2 == -1)
				break;

			if (num1 < num2)
				contMenores++;
			else if (num1 > num2)
				contMayores++;
			else
				contIguales++;
		}

		System.out.println("Estadisticas");
		System.out.println("Iguales: " + contIguales);
		System.out.println("Mayores: " + contMayores);
		System.out.println("Menores: " + contMenores);

		leer.close();

	}

}
