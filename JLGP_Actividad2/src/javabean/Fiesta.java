package javabean;

import java.time.LocalDate;
import java.time.LocalTime;

public class Fiesta {
	/*
	 * Declaramos los atributos de la clase
	 */
	private String tipoFiesta;
	private String direccion;
	private int bocadillos;
	private int bebidas;
	private int invitados;
	private LocalDate fecha;
	private LocalTime hora;
	/*
	 * Declaramos los atributos constantes
	 * que segun he leido no tiene getters ni setters
	 */
	public final int PRECIO_BOCADILLO = 3;
	public final int PRECIO_BEBIDA = 2;
	public final int PRECIO_INVITADO = 5;
	
	/*
	 * Constructor sin atributos
	 */
	public Fiesta() {
		super();
	}

	/*
	 * Constructor con atributos
	 */
	public Fiesta(
				String tipoFiesta, String direccion, int bocadillos,
				int bebidas, int invitados, LocalDate fecha,
				LocalTime hora
				) {
		super();
		this.tipoFiesta = tipoFiesta;
		this.direccion = direccion;
		this.bocadillos = bocadillos;
		this.bebidas = bebidas;
		this.invitados = invitados;
		this.fecha = fecha;
		this.hora = hora;
	}

	/*
	 * getters y setters
	 */
	public String getTipoFiesta() {
		return tipoFiesta;
	}

	public void setTipoFiesta(String tipoFiesta) {
		this.tipoFiesta = tipoFiesta;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getBocadillos() {
		return bocadillos;
	}

	public void setBocadillos(int bocadillos) {
		this.bocadillos = bocadillos;
	}

	public int getBebidas() {
		return bebidas;
	}

	public void setBebidas(int bebidas) {
		this.bebidas = bebidas;
	}

	public int getInvitados() {
		return invitados;
	}

	public void setInvitados(int invitados) {
		this.invitados = invitados;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	/*
	 * Sobreescribimos el metodo toString
	 */
	@Override
	public String toString() {
		return "Fiesta [tipoFiesta=" + this.tipoFiesta + 
				", direccion=" + this.direccion + 
				", bocadillos=" + this.bocadillos + 
				", bebidas=" + this.bebidas + 
				", invitados=" + this.invitados +
				", fecha=" + this.fecha + ", hora=" + this.hora + "]";
	}
	
	/*
	 * metodo que añade un invitdo
	 */
	public void invitar() {
		this.invitados++;
	}
	
	/*
	 * metodo sobrecargado que recibe un parametro con una cantidad de invitados a sumar
	 */
	public void invitar(int cantidad) {
		this.invitados += Math.abs(cantidad);
	}
	
	/*
	 * metodo que resta un invitdo
	 */
	public void cancelarInvitacion() {
		this.invitados--;
		if (this.invitados < 0)
			this.invitados = 0;
	}
	
	/*
	 * metodo sobrecargado que recibe un parametro con una cantidad de invitados a restar
	 */
	public void cancelarInvitacion(int cantidad) {
		this.invitados -= Math.abs(cantidad);
		if (this.invitados < 0)
			this.invitados = 0;
	}
	
	/*
	 * metodo que calcula el precio de la fiesta
	 */
	public int precioFiesta() {
		int precioFiesta = this.invitados * PRECIO_INVITADO + this.bebidas * PRECIO_BEBIDA + this.bocadillos * PRECIO_BOCADILLO;
		return precioFiesta;
	}
	
}
