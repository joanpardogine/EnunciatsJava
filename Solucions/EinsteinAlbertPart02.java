import java.io.File;
import java.util.Scanner;

public class EinsteinAlbertPart02 {
    // EinsteinAlbertPart02
    
    
    public static boolean conteRepetits(String[] cadenaRebuda){
        boolean hiHaRepetit = false;
        String cadenaAComparar = "";
        for (int i=0; i < cadenaRebuda.length; i++){
            cadenaAComparar = cadenaRebuda[i];
            for (int j=i+1; j < cadenaRebuda.length; j++){
                if( cadenaAComparar.equals(cadenaRebuda[j]) ){ // si la cadenaAComparar =  cadenaRebuda[j]
                    hiHaRepetit = true;
                    break;
                }
            }
            if(hiHaRepetit == true){
                break;
            }
        }
        return hiHaRepetit;
    }
    
   public static int liniesDelFitxer(String nomFitxer){
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
           // System.out.println(linia);
           comptador ++;
           
         }
       } catch (Exception exepcioRebuda) {
         // Si tenim errors amb el fitxer que gestionem
         // mostrem el missatge d'error rebut.
         System.out.println("Missatge d'error: " + exepcioRebuda.getMessage());
       }
     return comptador;
     }

    public static void main(String[] args) {
        // Your code here!
        String cadena[] = {"hola","adeu","3","4","5","6","holar","92","17","13","12","11"};
        //  i = 1
        //  cadenaAComparar = "2"
        // cadena[i+1] = "3";
        
        String nomFitxer = "File1";
        boolean teRepetits = false;
        String linia;
        String[] arrayCadenes;
        int comptaLinia = 1;
        int totalLiniesFitxer = 0;
        
        totalLiniesFitxer = liniesDelFitxer(nomFitxer);
        
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
                linia = puntFitxer.nextLine();   //"51","22","87","43","46","51","16","49"
                arrayCadenes = linia.split(",");
                teRepetits = conteRepetits(arrayCadenes);
                if (teRepetits == true){
                    System.out.println("La fila "
                        + comptaLinia
                        + " de "
                        + totalLiniesFitxer
                        + " té repetits!");
        
                    //Fila 1 de 2 té nombres duplicats

                } else {
                    System.out.println("La fila "
                        + comptaLinia
                        + " de "
                        + totalLiniesFitxer
                        + " NO té repetits!");
                }
                comptaLinia++;
            }
        } catch (Exception exepcioRebuda) {
            // Si tenim errors amb el fitxer que gestionem
            // mostrem el missatge d'error rebut.
            System.out.println("Missatge d'error: " + exepcioRebuda.getMessage());
       }

     }
}
