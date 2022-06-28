import java.util.Scanner;

/**
 * 6. Escribir un programa que implemente una pequeña calculadora con switch-case. 
 * El programa pedirá al usuario los operandos (a y b) y la operación a realizar: 
 * suma, resta, multiplicación y división. En función de la opción seleccionada se
 * realizará una de las operaciones aritméticas.
 * @author David
 *
 */
public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce el primer número: ");
		double num1 = entrada.nextDouble();
		
		System.out.println("Introduce el segundo número: ");
		double num2 = entrada.nextDouble();
		
		System.out.println("Calculadora");
		System.out.println("1. Sumar");
		System.out.println("2. Restar");
		System.out.println("3. Multiplicar");
		System.out.println("4. Dividir y elevar al cuadrado");
		System.out.println("5. Eleva al cuadrado el primero");
		System.out.println("Introduce una opción (1-5): ");
		int opcion = entrada.nextInt();
		double res = 0;
		
		switch (opcion) {
		case 1: res = num1+num2;
		        break;
		case 2: res = num1-num2;
			    break;
		case 3: res = num1 * num2;
				break;
		case 4: res = num1 / num2;
				
		case 5: System.out.println("El número al cuadrado es "+ num1*num1);
				break;
		default: System.out.println("Opción incorrecta. Debe elegir una opción entre 1 y 4");
		}

		if (opcion>=1 && opcion<=4) {
			System.out.println("El resultado es "+ res);
		}
		entrada.close();
	}
}
