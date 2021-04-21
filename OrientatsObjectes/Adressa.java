/** Fer la declaració de la classe Adressa. 
 * Aquesta classe té com a atributs la localitat,
 * el codi postal i el carrer. Com a mètodes,
 * tindrem el constructor (amb tres paràmetres
 * que corresponen als atributs de la classe),
 * un mètode de consulta per a cada atribut i 
 * un mètode toString que retorna en una cadena
 * l’adreça sencera amb el format
 * "Carrer – Codi Postal - Localitat". 
 * (Adressa.java)
 * @author Joan
 * */
public class Adressa {
	// Atributs 
	private String localitat;
	private String codiPostal;
	private String carrer;
	
	// Constructor
	Adressa(String localitatRebuda,
			String cpRebut,
			String carrerRebut){
		this.localitat = localitatRebuda;
		this.codiPostal = cpRebut;
		this.carrer = carrerRebut;
	}
	
	// Getters i Setters
	
	public String getLocalitat() {
		return this.localitat;
	}

	public String getCodiPostal() {
		return this.codiPostal;
	}

	public String getCarrer() {
		return this.carrer;
	}
	
	public void setLocalitat(String localitatRebuda) {
		this.localitat = localitatRebuda;
	}
	
	public void setCodiPostal(String codiPostalRebut) {
		this.codiPostal = codiPostalRebut;
	}
	
	public void setCarrer(String carrerRebut) {
		this.carrer = carrerRebut;
	}
	
	// Mètodes
	/** Retorna en una cadena 
	 *  l’adreça sencera amb el format
	 *  "Carrer – Codi Postal - Localitat".
	 */  
	public String toString() {
		return (this.carrer
				+ " – " + this.codiPostal
				+ " – " + this.localitat);
	}
}
