package ejerciciostema2;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		int nota;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca la nota: ");
		nota = sc.nextInt();
		
		if (nota<0||nota>10) {
			System.out.print("Su nota no es valida");
		}
		
		else if (nota>=0&&nota<5) {
			System.out.print("Su nota es INSUFICIENTE");
		}
		
		else if (nota>=5&&nota<6) {
			System.out.print("Su nota es SUFICIENTE");
		}
		
		else if (nota>=6&&nota<7) {
			System.out.print("Su nota es BIEN");
		}
		
		else if (nota>=7&&nota<9) {
			System.out.print("Su nota es NOTABLE");
		}
		
		else {
			System.out.print("Su nota es SOBRESALIENTE");
		}
		
		sc.close();
	}
}
