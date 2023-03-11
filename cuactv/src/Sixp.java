import java.util.Scanner;

public class Sixp {
public static void pint() {
	double h,l,b5,b1,a,p;
	int cant,cost;
	System.out.println("Ingrese el alto de su habitación en (pies)^2:");
	Scanner pies=new Scanner(System.in);
	h=pies.nextDouble();
	System.out.println("Ingrese el largo de su habitación en (pies)^2:");
	l=pies.nextDouble();
	System.out.println("Ingrese el ancho de su habitación en (pies)^2:");
	a=pies.nextDouble();
	p=h*l+a;
	b5=p/1500;
	b1=p/300;
	cant=(int) (b5+b1);
	cost=(int) ((b5*15)+(b1*4));
	System.out.println("Necesita comprar "+ cant +" que le salen a "+ cost +"$");

}
}
