import java.util.Scanner;

/**
4. Algoritmo que pida los parámetros (a, b y c de tipo double) de dos rectas, 
correspondientes a su ecuación implícita (ax + by + c = 0), e indique si 
son coincidentes, paralelas o secantes. En el caso de que sean secantes, 
hay que indicar si son perpendiculares o no.
*/

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduzca las dos rectas (A y B) que quiere comparar\n");
		
		System.out.println("-------------Primera Recta------------ ");
		System.out.println("Introduce valor a1: ");
		float a1=teclado.nextFloat();
		System.out.println("Introduce valor b1: ");
		float b1=teclado.nextFloat();
		System.out.println("Introduce valor c1: ");
		float c1=teclado.nextFloat();
		
		System.out.println("-------------Segunda Recta------------ ");
		System.out.println("Introduce valor a2: ");
		float a2=teclado.nextFloat();
		System.out.println("Introduce valor b2: ");
		float b2=teclado.nextFloat();
		System.out.println("Introduce valor c2: ");
		float c2=teclado.nextFloat();
		
		teclado.close();
		
		if ((a1/a2)!=(b1/b2)){
			System.out.println("Las rectas A y B son secantes ");
			if ((a1/b1)==(-b2/a2)){
				System.out.println("Las rectas A y B son perpendiculares ");
			}
		}else System.out.println("Las rectas A y B son paralelas ");{
			if((a1/a2)==(c1/c2)) {
				System.out.println("Las rectas A y B son coincidentes ");
			}
		}
	}
}
