package actividadestema3;

import java.util.Scanner;

public class Actividad6 {

	public static void main(String[] args) {
		
		int n;
		
		Scanner ma = new Scanner(System.in);
		
		System.out.println("Dime un número entero por favor");
		
		n = ma.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println();
				for (int b=1 ; b<=i; b++) {
					System.out.print(i);
			
				}
		}
		ma.close();
	}

}
