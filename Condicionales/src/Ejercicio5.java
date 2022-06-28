import java.util.Scanner;

/**
 * 5. Algoritmo que determine si un año dado es bisiesto o no, teniendo en cuenta 
 * que son años bisiestos los múltiplos de 4, excepto los que son también múltiplos 
 * de 100 pero no lo son de 400.
 * @author David
 *
 */
public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce el año: ");
		int año = entrada.nextInt();
		
		if ( (año%4) == 0 ) {
			if ( (año%100 ==0) && (año%400 != 0)) {
				System.out.println("El año NO es bisiesto");
			} else {
				System.out.println("El año es bisiesto");
			}
		} else {
			System.out.println("El año NO es bisiesto");
		}
		entrada.close();
	}
}