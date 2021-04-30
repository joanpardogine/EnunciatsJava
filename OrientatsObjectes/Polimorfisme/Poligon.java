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

   // Mètodes
   //Sobreescritura del mètode toString() heretat d'Object
   @Override
   public String toString(){
      return "Nombre de costats: " + qtatCostats;
   }

   //Declaració del mètodo abstracte area()
   public abstract double area();

   //Declaració del mètodo abstracte perimetre()
   public abstract double perimetre();

}