import java.io.FileWriter;

public class EscripturaFitxer {

  public static void main(String[] args) {

    // Creem una variable amb el nom del fitxer que volem llegir
    String nomFitxer = "fitxerAEscriure.txt";
    
    String[] linies = {
      "En un lugar de la Mancha, de cuyo nombre no quiero acordarme",
      "no ha mucho tiempo que vivía un hidalgo de los de lanza en astillero",
      "adarga antigua, rocín flaco y galgo corredor.", 
      "Una olla de algo más vaca que carnero, salpicón las más noches",
      "duelos y quebrantos los sábados, lantejas los viernes, algún palomino",
      "de añadidura los domingos, consumían las tres partes de su hacienda."
      };
    
    // Per controlar els errors amb el fitxer a gestionar
    try {  
      FileWriter fitxer = new FileWriter("lib/" + nomFitxer);
      // Escribim les línies al fitxer
      String linea;     
       for (int i = 0; i<linies.length; i++ ) {
        linea = linies[i];
        fitxer.write(linea + "\n");
      }
      // for (String linea : linies) {
      //      fitxer.write(linea + "\n");
      // }
       
       fitxer.close();
    } catch (Exception exepcioRebuda) {
      // Si tenim errors amb el fitxer que gestionem
      // mostrem el missatge d'error rebut.
      System.out.println("Missatge d'error: " + exepcioRebuda.getMessage());
    }
    System.out.println("Final!");
  }
}