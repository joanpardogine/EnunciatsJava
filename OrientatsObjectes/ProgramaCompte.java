import java.util.Scanner;

// import jdk.javadoc.internal.doclets.formats.html.resources.standard;

public class ProgramaCompte {
 
   public static Scanner teclat = new Scanner(System.in);

    public static void main(String[] args) {

      System.out.print ("Entra el nom del primer titular: ");
      String nomPrimerTitular = teclat.next();

      System.out.print ("Entra el nom del primer titular: ");
      String nomSegonTitular = teclat.next();


      System.out.print ("Entra la quantitat del compte del segon titular: ");
      double importSegonTitular = teclat.nextInt();

        Compte compte_1 = new Compte(nomPrimerTitular); // constructor només amb el nom
        Compte compte_2 = new Compte(nomSegonTitular, importSegonTitular);
                     // constructor amb el nom i l'import inicial
         
        //Fa ingresos als comptes
        System.out.print ("Entra la quantitat a ingressar del compte d'en "
            + compte_1.getTitular() + ": ");
        double importIngressarPrimerTitular = teclat.nextInt();

        System.out.print ("Entra la quantitat a ingressar del compte d'en "
            + compte_2.getTitular() + ": ");
        double importIngressarSegonTitular = teclat.nextInt();

        compte_1.ingressar(importIngressarPrimerTitular);
        compte_2.ingressar(importIngressarSegonTitular);
         
        //Treure diners dels comptes
        System.out.print ("Entra la quantitat a retirar del compte d'en "
            + compte_1.getTitular());
       double importRetirarPrimerTitular = teclat.nextInt();

       System.out.print ("Entra la quantitat a retirar del compte d'en "
                  + compte_2.getTitular());

       double importRetirarSegonTitular = teclat.nextInt();

        compte_1.retirar(importRetirarPrimerTitular);
        compte_2.retirar(importRetirarSegonTitular);
         
        //Mostro la informacié dels comptes

        System.out.println(compte_1); // 0 euros
        System.out.println(compte_2); // 600 euros
         
    }
     
}