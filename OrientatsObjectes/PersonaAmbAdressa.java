public class PersonaAmbAdressa {
	// Atributs
	   private int numDni;
	   private String nom;
	   public Adressa adressaPersona;
	   // adressaPersona.localitat String
	   // adressaPersona.codiPostal  String
	   // adressaPersona.carrer  String
	   
	// Constructors
	   public PersonaAmbAdressa(int dniRebut) {
	      this.numDni = dniRebut;
	   }
	   
	   public PersonaAmbAdressa(int dniRebut, String nomRebut) {
	      this.numDni = dniRebut;
	      this.nom = nomRebut;
	   }
	   
	   public PersonaAmbAdressa(int dniRebut,
			   String nomRebut,
			   String localitatRebuda,
			   String codiPostalRebut,
			   String carrerRebut) {
		      this.numDni = dniRebut;
		      this.nom = nomRebut;
		      this.adressaPersona = new Adressa (localitatRebuda,
			   codiPostalRebut,
			   carrerRebut);    
		   }
	   
	   /*
	   public PersonaAmbAdressa(int dniRebut,
			   String nomRebut,
			   Adressa adressaRebuda) {
		      this.numDni = dniRebut;
		      this.nom = nomRebut;
		      this.adressaPersona = new Adressa (adressaRebuda);    
		   }
	   */
	   
	// Mètodes
	   public int getDNI(){
	      return (this.numDni);
	   }
	   
	   public String getNom() {
	      return (this.nom);
	   }
	   
	   public void setDNI(String dniRebut) {
	      this.nom = dniRebut;
	   }
	   
	   public void setNom(String nomRebut) {
		      this.nom = nomRebut;
		   }
	   
	   public String getAdressa() {
	      return (this.adressaPersona.toString());
	   }
	   
	   /* adressaPersona.localitat  String */
	   public String getLocalitat() {
		   return this.adressaPersona.getLocalitat();
	   }
	   
	   /* adressaPersona.codiPostal  String */
	   public String getCodiPostal() {
		   return this.adressaPersona.getCodiPostal();
	   }
	   
	   
	   /* adressaPersona.carrer  String */
	   public String getCarrer2() {
		   return this.adressaPersona.getCarrer();
	   }
	   
	   
	   
	   public void setAdressa( String localitatRebuda,
			   String codiPostalRebut,
			   String carrerRebut) {
	      this.adressaPersona.setLocalitat(localitatRebuda);
	      this.adressaPersona.setCodiPostal(codiPostalRebut);
	      this.adressaPersona.setCarrer(carrerRebut);
	   }

}
