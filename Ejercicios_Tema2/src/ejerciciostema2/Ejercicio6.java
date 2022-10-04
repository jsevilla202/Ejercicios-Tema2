package ejerciciostema2;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		int a, b, c;
		double raiz, ecuacion1, ecuacion2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Para realizar la ecuación de segundo grado necesito los siguientes datos:  ");
		System.out.print("Inserte el valor que desea darle a ´a´: ");
		a = sc.nextInt();
		
		System.out.print("Inserte el valor que desea darle a ´b´: ");
		b = sc.nextInt();
		
		System.out.print("Inserte el valor que desea darle a ´c´: ");
		c = sc.nextInt();
		
		raiz = (b*b)-4*a*c;
		ecuacion1 = (-b+Math.sqrt(raiz))/(2*a);
		ecuacion2 = (-b-Math.sqrt(raiz))/(2*a);
		
		System.out.print(raiz<0? "La raiz cuadrada no se puede realizar" : "Las soluciones de x son "+
		ecuacion1 + " y " + ecuacion2);
		
		sc.close();	
		}



	}

