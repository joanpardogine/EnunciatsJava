package Polimorfisme;

import java.util.Scanner;

// Clase Principal

public class PolimorfismePrograma {

   public static Scanner teclat = new Scanner(System.in);
   public static int comptador = 0;
   public static final int QTAT_POLIGONS = 5;

   // Array de referències a objetes de la clase base Poligon
   static Poligon[] poligons = new Poligon[QTAT_POLIGONS];

   // Es demana per teclat el tipus de Poligon a crear
   // s'executa i es llegeix el mètode corresponent
   public static void llegirPoligons() {
      int tipusPoligon;
      do {
         do {
            System.out.print("Tipus de polígon:\n"
                  + " 1 -> Rectangle.\n"
                  + " 2 -> Triangle.\n"
                  + " 0 -> Acabar.\n"
                  + "Escull una opció: ");
            tipusPoligon = teclat.nextInt();
         } while (tipusPoligon < 0 || tipusPoligon > 2);
         if (tipusPoligon != 0) {
            switch (tipusPoligon) {
            case 1:
               llegirRectangle();
               break;
            case 2:
               llegirTriangle();
               break;
            }
         }
      } while (tipusPoligon != 0);
   }

   // Es crea una instancia de la classe rectangle i s'afegeix a l'array
   public static void llegirRectangle() {
      double costat1, costat2;
      System.out.println("\nEntra les dades del Rectangle");
      costat1 = llegirCostat(1);
      costat2 = llegirCostat(2);

      Rectangle rectangleLlegit = new Rectangle(costat1, costat2);
      poligons[comptador] = rectangleLlegit;
      comptador++;
      
      System.out.println("Rectangle creat correctament!\n");
   }

   // Es crea una instancia de la classe triangle i s'afegeix a l'array
   public static void llegirTriangle() {
      double costat1, costat2, costat3;
      System.out.println("\nEntra les dades del Triangle");
      costat1 = llegirCostat(1);
      costat2 = llegirCostat(2);
      costat3 = llegirCostat(3);
      
      Triangle triangleLlegit = new Triangle(costat1, costat2, costat3);
      poligons[comptador] = triangleLlegit;
      comptador++;

      System.out.println("Triangle creat correctament!\n");
   }

   /**
    * @return
    */
   private static double llegirCostat(int nombreCostat) {
      double costat1;
      do {
         System.out.print("Mida costat "
               + nombreCostat
               + ": ");
         costat1 = teclat.nextDouble();
      } while (costat1 <= 0);
      return costat1;
   }

   public static void mostrarPoligons() {
      // Es recorre l'Array poligons que conté
      // referencies als Triangles i Rectangles.
      for(int i = 0; i< comptador; i++){
         System.out.println(poligons[i].toString());
         System.out.println("Area      : " + poligons[i].area());
         System.out.println("Perimetre : " + poligons[i].perimetre());
      }
   }

   public static void main(String[] args) {
      llegirPoligons();
      mostrarPoligons();
   }
}