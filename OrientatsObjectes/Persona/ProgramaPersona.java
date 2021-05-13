package Persona;

import java.util.Scanner;

public class ProgramaPersona {
   public static Scanner teclat = new Scanner(System.in);
   
   public static void main(String[] args) {
    
      Programador programador = new Programador("Joan", 21, 'H', 40);
      System.out.println(programador.toString() );

      double nouSou = 0;
      int novaVelocitat = 0;
      System.out.print("Entra el nou sou d'en "
               + programador.getNom()
               + ": ");
      nouSou = teclat.nextDouble();
      
      programador.setSalari(nouSou);
      System.out.println("Un cop afegit el nou sou!");
      
      System.out.println(programador.toString() );
      
      System.out.print("Entra la nova velocitat d'en "
            + programador.getNom()
            + ": ");
      novaVelocitat = teclat.nextInt();
   
      programador.setLiniesCodiHora(novaVelocitat);
      System.out.println("Un cop afegit la nova velociat!");
      
      System.out.println(programador.toString() );
   
   }
}
