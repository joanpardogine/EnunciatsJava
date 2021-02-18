import java.io.File;
import java.util.Scanner;

public class LecturaFitxer {

	public static void main(String[] args) {

		// Fitxer que volem llegir
		String nomFitxer = "fitxerLlegir.txt";
		File fitxer = new File("lib/" + nomFitxer);
		Scanner puntFitxer = null; // punter al fitxer a llegir

		// Per controlar els errors amb el fitxer a gestionar
		try {
			// Llegim el contingut del fitxer
			System.out.println("... llegim el contingut del fitxer ...");
			puntFitxer = new Scanner(fitxer);
			// Llegim linea a línia fitxer
			while (puntFitxer.hasNextLine()) {
				String linia = puntFitxer.nextLine();
				// Guardem la línia a un String
				System.out.println(linia);
				// Mostrem la línia per pantalla
			}
		} catch (Exception ex) {
			// Si tenim errors amb el fitxer que gestionem
			// mostrem el missatge d'error rebut.
			System.out.println("Missatge d'error: " + ex.getMessage());
		}
	}
}
