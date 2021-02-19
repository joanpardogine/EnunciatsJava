import java.util.Scanner;

public class TornaMaxIMin {

	public static int tornaMaxim(int num1, int num2) {
		int valorMaxim;
		if (num1 > num2) {
			valorMaxim = num1;
		} else {
			valorMaxim = num2;
		}
		return valorMaxim;
	}
	
	public static int tornaMimim(int num1, int num2) {
		int valorMinim;
		if (num1<num2) {
			valorMinim = num1;
		} else {
			valorMinim = num2;
		}
		return valorMinim;
	}
	
	public static void main(String[] args) {
		

		
		Scanner teclat = new Scanner(System.in);
		int nombre1, nombre2;
		// int nombreMesGran, nombreMesPetit;
		
		System.out.println("Escriu el primer dels nombres");
		nombre1 = teclat.nextInt();

		System.out.println("Escriu el segon dels nombres");
		nombre2 = teclat.nextInt();
		
		// nombreMesGran = tornaMaxim(nombre1, nombre2);
		// System.out.println("El nombre m�s gran �s " + nombreMesGran);
		System.out.println("El nombre m�s gran �s " + tornaMaxim(nombre1, nombre2));
		
		// nombreMesPetit = tornaMimim(nombre1, nombre2);
		// System.out.println("El nombre m�s petit �s " + nombreMesPetit);
		System.out.println("El nombre m�s petit �s " + tornaMimim(nombre1, nombre2));
		teclat.close();
	}

}
