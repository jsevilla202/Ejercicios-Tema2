package ejerciciostema2;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		//Nombramos las variables como cadenas
		String respuesta1, respuesta2;
		//Creamos el scanner y lo nombramos "sc"
		Scanner sc = new Scanner(System.in);
		//Pedimos al usuario que introduzca una de las siguientes opciones
		System.out.print("Jugador 1 introduzca PIEDRA, PAPEL o TIJERAS: ");
		//Capturamos lo que ha introducido el usuario y lo guardamos en la variable "respuesta1"
		respuesta1 = sc.nextLine();
		//Pedimos al otro usuario que introduzca una de las siguientes opciones
		System.out.print("Jugador 2 introduzca PIEDRA, PAPEL o TIJERAS: ");
		//Capturamos lo que ha introducido el usuario y lo guardamos en la variable "respuesta2"
		respuesta2 = sc.nextLine();
			
		/*Se ha utilizado ".equals" para igualar cadenas ya que "==" es solo para valores numericos
		 Si la respuesta del jugador 1 es "Piedra"*/
		if(respuesta1.equals("PIEDRA")) {
			//Y la respuesta del jugador 2 es "Papel", el jugador 2 gana
			if(respuesta2.equals("PAPEL")) {
				System.out.println("El jugador 2 gana");
			}
			//En caso de que la respuesta del jugador 2 sea "Tijeras", el jugador 1 gana
			else if(respuesta2.equals("TIJERAS")) {
				System.out.println("El jugador 1 gana");
			}
			else {
				//En otro caso es empate
				System.out.println("Empate");
			}
		}
		//Si la respuesta del jugador 1 es "Papel"
		if(respuesta1.equals("PAPEL")) {
			//Y la respuesta del jugador 2 es "Tijeras", el jugador 2 gana
			if(respuesta2.equals("TIJERAS")) {
				System.out.println("El jugador 2 gana");
			}
			//En caso de que la respuesta del jugador 2 sea "Piedra", el jugador 1 gana
			else if(respuesta2.equals("PIEDRA")) {
				System.out.println("El jugador 1 gana");
			}
			else {
				//En otro caso es empate
				System.out.println("Empate");
			}
		}
		//Si la respuesta del jugador 1 es "Tijeras"
		if(respuesta1.equals("TIJERAS")) {
			//Y la respuesta del jugador 2 es "Piedra", el jugador 2 gana
			if(respuesta2.equals("PIEDRA")) {
				System.out.println("El jugador 2 gana");
			}
			//En caso de que la respuesta del jugador 2 sea "Papel", el jugador 1 gana
			else if(respuesta2.equals("PAPEL")) {
				System.out.println("El jugador 1 gana");
			}
			else {
				//En otro caso es empate
				System.out.println("Empate");
			}
		}
		//Si la respuesta no es ni "Piedra" ni "Papel" ni "Tijeras", la respuesta no es valida
		else {
			System.out.println("La respuesta no es valida");
		}
		//Cerramos el scanner
		sc.close();
	}

}
