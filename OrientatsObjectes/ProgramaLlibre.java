import java.util.Scanner;

public class ProgramaLlibre {

	public static Scanner teclat = new Scanner(System.in);
	
	public static void main(String[] args) {
		
	      System.out.print ("Entra el titol del libre que "
		      		+ "vols donar d'alta: ");
		      String titolPrimerLlibre = teclat.next();

	      System.out.print ("Qui és l'autor del llibre "
		    		  + titolPrimerLlibre + ": ");
	      String autorPrimerLlibre = teclat.next();
	      
	      System.out.print ("Quants exemplars hi ha del llibre "
	    		  + titolPrimerLlibre + ": ");
	      
	      int exemplarsPrimerLlibre = teclat.nextInt();
	      
	      Llibre llibreNumero1 = new Llibre (titolPrimerLlibre,
	    		  autorPrimerLlibre,
	    		  exemplarsPrimerLlibre,
	    		  0);
	      
	      
	      System.out.print("Entra el titol del libre que "
	      		+ "vols en prestec: ");
	      String titolLlibreEnPrestec = teclat.next();
	      
	      
	      // Primer exemplar
	      System.out.println("Agafo en prestec un exemplar de "
	    		  + titolLlibreEnPrestec + ".");
	      
	      llibreNumero1.agafarEnPrestec(titolLlibreEnPrestec);

	      System.out.println("Del llibre "
	    		  + llibreNumero1.getTitol()
	    		  + " en queden " 
	    		  + ( llibreNumero1.getExemplars() - llibreNumero1.getPrestec() )
	    		  + " exemplars.");

	      // Segon exemplar
	      System.out.println("Agafo en prestec un exemplar de "
	    		  + titolLlibreEnPrestec + ".");
	      
	      llibreNumero1.agafarEnPrestec(titolLlibreEnPrestec);

	      System.out.println("Del llibre "
	    		  + llibreNumero1.getTitol()
	    		  + " en queden " 
	    		  + ( llibreNumero1.getExemplars() - llibreNumero1.getPrestec() )
	    		  + " exemplars.");
	      
	      // Tercer exemplar
	      System.out.println("Agafo en prestec un exemplar de "
	    		  + titolLlibreEnPrestec + ".");
	      
	      llibreNumero1.agafarEnPrestec(titolLlibreEnPrestec);

	      System.out.println("Del llibre "
	    		  + llibreNumero1.getTitol()
	    		  + " en queden " 
	    		  + ( llibreNumero1.getExemplars() - llibreNumero1.getPrestec() )
	    		  + " exemplars.");
	 

	      System.out.println("Titol del llibre abans "
	    		  + llibreNumero1.getTitol());
	      
	      llibreNumero1.setTitol("El quijote");
	      
	      System.out.println("Titol del llibre despres "
	    		  + llibreNumero1.getTitol());
	}

}
