package Persona;

public class Programador extends Treballador {
   // Constants 
   private static final int LINIES_DEFECTE = 0;
   
   // Atribut
   private int liniesCodiHora;
   
   // Constuctors
   Programador(String nomRebut, int edatRebuda, 
         char sexeRebut) {
      super(nomRebut, edatRebuda, sexeRebut);
      this.liniesCodiHora = LINIES_DEFECTE;
   }

   Programador(String nomRebut, int edatRebuda, 
         char sexeRebut, double salariRebut) {
      super(nomRebut, edatRebuda, sexeRebut, salariRebut);
      this.liniesCodiHora = LINIES_DEFECTE;
   }

   Programador(String nomRebut, int edatRebuda,
         char sexeRebut, double salariRebut,
         int liniesCodiHoraRebudes) {
      super(nomRebut, edatRebuda, sexeRebut, salariRebut);
      this.liniesCodiHora = liniesCodiHoraRebudes;
   }
   
   // Getters i Setters
   public int getLiniesCodiHora() {
      return this.liniesCodiHora;
   }
   
   public void setLiniesCodiHora(int liniesCodiHoraRebudes) {
      this.liniesCodiHora = liniesCodiHoraRebudes;
   }
   
   public String toString() {
      return super.toString()
            + "      Línies x hora : " + this.liniesCodiHora + "\n";
   }
}
