import java.util.Scanner;

public class ProgramaCotxes {
	
	public static void introduirDadesObjectes(String titolobj,Cotxe objcotxes) {
		Scanner teclattext = new Scanner (System.in);
		
		String marca,model,color,matricula;
		System.out.println("Dades per a "+titolobj.toUpperCase());
		System.out.print("Introdueix la MARCA del cotxe "+titolobj+": ");
		marca = teclattext.nextLine();
		System.out.print("Introdueix el MODEL de "+titolobj+": ");
		model = teclattext.nextLine();
		System.out.print("Introdueix el COLOR de "+titolobj+": ");
		color = teclattext.nextLine();
		
		objcotxes.setMarca(marca);
		objcotxes.setModel(model);
		objcotxes.setColor(color);
		objcotxes.matricular();
		
		
		
	}
	public static void main(String[] args) {
		Scanner teclatnum = new Scanner (System.in);
		int numCotxes;
		System.out.println("Introdueix el numero de cotxes");
		numCotxes = teclatnum.nextInt();
		Cotxe []objarr = new Cotxe[numCotxes]; 
		for (int i=0; i<objarr.length; i++) {
			objarr[i] = new Cotxe();
			introduirDadesObjectes("Objecte "+(i+1),objarr[i]);
		}
		System.out.println("Visualitar inforamació");	
		for (int i=0; i<objarr.length; i++) {
			System.out.println("Objecte "+(i+1));
			objarr[i].visualitzar();
		}
		
	}

}
