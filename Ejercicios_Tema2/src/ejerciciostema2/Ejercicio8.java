package ejerciciostema2;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		//Nombramos la variable como numero entero
		int nota;
		//Creamos el scanner y lo nombramos "sc"
		Scanner sc = new Scanner(System.in);
		//Pedimos al usuario que introduzca una nota entre 0 y 10
		System.out.print("Introduzca la nota entre 0 y 10: ");
		//Capturamos lo que ha introducido el usuario y lo guardamos en la variable "nota"
		nota = sc.nextInt();
		
		//Creamos un switch y dependiendo de la nota introducida pasará una acción u otra
		switch(nota) {
		case 0: System.out.print("la nota es INSUFUICIENTE"); break;
		case 1: System.out.print("la nota es INSUFUICIENTE"); break;
		case 2: System.out.print("la nota es INSUFUICIENTE"); break;
		case 3: System.out.print("la nota es INSUFUICIENTE"); break;
		case 4: System.out.print("la nota es INSUFUICIENTE"); break;
		case 5: System.out.print("la nota es SUFUICIENTE");break;
		case 6: System.out.print("la nota es BIEN"); break;
		case 7: System.out.print("la nota es NOTABLE"); break;
		case 8: System.out.print("la nota es NOTABLE"); break;
		case 9: System.out.print("la nota es SOBRESALIENTE"); break;
		case 10: System.out.print("la nota es SOBRESALIENTE"); break;
		default:
			System.out.print("La nota introducida no es correcta");
			break;
		}
		//Cerramos el scanner
		sc.close();
	}
}
