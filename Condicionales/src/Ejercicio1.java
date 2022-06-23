import java.util.Scanner;

/**
1. Algoritmo que pida dos enteros y que indique el mayor y el menor, 
o si ambos son iguales.*/

public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		int num1=teclado.nextInt();
		
		System.out.println("Introduce otro numero: ");
		int num2=teclado.nextInt();
		
		teclado.close();
		
		if(num1>num2)
		{
				System.out.println("El numero mayor es: "+num1 + 
						"\nEl numero menor es: "+num2);
		}else if (num1<num2) {
				System.out.println("El numero mayor es: "+num2 + 
						"\nEl numero menor es: "+num1);
		}else {
				System.out.println("Los numero son iguales");
		}
	}
}