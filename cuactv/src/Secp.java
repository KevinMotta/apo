

import java.util.Scanner;

public class Secp {
 public static void calculadoraSwitch() {
	 float n1,n2,res;
	 String op;

	 System.out.println("Bienvenido a su calculadora\nIngrese un valor decimal:");
	 Scanner cal=new Scanner(System.in);
	 n1=cal.nextFloat();
	 System.out.println("Ingrese el operador:");
	 op=cal.next();
	 System.out.println("Ingrese un valor decimal");
	 n2=cal.nextFloat();

	 switch(op) {
	 case "+": res=n1+n2;
	 System.out.println("El resultado es:"+res);
	 break;
	 case "-": res=n1-n2;
	 System.out.println("El resultado es:"+res);
	 break;
	 case "*": res=n1*n2;
	 System.out.println("El resultado es:"+res);
	 break;
	 case "/": res=n1/n2;
	 System.out.println("El resultado es:"+res);
	 break;
	 default: System.out.println("Operador no valido");
	 }
	 
}
 public static void calculadoraif() {
	 float n3,n4,res1;
	 String op1;

	 System.out.println("Bienvenido a su calculadora\nIngrese un valor decimal:");
	 Scanner cal1=new Scanner(System.in);
	 n3=cal1.nextFloat();
	 System.out.println("Ingrese el operador:");
	 op1=cal1.next();
	 System.out.println("Ingrese un valor decimal");
	 n4=cal1.nextFloat();
	 if(op1=="+") {
		 res1=n3+n4;
		 System.out.println("El resultado es:"+res1);
	 }
	 else if(op1=="-") {
		 res1=n3-n4;
		 System.out.println("El resultado es:"+res1);
	 }
	  else if(op1=="/") {
		 res1=n3/n4;
		 System.out.println("El resultado es:"+res1);
	 }
	  else if(op1=="*") {
		 res1=n3*n4;
		 System.out.println("El resultado es:"+res1);
	 }
	
	 else 
		 System.out.println("Operador no valido");
	 }
	 
}

