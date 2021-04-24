<<<<<<< HEAD

public class Vehicle {
   // Atributs
   private String marca, model, matricula;
   private int any;
   private float consum;

   // Constructors
   public Vehicle(String marcaRebuda, String modelRebut, String marticulalRebuda, int anyRebut, float consumRebut) {
      this.marca = marcaRebuda;
      this.model = modelRebut;
      this.matricula = marticulalRebuda;
      this.any = anyRebut;
      this.consum = consumRebut;
   }
   
   // Getters
   public String getMarca() {
      return this.marca;
   }
   public String getModel() {
      return this.model;
   }
   public String getMatricula() {
      return this.matricula;
   }
   public int getAny() {
      return this.any;
   }
   public float getConsum() {
      return this.consum;
   }
   
   // Setters
   public void setMarca(String marcaRebuda) {
      this.marca = marcaRebuda;
   }
   public void setModel(String modelRebut) {
      this.model = modelRebut;
   }
   public void setMatricula(String marticulalRebuda) {
      this.matricula= marticulalRebuda;
   }
   public void setAny(int anyRebut) {
      this.any = anyRebut;
   }
   public void setConsum(float consumRebut) {
      this.consum = consumRebut;
   }
   
   // Mètodes
   public float autonomia(int litres) {
      return (litres/this.consum) * 100;
   }
   
   public String toString() {
      return "Vehicle\n-------\n"
         + "Marca          : " + this.marca + "\n"
         + "Model          : " + this.model + "\n"
         + "Matrícula      : " + this.matricula + "\n"
         + "Any fabricació : " + this.any + "\n"
         + "Consum (litres): " + this.consum + " cada 100km.";
            
   }
=======

public class Vehicle {
   // Atributs
   private String marca, model, matricula;
   private int any;
   private float consum;

   // Constructors
   public Vehicle(String marcaRebuda, String modelRebut, String marticulalRebuda, int anyRebut, float consumRebut) {
      this.marca = marcaRebuda;
      this.model = modelRebut;
      this.matricula = marticulalRebuda;
      this.any = anyRebut;
      this.consum = consumRebut;
   }
   
   // Getters
   public String getMarca() {
      return this.marca;
   }
   public String getModel() {
      return this.model;
   }
   public String getMatricula() {
      return this.matricula;
   }
   public int getAny() {
      return this.any;
   }
   public float getConsum() {
      return this.consum;
   }
   
   // Setters
   public void setMarca(String marcaRebuda) {
      this.marca = marcaRebuda;
   }
   public void setModel(String modelRebut) {
      this.model = modelRebut;
   }
   public void setMatricula(String marticulalRebuda) {
      this.matricula= marticulalRebuda;
   }
   public void setAny(int anyRebut) {
      this.any = anyRebut;
   }
   public void setConsum(float consumRebut) {
      this.consum = consumRebut;
   }
   
   // Mètodes
   public float autonomia(int litres) {
      return (litres/this.consum) * 100;
   }
   
   public String toString() {
      return "Vehicle\n-------\n"
         + "Marca          : " + this.marca + "\n"
         + "Model          : " + this.model + "\n"
         + "Matrícula      : " + this.matricula + "\n"
         + "Any fabricació : " + this.any + "\n"
         + "Consum (litres): " + this.consum + " cada 100km.";
            
   }
>>>>>>> 0973f134151dcb3642cb7e9fd29bce3cd06e37bc
}