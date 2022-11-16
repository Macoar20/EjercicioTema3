package actividadestema3;

import java.util.Scanner;

public class Actividad5 {

	public static void main(String[] args) {
		
		int a;
		int b;
		Scanner ma = new Scanner(System.in);
		
		System.out.println("Dame 2 números enteros por favor");
		
		a = ma.nextInt();
		b = ma.nextInt();
		
		for (int i =Math.max(a, b); i>=Math.min(a, b); i++) {
				if (i%a==0&&i%b==0); {
				System.out.println(i);
				break;
				}
				
			}
		ma.close();

	}

}
