package ejerciciostema2;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		//Nombramos la variable como numero entero
		int numero;
		//Creamos el scanner y lo nombramos "sc"
		Scanner sc = new Scanner(System.in);
		//Pedimos al usuario que inserte un numero que esté entre 0 y 99999
		System.out.print("Inserte un número entre 0 y 99.999: ");
		//Capturamos lo que ha introducido el usuario y lo guardamos en la variable "numero"
		numero = sc.nextInt();
		
		//Si el número no está en ese rango decimos que el numero no es valido
		if (numero<0||numero>99999) {
			System.out.print("Su número no es valido");
		}
		//Si el numero está entre 0 y 9, tendrá una cifra y lo mostramos
		else if (numero<=9) {
			System.out.print("Su número tiene una cifra");
		}
		//Si el numero está entre 10 y 99, tendrá dos cifra y lo mostramos
		else if (numero<=99) {
			System.out.print("Su número tiene dos cifras");
		}
		//Si el numero está entre 100 y 999, tendrá tres cifra y lo mostramos
		else if (numero<=999) {
			System.out.print("Su número tiene tres cifras");
		}
		//Si el numero está entre 1000 y 9999, tendrá tres cifra y lo mostramos
		else if (numero<=9999) {
			System.out.print("Su número tiene cuatro cifras");
		}
		//Si el numero no es ninguno de los anteriores, el numero tendrá 5 cifras y lo mostramos
		else {
			System.out.print("Su número tiene cinco cifras");
		}
		//Cerramos el scanner
		sc.close();
	}

}
