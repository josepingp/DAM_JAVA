package javabean;

import java.util.Arrays;

public class Tablero {
	private Slot[][] slots;

	public Tablero() {
		this.slots = new Slot[3][3];
	}

	public Slot[][] getSlots() {
		return slots;
	}

	public void setSlots(Slot[][] slots) {
		this.slots = slots;
	}

	@Override
	public String toString() {
		return "Tablero [slots=" + Arrays.toString(slots) + "]";
	}

	public void dibujarTablero() {
		int cont = 0;
		
		for (Slot[] row : slots) {
			String lineaTablero = "";

			for (int i = 0; i < row.length; i++) {
				cont++;
				
				if (row[i] == null)
					lineaTablero = lineaTablero.concat(" [" + cont + "] ");
				else
					lineaTablero = lineaTablero.concat(" [" + row[i].printSlotToken() + "] ");

			}
			System.out.println(lineaTablero);
		}
	}
	
	public Slot selectSlot(String numero) {
		switch(numero)
	}

	
}
