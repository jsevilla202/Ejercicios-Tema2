package ejerciciostema2;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		int numero1, numero2, numero3;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Inserte un numero cualquiera para si el siguiente es mayor, menor o igual: ");
		numero1 = sc.nextInt();
		
		System.out.print("Inserte un numero cualquiera para si el anterior es mayor, menor o igual: ");
		numero2 = sc.nextInt();
	
		System.out.print("Inserte un numero cualquiera para si los anteriores son "
				+ "mayores, menores o iguales: ");
		numero3 = sc.nextInt();
		
		if (numero1==numero2&&numero1==numero3){
			System.out.print("Estos números son iguales");
		}
		else {
			if (numero1<numero2&&numero1<numero3) {
				if(numero2<numero3) {
					System.out.print(numero3 + " " + numero2 + " " + numero1);
				}
				else {
					System.out.print(numero2 + " " + numero3 + " " + numero1);
				}
			}
			if (numero2<numero1&&numero2<numero3) {
				if(numero1<numero3) {
					System.out.print(numero3 + " " + numero1 + " " + numero2);
				}
				else {
					System.out.print(numero1 + " " + numero3 + " " + numero2);
				}
			}
			if (numero3<numero1&&numero3<numero2) {
				if(numero1<numero2) {
					System.out.print(numero2 + " " + numero1 + " " + numero3);
				}
				else {
					System.out.print(numero1 + " " + numero2 + " " + numero3);
				}
			}
		}
		sc.close();	
		}



	}

