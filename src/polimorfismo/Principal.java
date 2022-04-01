package polimorfismo;

public class Principal {


	static Caballo caballo1= new Caballo();
	static Perro perro1= new Perro();
	static Gato gato1= new Gato();	

	public static void main(String[] args) {
		
		gato1.sonido();
		perro1.sonido();
		caballo1.sonido();		

	}

}
