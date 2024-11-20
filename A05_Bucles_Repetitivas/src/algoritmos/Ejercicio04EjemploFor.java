package algoritmos;

public class Ejercicio04EjemploFor {

	public static void main(String[] args) {
		int cont = 0;
		int contMultiplos2 = 0;
		int contMultiplos3 = 0;
		
		for (int i = 100; i >=1; i--) {
			System.out.println(i);
			
			cont++;
			
			if (i % 2 == 0)
				contMultiplos2++;
			if (i % 3 == 0)
				contMultiplos3++;
		}
		
		System.out.println("Estadisticas");
		System.out.println("Números procesados: " + cont);
		System.out.println("Números múltiplos de dos: " + contMultiplos2);
		System.out.println("Números múltiplos de tres: " + contMultiplos3);

	}

}
