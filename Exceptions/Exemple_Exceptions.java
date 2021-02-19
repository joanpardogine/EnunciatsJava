import java.util.Scanner;

public class Exemple_Exceptions {
  
  public static Scanner teclat = new Scanner(System.in);
  public static void main(String[] args) {
    int nombre;
    System.out.print("Escriu un nombre entre 1 i 10! ");
    nombre = teclat.nextInt();
    try {
      if ((nombre>0) && (nombre<10)) {
        System.out.print("Has entrat el nombre " + nombre);
      } else {
        if (nombre>10) {
          throw new Exception ("ErrMesGran");
        } else {
          throw new Exception ("ErrMesPetit");
        }
      } 
    } catch (Exception ExcepcioAControlar){

      System.out.print(ExcepcioAControlar);

      if (ExcepcioAControlar.equals("ErrMesGran")){
        System.out.print("Error! El nombre entrar és massa gran!");
      }
      if (ExcepcioAControlar.equals("ErrMesPetit")){
        System.out.print("Error! El nombre entrar és massa petit!");
      }

    }
  }

}
