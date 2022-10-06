package ejerciciostema2;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		String respuesta1, respuesta2;
		boolean gana1, gana2;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Jugador 1 introduzca PIEDRA, PAPEL o TIJERAS: ");
		respuesta1 = sc.nextLine();
		System.out.print("Jugador 2 introduzca PIEDRA, PAPEL o TIJERAS: ");
		respuesta2 = sc.nextLine();
			
		if(respuesta1.equals("PIEDRA")) {
			if(respuesta2.equals("PAPEL")) {
				System.out.println("El jugador 2 gana");
			}
			else if(respuesta2.equals("TIJERAS")) {
				System.out.println("El jugador 1 gana");
			}
			else {
				System.out.println("Empate");
			}
		}
		
		if(respuesta1.equals("PAPEL")) {
			if(respuesta2.equals("TIJERAS")) {
				System.out.println("El jugador 2 gana");
			}
			else if(respuesta2.equals("PIEDRA")) {
				System.out.println("El jugador 1 gana");
			}
			else {
				System.out.println("Empate");
			}
		}
		
		if(respuesta1.equals("TIJERAS")) {
			if(respuesta2.equals("PIEDRA")) {
				System.out.println("El jugador 2 gana");
			}
			else if(respuesta2.equals("PAPEL")) {
				System.out.println("El jugador 1 gana");
			}
			else {
				System.out.println("Empate");
			}
		}
		else {
			System.out.println("La respuesta no es valida");
		}
		sc.close();
	}

}
