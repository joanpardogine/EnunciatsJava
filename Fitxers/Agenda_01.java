import java.io.File;
import java.util.Scanner;

public class Agenda_01 {

	public static Scanner teclat = new Scanner(System.in);
	
	// public final static int NOM = 0;
	// public final static int TEL = 1;
	// public final static int EMAIL = 2;
	
	
	public static void mostraMenu(String opcions[], String missatge) {
		String cadenaOpcions = " (";
		for (int i = 0; i < opcions.length; i++) {
			System.out.println( (i + 1) + ". " + opcions[i]);
			cadenaOpcions = cadenaOpcions + (i + 1);
			if(i<opcions.length - 1) {
				cadenaOpcions = cadenaOpcions + ", ";
			}
		}
		cadenaOpcions = cadenaOpcions + ")";
		System.out.print(missatge + cadenaOpcions + ": ");
	}

	public static int obteOpcio(String arrayRebut[], String missatge) {
		mostraMenu(arrayRebut, missatge);
		int intMinim = 1, intMaxim = arrayRebut.length;
		int opcioEscollida = 0;
		boolean esCorrecte = false, esEnter = true;
		String cadLlegida;
		do {
			// opcioEscollida = teclat.nextInt();
			cadLlegida = teclat.next();
			try{
				opcioEscollida = Integer.parseInt(cadLlegida);
			} catch (NumberFormatException e) {
				esEnter = false;
			}
			
			if( (esEnter == true) &&
				(opcioEscollida>=intMinim) &&
				(opcioEscollida<=intMaxim)
			  ) {
				esCorrecte = true;
				break;
			} else {
				System.out.println("\nEntra una opció valida!\n");
				mostraMenu(arrayRebut, missatge);
			}
		} while(esCorrecte == false);
		return opcioEscollida;
		
	}
	
	public static int obtenirLineas(String nomFitxer) {
		int comptadorLineas = 0;

		try {
			File fitxer = new File(nomFitxer);
			Scanner fitxerScanner = new Scanner(fitxer);

			while (fitxerScanner.hasNextLine()) {
				fitxerScanner.nextLine();
				comptadorLineas++;
			}
			fitxerScanner.close();

		} catch (Exception e) {
			System.out.println("Error inesperat. " + e.getMessage());
		}

		return comptadorLineas;
	}
	
	public static String[][] omplirMatriu(String nomFitxer) {
		int files, columnes;
		files = obtenirLineas(nomFitxer);
		columnes = 3;
		String [][] matContactes = new String[files][columnes];
		
		try {
			File fitxer = new File(nomFitxer);
			Scanner fitxerScanner = new Scanner(fitxer);
			for (int i = 0; i < matContactes.length; i++) {
				String liniaFitxer = fitxerScanner.nextLine();
				String[] informacioContacte = liniaFitxer.split(";");
					matContactes[i][0] = informacioContacte[0];
					matContactes[i][1] = informacioContacte[1];
					matContactes[i][2] = informacioContacte[2];
				}
			fitxerScanner.close();

		} catch (Exception e) {
			System.out.println("Error inesperat. " + e.getMessage());
		}

		return matContactes;
	}
	
	public static void mostraAgenda(String[][] matriuAMostrar) {
		for (int i = 0; i < matriuAMostrar.length; i++) {
			System.out.print("Pos.   : " + (i+1) + "\n"
					+ "Nom    : " + matriuAMostrar[i][0] 
					+ "\nTelefon: " + matriuAMostrar[i][1]
					+ "\nEmail  : " + matriuAMostrar[i][2] 
					+ "\n\n");
		}
	}
	
	public static String[][] afegeixAMatriu(String[][] matriuRebuda, String[] dadesAAfegir) {
		String novaMatriu [][] = new String [matriuRebuda.length + 1][3];
		for (int i = 0; i < novaMatriu.length - 1; i++) {
			novaMatriu[i][0]=matriuRebuda[i][0];
			novaMatriu[i][1]=matriuRebuda[i][1];
			novaMatriu[i][2]=matriuRebuda[i][2];
		}
		novaMatriu[novaMatriu.length-1][0]=dadesAAfegir[0];
		novaMatriu[novaMatriu.length-1][1]=dadesAAfegir[1];
		novaMatriu[novaMatriu.length-1][2]=dadesAAfegir[2];
		return novaMatriu;
	}
	
	
	
	public static void main(String[] args) {
		String opcions[] = {"Afegir contacte",
				"Esborrar contacte",
				"Modificar contacte.",
				"Sortir i guardar dades.",
				"Sortir sense guardar."
				};
		String missatge = "Entra una de les següents opcions";
		String dadesContacte[] = new String[3];
		String nomFitAgenda = "lib/agenda.csv";
		String agenda[][];
		int opcioEscollida;
				
		agenda = omplirMatriu(nomFitAgenda);
		// mostraAgenda(agenda);
		opcioEscollida = obteOpcio(opcions, missatge);
		
		// System.out.print("Opció escollida és: " + opcioEscollida);
				
		switch (opcioEscollida) {
			case 1:
				System.out.print("Entra el nom del nou contacte: ");
				dadesContacte[0] = teclat.next();

				System.out.print("Entra el telèfon del nou contacte: ");
				dadesContacte[1] = teclat.next();

				System.out.print("Entra el email del nou contacte: ");
				dadesContacte[2] = teclat.next();
				
				agenda = afegeixAMatriu(agenda,dadesContacte);
				// mostraAgenda(agenda);
				System.out.print("Contacte afegit correctament!");
				break;
				
			case 2:
				System.out.print("Entra la posició del contacte que vols modificar: ");
				
				break;
				
			case 3:
				break;
				
			case 4:
				break;
				
			case 5:
				break;
		}
	}

}
