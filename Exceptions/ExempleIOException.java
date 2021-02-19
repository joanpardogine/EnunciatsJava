import java.util.Scanner;

public class ExempleIOException {
  /* IOException  
  */

  public static void main(String[] args) {
    Scanner teclat = new Scanner(System.in);
    int nombre;
    
    System.out.print("Entra un nombre: ");
    nombre = teclat.nextInt();
    System.out.print("El nombre entrat és: " + nombre);
    teclat.close();
  }

  /* SORTIDA 
Entra un nombre: e
Exception in thread "main" java.util.InputMismatchException
        at java.base/java.util.Scanner.throwFor(Scanner.java:939)
        at java.base/java.util.Scanner.next(Scanner.java:1594)
        at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
        at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
        at ExempleIOException.main(ExempleIOException.java:12)
  */
}
