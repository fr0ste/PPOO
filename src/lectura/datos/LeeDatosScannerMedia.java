package lectura.datos;

import java.util.Scanner;

public class LeeDatosScannerMedia {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Introduce tres números (pueden contener decimales separados para espacios: ");
		
		double x1 = s.nextDouble();
		double x2 = s.nextDouble();
		double x3 = s.nextDouble();
		
		
		double media = (x1+x2+x3)/3;
		
		System.out.println("la media de esos tres numeros es " + media);
		
	}

}
