package Ejemplos;

import java.util.Scanner;

public class Ejercicio_6 {
	
	public static void main(String[] args) {
		
		int numero = 0;
		int suma = 0;
		int contador = 0;
		Scanner sn = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		numero = sn.nextInt();
		
		while(numero != 0) {
			suma+=numero;
			contador++;
			System.out.println("Introcude un número: ");
			numero = sn.nextInt();
		}
		System.out.println("La media de los número positivos es: "+((float)suma/contador));
		sn.close();
	}
}

