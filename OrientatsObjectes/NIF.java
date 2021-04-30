public class NIF
extends DNI {
   
   // NOU atribut de l'instància
   private char lletra_nif;
   
   // NOVA constant pel calcul de la lletra
   private static final char[] LLETRES = {
         'T','R','W','A','G','M','Y','F','P','D',
         'X','B','N','J','Z','S','Q','V','H','L',
         'C','K','E'};
   
   // REDEFINIM el constructor
   NIF (int xifres) {
      super(xifres); //Cridem al constructor de
      // DNI perquè inicialitzi
      // l'atribut num_dni
      this.lletra_nif = calcula_lletra();
   }
   
   // NOU mètode GETTER
   public char getLletra() {
      return (this.lletra_nif);
   }
 
   // NOU mètode auxiliar
   private char calcula_lletra() {
      // calculem la lletra amb el ròssec de la divisió entera.
      return (LLETRES[(num_dni % 23)]);
   }
   
  
   // REDEFINIM el clone de DNI pel NIF
   public Object clone() {
      return (Object)( new NIF(num_dni));
   }
   
   // REDEFINIM el toString de DNI pel NIF
   public String toString() {
      // Retornem el que retorna la classe DNI
      // amb la lletra del NIF concatenada al final
      return (super.toString() + this.lletra_nif);
   }
}