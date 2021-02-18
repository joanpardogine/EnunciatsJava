import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/*Contingut del fitxer:
		34,2
		3,4
		25,6
		8,9
		8,0
		5,-15
 Fitxer de sortida:
		34,2,36
		3,4,7
		25,6,31
		8,9,17
		8,0,8
		5,-15, -10
*/

public class LlegirCsvISumarSenseFuncions {

	public static void main(String[] args) {
		
		String[] arrayNombresLlegits;
		int sumaLinia;
		
		try { // Per controlar el fitxer que volem llegir
			File fitxerLlegir = new File("lib/nombresASumar.txt");
			Scanner punterFitLleg = null;
			
			// punter per accedir al fitxer a llegir
			punterFitLleg = new Scanner(fitxerLlegir);
			
			try { // Per controlar el fitxer que volem escriure
				FileWriter fitxerEscriure = new FileWriter("lib/nombresSumats.txt");
				
				// Llegim el contingut del fitxer
				System.out.println("... llegim el contingut del fitxer ...");
				
				// Llegim linea a línia fitxer
				while (punterFitLleg.hasNextLine()) {
					// Inicialitzem la suma a zero
					sumaLinia = 0;
					
					// Salvem la línia a un String
					String linia = punterFitLleg.nextLine();
					
					// Mostrem la línia
					System.out.println(linia);
					
					arrayNombresLlegits = linia.split(","); 
					// Divideix l'String linia en camps separats per ","
					// i afegeix els elements a un Array  arrayNombres
					
					sumaLinia = Integer.parseInt(arrayNombresLlegits[0]) +
							Integer.parseInt(arrayNombresLlegits[1]);

					// cal que la suma l'afegim a un fitxer de sortida.
					fitxerEscriure.write(linia + "," + sumaLinia + "\n");
					System.out.print(linia + "," + sumaLinia + "\n");
//					int sumaValors=0;
//					for (int i =0; i < arrayNombresLlegits.length; i++) {
//						sumaValors = sumaValors + Integer.parseInt(arrayNombresLlegits[i]);
//					}				
//					System.out.println("sumaValors = " + sumaValors);
				}
				fitxerEscriure.close(); // Tanquem el fitxer a escriure
				
			} catch (Exception ex) { // Per controlar el fitxer que volem escriure
				System.out.println("Missatge (fitxer escriure): " + ex.getMessage());
			} 	// FINAL Per controlar el fitxer que volem escriure
			punterFitLleg.close(); // Tanquem el fitxer a llegir
			
		} catch (Exception ex) { // Per controlar el fitxer que volem llegir
			System.out.println("Missatge (fitxer lectura): " + ex.getMessage());
		}		// FINAL Per controlar el fitxer que volem llegir

//		finally {
//			// Tanquem el fitxer tant si la lectura ha estat correcta com si no
//			try {
//				if (punterFitLleg != null)
//					punterFitLleg.close();
//			} catch (Exception ex2) {
//				System.out.println("Missatge 2: " + ex2.getMessage());
//			}
//		}

	}
}