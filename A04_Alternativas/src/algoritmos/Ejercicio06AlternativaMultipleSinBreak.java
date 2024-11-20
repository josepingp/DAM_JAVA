package algoritmos;

public class Ejercicio06AlternativaMultipleSinBreak {

	public static void main(String[] args) {
		// Nos dan un numero con el mes y tenemos que decir si corresponde a 31 días
		//	o 30 dias o 28/29

		int mes = 2;
		
		switch(mes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("Este mes es de 31 días");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println("es de 30 días");
			break;
		case 2:
			System.out.println("de 28 o 29 segun el año");
			break;
		default :
			System.out.println("mes erroneo");
		
		}
	}

}
