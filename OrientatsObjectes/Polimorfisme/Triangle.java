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

   // M�todes
   // Sobreescriptura del m�tode toString() heretat de Poligon
   @Override
   public String toString() {
      return "Triangle\n"
            + super.toString() + "\n"
            + "  costat 1 = " + costat1 + "\n"
            + "  costat 2 = " + costat2 + "\n"
            + "  costat 3 = " + costat3 + "\n";
   }

   //Implementaci� del m�todo abstracte perimetre() heretat de Poligon
   @Override
   public double perimetre(){
      return costat1 + costat2 + costat3;
   }
   
   //Implementaci� del m�todo abstracte area() heretat de Poligon
   // Segons la f�rmula d'Her�
   /* La f�rmula d'Her� �s un m�tode de calcular l'�rea del triangle
    * a partir de les longituds dels costats. �s d'una gran utilitat
    * pr�ctica quan hi ha elements f�sics que impedeixen de poder
    * mesurar-ne l'altura i nom�s tenim acc�s a mesurar-ne la llargada
    * dels costats.
    * Si a, b i c s�n les longituds dels costats, l'�rea del triangle
    * ser�: A= sqrt (sp * (sp-a) * (sp-b) * (sp-c) )
    * on sp �s el semiper�metre del triangle:
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