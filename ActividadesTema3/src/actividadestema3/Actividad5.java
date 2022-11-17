package actividadestema3;

import java.util.Scanner;

public class Actividad5 {
	/*
	* He probado con el 15 y el 50, ha salido 150
	* He probado con el 60 y el 35 y ha salido 420
	* He probado con el 10 y el 5 y ha salido 10
	*/

	public static void main(String[] args) {

		//Declaramos las variables que utilizaremos más adelante
		int a; //Variable que hará referencia al primer número introducido por el usuario
		int b; //Variable que hará referencia al segundo número introducido por el usuario
		
		//Creamos el escáner que nos premitirá introducir el valor de nuestra variable n
		Scanner ma = new Scanner(System.in);

		//Le pedimos al usuario que escriba 2 números y qué vamos a hacer con esos números
		System.out.println("Dame 2 números enteros por favor");

		//Hacemos que el usuario introduzca los valores para a y para b
		a = ma.nextInt();
		b = ma.nextInt();

		//Este for será el que irá probando cada número mayor al máximo de a y b 1 a 1 hasta encontrar el mínimo común múltiplo
		for (int i = Math.max(a, b); i >= Math.min(a, b); i++) {
			
			//Si el resto de a y b dividido entre el número del bucle es igual a 0 significa que ese será su mínimo común múltiplo
			if (i % a == 0 && i % b == 0) {
				
				//Le decimos al usuario cual es el mínimo común múltiplo y salimos de los bucles
				System.out.println("Su mínimo común múltiplo es "+ i);
				break;
			}

		}
		
		//Cerramos el escáner
		ma.close();

	}

}
