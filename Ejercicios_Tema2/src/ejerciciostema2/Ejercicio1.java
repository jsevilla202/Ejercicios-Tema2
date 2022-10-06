package ejerciciostema2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		//Nombramos la variable como numero entero
		int numero;
		//Creamos el scanner y lo nombramos "sc"
		Scanner sc = new Scanner(System.in);
		//Pedimos al usuario un numero al azar
		System.out.print("Inserte un numero cualquiera para comprobar si es par o no: ");
		//Capturamos lo que ha introducido el usuario y lo guardamos en la variable "numero"
		numero = sc.nextInt();
		
		//Comprobamos si el numero es par usando su módulo (si es 0 es par) y mostramos el resultado
		if (numero%2==0){
			System.out.print("Este número es par");
		}
		//En otro caso es impar y mostramos el resultado
		else {
			System.out.print("Este número es impar");
		}
		//Cerramos el scanner
		sc.close();	
		}
	}
