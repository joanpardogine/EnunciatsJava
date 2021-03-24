import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {
    // EinsteinAlbertPart03
    
    public static Scanner teclat = new Scanner(System.in);
    
    public static String demanaCadena(String missatge){
        String cadena;
		
		System.out.println(missatge);
		cadena = teclat.nextLine();
		
		return cadena;
	}
    
       public static int liniesDelFitxer(String nomFitxer) {
       int comptador = 0;
    // Creem una variable enllaçada amb el fitxer que volem llegir
       File fitxer = new File(nomFitxer);
       
       // Creem un punter al fitxer a llegir
       Scanner puntFitxer = null;
   
       // Per controlar els errors amb el fitxer a gestionar
       try {
         // Creem un punter per llegir el contingut del fitxer
         puntFitxer = new Scanner(fitxer);
         // Mentre hi hagi una següent línia fitxer al fitxer
         while (puntFitxer.hasNextLine()) {
           // Llegim la línia i la guardem String que anomenem linia
           String linia = puntFitxer.nextLine();
           // Mostrem la línia, que acabem de llegir per pantalla
           System.out.println(linia);
           comptador ++;
           
         }
       } catch (Exception exepcioRebuda) {
         // Si tenim errors amb el fitxer que gestionem
         // mostrem el missatge d'error rebut.
         System.out.println("Missatge d'error: " + exepcioRebuda.getMessage());
       }
     return comptador;
     }
     
    public static int[] obteQuantitatDeVocals(String cadenaRebuda){
        int[] arrayQtatVocals = new int [5];
        // cadenaRebuda = "La programació és entretinguda."
        // arrayQtatVocals[0]  A's
        // arrayQtatVocals[5]  U's
        
        for (int i=0; i<cadenaRebuda.length(); i++){
            if( (cadenaRebuda.charAt(i) == 'a') ||
                (cadenaRebuda.charAt(i) == 'A') ||
                (cadenaRebuda.charAt(i) == 'à') ||
                (cadenaRebuda.charAt(i) == 'á') ||
                (cadenaRebuda.charAt(i) == 'À') ||
                (cadenaRebuda.charAt(i) == 'Á')     ) {
                arrayQtatVocals[0]++;
            } else if ( (cadenaRebuda.charAt(i) == 'e') ||
                (cadenaRebuda.charAt(i) == 'E') ||
                (cadenaRebuda.charAt(i) == 'è') ||
                (cadenaRebuda.charAt(i) == 'é') ||
                (cadenaRebuda.charAt(i) == 'È') ||
                (cadenaRebuda.charAt(i) == 'É') ) {
                arrayQtatVocals[1]++;
            } else if ( (cadenaRebuda.charAt(i) == 'i') ||
                (cadenaRebuda.charAt(i) == 'I') ||
                (cadenaRebuda.charAt(i) == 'ì') ||
                (cadenaRebuda.charAt(i) == 'í') ||
                (cadenaRebuda.charAt(i) == 'Ì') ||
                (cadenaRebuda.charAt(i) == 'Í') ) {
                arrayQtatVocals[2]++;
            } else if ( (cadenaRebuda.charAt(i) == 'o') ||
                (cadenaRebuda.charAt(i) == 'O') ||
                (cadenaRebuda.charAt(i) == 'ò') ||
                (cadenaRebuda.charAt(i) == 'ó') ||
                (cadenaRebuda.charAt(i) == 'Ò') ||
                (cadenaRebuda.charAt(i) == 'Ó') ) {
                arrayQtatVocals[3]++;
            } else if ( (cadenaRebuda.charAt(i) == 'u') ||
                (cadenaRebuda.charAt(i) == 'U') ||
                (cadenaRebuda.charAt(i) == 'ù') ||
                (cadenaRebuda.charAt(i) == 'ú') ||
                (cadenaRebuda.charAt(i) == 'Ù') ||
                (cadenaRebuda.charAt(i) == 'Ú') )  {
                arrayQtatVocals[4]++;
            } 
            
        }
        return arrayQtatVocals;
    }
    
    public static int obteQuantitatDeParaules(String cadenaRebuda){
        int qtatEspais, qtatParaules;
        qtatEspais = 0;
        for (int i=0; i<cadenaRebuda.length(); i++){
            if (cadenaRebuda.charAt(i) == ' ') {
                qtatEspais++;
            }
        }
        qtatParaules = qtatEspais + 1;
        return qtatParaules;
    }
    
    public static int[] creaArray(int[] vocals, int paraules){
        int [] qtatVocalsParaules = new int[6];
        for (int i=0; i<qtatVocalsParaules.length; i++){
            if(i<vocals.length){
                qtatVocalsParaules[i]=vocals[i];
            } else {
                qtatVocalsParaules[i]=paraules;
            }
        }
        return qtatVocalsParaules;
    }
    

     
     public static void escriuMatriuAlFitxer(String nomFitxerB, int[][] dades){
         String liniaAGuardar = "";
         try {  
            FileWriter fitxer = new FileWriter(nomFitxerB);
            for (int fila=0; fila<dades.length; fila++){
                for (int columna=0; columna<dades[fila].length; columna++){
                    liniaAGuardar = liniaAGuardar + dades[fila][columna]; 
                }   
                fitxer.write(liniaAGuardar);
            }
            fitxer.close();
            
            
         } catch (Exception exepcioRebuda) {
          // Si tenim errors amb el fitxer que gestionem
          // mostrem el missatge d'error rebut.
          System.out.println("Missatge d'error: " + exepcioRebuda.getMessage());
        }
     }
     

    public static void main(String[] args) throws FileNotFoundException {
        // String cadena = "La programació és entretinguda.";
        int[] qtatVocals;
        int[] qtatVocalsMesParaules = new int [6];
        int qtatParaules;
        int qtatLiniesDelFitxer;

        String nomFitxLlegir, nomFitxEscriure;
        
        nomFitxLlegir = demanaCadena("Entra el nom del fitxer per llegir (File1)");
        nomFitxEscriure = demanaCadena("Entra el nom del fitxer per llegir (File2)");

        qtatLiniesDelFitxer = liniesDelFitxer(nomFitxLlegir);

        int filesMatriu, columnesMatriu;
        filesMatriu = qtatLiniesDelFitxer;
        columnesMatriu = 6;
          int[][] matriu = new int[filesMatriu][columnesMatriu];
          
        File fitxer = new File(nomFitxLlegir);
        
        for (int i=0; i<qtatLiniesDelFitxer; i++){
            Scanner puntFitxer = new Scanner(fitxer);
            // Mentre hi hagi una següent línia fitxer al fitxer
            while (puntFitxer.hasNextLine()) {
                String linia = puntFitxer.nextLine();
                qtatVocals = obteQuantitatDeVocals(linia);
                qtatParaules = obteQuantitatDeParaules(linia);
                // System.out.print(linia);
                qtatVocalsMesParaules = creaArray(qtatVocals, qtatParaules);
                //for (int i=0; i<qtatVocalsMesParaules.length; i++){
                //    System.out.println(qtatVocalsMesParaules[i]);
                //}
                
                matriu[i] = qtatVocalsMesParaules;
                
            }
            puntFitxer.close();
        } 
        
        
        
      
        
        
        
        escriuMatriuAlFitxer(nomFitxEscriure, matriu);
        System.out.println("FINAL");
        
     }
}
