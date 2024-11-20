package javabean;

public class Empleado {
	//Atributos de instancia u objeto
	private int idEmpleado;
	private String nombre;
	private String apellido;
	private double salarioM;
	private double complementos;
	private char genero;
	
	/*
	 * Constructor
	 */
	public Empleado () {
		
	}
	
	public Empleado(int idEmpleado, String nombre, String apellido, double salarioM) {
		super();
		this.idEmpleado = idEmpleado;
		this.nombre = nombre;
		this.apellido = apellido;
		this.salarioM = salarioM;
	}

	public int getIdEmpleado() {
		return idEmpleado;
	}
	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public double getSalarioM() {
		return salarioM;
	}
	public void setSalarioM(double salarioM) {
		this.salarioM = salarioM;
	}
	public double getComplementos() {
		return complementos;
	}
	public void setComplementos(double complementos) {
		this.complementos = complementos;
	}
	public char getGenero() {
		return genero;
	}
	public void setGenero(char genero) {
		this.genero = genero;
	}
	
	@Override
	public String toString() {
		return "Empleado [idEmpleado=" + idEmpleado + ", nombre=" + nombre + ", apellido=" + apellido + ", salarioM="
				+ salarioM + ", complementos=" + complementos + ", genero=" + genero + "]";
	}
	

	

}
