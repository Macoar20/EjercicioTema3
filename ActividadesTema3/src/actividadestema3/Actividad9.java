package actividadestema3;

import java.util.Scanner;

public class Actividad9 {

	public static void main(String[] args) {

		int conteo=0;
		long num;
		
		Scanner ma = new Scanner(System.in);
		
		System.out.println("Introduce un número, te diré cuántos dígitos tiene ese número");
		
		num = ma.nextLong();
		
		for (long i = 1; i<num; i = i*10) {
			conteo++;
		}
		System.out.println("Su número posee "+ conteo +" dígitos");
		ma.close();
	}

}
