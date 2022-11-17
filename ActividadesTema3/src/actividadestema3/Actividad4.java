package actividadestema3;

import java.util.Scanner;

public class Actividad4 {
	/*
	* He probado con el 8 y el 4 siendo 4 el resultado
	* He probado con el 15 y el 50 siendo  5 el resultado
	* Por último he probado con 20 y 30 y ha salido 10
	*/

	public static void main(String[] args) {
		
		//Declaramos las variables que utilizaremos más adelante
		int a; //Variable que hará referencia al primer número introducido por el usuario
		int b; //Variable que hará referencia al segundo número introducido por el usuario
		int diva; //Variable que hará referencia a los restos de a que utilizaremos para saber si un número sirve como máximo común divisor
		int divb; //Variable que hará referencia a los restos de b que utilizaremos para saber si un número sirve como máximo común divisor
		int mcd=0; //Variable que hará referencia al máximo común divisor
		
		//Creamos el escáner que nos premitirá introducir el valor de nuestra variable n
		Scanner ma = new Scanner(System.in);
		
		//Le pedimos al usuario que escriba 2 números y qué vamos a hacer con esos números
		System.out.println("Dame 2 números enteros por favor, yo te haré el MCD");
		
		//Hacemos que el usuario introduzca los valores para a y para b
		a = ma.nextInt();
		b = ma.nextInt();
		
		// Este for será el que irá probando cada número menor al máximo de a y b 1 a 1 hasta encontrar el máximo común divisor
		for (int i = Math.max(a, b); i >= 1; i--) {
			
			//Ambas variables nos permitiran más tarde saber si hemos encontrado el mcd, ya que cuando ambas sean = a 0 significará que ese es el mcd
			diva = a%i;
			divb = b%i;
			
				//En el caso de que no haya Máximo común divisor con ese valor, el bucle se terminará ahí y comenzará otra vez con el siguiente valor
				if (i<mcd) {
					break;
				}
				//Si entramos en este if significará que el valor de ambos div es igual a 0 por lo que hemos encontrado al MCD
				if (diva==0&&divb==0) {
					mcd=i;
				
						
				} 
		}
		//Le decimos al usuario cual es el mcd
		System.out.println("Su mcd es "+ mcd);
		
		//Cerramos el escáner
		ma.close();
	}

}
