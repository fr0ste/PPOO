package tipos_de_datos;

public class Primitivos {
	public static void main(String args[]) {
		int a = 3;
		byte b = 101;
		short c = (short) 3.5;
		long d = 2130;
		float e = 3.1416f;
		double f = 3.141592653;
		boolean g = false;
		char h = 'w';

		System.out.println("______________________________________________________________________");
		System.out.println("|tipo    |   bits(tamaño) |      valor min      |      valor max     |");
		System.out.println("|int     |       32        |       -2³¹          |       2³¹-1        |");
		System.out.println("|byte    |       8         |       -128          |       127          |");
		System.out.println("|short   |       16        |      -32.768        |      32.767        |");
		System.out.println("|long    |       64        |       -2⁶³          |      2⁶³-1         |");
		System.out.println("|float   |       32        |   -3.402823e38      |     3.402823e38    |");
		System.out.println("|double  |       64        |-1.79769313486232e308|1.79769313486232e308|");
		System.out.println("|boolean |       1         |                     |                    |");
		System.out.println("|char    |       16        |     \\u0000          |       \\uffff       |");
		System.out.println("|________|____________________________________________________________|");

	}

}
