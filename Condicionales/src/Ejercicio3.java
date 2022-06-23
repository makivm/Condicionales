import java.util.Scanner;

/**
 * 3. Dadas dos casillas de un tablero de ajedrez por la fila y columna 
 * que ocupan, comprobar si están en la misma fila, columna, o en la misma 
 * diagonal.
 */

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduzca fila y columna de las dos piezas\n");
		
		System.out.println("-------------Primera Pieza------------ ");
		System.out.println("Introduce fila: ");
		int fila1=teclado.nextInt();
		System.out.println("Introduce columna: ");
		int columna1=teclado.nextInt();
		
		System.out.println("-------------Segunda Pieza------------ ");
		System.out.println("Introduce fila: ");
		int fila2=teclado.nextInt();
		System.out.println("Introduce columna: ");
		int columna2=teclado.nextInt();
		
		if (fila1==fila2){
			System.out.println("Las piezas estan en la misma fila");
		}
		if (columna1==columna2){
			System.out.println("Las piezas estan en la misma columna");
		}
		
		if (Math.abs(fila1-fila2)==Math.abs(columna1-columna2)) {
			System.out.println("Las piezas estan en la misma diagonal");
		}
		
		System.out.println("\n * Fin de programa.");
		
		teclado.close();
	}
}
