package Firstpnt;

import java.util.Scanner;

public class Form {
	Scanner op=new Scanner(System.in);
	Scanner x=new Scanner(System.in);
	Scanner y=new Scanner(System.in);
	Scanner z=new Scanner(System.in);
	Scanner vol=new Scanner(System.in);

	int e,n1,n2,n3,v;
	double res;

public Form() {
	System.out.println("PUNTO 2. CALCULE SEGÚN SU FORMULA\n");
	System.out.println("1. a=(Raiz(x(^5)-6)/4");
	System.out.println("2. b=x(^y)-6(^x)");
	System.out.println("3. c=4cos(z/5)-sinx(^2)");
	System.out.println("4. d=x(^4)-Raiz(6x-y(^3)");
	System.out.println("5. e=1/(y-(1/x-2(^y)))");
	System.out.println("6. f=7(cos(Raiz(5-sin Raiz(3x-4))))");
	System.out.println("Elija la formula que desea usar:"+"\n");

	e=op.nextByte();
	
		if(e==1){
			System.out.println("Asignele un valor a x");
			n1=x.nextInt();
			res=(Math.sqrt(Math.pow(n1,5)-6))/4;
	}
		if(e==2){
			System.out.println("Asignele un valor a x");
			n1=x.nextInt();
			System.out.println("Asignele un valor a y");
			n2=y.nextInt();
			res=((Math.pow(n1,n2))-(Math.pow(6,n1)));
		}
		if(e==3){
			System.out.println("Asignele un valor a x");
			n1=x.nextInt();
			System.out.println("Asignele un valor a z");
			n3=z.nextInt();
			res=4*Math.cos(n3/5)-Math.sin(Math.pow(n1, 2));
	}
		if(e==4){
			System.out.println("Asignele un valor a x");
			n1=x.nextInt();
			System.out.println("Asignele un valor a y");
			n2=y.nextInt();
			res=Math.pow(n1,4)-Math.sqrt(6*n1-Math.pow(n2, 3));
	}
		if(e==5){
			System.out.println("Asignele un valor a x");
			n1=x.nextInt();
			System.out.println("Asignele un valor a y");
			n2=y.nextInt();
			res=1/n2-(1/n1-Math.pow(2, n2));
	}
		if(e==6){
			System.out.println("Asignele un valor a x");
			n1=x.nextInt();
			res=7*(Math.cos((Math.sqrt(5-Math.sin(Math.sqrt(3*n1-4))))));
	}
		System.out.println("El resultado es: "+res);



}
}

