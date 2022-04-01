package preexamen;

public class Principal {
	
	static Alumno alumno = new Alumno();
	static Profesor profe = new Profesor();
	static Trabajador trabajador = new Trabajador();
	
	
	public static void main(String[] args) {
		
		alumno.setNombre("luis");
		alumno.setEdad(20);
		
		profe.setNombre("pedro");
		profe.setEdad(30);
		
		trabajador.setNombre("luis");
		trabajador.setEdad(40);
		
		System.out.println("Nombre: " + alumno.getNombre());
		System.out.println("Edad: "+ alumno.getEdad());
		System.out.println("Nombre" + profe.getNombre());
		System.out.println("Edad: "+ profe.getEdad());
		System.out.println("Nombre: " + trabajador.getNombre());
		System.out.println("Edad: " + trabajador.getEdad());
		
		alumno.enseña();
		profe.enseña();
		trabajador.enseña();
		
		
		

	}

}
