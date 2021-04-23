
public class UsaVehicle {

   public static void main(String[] args) {
      /* marca (cadena de caràcters, String)
         model (cadena de caràcters, String)
         any de fabricació (enter, int) o
         matrícula (cadena de caràcters, String) o
         consum, en litres de carburant per cada 100 quilòmetres (decimal, float)

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
               + " prodrà recorrer " + cotxe1.autonomia(litresDiposit) + " Km");
      }
      
   }

}
