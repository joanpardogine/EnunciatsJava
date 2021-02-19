import java.io.File;
import java.util.Scanner;

public class LecturaFitxer {

  public static void main(String[] args) {

    // Creem una variable amb el nom del fitxer que volem llegir
    String nomFitxer = "fitxerLlegir.txt";

    // Creem una variable enllaçada amb el fitxer que volem llegir
    File fitxer = new File("lib/" + nomFitxer);
    
    // Creem un punter al fitxer a llegir
    Scanner puntFitxer = null;

    // Per controlar els errors amb el fitxer a gestionar
    try {
      System.out.println("... llegim el contingut del fitxer ...");
      // Creem un punter per llegir el contingut del fitxer
      puntFitxer = new Scanner(fitxer);
      // Mentre hi hagi una següent línia fitxer al fitxer
      while (puntFitxer.hasNextLine()) {
        // Llegim la línia i la guardem String que anomenem linia
        String linia = puntFitxer.nextLine();
        // Mostrem la línia, que acabem de llegir per pantalla
        System.out.println(linia);
      }
    } catch (Exception exepcioRebuda) {
      // Si tenim errors amb el fitxer que gestionem
      // mostrem el missatge d'error rebut.
      System.out.println("Missatge d'error: " + exepcioRebuda.getMessage());
    }
  }
}
