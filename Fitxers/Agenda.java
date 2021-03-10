import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Agenda {

	public static Scanner teclat = new Scanner(System.in);
	public static Scanner teclatCadenes = new Scanner(System.in);
	
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
		boolean esCorrecte, esEnter;
		esCorrecte = false;
		String cadLlegida;
		do {
			esEnter = true;
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
				System.out.print("\nEntra una opció valida!\n\n");
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
	
	public static String[][] modificaContacte(String[][] matriuRebuda, int posicioAModificar){
		String novaMatriu [][] = new String [matriuRebuda.length][3];
		int campAModificar;
		String nouValor="";
		String missatge = "Quin és el camp que vols modificar?";
		campAModificar = obteOpcio(matriuRebuda[posicioAModificar-1],missatge);
		
		System.out.print("Entra el nou valor");
		nouValor = teclatCadenes.nextLine();
		
		for (int i = 0; i < matriuRebuda.length; i++) {
			for (int j = 0; j < matriuRebuda[i].length; j++) {
				if(i==posicioAModificar-1 && j ==campAModificar-1) {
					novaMatriu[i][j]=nouValor;
				} else {
					novaMatriu[i][j]=matriuRebuda[i][j];
				}
			}
		}
		return novaMatriu;
	}
	
	
	public static String[][] eliminaDeLaMatriu(String[][] matriuRebuda, int posicioAEsborrar){
		String novaMatriu [][] = new String [matriuRebuda.length - 1][3];
		int posNovaMatriu = 0;
		for (int i = 0; i < matriuRebuda.length; i++) {
			if(i!=posicioAEsborrar-1) {
				novaMatriu[posNovaMatriu][0]=matriuRebuda[i][0];
				novaMatriu[posNovaMatriu][1]=matriuRebuda[i][1];
				novaMatriu[posNovaMatriu][2]=matriuRebuda[i][2];
				posNovaMatriu++;
			}
		}
		return novaMatriu;
	}
	
	
	public static void escriureAgendaFitxer(String[][] matriu, String nomFitxer) {
		// Per controlar els errors amb el fitxer a gestionar
		String linia;  // Joan Pardo;931234567;joanpardo@ginebro.cat
		
		try {	
			FileWriter fitxer = new FileWriter(nomFitxer);
			
			
			
			// Escribim les línies al fitxer
			for (int i = 0; i<matriu.length; i++ ) {
				linia = "";
 				linia = matriu[i][0] + ";" 
 						+ matriu[i][1] + ";"
 						+ matriu[i][2]; 
 				fitxer.write(linia + "\n");
				}
			// for (String linea : linies) {
			// 	   fitxer.write(linea + "\n");
			// }
 			
 			fitxer.close();
		} catch (Exception ex) {
			// Si tenim errors amb el fitxer que gestionem
			// mostrem el missatge d'error rebut.
			System.out.println("Missatge d'error: " + ex.getMessage());
		}
	}
	
	public static void main(String[] args) {
		/* Declaració de variables */ 
		boolean sortir;
		
		
		/* Inicialització de variables */ 
		sortir = false;
			
		
		String opcions[] = {"Afegir contacte.",
					"Esborrar contacte.",
					"Modificar contacte.",
					"Mostra contactes.",
					"Sortir i guardar dades.",
					"Sortir sense guardar."
					};
		
		String missatge = "Entra una de les següents opcions";
		String dadesContacte[] = new String[3];
		String nomFitAgenda = "lib/agenda.csv";
		String agenda[][];
		int opcioEscollida;
		int posicioEscollida;
					
		agenda = omplirMatriu(nomFitAgenda);
		do {
			// mostraAgenda(agenda);
			opcioEscollida = obteOpcio(opcions, missatge);
			
			// System.out.print("Opció escollida és: " + opcioEscollida);
					
			switch (opcioEscollida) {
				case 1:   // Afegir contacte
					System.out.print("Entra el nom del nou contacte: ");
					dadesContacte[0] = teclat.next();
	
					System.out.print("Entra el telèfon del nou contacte: ");
					dadesContacte[1] = teclat.next();
	
					System.out.print("Entra el email del nou contacte: ");
					dadesContacte[2] = teclat.next();
					
					agenda = afegeixAMatriu(agenda,dadesContacte);
					// mostraAgenda(agenda);
					System.out.println("Contacte afegit correctament!");
					break;
					
				case 2:  // Esborrar contacte
		
					System.out.print("\nEntra la posició del "
							+ "contacte que vols esborrar: ");
					posicioEscollida = teclat.nextInt();
					// System.out.println("\nEl contacte que vols "
					//		+ "esborrar és " 
					//		+ agenda[posicioEscollida-1][0]
					//		+ "?");
					String [] arrayPerEsborrar = {"Si","No"};
					int opcioPerEsborrar = obteOpcio(arrayPerEsborrar,
							"\nEl contacte que vols "
							+ "esborrar és " 
							+ agenda[posicioEscollida-1][0]);
					if(opcioPerEsborrar==2){
						System.out.println("El contacte no s'ha esborrat!");
					} else {
						agenda = eliminaDeLaMatriu(agenda,posicioEscollida);
						System.out.println("El contacte s'ha esborrat correctament!");
					}
					
					
					
					break;
					
				case 3: // Modificar contacte.
					System.out.print("\nEntra la posició del "
							+ "contacte que vols modificar: ");
					posicioEscollida = teclat.nextInt();
					agenda = modificaContacte(agenda,posicioEscollida);
					break;
					
				case 4:  // Mostra contactes.
					
					mostraAgenda(agenda);
					break;
					
				case 5:  // Sortir i guardar dades.
					escriureAgendaFitxer(agenda,nomFitAgenda);
					
				case 6:  // Sortir sense guardar.
					sortir = true;
					break;
			}
			
			/*int perSortir=0;
			String [] arrayPerSortir = {"Si","No"};
			//int obteOpcio(String arrayRebut[], String missatge)
			perSortir = obteOpcio(arrayPerSortir, "Vols sortir?");
			if (perSortir==1) {
				sortir=true;
			}*/
		} while (sortir == false);
		System.out.print("Adeu!");
	}

}
