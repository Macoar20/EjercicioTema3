package actividadestema3;

import java.util.Scanner;

public class Actividad6 {

	public static void main(String[] args) {
		
		//Introducimos la variable
		int n; //Variable que hará referencia al número introducido por el usuario
		
		//Creamos el escáner que nos premitirá introducir el valor de nuestras variables
		Scanner ma = new Scanner(System.in);
		
		//Le decimos al usuario que nos introduzca un número
		System.out.println("Dime un número entero por favor");
		
		//El usuario introducirá un valor de n
		n = ma.nextInt();
		
		//Creamos un for con el que haremos referencía a las líneas de la pirámide, es decir a la altura, que será la misma que n
		for (int i=1; i<=n; i++) {
			
			//Este será el salto de línea que se aplicará al principio de este bucle
			System.out.println();
			
				//Mediante este bucle imprimiremos el número de la línea tantas veces como ese número sea, es decir en la primera línea será 1 vez
				for (int b=1 ; b<=i; b++) {
					
					//Este bucle lo que hará será imprimir horizontalmente los números 1 por 1 hasta llegar al mismo número de la fila
					System.out.print(i);
			
				}
		}
		
		//Cerramos el escáner
		ma.close();
	}

}
