package javabean;

import java.util.Scanner;

public class GameTest {

	public static void main(String[] args) {
		Tablero tablero = new Tablero();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce el nombre del primer jugador");
		String name = scanner.next();
		Player player1 = new Player(name);
		
		System.out.println("Introduce el nombre del segundo jugador");
		name = scanner.next();
		Player player2 = new Player(name);
		Player[] players = {player1, player2};
		
		scanner.close();
		
		int random = (int) Math.round(Math.random());
		if (random == 1) {
			players[0] = player1;
			players[0].setToken(false);
			players[1] = player2;
			players[1].setToken(true);
		} else {
			players[0] = player2;
			players[0].setToken(false);
			players[1] = player1;
			players[1].setToken(true);
		}
		
		System.out.println("Comienza " + players[0].getName());
		
		
			
//		while (Tablero.isThereWinner()) {
//			System.out.println("Turno de " + players[0].getName());
//			
//		}
		

	}

}