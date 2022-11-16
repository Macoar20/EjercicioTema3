package actividadestema3;

import java.util.Scanner;

public class Actividad3 {

	public static void main(String[] args) {
		
		String m= "*";
		int n;
		
		Scanner ma = new Scanner(System.in);
		
		System.out.println("Dime un número y te haré un tríangulo de base y altura = a ese número");
		
		n = ma.nextInt();
		
		for (int i=1; i<=n; i++) {
			for (int b = n; b>i; b=b-1) {
				System.out.printf(" ");
			}
			
			for (int j = 0; j<i; j++) {
				System.out.printf( m +" ");
			} System.out.printf("\n");
		}
		ma.close();
	}

}
