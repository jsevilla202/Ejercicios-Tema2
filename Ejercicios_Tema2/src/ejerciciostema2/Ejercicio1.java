package ejerciciostema2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		int numero;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Inserte un numero cualquiera para comprobar si es par o no: ");
		numero = sc.nextInt();
		
		
		if (numero%2==0){
			System.out.print("Este número es par");
		}
		else {
			System.out.print("Este número es impar");
		}
		sc.close();	
		}
	}
