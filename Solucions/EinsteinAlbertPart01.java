import java.io.File;
import java.util.Scanner;

public class EinsteinAlbertPart01 {

   public static void mostraMatriuEnters(int matriuRebuda[][]){
       for (int fila = 0; fila < matriuRebuda.length; fila++){
           for (int columna = 0; columna < matriuRebuda[fila].length; columna++) {
               System.out.print(matriuRebuda[fila][columna]);
               if (columna<matriuRebuda[fila].length-1){
                   System.out.print(" - ");
               }
           }
           System.out.println();
       }
   }
   
   public static void mostraMatriuCadenes(String matriuRebuda[][]){
       for (int fila = 0; fila < matriuRebuda.length; fila++){
           for (int columna = 0; columna < matriuRebuda[fila].length; columna++) {
               System.out.print(matriuRebuda[fila][columna]);
               if (columna<matriuRebuda[fila].length-1){
                   System.out.print(" - ");
               }
           }
           System.out.println();
       } 
   }

   public static int[][] ompleMatriuEnters(int files, int columnes) {
         int[][] matriuPlena = new int [files][columnes];
   
         for (int i=0; i<matriuPlena.length; i++){
            for (int j=0; j<matriuPlena[i].length; j++){
               matriuPlena[i][j]=aleatoriEntreDosNombres(10,250);
            }
         }
         return matriuPlena;
   }
   
   public static String[][] ompleMatriuCadenes(int files, int columnes) {
     String[][] matriuPlena = new String [files][columnes];

     for (int i=0; i<matriuPlena.length; i++){
        for (int j=0; j<matriuPlena[i].length; j++){
           matriuPlena[i][j]="ompleMatriuCadenes" +  i + j;
        }
     }
     return matriuPlena;
   }

   public static int aleatoriEntreDosNombres(int nombrePetit, int nombreGran) {
     int nombreAleatori;
     nombreAleatori = (int) (Math.random() * (nombreGran+1 - nombrePetit) + nombrePetit);
     return nombreAleatori;
     // return (int) (Math.random() * (nombreGran+1 - nombrePetit) + nombrePetit);
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
       int files = 4;
       int columnes = 3;
       
       int matriu[][] = new int[files][columnes];
       String matriuCadenes[][] = new String[files][columnes];
       
       matriu = ompleMatriuEnters(files, columnes);
       mostraMatriuEnters(matriu);

       System.out.println("FINAL enunciat 1");
       
       matriuCadenes = ompleMatriuCadenes(files, columnes);
       mostraMatriuCadenes(matriuCadenes);
       
       System.out.println("FINAL enunciat 2");
       
       String nomFitxer = "File1";
       int qtatLinies = liniesDelFitxer(nomFitxer);
       
       System.out.println("El fitxer " + nomFitxer + " té " + qtatLinies + " línies");
       System.out.println("FINAL enunciat 3");
   }
}