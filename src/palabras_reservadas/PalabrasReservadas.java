package palabras_reservadas;

public class PalabrasReservadas {

	public PalabrasReservadas() {

		int y = 0;
		

		for (int i=0; i<100; i++) {
			
			
			if(i%2==0) {
				
				System.out.println("el valor de i "+i);
			}else {
				
				System.out.println("el valor de I :"+i);
				
				
			}
			

		}

	}

	public static void main(String[] args) {

		//PalabrasReservadas pr = new PalabrasReservadas();
		
		
		int a= 10;
		int b=15;
		int c=9;
		int d=0;
		
		System.out.println(a>b && b<a);
		System.out.println(a<b);
		System.out.println(a==b);
		System.out.println(c>>d);
		System.out.println(c>>>d);
		//System.out.println(a~b);
		
		
		
	}

}
