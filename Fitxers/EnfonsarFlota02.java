import java.util.Scanner;

public class EnfonsarFlota02 {

   static final int MIDA = 8;
   public static Scanner teclat = new Scanner(System.in);


   public static void omplirMatriu(char[][] matriuRebuda){
      for (int fila = 0; fila < matriuRebuda.length; fila++) {
         for (int colu = 0; colu < matriuRebuda[fila].length; colu++) {
            matriuRebuda[fila][colu] = 'a';
         }
      }
   }

   public static void pintaLinia(int columnes){
      for (int i=0; i<columnes; i++){
         System.out.print("+---");
      }
      System.out.println("+");
   }

   public static void mostraMatriu(char[][] matriuRebuda){
      pintaLinia(matriuRebuda.length);
      for (int fila = 0; fila < matriuRebuda.length; fila++) {
         System.out.print("|");
         for (int colu = 0; colu < matriuRebuda[fila].length; colu++) {
            System.out.print(" " + matriuRebuda[fila][colu] + " |");
         }
         System.out.println();
         pintaLinia(matriuRebuda.length);
      }
   }

   public static String demanaNom(String numJugador){
      String nomJugador;
      System.out.print("Entra el nom del Jugador" + numJugador + ": ");
      nomJugador = teclat.next();
      return nomJugador;
   }

   public static void demanaPosicions(char[][] matriuVaixell, int qtatPosicions){
      // int[] arrayPosicio = new int[2]; // arrayPosicio[0] = fila i arrayPosicio[1] = columna
      int fila,columna;
      boolean posicioCorrecte;
      boolean posicioBuida;
      boolean demanarSeguent = true;
      for(int i=1; i<=qtatPosicions; i++){
         do{
            posicioCorrecte = false;
            posicioBuida = false;
            System.out.print("Entra la posició (fila) del vaixell "
               + i 
               + " de "
               + qtatPosicions
               + " (màxim "
               + MIDA
               + "): ");

            fila = teclat.nextInt();
            System.out.print("Entra la posició (columna) del vaixell "
            + i 
            + " de "
            + qtatPosicions
            + " (màxim "
            + MIDA
            + "): ");

            columna = teclat.nextInt();
            // arrayPosicio[0] = fila;
            // arrayPosicio[1] = columna;
            if(   (fila > 0    && fila <= MIDA) &&
                  (columna > 0 && columna <= MIDA)
               ){ // La posició llegida es troba entre 1 i MIDA
               posicioCorrecte = true;
               System.out.println("La posició ÉS correcte!");
               posicioBuida = posicioEsBuida(matriuVaixell, fila, columna);
               if(posicioBuida == true){
                  System.out.println("La posició ÉS buida!");
                  entraVaixell(matriuVaixell, fila, columna);
                  System.out.println("mostraMatriu dins demanaPosicions");
                  mostraMatriu(matriuVaixell);
               } else {
                  System.out.println("La posició NO ÉS buida!");
               }
            } else {
               System.out.println("La posició NO ÉS correcte!");
            }
         } while(posicioCorrecte == false || posicioBuida == false);
      } // FINAL for(int i=1; i<=qtatPosicions; i++)
   }

   public static boolean posicioEsBuida(char[][] matriuVaixell, int fila, int columna){
      boolean posicioBuida = false;
      if (matriuVaixell[fila][columna]=='a') {
         posicioBuida = true;
      }
      return posicioBuida;
   }

   public static void entraVaixell(char[][] matriuVaixell, int fila, int columna){
      // int fila, columna;
      // posicioVaixell = [0] fila [1] columna

      fila --;
      columna --;
         matriuVaixell[fila][columna] = 'v';
System.out.println("mostraMatriu dins entraVaixell");
         mostraMatriu(matriuVaixell);
   }

   public static void main(String[] args) {
      String nomJugador1, nomJugador2;

      nomJugador1 = "Joan"; // demanaNom("1");
      nomJugador2 = "Ivan"; // demanaNom("2");

      char[][] matriuJugador1 = new char[MIDA][MIDA];
      char[][] matriuJugador2 = new char[MIDA][MIDA];

      omplirMatriu(matriuJugador1);
      omplirMatriu(matriuJugador2);

      demanaPosicions(matriuJugador1,3);
      demanaPosicions(matriuJugador2,3);

      System.out.println("Matriu " + nomJugador1);
      mostraMatriu(matriuJugador1);
      System.out.println("Matriu " + nomJugador2);
      mostraMatriu(matriuJugador2);

      // entraVaixells(matriuJugador1, 5);
      // entraVaixells(matriuJugador2, 5);
      
      // mostraMatriu(matriuJugador1);


   }

}
