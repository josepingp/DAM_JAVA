package algoritmos;

public class Ejercicio01ArrayUnidimensional {

	public static void main(String[] args) {
		int [] numeros = {1,2,3,4,5,6,7,8,9,};
		
		System.out.println(numeros.length);
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("En posicion: " + i + "esta el número: " + numeros[i]);
		}

		for (int numero: numeros) {
			System.out.println(numero);
		}
	}

}
