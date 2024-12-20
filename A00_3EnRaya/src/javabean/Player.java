package javabean;

public class Player {
	private String name;
	private boolean token;
	private int wins;
	
	public Player() {
		super();
	}

	public Player(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWins() {
		return wins;
	}

	public void setWins(int wins) {
		this.wins = wins;
	}

	public boolean getToken() {
		return token;
	}

	public void setToken(boolean token) {
		this.token = token;
	}

	@Override
	public String toString() {
		return "player [name=" + name + ", wins=" + wins + "]";
	}
	
	public void plusWin() {
		this.wins++;
	}
	
}
