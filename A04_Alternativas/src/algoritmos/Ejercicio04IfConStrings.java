package algoritmos;

public class Ejercicio04IfConStrings {

	public static void main(String[] args) {
		// Opciones: editar, ver, alta

		String opcion = "ver";

//		if (opcion == "editar")
		if (opcion.equals("editar"))
			System.out.println("Estamos editando");
//		else if (opcion == "ver")
		else if (opcion.equals("ver"))
			System.out.println("Estamos viendo");
		else
			System.out.println("Estamos en alta");

		String opcion2 = new String("editar");

		if (opcion.equals(opcion2))
			System.out.println("SON IGUALES!!");
		else
			System.out.println("SON DISTINTOS");

		System.out.println("Fin del programa");
	}

}
