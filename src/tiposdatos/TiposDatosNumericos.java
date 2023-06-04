/**
 * 
 */
package tiposdatos;

/**
 * @author iván
 *
 */
public class TiposDatosNumericos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// se genera método
		byte b = 28;
		short s = 3458;
		int i = 33456;
		long l = 3_000_000_000L;
		float f = 0.25f;
		int x = 7;
		int y = 5;
		double pi = Math.PI;
		int z = x + y;
		System.out.println("suma");
		System.out.println(z);
		z = x - y;
		System.out.println("resta");
		System.out.println(z);
		z = x * y;
		System.out.println("Multiplicación");
		System.out.println(z);
		z = x / y;
		System.out.println("division");
		System.out.println(z);
		double j = pi / f;
		System.out.println("division con decimal");
		System.out.println(j);
		z = x % y;
		System.out.println("resto");
		System.out.println(z);
		z = x++;
		System.out.println("Incremento de x");
		System.out.println(z);
		System.out.println(x);
		int bitMask = 0b0011;
		int val = 0b1111;
		int res = val & bitMask;
		System.out.println("and");
		System.out.println(res);
		System.out.println(Integer.toBinaryString(res));
		res = val ^ bitMask;
		System.out.println("or exclusivo");
		System.out.println(res);
		System.out.println(Integer.toBinaryString(res));
		res = val | bitMask;
		System.out.println("or inclusivo");
		System.out.println(res);
		System.out.println(Integer.toBinaryString(res));
		res = val << 1;
		System.out.println("movimiento izquierda");
		System.out.println(res);
		System.out.println(Integer.toBinaryString(res));
		res = val >> 2;
		System.out.println("movimiento derecha");
		System.out.println(res);
		System.out.println(Integer.toBinaryString(res));
		res = (-val) >> 2;
		System.out.println("movimiento izquierda con signo ");
		System.out.println(res);
		System.out.println(Integer.toBinaryString(res));
		res = val >>> 1;
		System.out.println("movimiento derecha");
		System.out.println(res);
		System.out.println(Integer.toBinaryString(res));
		res = ~val;
		System.out.println("inverso");
		System.out.println(res);
		System.out.println(Integer.toBinaryString(res));
		System.out.println(5 / 9);
		System.out.println(5f / 9);
		System.out.println((double) 5 / 9);
	}

}
