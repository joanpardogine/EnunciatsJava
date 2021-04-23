
public class UsaVehicle {

   public static void main(String[] args) {
      /* marca (cadena de car�cters, String)
         model (cadena de car�cters, String)
         any de fabricaci� (enter, int) o
         matr�cula (cadena de car�cters, String) o
         consum, en litres de carburant per cada 100 quil�metres (decimal, float)

       * */
      
      String marcaTest, modelTest, matriculaTest;
      int anyTest, litresDiposit;
      float consumTest;
      
      if (args.length == 0 || args.length < 6) {
         System.out.print("No hi ha, o falten arguments!");
      } else {
         marcaTest = args[0];
         modelTest = args[1];
         anyTest = Integer.parseInt(args[2]);
         matriculaTest = args[3];
         consumTest = Float.parseFloat(args[4]);
         litresDiposit = Integer.parseInt(args[5]);
         
         Vehicle cotxe1 = new Vehicle(marcaTest,
               modelTest,
               matriculaTest,
               anyTest,
               consumTest);
         
         System.out.println(cotxe1.toString());
         System.out.println("Amb " + litresDiposit + " litres"
               + " prodr� recorrer " + cotxe1.autonomia(litresDiposit) + " Km");
      }
      
   }

}
