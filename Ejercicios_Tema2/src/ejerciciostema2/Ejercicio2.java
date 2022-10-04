package ejerciciostema2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		int numero1, numero2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Inserte un numero cualquiera para si el siguiente es igual: ");
		numero1 = sc.nextInt();
		
		System.out.print("Inserte un numero cualquiera para si el anterior es igual: ");
		numero2 = sc.nextInt();
		
		if (numero1==numero2){
			System.out.print("Estos números son iguales");
		}
		else {
			System.out.print("Estos números son diferentes");
		}
		sc.close();	
		}
	}

