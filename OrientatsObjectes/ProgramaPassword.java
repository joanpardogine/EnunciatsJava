import java.util.Scanner;

/*
 * Crea un array de Password's amb 
 * la mida que tu li indiquis per teclat.
 * Indica també per teclat la longitud dels Passwords.
 * Crea un bucle que creï un objecte per a cada posició
 * de l'array amb les dades introduïdes anteriorment.
 * Mostrar per a cada objecte de l'array de Passwords
 * si aquest és fort o no. Pots fer servir el següent format:
 * 		contrasenya1 valor SÍ
 * 		contrasenya2 valor NO

*/
public class ProgramaPassword {
	
	public static Scanner teclat = new Scanner(System.in);
	
	public static void main(String[] args) {
	      System.out.print ("Entra la quantitat de passwords: "); // mida array
	      int midaArray= teclat.nextInt();
	      
	      Password llistaDePasswords[] = new Password[midaArray];
	     
	      System.out.print ("Entra la longitud del password: ");
	      int longitudPassword = teclat.nextInt();
	      
	      for (int i=0; i<llistaDePasswords.length; i++ ) {

		      llistaDePasswords[i] = new Password(longitudPassword);
	      }
	      
	      for (int i=0; i<llistaDePasswords.length; i++ ) {
	    	  String textEsFort = " NO";
	    	  boolean esFortTemp = llistaDePasswords[i].esFort();
	    	  if (esFortTemp == true) {
	    		  textEsFort = "";
	    	  }
		      System.out.println ("El password "
	    		  	+ llistaDePasswords[i].getContrasenya()
	    		  	+ textEsFort
	    		  	+ " és fort!");
	      }


	}

}
