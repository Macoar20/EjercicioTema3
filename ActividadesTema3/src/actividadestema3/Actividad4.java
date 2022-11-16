package actividadestema3;

import java.util.Scanner;

public class Actividad4 {

	public static void main(String[] args) {
		
		int a;
		int b;
		int diva;
		int divb;
		int mcd=0;
		
		Scanner ma = new Scanner(System.in);
		
		System.out.println("Dame 2 números enteros por favor");
		
		a = ma.nextInt();
		b = ma.nextInt();
		
		for (int i = Math.max(a, b); i >= 1; i--) {
			diva = a%i;
			divb = b%i;
				if (i<mcd) {
					break;
				}
				if (diva==0&&divb==0) {
					mcd=i;
				
						
				} 
		}
		System.out.println(mcd);
		ma.close();
	}

}
