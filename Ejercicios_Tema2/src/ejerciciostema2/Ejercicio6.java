package ejerciciostema2;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		//Nombramos las variables como numeros enteros
		int a, b, c;
		//Nombramos las variables como numeros con decimales
		double raiz, ecuacion1, ecuacion2;
		
		//Creamos el scanner y lo nombramos "sc"
		Scanner sc = new Scanner(System.in);
		
		//Pedimos al usuario que inserte los siguientes datos
		System.out.println("Para realizar la ecuación de segundo grado necesito los siguientes datos:  ");
		//Pedimos al usuario que inserte el valor de "a"
		System.out.print("Inserte el valor que desea darle a ´a´: ");
		//Capturamos lo que ha introducido el usuario y lo guardamos en la variable "a"
		a = sc.nextInt();
		//Pedimos al usuario que inserte el valor de "b"
		System.out.print("Inserte el valor que desea darle a ´b´: ");
		//Capturamos lo que ha introducido el usuario y lo guardamos en la variable "b"
		b = sc.nextInt();
		//Pedimos al usuario que inserte el valor de "c"
		System.out.print("Inserte el valor que desea darle a ´c´: ");
		//Capturamos lo que ha introducido el usuario y lo guardamos en la variable "c"
		c = sc.nextInt();
		
		//Dividimos la ecuación de 2º grado entre raiz y las ecuaciones de suma y resta
		raiz = (b*b)-4*a*c;
		ecuacion1 = (-b+Math.sqrt(raiz))/(2*a);
		ecuacion2 = (-b-Math.sqrt(raiz))/(2*a);
	
		//Si la raiz es 0, la solución de x es -b/2*a
		if(raiz==0) {
			System.out.println("la solución de x es: " + (-b)/2*a);
		}
		else {
		//Si el resultado de la raiz es inferior a 0 no existe, en otro caso mostramos las soluciones
		System.out.print(raiz<0? "La raiz cuadrada no se puede realizar" : "Las soluciones de x son "+
		ecuacion1 + " y " + ecuacion2);
		}
		//Cerramos el scanner
		sc.close();	
		}



	}

