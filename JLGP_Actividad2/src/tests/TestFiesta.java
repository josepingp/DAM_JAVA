package tests;

import javabean.Fiesta;
import java.time.LocalDate;
import java.time.LocalTime;

public class TestFiesta {
	/*
	 * declaramos las fiestas
	 */
	private static Fiesta fiesta1 = new Fiesta();
	private static Fiesta fiesta2 = new Fiesta();
	private static Fiesta fiesta3 = new Fiesta(
												"Cumpleaños", "Calle de las Mercedes", 2, 5, 10,
												LocalDate.of(2024, 12, 9), LocalTime.of(15, 0)
												);
	private static Fiesta fiesta4 = new Fiesta(
												"Despedida de soltero", "Calle Peligrosa", 20, 15, 25,
												LocalDate.of(2025, 1, 22), LocalTime.of(22, 30)
												);

	public static void main(String[] args) {
		/*
		 * Rellenamos de datos las fiestas creadas
		 * con el constructor vacío
		 */
		fiesta1.setBebidas(30);
		fiesta1.setBocadillos(20);
		fiesta1.setDireccion("Calle libertad");
		fiesta1.setFecha(LocalDate.of(2025, 3, 19));
		fiesta1.setHora(LocalTime.of(20, 30));
		fiesta1.setInvitados(20);
		fiesta1.setTipoFiesta("Bautizo");

		fiesta2.setBebidas(15);
		fiesta2.setBocadillos(25);
		fiesta2.setDireccion("Calle JC");
		fiesta2.setFecha(LocalDate.of(2025, 4, 29));
		fiesta2.setHora(LocalTime.of(10, 30));
		fiesta2.setInvitados(25);
		fiesta2.setTipoFiesta("Fiesta friki");

		/*
		 * Llamamos a las funciones que prueban
		 */
		imprimir();
		invitar();
		invitar(10);
		cancelarInvitacion();
		cancelarInvitacion(10);
		precioFiesta();
	}

		/*
		 * Declaramos las funciones para las pruebas
		 */
		public static void imprimir() {
			System.out.println(fiesta3.toString());
		}
		
		public static void invitar() {
			System.out.println("\nAgregar a un invitado a la fiesta 4");
			fiesta4.invitar(); //26
			System.out.println("La fiesta4 que tenia 25 ahora tiene: " + fiesta4.getInvitados());
		}
		
		public static void invitar(int cantidad) {
			System.out.println("\nAgregar 10 invitado a la fiesta 4");
			fiesta4.invitar(cantidad); //36
			System.out.println("La fiesta4 que tenia 26 ahora tiene: " + fiesta4.getInvitados());
		}
		
		public static void cancelarInvitacion() {
			System.out.println("\nRestar un invitado a la fiesta 4");
			fiesta4.cancelarInvitacion(); //35
			System.out.println("La fiesta4 que tenia 36 ahora tiene: " + fiesta4.getInvitados());
		}
		
		public static void cancelarInvitacion(int cantidad) {
			System.out.println("\nRestar 10 invitado a la fiesta 4");
			fiesta4.cancelarInvitacion(cantidad); //25
			System.out.println("La fiesta4 que tenia 35 ahora tiene: " + fiesta4.getInvitados());
		}
		
		public static void precioFiesta() {
			System.out.println("\nCalculamos el precio de la fiesta 3");
			fiesta3.precioFiesta();//215
			System.out.println("La fiesta3 cuesta: " + fiesta4.precioFiesta());
		}
		
	}


