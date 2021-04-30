class CompteCorrent
   extends CompteBancari {
   
   // Atributs de la classe
   private boolean xecsEmesos;

// Constructor 3 arguments
   CompteCorrent(String numCompteRebut, double saldoRebut, boolean xecsEmesos) {
      super(numCompteRebut, saldoRebut);
      this.xecsEmesos = xecsEmesos;
   }

   // GETTERS i SETTERS
   public boolean getXecsEmesos() {
      return xecsEmesos;
   }

   public void setXecsEmesos(boolean xecsEmesos) {
      this.xecsEmesos = xecsEmesos;
   }

   public String toString() {
      return super.toString()
            + " "
            + this.getClass().getName()
            + " "
            + "Xecs emesos: "
            + this.xecsEmesos;
   }
}