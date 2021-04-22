/** Fer la declaraci� de la classe Adressa. 
 * Aquesta classe t� com a atributs la localitat,
 * el codi postal i el carrer. Com a m�todes,
 * tindrem el constructor (amb tres par�metres
 * que corresponen als atributs de la classe),
 * un m�tode de consulta per a cada atribut i 
 * un m�tode toString que retorna en una cadena
 * l�adre�a sencera amb el format
 * "Carrer � Codi Postal - Localitat". 
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
   
   // M�todes
   /** Retorna en una cadena 
    *  l�adre�a sencera amb el format
    *  "Carrer � Codi Postal - Localitat".
    */  
   public String toString() {
      return (this.carrer
            + " � " + this.codiPostal
            + " � " + this.localitat);
   }
}
