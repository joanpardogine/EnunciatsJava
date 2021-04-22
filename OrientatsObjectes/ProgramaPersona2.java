import java.util.Scanner;

public class ProgramaPersona2 {

   static Scanner teclat = new Scanner (System.in);
   static Scanner teclatNombres = new Scanner (System.in);
   
   public static void main(String[] args) {
      // TODO Auto-generated method stub

      String nomPersona1, localitatPersona1, cpPersona1, carrerPersona1;
      int dniPersona1;
      
      System.out.println("----  Prova de GETTERS!  ----");
      System.out.print("Entra el nom de la persona: ");
      nomPersona1 = teclat.nextLine();
      
      System.out.print("Entra el dni de " + nomPersona1 + ": ");
      dniPersona1 = teclatNombres.nextInt();
      
      System.out.print("Entra la localitat de " + nomPersona1 + ": ");
      localitatPersona1 = teclat.nextLine();
      
      System.out.print("Entra el codi postal de " + nomPersona1 + ": ");
      cpPersona1 = teclat.nextLine();
      
      System.out.print("Entra el carrer de " + nomPersona1 + ": ");
      carrerPersona1 = teclat.nextLine();
      
      PersonaAmbAdressa persona1 = new PersonaAmbAdressa(dniPersona1, nomPersona1, localitatPersona1, cpPersona1, carrerPersona1);

      System.out.println("Persona creada correctament!");

      System.out.println("Nom         : " + persona1.getNom());
      System.out.println("DNI         : " + persona1.getDNI());
      System.out.println("Adressa     : " + persona1.getAdressa());
      System.out.println("localitat   : " + persona1.getLocalitat());
      System.out.println("codi postal : " + persona1.getCodiPostal());
      System.out.println("Carrer      : " + persona1.getCarrer());
      System.out.println("-----------------------------");
      
      
      System.out.println("----  Prova de SETTERS!  ----");
      // teclat.reset();
      System.out.print("Entra el NOU nom de "
            + persona1.getNom() 
            + ": ");
      nomPersona1 = teclat.nextLine();
      persona1.setNom(nomPersona1);

      System.out.print("Entra el NOU dni de "
            + nomPersona1
            + " (" + persona1.getDNI()
            + "): ");
      dniPersona1 = teclatNombres.nextInt();
      persona1.setDNI(dniPersona1);
      
      System.out.print("Entra la NOVA localitat de "+ nomPersona1
            + " (" + persona1.getLocalitat()
            + "): ");
      localitatPersona1 = teclat.nextLine();
      persona1.setLocalitat(localitatPersona1);
      
      System.out.print("Entra el NOU codi postal de "+ nomPersona1
            + " (" + persona1.getCodiPostal()
            + "): ");
      cpPersona1 = teclat.nextLine();
      persona1.setCodiPostal(cpPersona1);
      
      System.out.print("Entra el NOU carrer de " + nomPersona1
            + " (" + persona1.getCarrer()
            + "): ");
      carrerPersona1 = teclat.nextLine();
      persona1.setCarrer(carrerPersona1);
      
      System.out.println("Persona modificada correctament!");
      System.out.println("Prova de SETTERS!");
      System.out.println("Nom         : " + persona1.getNom());
      System.out.println("DNI         : " + persona1.getDNI());
      System.out.println("Adressa     : " + persona1.getAdressa());
      System.out.println("localitat   : " + persona1.getLocalitat());
      System.out.println("codi postal : " + persona1.getCodiPostal());
      System.out.println("Carrer      : " + persona1.getCarrer());
      
      System.out.println("-----------------------------");
   }

}
