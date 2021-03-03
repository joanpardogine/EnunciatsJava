import java.io.FileWriter;
import java.util.Scanner;

public class DosFitxersTresMatrius_01 {

   public static Scanner teclat = new Scanner(System.in);

   public static void mostrarMissatgePerPantallaSegonsSaltLinea(String cadena, boolean ambSalt) {
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
   
   public static int tornaFilesColumnesMatriuQuadrada() {
      int files,columnes;

      do {
         mostrarMissatgePerPantallaSegonsSaltLinea("Entra la quantitat de files (0 per sortir): ", false);
         files = llegirEnterTeclat();
         
         mostrarMissatgePerPantallaSegonsSaltLinea("Entra la quantitat de columnes (0 per sortir): ", false);
         columnes = llegirEnterTeclat();
         
         if (files == 0 || columnes == 0) {
            mostrarMissatgePerPantallaSegonsSaltLinea("Veig que vols sortir.\nAdeu!", true);
            break;
         }

         if (files != columnes) {
            mostrarMissatgePerPantallaSegonsSaltLinea("La quantitat de columnes "
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
            mostrarMissatgePerPantallaSegonsSaltLinea("Introdueix valor posició " 
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
         String linea;
         
         for (int fila=0;fila<matriuRebuda.length;fila++) {
            linea="";
            for (int columna=0; columna<matriuRebuda[fila].length;columna++) {
               linea = linea + matriuRebuda[fila][columna];
               if (columna<matriuRebuda[fila].length-1) {
                  linea = linea + "#";
               }
            }
            fitxer.write(linea + "\n");
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
      for (int fila=0;fila<matriuRebuda.length;fila++) {
         for (int columna=0; columna<matriuRebuda[fila].length;columna++) {
            System.out.print(matriuRebuda[fila][columna]);
            if (columna<matriuRebuda[fila].length-1) {
               System.out.print (", ");
            }
         }
         System.out.println();
      }   
   }
   
   public static void main(String[] args) {
      int files, columnes;
      String nomFitxer1 = "matIntroUsuari.txt";
      files = tornaFilesColumnesMatriuQuadrada();
      columnes = files;  // degut a que és una matriu quadrada (files=columnes)

      int matriu[][] = new int [files][columnes];

      afegirValorsMatriu(matriu);
      // mostrarMatriu(matriu);

      escriuMatriuAFitxer(matriu, "lib/" + nomFitxer1);
      mostrarMissatgePerPantalla("Final!");
   }

}
