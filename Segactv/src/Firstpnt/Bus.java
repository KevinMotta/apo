package Firstpnt;

import java.util.Scanner;

public class Bus {
	Scanner est=new Scanner(System.in);
public Bus() {
	int can,canf;
	System.out.println("Digite la cantidad de estudiantes que van a ir al viaje:");
	can=est.nextInt();
	canf=can-45;
	if(can>45) {
		System.out.println("Tendrán que usar un autobús y "+ canf+" tendrán que irse en furgonetas");
	}
	else {
	System.out.println("Tendrán que usar un autobús");
}
}
}