

import java.util.Random;
import java.util.Scanner;

public class Cuap {
	
	public static void cuap() {
		String nom;
		Scanner n=new Scanner(System.in);
		System.out.println("Ingrese su nombre:");
		nom=n.next();
		System.out.println("");
	}
public Cuap() {
	int i,mayorcl1=0,mayorcl=0,postc=0,postc1=0,poSt=0;
	double mayornt=0;
	int[] clst=new int[1400];
	int[] satst=new int[1400];
	double[] notmst=new double[1400];
	int[] pm4Om=new int[1400];
	int[] pm35Om=new int[1400];
	int[] pm3Om=new int[1400];
	for(i=0;i<1400;i++) {
		Random ran=new Random();
		clst[i]=(int)(Math.random()*12);
		satst[i]=(int)(Math.random()*1600);
		notmst[i]=(Math.random()*5);
	}
	for(i=0;i<1400;i++) {
		if(clst[i]>=mayorcl1) {
			mayorcl1=clst[i];
			postc1=i;
		}
		if(clst[i]>mayorcl) {
			mayorcl=clst[i];
			postc=i;
		}
	}
	for(i=0;i<1400;i++) {
		if(notmst[i]>=4&&satst[i]>=1100) {
			pm4Om[i]=i;
		}
		if(notmst[i]>=3.5&&satst[i]>=1300) {
			pm35Om[i]=i;
		}
		if(notmst[i]>=3&&satst[i]>=1500) {
			pm3Om[i]=i;
		}
	}
	System.out.println("\nESTUDIANTES APROVADOS");
	System.out.println("El/la estudiante #"+(postc+1)+" y #"+(postc1)+" obtuvieron las dos clasificacione más altas.");
	System.out.println("Estudiantes con nota media mayor o igual a 4 y puntaje SAT mayor o igual a 1100:");
	for (i=0;i<1400;i++) {
		if(pm4Om[i]!=0) {
			System.out.println(pm4Om[i]);
		}
	}
	System.out.println("Estudiantes con nota media mayor o igual a 3.5 y puntaje SAT mayor o igual a 1300:");
	for (i=0;i<1400;i++) {
		if(pm35Om[i]!=0) {
			System.out.println(pm35Om[i]);
		}
	}
	System.out.println("Estudiantes con nota media mayor o igual a 3 y puntaje SAT mayor o igual a 1500:");
	for (i=0;i<1400;i++) {
		if(pm3Om[i]!=0) {
			System.out.println(pm3Om[i]);
		}
	}
}
}
