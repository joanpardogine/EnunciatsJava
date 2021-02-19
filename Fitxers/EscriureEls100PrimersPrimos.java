import java.io.FileWriter;

public class EscriureEls100PrimersPrimos {

	public static boolean esNombrePrimer(int numRebut) {
		boolean prime=true;
		for(int j=2;j<numRebut;j++) {
			if(numRebut % j == 0) {
				prime=false;
				break;
			}
		}
		if (numRebut==1) {
			prime=false;
		}
		return prime;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nomFitxer = "numNaturals.txt";
		int comptaPrimers = 0;
		int comptaNombres = 2;
		boolean esPrimer = false;
	
		try {	
			FileWriter fitxer = new FileWriter("lib/" + nomFitxer);
			do {
				esPrimer = esNombrePrimer(comptaNombres);  // cal crear-la!!!
				if(esPrimer==true) {
					// Escribim el nombre que és primer al fitxer
					fitxer.write(comptaNombres + ",");
					comptaPrimers++;
				}
				comptaNombres++;
			} while(comptaPrimers<100);
			
 			fitxer.close();
		} catch (Exception ex) {
			// Si tenim errors amb el fitxer que gestionem
			// mostrem el missatge d'error rebut.
			System.out.println("Missatge d'error: " + ex.getMessage());
		}
		System.out.println("Final! \n"
				+ "comptaNombres = " + (comptaNombres - 1)
				+ "\ncomptaPrimers = " + comptaPrimers);
	}

}
