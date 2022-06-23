import java.util.Scanner;

/**
 2. Algoritmo que pida tres números distintos de tipo float e indique cual 
 es el que ocupa la posición central si los tres se ordenasen.
 
 */

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduce tres numeros DISTINTOS: ");
		
		System.out.println("Introduce un numero: ");
		float num1=teclado.nextInt();
		
		System.out.println("Introduce otro numero: ");
		float num2=teclado.nextInt();
		
		System.out.println("Introduce el ultimo numero: ");
		float num3=teclado.nextInt();
		
		teclado.close();
		
		if((num1>Math.min(num2, num3))&&(num1<Math.max(num2, num3))) {
			System.out.println("La posicion central la ocupa: "+num1);
		}else if((num2>Math.min(num1, num3))&&(num2<Math.max(num1, num3))) {
			System.out.println("La posicion central la ocupa: "+num2);
		}else {
			System.out.println("La posicion central la ocupa: "+num3);
		}
	}
}
