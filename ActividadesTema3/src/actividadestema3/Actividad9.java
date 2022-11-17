package actividadestema3;

import java.util.Scanner;

public class Actividad9 {

	public static void main(String[] args) {

		//Introducimos la variables
		int conteo=0; //Variable que hará referencia al conteo de los dígitos que posee el número introducido por el usuario
		long num; //Variable que hará referencia al número que el usuario introduzca y del cual averiguaremos la cantidad de dígitos
		
		//Creamos el escáner que nos premitirá introducir el valor de nuestras variables
		Scanner ma = new Scanner(System.in);
		
		//Le damos al usuario las instrucciones, y le decimos lo que ocurrirá con el dígito introducido
		System.out.println("Introduce un número, te diré cuántos dígitos tiene ese número");
		
		//Hacemos que el usuario introduzca su número
		num = ma.nextLong();
		
		//Mediante este bucle averiguaremos los dígitos que posee el número multiplicando *10 en cada ciclo un 1,
		//mientras el número del bucle sea menor al introducido por el usuario, el bucle se seguirá ejecutando
		for (long i = 1; i<num; i = i*10) {
			
			//Cada ciclo del bucle es igual a un dígito más que posee el número introducido por el usuario
			conteo++;
		}
		
		//Le decimos al usuario cuantos dígitos tiene su número
		System.out.println("Su número posee "+ conteo +" dígitos");
		
		//Cerramos el escáner
		ma.close();
	}

}
