package javabean;

public class TestTablero {
	public static void main(String[] args) {
		Tablero tablero = new Tablero();
		
		Slot[][] slots = tablero.getSlots();
		
		slots[0][1] = new Slot(true);
		
		slots[1][1] = new Slot(false);
		
		tablero.setSlots(slots);
		
		tablero.dibujarTablero();
	}
}
