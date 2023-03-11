package Firstpnt;

import java.util.Scanner;

import javax.security.sasl.SaslClient;

public class Tri {
	static Scanner ba=new Scanner(System.in);
	static Scanner al=new Scanner(System.in);
	public static float a,b,h;
public Tri() {
	float base,altura;
	float a;
	System.out.println("PRIMER PUNTO");
	System.out.println("Calcule el area de un triangulo."+"\n");
	System.out.println("Ingrese el valor de la base de su triangulo");
	base=Tri.ba.nextFloat();
	System.out.println("Ingrese el valor de la altura de su triangulo");
	altura=Tri.al.nextFloat();
	a = (altura*base)/2;
	System.out.println("El area de su triangulo es: "+ a);
}
	
}
