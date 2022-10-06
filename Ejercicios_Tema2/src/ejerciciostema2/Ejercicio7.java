package ejerciciostema2;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		int numero;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Inserte un número entre 0 y 99.999: ");
		numero = sc.nextInt();
		
		if (numero<0||numero>99999) {
			System.out.print("Su número no es valido");
		}
		
		else if (numero>=0&&numero<=9) {
			System.out.print("Su número tiene una cifra");
		}
		
		else if (numero>=10&&numero<=99) {
			System.out.print("Su número tiene dos cifras");
		}
		
		else if (numero>=100&&numero<=999) {
			System.out.print("Su número tiene tres cifras");
		}
		
		else if (numero>=1000&&numero<=9999) {
			System.out.print("Su número tiene cuatro cifras");
		}
		
		else {
			System.out.print("Su número tiene cinco cifras");
		}
		
		sc.close();
	}

}
