package algoritmos;

public class Ejercicio02ArraysUnidimensionalesVacios {

	public static void main(String[] args) {
		//Los enteros se rellenas a 0
		int [] enteros = new int[4];
		//El double se rellena a 0.0
		double [] reales = new double[4];
		/*El char lo rellena \0 */
		char [] letras = new char[4];
		//el boolean se rellena a false
		boolean [] logicos = new boolean[4];
		//clase se rellena en null
		String [] palabras = new String[4];
		
		for (int entero: enteros)
			System.out.println(entero);
		
		for (double real: reales)
			System.out.println(real);
		
		for (char letra: letras)
			System.out.println(letra);
		
		for (boolean bool: logicos)
			System.out.println(bool);
		
		for (String clase: palabras)
			System.out.println(clase);

	}

}
