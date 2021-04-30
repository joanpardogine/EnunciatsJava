package Polimorfisme;

//Clase Triangle hereta de Poligon
public class Triangle extends Poligon{
   
   // Atributs
   private double costat1;
   private double costat2;
   private double costat3;
   
   // Constructors
   public Triangle() {
   }

   public Triangle(double costat1, double costat2, double costat3) {
      super(3);
      this.costat1 = costat1;
      this.costat2 = costat2;
      this.costat3 = costat3;
   }
   
   // Getters i Setters
   public double getCostat1() {
      return costat1;
   }

   public void setCostat1(double costat1) {
      this.costat1 = costat1;
   }

   public double getCostat2() {
      return costat2;
   }

   public void setCostat2(double costat2) {
      this.costat2 = costat2;
   }

   public double getCostat3() {
      return costat3;
   }

   public void setCostat3(double costat3) {
      this.costat3 = costat3;
   }

   // Mètodes
   // Sobreescriptura del mètode toString() heretat de Poligon
   @Override
   public String toString() {
      return "Triangle\n"
            + super.toString() + "\n"
            + "  costat 1 = " + costat1 + "\n"
            + "  costat 2 = " + costat2 + "\n"
            + "  costat 3 = " + costat3 + "\n";
   }

   //Implementació del mètodo abstracte perimetre() heretat de Poligon
   @Override
   public double perimetre(){
      return costat1 + costat2 + costat3;
   }
   
   //Implementació del mètodo abstracte area() heretat de Poligon
   // Segons la fòrmula d'Heró
   /* La fórmula d'Heró és un mètode de calcular l'àrea del triangle
    * a partir de les longituds dels costats. És d'una gran utilitat
    * pràctica quan hi ha elements físics que impedeixen de poder
    * mesurar-ne l'altura i només tenim accés a mesurar-ne la llargada
    * dels costats.
    * Si a, b i c són les longituds dels costats, l'àrea del triangle
    * serà: A= sqrt (sp * (sp-a) * (sp-b) * (sp-c) )
    * on sp és el semiperímetre del triangle:
    * sp = (a + b + c ) / 2
    * */
   @Override
   public double area(){
      double semiPerimetre = (costat1 + costat2 + costat3)/2;
      return Math.sqrt(semiPerimetre * (semiPerimetre-costat1)
            * (semiPerimetre-costat2)
            * (semiPerimetre-costat3));
   }

}