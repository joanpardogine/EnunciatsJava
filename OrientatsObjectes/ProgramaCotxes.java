import java.util.Scanner;

public class ProgramaCotxes {
	static Scanner teclat = new Scanner (System.in);
	
	public static void introduirDadesObjectes(String titolobj,Cotxe objcotxes) {
		
		String marca, model, color; 
		System.out.println("Dades per a "
				+ titolobj.toUpperCase());
		
		System.out.print("Introdueix la MARCA del cotxe "
				+ titolobj
				+ ": ");
		marca = teclat.next();
		System.out.print("Introdueix el MODEL de "
				+ titolobj
				+ ": ");
		model = teclat.next();
		System.out.print("Introdueix el COLOR de "
				+ titolobj
				+ ": ");
		color = teclat.next();
		
		objcotxes.setMarca(marca);
		objcotxes.setModel(model);
		objcotxes.setColor(color);
		objcotxes.matricular();
	}
	
	public static void main(String[] args) {
		int numCotxes;
		System.out.print("Introdueix el numero de cotxes: ");
		numCotxes = teclat.nextInt();
		Cotxe []objarr = new Cotxe[numCotxes]; 
		for (int i=0; i<objarr.length; i++) {
			objarr[i] = new Cotxe();
			introduirDadesObjectes("Objecte "+(i+1),objarr[i]);
		}
		System.out.println("Visualitar inforamació");	
		for (int i=0; i<objarr.length; i++) {
			System.out.println("Objecte " + (i + 1) );
			objarr[i].visualitzar();
		}
		
	}

}
