package actividadestema3;

import java.util.Scanner;

public class Actividad10 {

	public static void main(String[] args) {

		int num;
		int inverso=0;
		int unidad;
		int duplicado;
		
		
		
		Scanner ma = new Scanner(System.in);
		
		System.out.println("Introduce el número que quieras, te diré si es capícua o no");
		
		num = ma.nextInt();
		duplicado=num;
		
	for (;num!=0; num=num/10) {
		
		unidad = num%10;
		inverso = inverso*10+unidad;
		
	} if (inverso==duplicado) {
		System.out.println("Capícua");
	} else {
		System.out.println("No es capícua");
	}
		ma.close();
	}

}
