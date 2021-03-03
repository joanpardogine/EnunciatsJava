import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class DosFitxersTresMatrius_03 {

   public static Scanner teclat = new Scanner(System.in);

   public static void mostrarMissatgePerPantallaSegonsSaltlinia(String cadena, boolean ambSalt) {
      if (ambSalt==true) {
         System.out.println(cadena);
      } else {
         System.out.print(cadena);
      }
   }

   public static void mostrarMissatgePerPantalla(String cadena) {
      System.out.print(cadena);
   }

   public static char llegirCaracterTeclat() {
      char caracterLlegit = ' ';
      caracterLlegit = teclat.next().charAt(0);
      return caracterLlegit;
   }
   
   public static int llegirEnterTeclat() {
      int enterLlegit = 0;
      enterLlegit = teclat.nextInt();
      return enterLlegit;
   }
   
   public static int liniesDelFitxer(String nomFitxer) {
    int comptador = 0;
    String linia;
    //  Tot i que no es fa servir 
    // es necessaria per comptar les linies.
    try {
      File fitxer = new File(nomFitxer);
      Scanner puntFitxer = new Scanner(fitxer);
      while (puntFitxer.hasNextLine()) { //Mentre hi hagi una linia per sota, no sortirem del while
        linia = puntFitxer.nextLine();
        comptador++;
      }
      puntFitxer.close();
    } catch (Exception excepcioRebuda) {
      // Si tenim errors amb el fitxer que gestionem
      // mostrem el missatge d'error rebut.
      System.out.println("Missatge d'error: " + excepcioRebuda.getMessage());
    }
    
    return comptador;
  }



   public static int tornaFilesColumnesMatriuQuadrada() {
      int files,columnes;

      do {
         mostrarMissatgePerPantallaSegonsSaltlinia("Entra la quantitat de files (0 per sortir): ", false);
         files = llegirEnterTeclat();
         
         mostrarMissatgePerPantallaSegonsSaltlinia("Entra la quantitat de columnes (0 per sortir): ", false);
         columnes = llegirEnterTeclat();
         
         if (files == 0 || columnes == 0) {
            mostrarMissatgePerPantallaSegonsSaltlinia("Veig que vols sortir.\nAdeu!", true);
            break;
         }

         if (files != columnes) {
            mostrarMissatgePerPantallaSegonsSaltlinia("La quantitat de columnes "
               + "i files cal que siguin iguals!\nTorna-hi!", true);
         } 
      } while (files != columnes);

      return files;
   }
   
   public static boolean comprovaCadenaEsEnter(String cadenaRebuda) {
      boolean esEnter = false;
      int codiASCII;

      for (int i=0; i<cadenaRebuda.length();i++) {
         codiASCII = (int) cadenaRebuda.charAt(i);
         // caracter = 0 => ASCII = 48
         // caracter = 9 => ASCII = 57
         if(codiASCII >= 48 && codiASCII <= 57) {
            esEnter = true;
         } else {
            esEnter = false;
            break;
         }
      }
      return esEnter;
   }

   public static boolean comprovaCharEsEnter(char caracterRebut) {
      boolean esEnter = false;
      int codiASCII;
      codiASCII = (int) caracterRebut;
      // caracter = 0 => ASCII = 48
      // caracter = 9 => ASCII = 57
      if(codiASCII >= 48 && codiASCII <= 57) {
         esEnter = true;
      }else {
         esEnter = false;
      }
      return esEnter;
     }
   
   public static void afegirValorsMatriu(int[][] matriuRebuda) {
      //Afegir valors a una matriu
      int valorLlegit;
      // boolean esEnter;
      for (int fila=0;fila<matriuRebuda.length;fila++) {
         for (int columnes=0;columnes<matriuRebuda[fila].length;columnes++) {
            mostrarMissatgePerPantallaSegonsSaltlinia("Introdueix valor posició " 
               + fila
               + ","
               + columnes
               + ": ", false);
            valorLlegit = llegirEnterTeclat();
            // esEnter = comprovaCadenaEsEnter(valorLlegit);
            matriuRebuda[fila][columnes] = Integer.parseInt(String.valueOf(valorLlegit));
         }
      }
   }

   public static void escriuMatriuAFitxer(int[][] matriuRebuda, String nomFitxer) {
      // Per controlar els errors amb el fitxer a gestionar
      try {   
         FileWriter fitxer = new FileWriter(nomFitxer);
         // Escribim les línies al fitxer
         // LLegim valors d'una matriu
         String linia;
         
         for (int fila=0;fila<matriuRebuda.length;fila++) {
            linia="";
            for (int columna=0; columna<matriuRebuda[fila].length;columna++) {
               linia = linia + matriuRebuda[fila][columna];
               if (columna<matriuRebuda[fila].length-1) {
                  linia = linia + "#";
               }
            }
            fitxer.write(linia + "\n");
         }
         fitxer.close();
      } catch (Exception ex) {
         // Si tenim errors amb el fitxer que gestionem
         // mostrem el missatge d'error rebut.
         System.out.println("Missatge d'error: " + ex.getMessage());
      }
   }

   public static void mostrarMatriu(int[][] matriuRebuda) {
      //LLegim valors d'una matriu
      for (int fila = 0; fila < matriuRebuda.length; fila++) {
         for (int columna = 0; columna<matriuRebuda[fila].length; columna++) {
            System.out.print(matriuRebuda[fila][columna]);
            if (columna < matriuRebuda[fila].length - 1) {
               System.out.print (", ");
            }
         }
         System.out.println();
      }
   }

   public static int[][] llegeixMatriuDesDeFitxer(String nomFitxerConteMatriu){
    int files, columnes;
    files = liniesDelFitxer(nomFitxerConteMatriu);
    columnes = files;
    int[][] matriuATornar = new int [files][columnes];

    String linia;
        // Creem una variable enllaçada amb el fitxer que volem llegir
        File fitxer = new File(nomFitxerConteMatriu);
        
        // Creem un punter al fitxer a llegir
        Scanner puntFitxer = null;

        // Per controlar els errors amb el fitxer a gestionar
        try {
          // Creem un punter per llegir el contingut del fitxer
          puntFitxer = new Scanner(fitxer);
          // Mentre hi hagi una següent línia fitxer al fitxer
          while (puntFitxer.hasNextLine()) {

            for (int fila = 0; fila < matriuATornar.length; fila++) {
              linia = puntFitxer.nextLine();
              String[] arrayEnters = linia.split("#");
              for (int columna = 0; columna < arrayEnters.length; columna++) {
                matriuATornar[fila][columna] = Integer.parseInt(arrayEnters[columna]);
              }
           }
          }
        } catch (Exception exepcioRebuda) {
          // Si tenim errors amb el fitxer que gestionem
          // mostrem el missatge d'error rebut.
          System.out.println("Missatge d'error: "
            + exepcioRebuda.getMessage());
        }
    return matriuATornar;
   }

   public static int[][] transposaMatriuQuadrada(int[][] matriuRebuda){
    int filaMatRebuda = matriuRebuda.length;
    int columnaMatRebuda = filaMatRebuda;
    int[][] matriuATornar = new int [filaMatRebuda][columnaMatRebuda];

    for (int fila = 0; fila < matriuRebuda.length; fila++) {
      for (int columna = 0; columna<matriuRebuda[fila].length; columna++) {
        matriuATornar[fila][columna] =  matriuRebuda[columna][fila];
      }
   }
    return matriuATornar;
   }

   public static void escriuMatriusIntercaladesAFitxer (int[][] matriuRebuda1, int[][] matriuRebuda2, String nomFitxer) {
      // Per controlar els errors amb el fitxer a gestionar
      try {   
         FileWriter fitxer = new FileWriter(nomFitxer);
         // Escribim les línies al fitxer
         // LLegim valors d'una matriu
         String linia1 = "", linia2 = "";
         
         for (int fila=0;fila<matriuRebuda1.length;fila++) {
            linia1="";
            linia2="";
            for (int columna=0; columna<matriuRebuda1[fila].length;columna++) {
               linia1 = linia1 + matriuRebuda1[fila][columna];
               linia2 = linia2 + matriuRebuda2[fila][columna];
               if (columna<matriuRebuda1[fila].length-1) {
                  linia1 = linia1 + "#";
                  linia2 = linia2 + "#";
               }
            }
            fitxer.write(linia1 + "\n");
            fitxer.write(linia2 + "\n");
         }
         fitxer.close();
      } catch (Exception ex) {
         // Si tenim errors amb el fitxer que gestionem
         // mostrem el missatge d'error rebut.
         System.out.println("Missatge d'error: " + ex.getMessage());
      }
   }

   public static void main(String[] args) {
      /* Crear un fitxer (matIntroUsuari.txt) on cada línia
      * d'aquest fitxer serà cadascuna de les files d'una
      * matriu quadrada (files = columnes) introduïda per
      * l'usuari. (DosFitxersTresMatrius.java)     */
      int files, columnes;

      String nomFitxer1 = "./Fitxers/lib/matIntroUsuari.txt"; // Visual Studio Code
      // String nomFitxer1 = "lib/matIntroUsuari.txt"; // Eclipse

      files = tornaFilesColumnesMatriuQuadrada();
      columnes = files;  // degut a que és una matriu quadrada (files=columnes)

      int matriu[][] = new int [files][columnes];
      afegirValorsMatriu(matriu);
      System.out.println("Mostra matriu!");
      mostrarMatriu(matriu);
      System.out.println("FINAL Mostra matriu!");
      escriuMatriuAFitxer(matriu, nomFitxer1);

      mostrarMissatgePerPantalla("Final Part 1!");

      /* Seguidament recuperar la informació del fitxer per
      * guardar-la sobre una segona matriu trasposta, és a
      * dir, les files seran les columnes i les columnes les files. */
      int matATrasposar[][] = new int [files][columnes];
      int matTras[][] = new int [files][columnes];

      matATrasposar = llegeixMatriuDesDeFitxer(nomFitxer1);
      matTras = transposaMatriuQuadrada(matATrasposar);

      System.out.println("Mostra matTras!");
      mostrarMatriu(matTras);
      System.out.println("FINAL Mostra matTras!");

      mostrarMissatgePerPantalla("Final Part 2!");
      /* I per últim, generar un segon fitxer (matIntercalades.txt),
       * que contindrà totes dues matrius intercalant les seves files, */
      
      String nomFitxer2 = "./Fitxers/lib/matIntercalades.txt"; // Visual Studio Code
      // String nomFitxer2 = "lib/matIntercalades.txt"; // Eclipse

      escriuMatriusIntercaladesAFitxer(matriu, matTras, nomFitxer2);
      mostrarMissatgePerPantalla("Final Part 3!");
   }

}
