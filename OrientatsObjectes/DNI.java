public class DNI {
   
   // Atributs de la classe
   protected int num_dni;
   
   // Constructors de la classe
   public DNI (int xifres) {
      this.num_dni = xifres;
   }
   
   // GETTERS i SETTERS
   
   // Mètodes GETTER
   public int getDNI() {
     return (this.num_dni);
   }
   
   // Mètodes de DNI
   public boolean equals(DNI altre_dni) { 
      return (this.num_dni == altre_dni.getDNI());
   }
   
   public Object clone() {
      return (Object)(new DNI(this.num_dni));
   }
   
   public String toString(){ 
      return (Integer.toString(this.num_dni));
   }
}