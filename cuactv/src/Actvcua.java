import java.util.Scanner;

public class Actvcua {

	public static void main(String[] args) {
		int o;
	Frstp pri=new Frstp();
	System.out.println("\n¿Desea iniciar la calculadora por metodo if/else o Switch?");
	System.out.println("1. if/else\n2. switch");
	Scanner a=new Scanner(System.in);
	o=a.nextInt();
	switch(o){
	case 1: Secp.calculadoraif();
	break;
	case 2: Secp.calculadoraSwitch();
	break;
	}
	Thrp.peso();
	Cuap pr=new Cuap();
	System.out.println("\n");
	Cinp.finalexam();
	System.out.println("\n");
	Sixp.pint();
	}

}
