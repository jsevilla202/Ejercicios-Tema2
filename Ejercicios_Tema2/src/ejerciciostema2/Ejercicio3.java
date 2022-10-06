package ejerciciostema2;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		//Nombramos la variable como numero con decimales
		double numero;
		//Creamos el scanner y lo nombramos "sc"
		Scanner sc = new Scanner(System.in);
		//Pedimos al usuario que inserte un numero cualquiera para combrobar si es casi 0
		System.out.print("Inserte un numero cualquiera para comprobar si casi 0 o no: ");
		//Capturamos lo que ha introducido el usuario y lo guardamos en la variable "numero"
		numero = sc.nextDouble();
		
		//Comprobamos que el numero sea mayor que -1, menor que 1 y que no sea 0
		if (numero<1&&numero>-1&&numero!=0){
			System.out.print("Este número es casi 0");
		}
		//Si el numero es 0 decimos que el número es 0
		else if (numero==0){
				System.out.print("Este número es 0");
			}
		//En otro caso el numero no sera casi 0
		else {
			System.out.print("Este número no es casi 0");
			}
		//Cerramos el scanner
		sc.close();	
	}
}

