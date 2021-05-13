package Persona;

public class Treballador extends Persona {

      // Constants 
      private static final double SMI = 950;
      
      // Atributs
      private double salari;
      
      // Constuctor
      Treballador(String nomRebut, int edatRebuda, 
            char sexeRebut){
         super(nomRebut, edatRebuda, sexeRebut);
         this.salari = SMI;
      }
      
      Treballador(String nomRebut, int edatRebuda, 
            char sexeRebut, double salariRebut){
         super(nomRebut, edatRebuda, sexeRebut);
         if (salariRebut < SMI) {
            this.salari = SMI;          
         } else {
            this.salari = salariRebut;
         }
      }
      
      // Getters i Setters
      
     public double getSalari() {
        return this.salari;
     }
     
     public void setSalari(double salariRebut) {
        if (salariRebut < SMI) {
           this.salari = SMI;          
        } else {
           this.salari = salariRebut;
        }
     }
     
      // Mètodes
      public void augmentarSalari(double augmentSalari){
         this.salari += augmentSalari;
         // this.salari = this.salari + salariRebut
      }
      
      public String toString() {
         return super.toString() 
               + "   Salari : " + this.salari + "\n";
      }
}
