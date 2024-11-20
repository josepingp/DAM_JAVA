package algoritmos;

public class Ejercicio03IfConChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char genero = 'j';
		
		if (genero == 'H' || genero == 'h')
			System.out.println("Eres un hombre");
		else
			if ( genero == 'M' || genero == 'm')
				System.out.println("Eres una mujer");
			else
				System.out.println("Genero incorrecto");
		

	}

}
