package lectura.datos;

import java.util.Scanner;

public class DimeTuNombre {

	public static void main(String[] args) {

		String nombre;
		Scanner s = new Scanner(System.in);

		System.out.println("por favor, dime como te llamas: ");
		nombre = s.nextLine();
		System.out.println("hola " + nombre + ", encantado de conocerte!");

		System.out.println("introduce tu edad");
		int edad = Integer.parseInt(s.nextLine());
		System.out.println("tu edad es: " + edad);

	}

}
