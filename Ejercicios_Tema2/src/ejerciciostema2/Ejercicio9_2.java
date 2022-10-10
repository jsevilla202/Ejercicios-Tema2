package ejerciciostema2;

import java.util.Scanner;

public class Ejercicio9_2 {

	public static void main(String[] args) {
		/*Nombramos las variables como numeros enteros y marcamos como constante "PIEDRA", "PAPEL" y 
		"TIJERAS"*/
		int respuesta1, respuesta2;
		final int PIEDRA = 1, PAPEL = 2, TIJERAS = 3;
		//Creamos el scanner y lo nombramos "sc"
		Scanner sc = new Scanner(System.in);
		//Pedimos al usuario que introduzca una de las siguientes opciones
		System.out.print("Jugador 1 introduzca PIEDRA (1), PAPEL (2) o TIJERAS (3): ");
		//Capturamos lo que ha introducido el usuario y lo guardamos en la variable "respuesta1"
		respuesta1 = sc.nextInt();
		//Pedimos al otro usuario que introduzca una de las siguientes opciones
		System.out.print("Jugador 2 introduzca PIEDRA (1), PAPEL (2) o TIJERAS (3): ");
		//Capturamos lo que ha introducido el usuario y lo guardamos en la variable "respuesta2"
		respuesta2 = sc.nextInt();
		
		//Si las respuestan son iguales es un empate
		if(respuesta1==respuesta2) {
			System.out.println("Empate");
		}
		/*Si el jugador 1 ha sacado Piedra, Papel o Tijeras y el jugador 2 Papel, Tijeras o Piedra,
		el jugador 2 gana*/
		if(respuesta1==1&&respuesta2==2||respuesta1==2&&respuesta2==3||respuesta1==3&&respuesta2==1) {
				System.out.println("El jugador 2 ha ganado");
			}
		//En otro caso gana el jugador 1
		else{
			System.out.println("El jugador 1 ha ganado");
			}
		/*Si las respuestas del jugador 1 o 2 no estan dentro del dominio de 1,2,3 la respuesta será
		invalida*/
		if(respuesta1<1||respuesta1>3||respuesta2<1||respuesta2>3) {
			System.out.println("La respuesta no es valida");
		}
		//Cerramos el scanner
		sc.close();

	}

}
