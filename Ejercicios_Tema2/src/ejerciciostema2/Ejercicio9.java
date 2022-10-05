package ejerciciostema2;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		String respuesta1, respuesta2;
		int jugada1, jugada2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Jugador 1 introduzca PIEDRA, PAPEL o TIJERAS: ");
		respuesta1 = sc.next();
		System.out.print("Jugador 2 introduzca PIEDRA, PAPEL o TIJERAS: ");
		respuesta2 = sc.next();
		
		if (respuesta1=="PIEDRA") {
			jugada1=1;
		}
		else if(respuesta2=="PAPEL") {
			jugada1=2;
		}
		else {
			jugada1=3;
		}
		
		
		if (respuesta2=="PIEDRA") {
			jugada2=1;
		}
		else if(respuesta2=="PAPEL") {
			jugada2=2;
		}
		else {
			jugada2=3;
		}
		
		
		if (jugada1>=1&&jugada1<=3&&jugada2>=1&&jugada2<=3) {
			
			if(jugada1==1&&jugada2==3) {
				System.out.println("El jugador 1 gana");
			}
			if(jugada2==1&&jugada1==3) {
				System.out.println("El jugador 2 gana");
			}
			if(respuesta1=="PAPEL"&&respuesta2=="PIEDRA") {
				System.out.println("El jugador 1 gana");
			}
			if(respuesta2=="PAPEL"&&respuesta1=="PIEDRA") {
				System.out.println("El jugador 2 gana");
			}
			if(respuesta1=="TIJERAS"&&respuesta2=="PAPEL") {
				System.out.println("El jugador 1 gana");
			}
			if(respuesta2=="TIJERAS"&&respuesta1=="PAPEL") {
				System.out.println("El jugador 2 gana");
			}
		}
		

		else if(respuesta1==respuesta2) {
				System.out.println("Empate");
			}
		else {
			System.out.println("La respuesta no es valida");
		}
		sc.close();
	}

}
