/**
 * Classe Llibre
 *     //Atributs
 	Crea la classe Llibre.
 	Aquesta classe tindrà els següents atributs:
 	títol,
 	autor,
 	exemplars i
 	préstec.
 	exemplars:	 serà el nombre de còpies o exemplars
 			que la biblioteca té d’aquest llibre i
 	préstec:	 serà la quantitat de còpies que estan
 			en préstec d’aquest llibre.
 			
	Has de fer dos constructors:
		un sense paràmetres
		l’altre amb els quatre paràmetres.
		
	Fes també els mètodes get, set i toString.
	Per últim hauràs d’implementar dos mètodes:
		agafarEnPrestec()
		retornarDePrestec()

	agafarEnPrestec(String titolLlibreAAgafar)
		titol = "Don Quijote de la Mancha";
		autor = "Miguel de Cervantes";
	    exemplars = 3;
	    prestec = 0;
 
  */
public class Llibre {
    //Atributs
	private String titol;
	private String autor;
    private int exemplars;
    private int prestec;

    //Constructor
    public Llibre() {
        this("Sense titol","Sense autor",0,0); // Sobrecarga
    }
    
    //Constructor
    public Llibre(	String titolRebut,
		    		String autorRebut,
		    		int qtatExemplars,
		    		int qtatEnPrestec) {
        this.titol = titolRebut; 
        this.autor = autorRebut;
        if (qtatExemplars < 0) {
        	this.exemplars = 0;
        } else {
        	this.exemplars = qtatExemplars;
        }
        if (qtatEnPrestec < 0) {
        	this.prestec = 0;
        } else {
        	this.prestec = qtatEnPrestec;
        }
        this.prestec = qtatEnPrestec; 
    }
    //Mètodes GETTERs
    public String getTitol() {
        return this.titol;
    }
 
    public String getAutor() {
        return this.autor;
    }
    
    public int getExemplars() {
        return this.exemplars;
    }
 
    public int getPrestec() {
        return this.prestec;
    }
    
    //Mètodes SETTERs
    public void setTitol(String titolRebut) {
        this.titol = titolRebut;
    }
 
    public void setAutor(String autorRebut) {
    	this.autor = autorRebut;
    }
    
    public void setExemplars(int qtatExemplars) {
    	this.exemplars = qtatExemplars;
    }
 
    public void setPrestec(int qtatPrestec) {
        this.prestec = qtatPrestec;
    }
    
    // Mètodes
    /**	agafarEnPrestec(String titolLlibreAAgafar)
     *  ABANS D'AGAFAR EN PRESTEC
     *  --------------------------
		titol = "Don Quijote de la Mancha";
		autor = "Miguel de Cervantes";
	    exemplars = 3;
	    prestec = 3;
	 
	    SI (prestec < exemplars)
	     		= ok
	     		prestec++;
	    SINO "NO OK" 
	 			missatge no hi ha disponible
	 
	 *  DEPRES D'AGAFAR EN PRESTEC
	 *  --------------------------
		titol = "Don Quijote de la Mancha";
		autor = "Miguel de Cervantes";
	    exemplars = 3;
	    prestec = ??;
     */
    
    public void agafarEnPrestec(String titolLlibreAAgafar) {
    	if (this.prestec < this.exemplars) {
    		this.prestec++;
    	} else {
    		System.out.println("No hi ha cap exmeplar"
    				+ "a deixar en prestec.");
    	}
    }
    
    /**
     * retornarDePrestec()
     *      *  ABANS D'AGAFAR EN PRESTEC
     *  --------------------------
		titol = "Don Quijote de la Mancha";
		autor = "Miguel de Cervantes";
	    exemplars = 3;
	    prestec = 2;
	 
	    SI (prestec > 0)
	     		= ok
	     		prestec--;
	    SINO "NO OK" 
	 			missatge no hi cap lllibre en prestec!
	 
	 *  DEPRES D'AGAFAR EN PRESTEC
	 *  --------------------------
		titol = "Don Quijote de la Mancha";
		autor = "Miguel de Cervantes";
	    exemplars = 3;
	    prestec = ??;
     */
    public void retornarDePrestec(String titolLlibreAAgafar) {
    	
    }
    
}
