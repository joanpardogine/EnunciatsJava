import java.util.Scanner;

public class ProgramaPersona2 {

	static Scanner teclat = new Scanner (System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nomPersona1, localitatPersona1, cpPersona1, carrerPersona1;
		int dniPersona1;
		
		System.out.print("Entra el nom de la persona: ");
		nomPersona1 = teclat.next();
		
		System.out.print("Entra el dni de " + nomPersona1 + ": ");
		dniPersona1 = teclat.nextInt();
		
		System.out.print("Entra el localitat de " + nomPersona1 + ": ");
		localitatPersona1 = teclat.next();
		
		System.out.print("Entra el codi postal de " + nomPersona1 + ": ");
		cpPersona1 = teclat.next();
		
		System.out.print("Entra el carrer de " + nomPersona1 + ": ");
		carrerPersona1 = teclat.next();
		
		PersonaAmbAdressa persona1 = new PersonaAmbAdressa(dniPersona1, nomPersona1, localitatPersona1, cpPersona1, carrerPersona1);
		
		System.out.println("Persona creada correctament!");
		System.out.println("Nom         : " + persona1.getNom());
		System.out.println("DNI         : " + persona1.getDNI());
		System.out.println("Adressa     : " + persona1.getAdressa());
		System.out.println("localitat   : " + persona1.getLocalitat());
		System.out.println("codi postal : " + persona1.getCodiPostal());
		System.out.println("Carrer 1    : " + persona1.getCarrer2());
		
		System.out.println("Carrer 2    : " + persona1.adressaPersona.getCarrer());
	
		
	}

}
