package ejerciciostema2;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		//Nombramos las variables como numeros enteros
		int numero1, numero2, numero3;
		//Creamos el scanner y lo nombramos "sc"
		Scanner sc = new Scanner(System.in);
		
		//Pedimos al usuario un numero al azar
		System.out.print("Inserte un numero cualquiera para si el siguiente es mayor, menor o igual: ");
		//Capturamos lo que ha introducido el usuario y lo guardamos en la variable "numero1"
		numero1 = sc.nextInt();
		//Pedimos al usuario otr numero al azar
		System.out.print("Inserte un numero cualquiera para si el anterior es mayor, menor o igual: ");
		//Capturamos lo que ha introducido el usuario y lo guardamos en la variable "numero2"
		numero2 = sc.nextInt();
		//Pedimos al usuario otro numero más al azar
		System.out.print("Inserte un numero cualquiera para si los anteriores son "
				+ "mayores, menores o iguales: ");
		//Capturamos lo que ha introducido el usuario y lo guardamos en la variable "numero3"
		numero3 = sc.nextInt();
		
		//Comprobamos si los numero son iguales y mostramos el resultado
		if (numero1==numero2&&numero1==numero3){
			System.out.print("Estos números son iguales");
		}
		//En otro caso
		else {
			//Comprobamos si num1 es el menor
			if (numero1<numero2&&numero1<numero3) {
				//Comprobamos si num3 es el mayor y si es así mostramos el resultado
				if(numero2<numero3) {
					System.out.print(numero3 + " " + numero2 + " " + numero1);
				}
				//En otro caso num2 es el mayor y mostramos el resultado
				else {
					System.out.print(numero2 + " " + numero3 + " " + numero1);
				}
			}
			//Comprobamos si num2 es el menor
			if (numero2<numero1&&numero2<numero3) {
				//Comprobamos si num3 es el mayor y si es así mostramos el resultado
				if(numero1<numero3) {
					System.out.print(numero3 + " " + numero1 + " " + numero2);
				}
				//En otro caso num1 es el mayor y mostramos el resultado
				else {
					System.out.print(numero1 + " " + numero3 + " " + numero2);
				}
			}
			//Comprobamos si num3 es el menor
			if (numero3<numero1&&numero3<numero2) {
				//Comprobamos si num2 es el mayor y si es así mostramos el resultado
				if(numero1<numero2) {
					System.out.print(numero2 + " " + numero1 + " " + numero3);
				}
				//En otro caso num1 es el mayor y mostramos el resultado
				else {
					System.out.print(numero1 + " " + numero2 + " " + numero3);
				}
			}
		}
		//Cerramos el scanner
		sc.close();	
		}



	}

