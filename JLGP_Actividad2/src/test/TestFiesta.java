package test;

import javabean.Fiesta;
import java.time.LocalDate;
import java.time.LocalTime;

public class TestFiesta {

	public static void main(String[] args) {
		Fiesta[] fiestas = {
							new Fiesta(), 
							new Fiesta(
										"Cumpleaños", "Calle de las Mercedes",
										2, 5, 10, 
										LocalDate.of(2024, 12, 9), 
										LocalTime.of(15, 0)
										),
							new Fiesta(
										"Despedida de soltero",
										"Calle Peligrosa",
										20, 15, 25, 
										LocalDate.of(2025, 1, 22),
										LocalTime.of(22, 30)
										)
							};
		
		fiestas[0].setBebidas(30);
		fiestas[0].setBocadillos(20);
		fiestas[0].setDireccion("Calle libertad");
		fiestas[0].setFecha(LocalDate.of(2025, 3, 19));
		fiestas[0].setHora(LocalTime.of(20, 30));
		fiestas[0].setInvitados(20);
		fiestas[0].setTipoFiesta("Bautizo");
		
		for (Fiesta fiesta : fiestas) {
			System.out.println("**************** Comprobamos toString ****************");
			System.out.println(fiesta.toString());
			
			System.out.println("**************** Comprobamos precioFiesta ****************");
			System.out.println("La fiesta testVoidConst1 cuesta " + fiesta.precioFiesta());
			
			System.out.println("**************** Comprobamos invitar sin parametros ****************");
			fiesta.invitar();
			System.out.println("le sumamos un invitado a la fiesta que ahora tiene: " + fiesta.getInvitados());
			
			System.out.println("**************** Comprobamos cancelarInvitacion sin parametros ****************");
			fiesta.cancelarInvitacion();
			System.out.println("le srestamos un invitado a la fiesta que ahora tiene: " + fiesta.getInvitados());
			
			System.out.println("**************** Comprobamos invitar con parametros ****************");
			fiesta.invitar(200);
			System.out.println("le sumamos 200 invitado a la fiesta que ahora tiene: " + fiesta.getInvitados());
			
			System.out.println("**************** Comprobamos cancelarInvitacion con parametros ****************");
			fiesta.cancelarInvitacion(200);
			System.out.println("Le restamos 200 invitado a la fiesta que ahora tiene: " + fiesta.getInvitados());		

			System.out.println("");
			System.out.println("***************************************************************************************");
			System.out.println("");
		}

	}

}
