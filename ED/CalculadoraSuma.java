/*
 * Este programa realiza una simple operación de suma para dos 
 * números pero no sigue las buenas prácticas
*/

public class CalculadoraSuma {
	public static void main(String[] args) { 
		int numeroUno = 10;
		int numeroDos = 20;
		int resultado = numeroUno + numeroDos;
		
		
		System.out.println("El resultado de la suma de los números "
							+ numeroUno + " y " + numeroDos + " es: "
							+ resultado);
		
		System.out.println("A continuación se realizará la misma operación con "
							+ "diferentes valores para verificar el resultado "
							+ "y la eficiencia del programa");
		
		numeroUno = 5;
		numeroDos = 15;
		resultado = numeroUno + numeroDos;
		
		System.out.println("El resultado de la suma es: "+ resultado);
		
	}
}
