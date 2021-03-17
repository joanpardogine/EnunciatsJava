import java.util.Scanner;

public class EnfonsarFlota01 {

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

   public static int[] demanaPosicio(){
      int[] arrayPosicio = new int[2]; // arrayPosicio[0] = fila i arrayPosicio[1] = columna
      int fila,columna;
      boolean posicioCorrecte = false;

      do{
         System.out.print("Entra la posició (fila) a on vols un vaixell (màxim "+ MIDA + "): ");
         fila = teclat.nextInt();
         System.out.print("Entra la posició (columna) a on vols un vaixell (màxim "+ MIDA + "): ");
         columna = teclat.nextInt();
         if( (fila > 0    && fila <= MIDA) &&
             (columna > 0 && columna <= MIDA)
         ){
            posicioCorrecte = true;
            System.out.println("La posició ÉS correcte!");
         } else {
            System.out.println("La posició NO ÉS correcte!");
         }
      } while(posicioCorrecte == false);

      arrayPosicio[0] = fila;
      arrayPosicio[1] = columna;
      return arrayPosicio;
   }

   public static void main(String[] args) {
      String nomJugador1, nomJugador2;

      nomJugador1 = demanaNom("1");
      nomJugador2 = demanaNom("2");

      char[][] matriuJugador1 = new char[MIDA][MIDA];
      char[][] matriuJugador2 = new char[MIDA][MIDA];

      omplirMatriu(matriuJugador1);
      omplirMatriu(matriuJugador2);

/*
      System.out.println("Matriu " + nomJugador1);
      mostraMatriu(matriuJugador1);
      System.out.println("Matriu " + nomJugador2);
      mostraMatriu(matriuJugador2);*/


      int[] posicioRebuda;
      posicioRebuda = demanaPosicio();
      System.out.println("Fila    = " + posicioRebuda[0]);
      System.out.println("columna = " + posicioRebuda[1]);


   }

}
