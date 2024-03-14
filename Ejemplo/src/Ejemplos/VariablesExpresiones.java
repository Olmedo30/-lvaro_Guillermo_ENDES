package Ejemplos;

public class VariablesExpresiones {

	public static void main(String[] args) {
		//Comentario: Texto que sirve solo para leer y no se ejecuta
		
		System.out.println("Variables");
//		Declarar variable--> tipo nombre;
//		Declarar e inicializar una variable--> tipo nombre=valor;
		int edadAlumno;
		int edadProfesor=25;
		
//		Numéricas
		int x=1; 
		float altura=1.86f;
		double distancia=2000000000;
		
//		Booleanos true/false
		boolean encontrado=true;
		
//		Letras
		char letra='a';
		
//		Strings o cadenas de caracteres
		String saludo="Hola";
		
//		Expresión = conjunto de variables/operadores/objetos que devuelven un valor
		x=4; //asignación
		System.out.println(x);   //Pone la letra --------------------> x
		System.out.println("x"); //Pone el valor de la variable -----> 4
		System.out.println("El valor de x="+x);
		//Operadores Aritméticos
		x=x+2; //Suma
		System.out.println("El valor de x="+x);
		x=x-3; //Resta
		System.out.println("El valor de x="+x);
		x=x*8; //Producto
		System.out.println("El valor de x="+x);
		x=7/4; //División
		System.out.println("El valor de x="+x);
		x=7%4; //El resto que queda de la divión
		System.out.println("El resto 7/4 es x="+x);
		x=edadProfesor+2;
		x+=2; //x=x+2;
		x=x+1; //x++;
		x=x-1; //x--;
		//Operadores relacionales <,<=<==,>,>=,!=
		System.out.println(x<35);
		//Operadores lógicos: and && or || not!
		
		String cadena="Hola que tal";
		String cadena2= new String("Hola que tal");

		
	}

}
