package ejerciciostema2;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		//Nombramos las variables como numeros enteros
		int num1, num2, num3;
		//Creamos el scanner y lo nombramos "sc"
		Scanner sc = new Scanner(System.in);
		//Anuncioamos al usuario lo que se le va a pedir a continuación
		System.out.println("A continuación inserte 3 numeros cuando se lo pidan y se comprobará si el"
				+ " tercero es la suma del primero y segundo");
		/*Pedimos al usuario inserte 3 numeros, 1 cada vez que le sea requerido, capturamos las respuestas
		y las guardamos en las variables "num1", "num2" y "num3" respectivamente*/
		System.out.print("Inserte el primer número: ");
		num1 = sc.nextInt();
		System.out.print("Inserte el segundo número: ");
		num2 = sc.nextInt();
		System.out.print("Inserte el tercer número: ");
		num3 = sc.nextInt();
		
		//Si el sumatorio de num1 y num2 es igual a num3 lo indicamos y si no pues indicamos de que no son
		System.out.println(num3!=num1+num2? "El primer numero y el segundo no suman el tercero": 
			"El primer numero y el segundo suman el tercero");
		
		//Cerramos el scanner
		sc.close();
	}

}
