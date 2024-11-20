package javabeans;

public class Cuenta {
	/*
	 * ATRIBUTOS
	 */
	private int numeroCuenta;
	private String tipoCuenta;
	private String titular;
	private double saldo;
	
	/*
	 * CONSTRUCTORES
	 */
	
	public Cuenta() {
		super();
	}

	public Cuenta(int numeroCuenta, String tipoCuenta, String titular, double saldo) {
		super();
		this.numeroCuenta = numeroCuenta;
		this.tipoCuenta = tipoCuenta;
		this.titular = titular;
		this.saldo = saldo;
	}

	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public String getTipoCuenta() {
		return tipoCuenta;
	}

	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Cuenta [numeroCuenta=" + numeroCuenta + ", tipoCuenta=" + tipoCuenta + ", titular=" + titular
				+ ", saldo=" + saldo + "]";
	}
	
	/*
	 * METODOS PROPIOS. Responsabilidad de la clase
	 */

	public void abono(double importe) {
		this.saldo += importe;
	}
	
	public boolean extraer(double importe) {
		if (importe <= this.saldo) {
			this.saldo -= importe;
			return true;
		}
		
		return false;
	}
	
	public boolean transferir(Cuenta cuentaDestino, double importe) {
		if (this.extraer(importe)) {
			cuentaDestino.abono(importe);
			return true;
		}
		
		return false;
	}
}
