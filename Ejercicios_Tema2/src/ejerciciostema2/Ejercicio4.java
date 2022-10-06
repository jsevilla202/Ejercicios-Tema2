package ejerciciostema2;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		//Nombramos las variables como numeros enteros
		int numero1, numero2;
		//Creamos el scanner y lo nombramos "sc"
		Scanner sc = new Scanner(System.in);
		//Pedimos al usuario un numero al azar
		System.out.print("Inserte un numero cualquiera para si el siguiente es mayor, menor o igual: ");
		//Capturamos lo que ha introducido el usuario y lo guardamos en la variable "numero1"
		numero1 = sc.nextInt();
		//Pedimos al usuario otro numero al azar
		System.out.print("Inserte un numero cualquiera para si el anterior es mayor, menor o igual: ");
		//Capturamos lo que ha introducido el usuario y lo guardamos en la variable "numero2"
		numero2 = sc.nextInt();
		
		//Comprobamos si los numeros son iguales y mostramos el resultado
		if (numero1==numero2){
			System.out.print("Estos números son iguales");
		}
		//Comprobamos si numero2 es mayor que numero1 y mostramos el resultado
		else if (numero1<numero2) {
				System.out.print(numero1 + " " + numero2);
			}
		//En otro caso numero2 será menor que numero1 y mostramos el resultado
		else {
			System.out.print(numero2 + " " + numero1);
			}
		//Cerramos el scanner
		sc.close();	
		}



	}
