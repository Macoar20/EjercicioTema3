package actividadestema3;

import java.util.Scanner;

public class Actividad3 {

	public static void main(String[] args) {
		
		//Declaramos las variables que utilizaremos más adelante
		String m= "*"; //Este string será el que hará el tríangulo, ya que esta está hecha con una estrellita y no un número
		int n; //Esta variable hará referencia al número que introducirá el usuario, y la base y altura que será nuestro tríangulo posee
		
		//Creamos el escáner que nos premitirá introducir el valor de nuestra variable n
		Scanner ma = new Scanner(System.in);
		
		//Le daremos al usuario las instrucciones a seguir, además le pediremos que escriba el número
		System.out.println("Dime un número y te haré un tríangulo de base y altura = a ese número");
		
		//Le permitimos al usuario escribir su número
		n = ma.nextInt();
		
		//Este for será el encargado de las líneas, es decir la altura del tríangulo la cual será igual al número introducido por el usuario
		for (int i=1; i<=n; i++) {
			
			//Este for será el encargado de introducir la cantidad de espacios entre la pared de la consola y la primera estrella,
			//El número de espacios será igual al número del usuario - 1, aunque por cada fila le restaremos 1 más
			for (int b = n; b>i; b=b-1) {
				
				//Estos serán los espacios que encontramos antes de llegar a la primera estrella
				System.out.printf(" ");
			}
			
			//Este for será el encargado de darle forma a la pirámide, y de introducir las estrellas con los espacios entre esta
			for (int j = 0; j<i; j++) {
				
				//Esto imprimirá las estrellas, y despues de cada estrella nos encontraremos un espacio
				System.out.printf( m +" ");
			} 
			
			//Mediante este println le daremos la forma de tríangulo, ya que sin él las estrellas saldrían todas en la misma línea
			System.out.println("");
		}
		
		//Cerramos el escáner
		ma.close();
	}

}
