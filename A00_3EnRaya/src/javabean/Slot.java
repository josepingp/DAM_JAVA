package javabean;

public class Slot {
	//player1(false = o)  player2(true = x)
	private boolean token;

	public Slot() {
		super();
	}

	public Slot(boolean token) {
		super();
		this.token = token;
	}

	public boolean isToken() {
		return token;
	}

	public void setToken(boolean token) {
		this.token = token;
	}

	@Override
	public String toString() {
		return "Slot [token=" + token + "]";
	}
	
	public String printSlotToken() {
		if (this.token)
			return "X";
		else
			return "O";
	}

	
}
