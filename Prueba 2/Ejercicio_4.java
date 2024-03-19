package Bucles;

import java.util.Scanner;

public class Ejercicio_4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=0;
		System.out.println("Dime un número: ");
		n=sc.nextInt();
		int m=0;
		do {	
			System.out.println("Dime otro número: ");			
			n=sc.nextInt();	
			m++;
		} while(n>0);
		System.out.println("Se han mostrado "+m+" números.");
		sc.close();
	}
}