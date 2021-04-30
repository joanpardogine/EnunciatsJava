package Polimorfisme;

public abstract class Poligon {
   // Atributs
   private int qtatCostats;

   // Constructors
   public Poligon() {
   }

   public Poligon(int qtatCostatsRebuts) {
      this.qtatCostats = qtatCostatsRebuts;
   }

   // Getters i Setters
   public int getQtatCostats() {
      return qtatCostats;
   }

   public void setQtatCostats(int qtatCostatsRebut) {
      this.qtatCostats = qtatCostatsRebut;
   }

   // M�todes
   //Sobreescritura del m�tode toString() heretat d'Object
   @Override
   public String toString(){
      return "Nombre de costats: " + qtatCostats;
   }

   //Declaraci� del m�todo abstracte area()
   public abstract double area();

   //Declaraci� del m�todo abstracte perimetre()
   public abstract double perimetre();

}