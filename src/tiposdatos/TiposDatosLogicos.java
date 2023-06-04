/**
 * 
 */
package tiposdatos;

/**
 * @author Iván
 *
 */
public class TiposDatosLogicos {
	public static void main(String[] args) {
		int valor1 = 1;
		int valor2 = 2;
		if ((valor1 == 1) && (valor2 == 2))
			System.out.println("valor es 1 AND valor 2 es 2 ");
		if ((valor1 == 1) || (valor2 == 1))
			System.out.println("valor es 1 OR valor 2 es 2");

		int result;
		boolean someCondittion = true;
		result = someCondittion ? valor1 : valor2;
		System.out.println(result);

		if (valor1 == valor2)
			System.out.println("valor1 = valor 2");
		if (valor1 != valor2)
			System.out.println("valor1 distinto valor2");
		if (valor1 > valor2)
			System.out.println("valor1 mayor que valor2");
		if (valor1 < valor2)
			System.out.println("valor1 menor que valor2");
		if (valor1 <= valor2)
			System.out.println("valor1 menor igual que valor2");
	}
}
