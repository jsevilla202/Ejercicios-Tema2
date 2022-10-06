package ejerciciostema2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		//Nombramos las variables como numeros enteros
		int numero1, numero2;
		//Creamos el scanner y lo nombramos "sc"
		Scanner sc = new Scanner(System.in);
		//Pedimos al usuario un numero al azar
		System.out.print("Inserte un numero cualquiera para si el siguiente es igual: ");
		//Capturamos lo que ha introducido el usuario y lo guardamos en la variable "numero1"
		numero1 = sc.nextInt();
		//Pedimos al usuario otro numero al azar
		System.out.print("Inserte un numero cualquiera para si el anterior es igual: ");
		//Capturamos lo que ha introducido el usuario y lo guardamos en la variable "numero2"
		numero2 = sc.nextInt();
		
		//Comprobamos si los numeros son iguales y mostramos el resultado diciendo que es par
		if (numero1==numero2){
			System.out.print("Estos números son iguales");
		}
		//En otro caso mostramos el resultado diciendo que es impar
		else {
			System.out.print("Estos números son diferentes");
		}
		//Cerramos el scanner
		sc.close();	
		}
	}

