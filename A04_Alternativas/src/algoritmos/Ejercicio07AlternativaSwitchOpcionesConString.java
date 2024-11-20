package algoritmos;

public class Ejercicio07AlternativaSwitchOpcionesConString {

	public static void main(String[] args) {
		String opcion = "ver";
		
		switch (opcion.toLowerCase()) {
		case "editar":
			System.out.println("Estamos editando");
			break;
		case "ver":
			System.out.println("Estamos viendo");
			break;
		case "alta":
			System.out.println("dando de alta");
			break;
		default :
			System.out.println("Opcion erronea");
			
		}

	}

}
