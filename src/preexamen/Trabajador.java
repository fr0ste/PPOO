package preexamen;

public class Trabajador extends Persona{

	private int numeroTrabajador;

	public int getNumeroTrabajador() {
		return numeroTrabajador;
	}

	public void setNumeroTrabajador(int numeroTrabajador) {
		this.numeroTrabajador = numeroTrabajador;
	}
	
	
	@Override
	public void enseña() {
		
		System.out.println("el trabajador enseña a otros trabajadores");
		
	}
	
}
