package ejerciciostema2;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		int num1, num2, num3;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("A continuación inserte 3 numeros cuando se lo pidan y se comprobará si el"
				+ " tercero es la suma del primero y segundo");
		
		System.out.print("Inserte el primer número: ");
		num1 = sc.nextInt();
		System.out.print("Inserte el segundo número: ");
		num2 = sc.nextInt();
		System.out.print("Inserte el tercer número: ");
		num3 = sc.nextInt();
		
		System.out.println(num3!=num1+num2? "El primer numero y el segundo no suman el tercero": 
			"El primer numero y el segundo suman el tercero");
	}

}
