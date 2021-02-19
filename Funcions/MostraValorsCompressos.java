import java.util.Scanner;

public class MostraValorsCompressos {

	private static Scanner teclat;

	public static int llegirEnterAmbMissatge(String Missatge) {
		int nombreLlegit;
		System.out.print(Missatge);
		nombreLlegit = teclat.nextInt();
		return nombreLlegit;
	}
	
	/* Fer una funci� que rebr� dos nombres (dos par�metres)
	 * i escrigui per pantalla tots els nombres compresos
	 * entre els dos nombres rebuts (amb els dos nombres
	 * inclosos). La funci� no retorna res.
	 * */
	public static void mostraCompresos(int primerNombre, int segonNombre) {
		System.out.println("Els nombres compressos entre " + primerNombre
				+ " i " + segonNombre + " s�n:");
		for (int i = primerNombre; i <= segonNombre; i++) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		
		int numeroLlegit1, numeroLlegit2;
		teclat = new Scanner(System.in);

		numeroLlegit1 = llegirEnterAmbMissatge("Introdueix el primer dels nombres: ");
		numeroLlegit2 = llegirEnterAmbMissatge("Introdueix el segon dels nombres: ");

		mostraCompresos(numeroLlegit1, numeroLlegit2);
	}

}
