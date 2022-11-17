package actividadestema3;

import java.util.Scanner;

public class Actividad8 {

	public static void main(String[] args) {
		
		//Declaramos las variables que utilizaremos más tarde
		int mayor=0; //Esta variable la utilizaremos para saber cuando el número introducido es mayor que el anterior
		int n; //Esta variable hace referencia al número que introducirá el usuario
		int conteof=0; //Esta variable hace referencia al conteo de los fallos
		int conteo=0; //Esta variable hace referencia al conteo de los números introducimos
		
		//Creamos el escáner
		Scanner ma = new Scanner(System.in);
		
		//Le decimos al usuario lo que debe hacer, y las instrucciones a seguir
		System.out.println("Introduce números enteros, solo aceptaré los mayores al anterior, cuando quieras terminar introduce el 0");
		
		//Mediante este bucle el usuario irá introduciendo números, ya sean mayores o menores, y terminará cuando introduzca el 0
		for (n=ma.nextInt() ; n!=0;) {
			
			//Mediante este if, si el número introducido es mayor al anterior se imprimirá el siguiente mensaje
			if (n>mayor) {
				
				//Se guarda el valor del último número
				mayor=n;
				
				//Le decimos al usuario que siga introduciendo números
				System.out.println("Dime un número : ");
			}
			
			//En caso contrario, se añadirá 1 al valor del conteo de los fallos, y le diremos al usuario que ha ocurrido un fallo
			else if (n<=mayor) {
				
				//Se guarda el valor del último número
				mayor=n;
				
				//Sumamos 1 al valor del conteo de los fallos
				conteof++;
				
				//Le decimos al usuario que ha fallado y que introduzca otro número
				System.out.println("Fallo, es menor.");
				System.out.println("Dime un número : ");
			} 
			//El usuario vuelve a introducir un número y se le sumará 1 al conteo de los números
			n=ma.nextInt();
			conteo++;
			
		}
		
		//Le decimos al usuario los resultados totales de los conteos
		System.out.println("Total de número introducidos : "+ conteo);
		System.out.println("Números fallados : "+ conteof);
		
		//cerramos el escáner
		ma.close();
		
		
	}

}
