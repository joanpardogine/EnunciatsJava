import java.io.IOException;

public class SolucioIOException {
  /* IOException  
  */

  public static void main(String[] args) {

    int nombre;
    
    try {
      nombre = System.in.read();
    } catch (IOException ex) {
        System.out.println(" Error = " + ex);
    }
  }

  /* SORTIDA 
  Exception in thread "main" java.lang.Error: Unresolved compilation problem:
        Unhandled exception type IOException

        at ExempleIOException.main(ExempleIOException.java:7)
  */
}
