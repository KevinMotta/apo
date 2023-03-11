

import java.util.Scanner;

public class Thrp {
public static void peso() {
	Scanner pes=new Scanner(System.in);
	double pester,pesplnt;
	String a="Mercurio",b="Venus",c="Marte";
	String d="Júpiter",e="Saturno",f="Urano",g="Neptuno";
	byte plnt;
	System.out.println("\nCalcule su peso en los diferentes planetas");
	System.out.println("Seleccione el planeta en el que desea calcular su peso:");
	System.out.println("Menú\n1. "+a+"\t2. "+b+"\t3. "+c);
	System.out.println("4. "+d+"\t5. "+e+"\t6. "+f+"\t7. "+g);
	plnt=pes.nextByte();
	System.out.println("Ingrese su peso en el planeta tierra en Kg:");
	pester=pes.nextDouble();
	switch(plnt) {
	case 1: pesplnt=pester*0.38;
	System.out.println("Su peso en "+a+"es de "+pesplnt+" Kg");
	break;
	case 2: pesplnt=pester*0.91;
	System.out.println("Su peso en "+b+"es de "+pesplnt+" Kg");
	break;
	case 3: pesplnt=pester*0.38;
	System.out.println("Su peso en "+c+"es de "+pesplnt+" Kg");
	break;
	case 4: pesplnt=pester*2.36;
	System.out.println("Su peso en "+d+"es de "+pesplnt+" Kg");
	break;
	case 5: pesplnt=pester*0.92;
	System.out.println("Su peso en "+e+"es de "+pesplnt+" Kg");
	break;
	case 6: pesplnt=pester*0.89;
	System.out.println("Su peso en "+f+"es de "+pesplnt+" Kg");
	break;
	case 7: pesplnt=pester*1.13;
	System.out.println("Su peso en "+g+"es de "+pesplnt+" Kg");
	break;
	}
	
	
}
}
