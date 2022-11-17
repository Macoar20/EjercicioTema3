package actividadestema3;

import java.util.Scanner;

public class Actividad1 {
	/*
	* Lo primero que he probado, es a introducir las 23 59 59 y sumarle 10 segundos, todo ha salido correctamente
	* Después he probado a introducir un valor de horas mayor a 24 y ha salido error
	* Después he probado a introducir un valor de minutos y segundos mayor a 60 y ha salido error
	*/

	public static void main(String[] args) {
		
		//Declaramos las variables que utilizaremos más adelante
		int horas; //Variable que hará referencia a las horas, que en un princpio las introducirá el usuario
		int minutos; //Variable que hará referencia a los minutos, que en un princpio los introducirá el usuario
		int segundos; //Variable que hará referencia a los segundos, que en un princpio los introducirá el usuario
		int aumento; //Variable que hará referencia al aumento temporal en segundos que el usuario pedirá, y le será aplicado a los valores anteriores
		int resto; //Variable que usaremos para obtener la cantidad de segundos existentes en la suma de segundos, es decir en 123 hay 2 min y 3 seg
		int ayuda; //Variable que guardará el valor de los segundos cuando estos pasen a ser 0 tras llegar a 60
		
		//Creamos el escáner que nos premitirá introducir el valor de nuestras variables
		Scanner ma = new Scanner(System.in);
		
		//Le pregutamos al usuario por la hora, o lo que es lo mismo; le pedimos que le de valor a la variable horas
		System.out.println("¿Qué hora es?");
		
		//El usuario introducirá la cantidad de horas que tenemos
		horas = ma.nextInt();
		
		//Le pregutamos al usuario por los minutos, o lo que es lo mismo; le pedimos que le de valor a la variable minutos
		System.out.println("Qué minuto es?");
		
		
		//El usuario introducirá la cantidad de minutos que tenemos
		minutos = ma.nextInt();
		
		//Le pregutamos al usuario por los segundos, o lo que es lo mismo; le pedimos que le de valor a la variable segundos
		System.out.println("¿Qué segundo es?");
		
		//El usuario introducirá la cantidad de segundos que tenemos
		segundos = ma.nextInt();
		
		//Le pregutamos al usuario por la cantidad de segundos que quiere añadir, es decir, darle valor a la variable aumento
		System.out.println("¿Cúantos segundos quieres sumarle al reloj?");
		
		//El usuario introducirá la cantidad de segundos que quiere añadir
		aumento = ma.nextInt();
		
		//En caso de que el aumento sea mayor a 60, el código tomará esta ruta
		 if (horas<=24&&minutos<=60&&segundos<=60){ 
			
			//El resto es la cantidad de segundos que hay dentro del aumento, una vez hecha la coversión a minutos y horas
			resto = aumento%60;
			
			// Le sumamos a los segundos iniciales los segundos restantes del aumento
			segundos=segundos + resto;
				
				//Mediante este if haremos que si los segundos que tenemos son mayores o iguales a 60 se realizarán los siguientes comandos
				if (segundos>=60) {
					
					//Mediante la variable ayuda guardaremos el valor del resto de  los segundos tras pasarlos a minutos 
					ayuda = segundos-60;
					
					//Le damos valor 0 a los segundos para poder operar de mejor forma con ellos
					segundos=0;
					
					//Le damos a los segundos su valor de vuelta 
					segundos += ayuda;
					
					//Le sumamos 1 minuto más a los minutos
					minutos++;
					
						//Este if nos permitirá hacer que si los minutos llegan a 60 estos vuelvan al valor 0 y se le sume 1 a las horas
						if (minutos==60) {
							
							//Volvemos 0 el valor de los minutos cuando estos llegan a 60
							minutos=0;
							
							//Le sumamos 1 hora al valor de las horas
							horas++;
							
								//Si las horas llegan a 24, está obtendrán el valor 0, ya que los relojes funcionan así
								if (horas==24) {
									horas=0;
							}
					}
			}	
				//Le sumamos a los minutos que tenemos los minutos obtenidos de dividir los segundos que el usuario quería añadir entre 60
				minutos =minutos+ (aumento/60);
					
					//Mediante este for le iremos sumando 1 en cada ciclo a la variable minuto, y cuando este llegue a 60 pasará a ser 0
					for (int u=1; u<=minutos; u++) {
						
						//Mediante este if hacemos que cada vez que u valga 60, le sumamos 1 hora a las horas y el nuevo valor de u será 0
						if (u==60) {
							u=0;
							
							//Minutos tendrá como nuevo valor su valor menos 60 ya que cuando estos llegan a 60 significa 1 hora más
							minutos = minutos - 60;
							
							//Añadimos 1 hora más a la variable horas
							horas++;
							
							//Si las horas llegan a 24, está obtendrán el valor 0, ya que los relojes funcionan así
							if (horas==24) {
								horas=0;
							}
						}
					}
			
		} 
		 
		 //En el caso en el que el usuario introduzca valores imposibles saldrá error
		 else {
			System.out.println("Error");
		}
		
		//Le decimos al usuario el nuevo valor de las 3 variables
		System.out.println(horas + " : " + minutos + " : " + segundos);
		
		//Cerramos el escáner
		ma.close();
	}

}
