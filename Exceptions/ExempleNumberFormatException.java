public class ExempleNumberFormatException {
  /* NumberFormatException  
  */

  public static void main(String[] args) {
    String cadena="  12 ";
    int nombre = Integer.parseInt(cadena);
  }

  /* SORTIDA 
  Exception in thread "main" java.lang.NumberFormatException: For input string: "  12 "
        at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:68)
        at java.base/java.lang.Integer.parseInt(Integer.java:644)
        at java.base/java.lang.Integer.parseInt(Integer.java:776)
        at ExempleNumberFormatException.main(ExempleNumberFormatException.java:7)
  */
}
