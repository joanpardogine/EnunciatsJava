package Polimorfisme;

//Clase Rectangle hereda de Poligono
public class Rectangle extends Poligon{
   
   // Atributs
   private double costat1;
   private double costat2;

   // Constructors
   public Rectangle() {
   }

   public Rectangle(double costat1Rebut, double costat2Rebut) {
      super(2);
      this.costat1 = costat1Rebut;
      this.costat2 = costat2Rebut;
   }

   // Getters i Setters
   public double getCostat1() {
      return costat1;
   }

   public void setCostat1(double costat1Rebut) {
      this.costat1 = costat1Rebut;
   }

   public double getCostat2() {
      return costat2;
   }

   public void setCostat2(double costat2) {
      this.costat2 = costat2;
   }

   // Mètodes
   // Sobreescritura del mètode toString() heretat de Poligon
   @Override
   public String toString() {
      return "Rectangle\n"
            + super.toString() + "\n"
            + "  costat 1 = " + costat1 + "\n"
            + "  costat 2 = " + costat2 + "\n";
   }
   
   // Implementació del mètodo abstracte perimetre() heretat de Poligon
   @Override
   public double perimetre(){
      return 2 * (costat1 + costat2);
   }
   
   // Implementació del mètodo abstracte area() heretat de Poligon
   @Override
   public double area(){
      return costat1 * costat2;
   }

}