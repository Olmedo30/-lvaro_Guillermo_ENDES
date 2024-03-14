package Ejemplos;

import java.util.Scanner;

public class Ejemplo_2 {

	public static void main(String[] args) {
			System.err.println("Esto es un Error");
			System.out.println("Salida estandar");
			
			Scanner teclado=new Scanner(System.in); //leer desde el teclado
			System.out.println("Dame un número");
			int n1=teclado.nextInt();
			System.out.println("El primer número es: " +n1);
			System.out.println("Dame otro número");
			int n2=teclado.nextInt();
			System.out.println("El segundo número es: " +n2);

			int suma = 0;
			int resta = 0;
			int mul = 0;
			float div = 0.0f;
			
			suma = n1+n2;
			resta = n1-n2;
			mul = n1*n2;
			div = (float)n1/n2;
			
			System.out.println("El primer número es: "+ n1);
			System.out.println("El segundo número es:"+ n2);
			
			System.out.println("La suma es: "+suma);
			System.out.println("La resta es: "+resta);
			System.out.println("La multiplicación es: "+mul);
			System.out.println("La división es: "+div);
	}

}
