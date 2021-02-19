import java.util.Scanner;

public class OmplirIMaxArray {
/* *Dissenyar dues funcions:
omplir_taula(): funci� per omplir una taula (array)
de n elements. Els par�metres que rebr� la funci� s�n
la taula (array) a omplir i un enter que �s el nombre
d'elements. La funci� no retorna res.
maxim_taula(): funci� que calculi i retorni el nombre
m�s gran (m�xim). El par�metre que rebr� la funci� �s
la taula (array). I retornar� el m�xim (el nombre m�s
 gran) de la taula que li hem passat.
  */
	public static void omplir_taula(int[] arrayRebut, int nombreElements) {
		for (int i=0; i<nombreElements; i++) {
			arrayRebut[i]=i*2;
		}
	}  // FINAL public static void omplir_taula(int [] arrayRebut)
	

	public static int maxim_taula(int [] arrayRebut) {
		int valorMaxim;
		valorMaxim = 0;
		for (int j=0; j<arrayRebut.length; j++) {
			if(arrayRebut[j]>valorMaxim) {
				valorMaxim = arrayRebut[j];
			}
		}
		
		return valorMaxim;
	}  // FINAL public static int maxim_taula(int [] arrayRebut)

	

	public static void main(String[] args) {
		
		Scanner teclat = new Scanner(System.in);
		int midaTaula, valorMaxTaula;
		
		System.out.print("Escriu la mida de la taula: ");
		midaTaula = teclat.nextInt();
		
		int[] taulaAOmplir = new int[midaTaula];
		omplir_taula(taulaAOmplir, midaTaula);
	
		valorMaxTaula = maxim_taula(taulaAOmplir);
		
		System.out.print("El valor m�xim de la taula �s: " + valorMaxTaula);
		
		teclat.close();
	} // FINAL public static void main(String[] args)
	
	

}
