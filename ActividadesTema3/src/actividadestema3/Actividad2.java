package actividadestema3;

import java.util.Scanner;

public class Actividad2 {

	public static void main(String[] args) {
		
		//Declaramos las variables que utilizaremos más adelante
		int n; // Será el número introducido por el usuario, y por lo tanto tendremos que contar todos los primos hasta este
		int conteo = 0; // Será la variable que llevará el conteo de los números primos
		boolean primo = true; // El boolean que nos permitirá saber si el número es primo o no
		
		//Creamos el escáner que nos premitirá introducir el valor de nuestra variable n
		Scanner ma = new Scanner(System.in);
		
		//Le damos al usuario las instrucciones del programa, el y le decimos que introduzca un número
		System.out.println("Introduce un número, te diré cuantos números primos hay hasta llegar a ese número");
		
		//El usuario introduce un valor para n
		n = ma.nextInt();
		
		//Mediante este for vamos analizando todos los números 1 a 1 hasta llegar a n, y en cada ciclo declaramos si es primo o no
		for(int num =2; num<=n; num++) {
			
			primo=true;
			
			//Este for será el que nos permitirá dividir el número entre todos los números posibles hasta llegar al número anterior a num 
			for (int i = 2; i<num; i++) {
				
				//Si entre todos los números entre los que hemos dividido nuestro num 
				//ha dado como resultado algún 0 significa que ese número no es primo
				if (num%i==0) {
					
					//Decimos que el número no es primo y salimos de los bucles para entrar de nuevo
					primo = false;
					break;
			} 
			
		}
			
			//En el caso en el cual no nos hemos salido del bloque, 
			//es decir ningún resto es = a 0 significa que el número es primo y por lo tanto a conteo se le suma 1
			if (primo) {
			conteo++;
		}
	 
	}
		//Le decimos al usuario cuantos números primos había
		System.out.println("Había "+ conteo +" números primos");
		
		//Cerramos el escáner
		ma.close();
				
	}

}



