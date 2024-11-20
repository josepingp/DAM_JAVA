package javabean;

public class TestEmpleado {

	public static void main(String[] args) {
		Empleado emp1 = new Empleado();
		
		Empleado emp2 = new Empleado(220, "garcia", 2550);
		
		emp1.setNombre("Josin");
		emp1.setApellido("García");
		emp1.setComplementos(390);
		emp1.setGenero('h');
		emp1.setIdEmpleado(201);
		emp1.setSalarioM(2390);
		
		System.out.println("id empleado: " + emp1.getIdEmpleado());
		
		System.out.println(emp1.toString());
		System.out.println(emp2);
		
	}

}
