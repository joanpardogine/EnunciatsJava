package Persona;

public class Persona {

   private static final int MAJOR_EDAT = 18;

   // Atributs
   private String nom;
   private int edat;
   private char sexe;

   // Constructors
   Persona(String nomRebut, int edatRebuda, char sexeRebut) {
      this.nom = nomRebut;
      this.edat = edatRebuda;
      this.sexe = sexeRebut;
   }

   Persona() {
      this.nom = "Sense Nom";
      this.edat = 0;
      this.sexe = '?';
   }

   // Getters i Setters
   public String getNom() {
      return this.nom;
   }

   public int getEdat() {
      return this.edat;
   }
   
   public char getSexe() {
      return this.sexe;
   }

   public void setNom(String nomRebut) {
      this.nom = nomRebut;
   }

   public void setEdat(int edatRebuda) {
      this.edat = edatRebuda;
   }

   public void setSexe(char sexeRebut) {
      this.sexe = sexeRebut;
   }

   // Mètodes
   public void aniversari() {
      this.edat++;
   }

   public boolean esMajorEdat() {
      if (this.edat >= MAJOR_EDAT) {
         return true;
      } else {
         return false;
      }
   }

   public String toString() {
      return  "Nom : " + this.nom + "\n"
            + "Edat: " + this.edat + "\n";
   }

}
