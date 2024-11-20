package javabean;

public class Cliente {
	private String cif;
	private String nombre;
	private double facturacionAnual;
	private int numeroDeEmpleados;
	public String getCif() {
		return cif;
	}
	public void setCif(String cif) {
		this.cif = cif;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getFacturacionAnual() {
		return facturacionAnual;
	}
	public void setFacturacionAnual(double facturacionAnual) {
		this.facturacionAnual = facturacionAnual;
	}
	public int getNumeroDeEmpleados() {
		return numeroDeEmpleados;
	}
	public void setNumeroDeEmpleados(int numeroDeEmpleados) {
		this.numeroDeEmpleados = numeroDeEmpleados;
	}
	
	@Override
	public String toString() {
		return "CLiente [cif=" + cif + ", nombre=" + nombre + ", facturacionAnual=" + facturacionAnual
				+ ", numeroDeEmpleados=" + numeroDeEmpleados + "]";
	}
	
	
}
