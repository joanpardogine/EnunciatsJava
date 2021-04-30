public class CompteBancari {

   // Atributs de la classe
   private String numeroCompte;
   private double saldo;
   private double qttInicial = 10;

   // Constructor 1 argument
   public CompteBancari(String numCompteRebut) {
      this.numeroCompte = numCompteRebut;
   }

   // Constructor 2 arguments
   public CompteBancari(String numCompteRebut, double saldoRebut) {
      this.numeroCompte = numCompteRebut;
      if (saldoRebut >= this.qttInicial) {
         this.saldo = saldoRebut;
      } else {
         System.out.println("Error, el saldo introduït"
               + "és inferior a la quantitat minima demanada!");
      }
   }

   // GETTERS i SETTERS
   public String getNumCompte() {
      return (this.numeroCompte);
   }

   public double getSaldo() {
      return (saldo);
   }

   public void setSaldo(double saldo) {
      this.saldo = saldo;
   }

   public double getQtInicial() {
      return (qttInicial);
   }

   public void setQtInicial(double qttInicial) {
      this.qttInicial = qttInicial;
   }

   // Mètodes
   public void imposicio(double restarSaldo) {
      this.saldo = this.saldo - restarSaldo;
   }

   public void reintegrament(double sumarSaldo) {
      this.saldo = this.saldo - sumarSaldo;
   }

   public String toString() {
      return this.numeroCompte + " | " + this.saldo;
   }
}