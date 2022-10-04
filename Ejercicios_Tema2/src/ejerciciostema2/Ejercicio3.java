package ejerciciostema2;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		double numero;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Inserte un numero cualquiera para comprobar si casi 0 o no: ");
		numero = sc.nextDouble();
		
		
		if (numero<1&&numero>-1&&numero!=0){
			System.out.print("Este número es casi 0");
		}
		else {
			if (numero==0) {
				System.out.print("Este número es 0");
			}
			else {
				System.out.print("Este número no es casi 0");
			}
		}
		sc.close();	
		}
	}

