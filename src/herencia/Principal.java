package herencia;

public class Principal {
	
	static PNumerico bits =new PNumerico();
	static PNumerico corto =new PNumerico();
	static PNumerico entero =new PNumerico();
	static PNumerico largo =new PNumerico();
	
	
	public static void main(String[] args) {
		
		
		
		bits.setNombre("byte");
		bits.setLongitud("0-127");
		bits.setDescripcion("es el entero mas pequeño");
		bits.setPrimitivo("si");
		bits.setBits((byte)10);
		
		
		System.out.println("el nombre:" + bits.getNombre());
		System.out.println("la longitud es:" + bits.getLongitud());
		System.out.println("descripción: "+ bits.getDescripcion());
		System.out.println("primitivo:" + bits.getPrimitivo());
		System.out.println("ejemplo: " + bits.getBits());
		
		
		
		
	}

}
