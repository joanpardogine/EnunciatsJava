
public class Persona {

	// Atributs
	private String nom;
	private int edat;
	private String dni;
	private char sexe;
	private double pes;
	private double alssada;
	
    //Constructors
	
	//constructor amb el nom, edat
	// i sexe (la resta per defecte).
	public Persona(	String nomRebut, 
			int edatRebuda,
			char sexeRebut) {
		this(nomRebut, edatRebuda, sexeRebut, 80, 180); 
		// Sobrecarga
		
	}
	
	// constructor amb tots els
	// atributs com a paràmetres excepte el DNI.
    public Persona(	String nomRebut, 
    				int edatRebuda,
    				char sexeRebut,
    				double pesRebut,
    				double alssadaRebuda) {
        this.nom  		= nomRebut;
        this.edat 		= edatRebuda;
        this.sexe 		= sexeRebut;
        this.pes    	= pesRebut;
        this.alssada	= alssadaRebuda;
    }
    
    // Mètodes
    
    /* calcularIMC(): calcularà si la persona
     * està en el seu pes ideal (kg/alçada^2)
     * (pes en kg i alçada en m). Si aquesta
     * fórmula retorna un valor menor a 20,
     * la funció retorna -1, si retorna un
     * número entre 20 i 25 (ambdós inclosos),
     * significa que està en el seu pes ideal
     * i la funció retornarà 0. Per últim si
     * retorna un valor més gran de 25,
     * significa que té sobrepès i retornarà 1.
     * Es recomana que s'utilitzin constants
     * per això.*/
    public int calcularIMC() {
    	double valorIMC = 0;
    	int valorARetornar = 1;
    	valorIMC = this.pes / Math.pow(this.alssada, 2);
    	if(valorIMC < 20) {
    		valorARetornar = -1;
    	} else {
    		if ((valorIMC < 25)) {
        		valorARetornar = 0;
        	}
    	}
    	return valorARetornar;
    }
}
