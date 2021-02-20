import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PassaMatriuAFitxerLinea {
	
	public static Scanner teclat = new Scanner(System.in);
	
	public static int demanarEnter(String cadenaAMostrar) {
		int enterATornar = 0;
		System.out.print(cadenaAMostrar);
		enterATornar  = teclat.nextInt();
		return enterATornar;
	}
	
	
	
	public static void omplirMatriu (int [][] matriuEnters){
		int comptador = 1;
		for (int i=0; i<matriuEnters.length; i++) {
			for (int j=0; j<matriuEnters[i].length; j++) {
				matriuEnters[i][j]=comptador;
				comptador++;
			}	
		}
	}
	
	
	public static void mostrarMatriu (int [][] matriuEnters){
		for (int i=0; i<matriuEnters.length; i++) {
			for (int j=0; j<matriuEnters[i].length; j++) {
				System.out.print(matriuEnters[i][j]);
				if (j < matriuEnters[i].length - 1) {
					System.out.print(",");
				}
			}
			System.out.println();
		}
	}
	
		
	public static int[] obteFilaMatriu(int [][] matriuEnters, int filaAObtenir) {
		int[] filaATornar;
		filaATornar = matriuEnters[filaAObtenir];
		return filaATornar;
	}
	
	public static void escriuFilaFitxer(int[] filaAEscriure, FileWriter fitxer) {
			String filaAmbElements = "";
			for (int i=0; i<filaAEscriure.length;i++) {
				filaAmbElements = filaAmbElements 
						+ filaAEscriure[i]
						+ ", ";
			}
			try {
				fitxer.write(filaAmbElements + "\n");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}
	
	public static void mostrarContingutFitxer(String nomFitxer) {
		// Fitxer que volem llegir
		File fitxer = new File(nomFitxer);
		Scanner puntFitxer = null; // punter al fitxer a llegir

		// Per controlar els errors amb el fitxer a gestionar
		try {
			// Llegim el contingut del fitxer
			System.out.println("... mostrar contingut del fitxer ...");
			puntFitxer = new Scanner(fitxer);
			// Llegim linea a línia fitxer
			while (puntFitxer.hasNextLine()) {
				String linia = puntFitxer.nextLine();
				System.out.println(linia);
				// Mostrem la línia per pantalla
			}
		} catch (Exception ex) {
			// Si tenim errors amb el fitxer que gestionem
			// mostrem el missatge d'error rebut.
			System.out.println("Missatge d'error: "
					+ ex.getMessage());
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadDemanarFila = "Entra el nombre de files de la matriu: ";
		String cadDemanarColu = "Entra el nombre de columnes de la matriu: ";
		int files, columnes;
		
		String nomFitxer = "matriuLineal.txt";
		int[] fila;
		
		try {
			FileWriter fitxer = new FileWriter("lib/" + nomFitxer);
			
			files = demanarEnter(cadDemanarFila);
			columnes = demanarEnter(cadDemanarColu);
			
			int matriuEnters[][] = new int[files][columnes];
			omplirMatriu(matriuEnters);
			mostrarMatriu(matriuEnters);
			for (int i=0; i<matriuEnters.length; i++) {
				fila = obteFilaMatriu(matriuEnters, i);
				escriuFilaFitxer(fila, fitxer);				
			}
			
			
			mostrarContingutFitxer("lib/" + nomFitxer);
			
			// fitxer.close();
		} catch (Exception ex) {
			// Si tenim errors amb el fitxer que gestionem
			// mostrem el missatge d'error rebut.
			System.out.println("Missatge d'error: " + ex.getMessage());
		}
		System.out.println("Final!");
		
	}

}