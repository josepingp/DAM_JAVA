package algoritmos;

public class Ejercicio05AlternativaMultipleSwitch {

	public static void main(String[] args) {
		// Cuando una variable puede tener distintos valores especificos
//		(==), solo enteros, char, String con distinto tratamiento, escogemos switch

		int diaSemana = 1;

		switch (diaSemana) {
		case 1:
			System.out.println("Es lunes");
			break;
		case 2:
			System.out.println("es martes");
			break;
		case 3:
			System.out.println("es xcoles");
			break;
		case 4:
			System.out.println("es jueves");
			break;
		case 5:
			System.out.println("es viernes");
			break;
		default:
			System.out.println("es fin de semana");
			break;

		}
	}

}
