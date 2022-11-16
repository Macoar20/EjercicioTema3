package actividadestema3;

import java.util.Scanner;

public class Actividad8 {

	public static void main(String[] args) {

		int mayor=0;
		int n;
		int conteof=0;
		int conteo=0;
		
		
		Scanner ma = new Scanner(System.in);
		
		System.out.println("Introduce números enteros, solo aceptaré los mayores al anterior, cuando quieras terminar introduce el 0");
		
		
		for (n=ma.nextInt() ; n!=0;) {
			if (n>mayor) {
				mayor=n;
				System.out.println("Dime un número : ");
			} else if (n<=mayor) {
				mayor=n;
				conteof++;
				System.out.println("Fallo, es menor.");
				System.out.println("Dime un número : ");
			} 
			
			n=ma.nextInt();
			conteo++;
			
		}
		System.out.println("Total de número introducidos : "+ conteo);
		System.out.println("Números fallados : "+ conteof);
		
		
		
	}

}
