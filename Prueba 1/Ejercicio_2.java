package Bucles;

import java.util.Scanner;

public class Ejercicio_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=0;
		System.out.println("Dime un número: ");
		n=sc.nextInt();
		do {
			if (n>0) {
				System.out.println("Tu número es positivo");
				System.out.println("Dime otro número: ");
				n=sc.nextInt();
			} 
			if (n<0){
				System.out.println("Tu número es negativo");
				System.out.println("Dime otro número: ");
				n=sc.nextInt();
			}			
		}while(n!=0);
		sc.close();
	}
}
