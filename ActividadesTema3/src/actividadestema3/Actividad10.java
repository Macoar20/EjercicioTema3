package actividadestema3;

import java.util.Scanner;

public class Actividad10 {

	public static void main(String[] args) {
		
		//Declaramos las variables
		int num; //Variable que hará referencia al número introducido
		int inverso=0; // Esto nos permitirá realizar el inverso
		int unidad; //Nos permitirá ir guardando unidad a unidad del número introducido por el usuario
		int duplicado; //Este nos guardará el valor del num 
		
		
		//Creamos el escáner
		Scanner ma = new Scanner(System.in);
		
		//Le damos las instrucciones al usuario
		System.out.println("Introduce el número que quieras, te diré si es capícua o no");
		
		//El usuario introduce el valor de num
		num = ma.nextInt();
		duplicado=num;
		
	//Este for hará que se repita un bucle en el cual voy sacando en cada ciclo una unidad del num
	for (;num!=0; num=num/10) {
		
		//Unidad será igual al resto de num entre 10
		unidad = num%10;
		
		//Esto aplicado al inverso por 10 hará que le vayamos dando la vuelta al número 
		inverso = inverso*10+unidad;
		
	//Este if se aplicará cuando el inverso sea igual al duplicado, y cuando eso ocurra el número será capícua
	} if (inverso==duplicado) {
		
		//Le decimos al usuario que su número es capícua
		System.out.println("Capícua");
	
		//En caso contrario, no lo será
	} else {
		
		//Le decimos al usuario que su número no es capícua
		System.out.println("No es capícua");
	}	
		//Cerramos el escáner
		ma.close();
	}

}
