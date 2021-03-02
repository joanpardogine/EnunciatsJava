import java.io.IOException;

public class SolucioIOException {
  /* IOException  
  */

  public static void main(String[] args) {

    int nombre;
    nombre = 3;
    
    try {
      nombre = System.in.read();
    } catch (IOException ex) {
        System.out.println(" Error = " + ex);
    }
    System.out.println(nombre);
  }

  /* SORTIDA 
  Exception in thread "main" java.lang.Error: Unresolved compilation problem:
        Unhandled exception type IOException

        at ExempleIOException.main(ExempleIOException.java:7)
  */
}
