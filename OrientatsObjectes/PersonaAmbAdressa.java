public class PersonaAmbAdressa {
   // Atributs
   private int numDni;
   private String nom;
   private Adressa adressaPersona;
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
      
   // GETTERS
      public int getDNI(){
         return (this.numDni);
      }
      
      public String getNom() {
         return (this.nom);
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
      public String getCarrer() {
         return this.adressaPersona.getCarrer();
      }
      
      
      // SETTERS      
      public void setDNI(int dniRebut) {
         this.numDni = dniRebut;
      }
      
      public void setNom(String nomRebut) {
            this.nom = nomRebut;
         }

      public void setAdressa( String localitatRebuda,
            String codiPostalRebut,
            String carrerRebut) {
         this.adressaPersona.setLocalitat(localitatRebuda);
         this.adressaPersona.setCodiPostal(codiPostalRebut);
         this.adressaPersona.setCarrer(carrerRebut);
      }
      
      public void setLocalitat(String localitatRebuda) {
         this.adressaPersona.setLocalitat(localitatRebuda);
      }
      
      public void setCodiPostal(String codiPostalRebut) {
         this.adressaPersona.setCodiPostal(codiPostalRebut);
      }
      
      public void setCarrer(String carrerRebut) {
         this.adressaPersona.setCarrer(carrerRebut);
      }
}
