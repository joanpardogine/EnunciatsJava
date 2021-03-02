public class ExempleNulPointerException {
  /* NulPointerException  
  */

  public static void main(String[] args) {
    String cadena = "";
    int numero = Integer.parseInt(cadena);
    System.out.println(numero);
  }

  /* SORTIDA 
  Exception in thread "main" java.lang.Error: Unresolved compilation problem:
        The local variable cadena may not have been initialized

        at ExempleNulPointerException.main(ExempleNulPointerException.java:7)
  
  */
}
