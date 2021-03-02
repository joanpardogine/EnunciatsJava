import java.io.File;
import java.util.Scanner;

/*
 * Escriure un programa que donat el contingut d'un arxiu,
 * el classifiqui dins d'una matriu. La primera línia del
 * fitxer conté la mida de la matriu, files i columnes,
 * separat per un coixinet (#). I a la segona fila,
 * conté els valors de totes les cel·les de la matriu.
 * Contingut del fitxer:
 *    5#4
 *    1,2,3,4,5,6,7,8,9,A,B,C,D,E,F,G,H,I,J,K
		array[0][1][2][3]
		 [0]  1  2  3  4
		 [1]  5	 6  7  8
		 [2]  9  A  B  C
		 [3]  D  E  F  G
		 [4]  H  I  J  K
 * */
public class PassarFitxerAMatriu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Fitxer que volem llegir
		String nomFitxer = "fitxerAmbMatriu.txt";
		String arrayFilesColumnes[] = new String [2];
		String arrayValorsMatriu[];
		
		// arrayFilesColumnes[0] conté les files
		// arrayFilesColumnes[1] conté les columnes
		int files, columnes;
		
		File fitxer = new File("lib/" 
				+ nomFitxer);
		Scanner puntFitxer = null; // punter al fitxer a llegir

		// Per controlar els errors amb el fitxer a gestionar
		try {
			// Llegim el contingut del fitxer
			System.out.println("... llegim el "
					+ "contingut del fitxer ...");
			puntFitxer = new Scanner(fitxer);
			// Llegim la primea linea que conté les files i columnes
			String linia = puntFitxer.nextLine();

			arrayFilesColumnes = linia.split("#");
			files = Integer.parseInt(arrayFilesColumnes[0]);
			columnes = Integer.parseInt(arrayFilesColumnes[1]);
			char matriu[][] = new char [files][columnes];
			// Llegim la segona linea que conté tots els valors de la matriu.
			
			linia = puntFitxer.nextLine();			
			arrayValorsMatriu = linia.split(",");
			// arrayValorsMatriu[0]=1
			// arrayValorsMatriu[1]=2
			// arrayValorsMatriu[2]=3
			// arrayValorsMatriu[3]=4
			//  1,2,3,4,5,6,7,8,9,A,B,C,D,E,F,G,H,I,J,K
			//      array[0][1][2][3] <== i
			// 		 [0]  1  2  3  4    >>> i = 0
			//	     [1]  5  6  7  8    >>> i = 1
			int comptadorColumna = 0;
			for(int i=0; i < matriu.length; i++) {
				for(int j=0; j < matriu[i].length; j++) {
					matriu[i][j]=arrayValorsMatriu[comptadorColumna].charAt(0);  // i = 0 
					comptadorColumna++;					
				}
			}
			System.out.println("mostrar matriu!");
			for(int i=0; i < matriu.length; i++) {
				for(int j=0; j < matriu[i].length; j++) {
					System.out.print(matriu[i][j]);
				}
				System.out.println();
			}
			System.out.println("final!");
			
		} catch (Exception ex) {
			// Si tenim errors amb el fitxer que gestionem
			// mostrem el missatge d'error rebut.
			System.out.println("Missatge d'error: "
					+ ex.getMessage());
		}
	}
}
