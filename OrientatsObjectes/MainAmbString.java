public class MainAmbString {
   public static void main(String[] args) {
      
      String paraules = "paraula1;paraula2;paraula3";
      String paraules2 = new String("paraula1;paraula2;paraula3");
      
      
      int[] un_array = new int[3];
      
      Integer[] un_altre_array = new Integer[3];
      
      for (int i=0; i<un_array.length ;i++) {
         System.out.println("un_array[i] = " + un_array[i]);
      }
      
      Adressa adressaProva = new Adressa();
      System.out.println(adressaProva.toString());
      
      Adressa[] taulaAdressa = new Adressa[3];
      
      // String[] unArray
      taulaAdressa[0]= new Adressa("Llinars del Vallès", "08450", "Joaquim Costa, s/n");
      taulaAdressa[1]= new Adressa("Cardedeu", "08440", "Pl. de Sant Joan, 1");
      taulaAdressa[2]= new Adressa("Barcelona", "08001", "Pl. Sant Jaume, 1");
      
      for (int i=0; i<taulaAdressa.length ;i++) {
         System.out.println(taulaAdressa[i].toString());
      }
   }
}