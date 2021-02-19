import java.util.Scanner;

public class CalculDosNombresEnBucle {
	/*
	 * Escriure un programa que demani dos nombres i
	 * l'operaci� a realitzar sobre els dos nombres.
	 * En finalitzar, ha de mostrar el resultat de 
	 * l'operaci� matem�tica realitzada. El primer
	 *  nombre entrat ser� el primer operand i el
	 * segon nombre el segon operand. Comen�at plantejament!
	 * L'operaci� pot ser:
	 * +   	suma
	 * -   	resta
	 * /	divisi� sencera
	 * %	m�dul (residu de la divisi�)
	 * *	multiplicaci�
	 * ^	elevat
	 * Heu de fer una funci� per cada operaci�.
	 * */
	
	public static int suma(int num1, int num2) {
		int resultat;
		resultat = num1 + num2;
		return resultat;
	}
	
	public static int resta(int num1, int num2) {
		int resultat;
		resultat = 0;
		resultat = num1 - num2;
		return resultat;
	}
	
	public static int prod(int num1, int num2) {
		int resultat;
		resultat = 0;
		resultat = num1 * num2;
		return resultat;
	}
	
	public static double divi(int num1, int num2) {
		float resultat;
		resultat = 0;
		if (num2==0) {
			resultat = -1;
		} else {
			resultat = num1 / num2;
		}
		return resultat;
	}
	
	public static int modul(int num1, int num2) {
		int resultat;
		resultat = 0;
		resultat = num1 % num2;
		return resultat;
	}
	
	public static double potencia(int num1, int num2) {
		double resultat;
		resultat = 0;
		resultat = Math.pow(num1,num2);
		return resultat;
	}
	
	public static void main(String[] args) {
		

		Scanner teclat = new Scanner(System.in);
		int nombre1, nombre2, resultat;

		double resDecimal;

		String resText;
		char operacio, seguir;
		
		resultat = 0;
		resDecimal = 0;
		resText = "";
		
		do {
			System.out.print("Escriu el primer dels nombres: ");
			nombre1 = teclat.nextInt();
			
			System.out.print("Escriu el segon dels nombres: ");
			nombre2 = teclat.nextInt();
			
			System.out.print("Escriu la operaci� que vols fer" +
					"amb els dos nombres:\n" +
					" +  suma\n" + 
					" -  resta\n" + 
					" /  divisi� sencera\n" + 
					" %  m�dul (residu de la divisi�)\r\n" + 
					" *  multiplicaci�\r\n" + 
					" ^  elevat\n");
			operacio = teclat.next().charAt(0);
			
			switch (operacio) {
			case '+':
				resultat = suma(nombre1,nombre2);
				resText = "El resultat de sumar "
				+ nombre1
				+ " i "
				+ nombre2
				+ " �s "
				+ resultat;
				break;
				
			case '-':
				resultat = resta(nombre1,nombre2);
				resText = "El resultat de restar "
				+ nombre1
				+ " i "
				+ nombre2
				+ " �s "
				+ resultat;
				break;
				
			case '*':
				resultat = prod(nombre1,nombre2);
				resText = "El resultat de multiplicar "
				+ nombre1
				+ " i "
				+ nombre2
				+ " �s "
				+ resultat;
				break;
				
			case '/':
				resDecimal = divi(nombre1,nombre2);
				resText = "El resultat de dividir "
				+ nombre1
				+ " i "
				+ nombre2
				+ " �s "
				+ resDecimal;
				break;
				
			case '%':
				resultat = modul(nombre1,nombre2);
				resText = "El m�dul (la resta) de dividr "
				+ nombre1
				+ " i "
				+ nombre2
				+ " �s "
				+ resultat;
				break;
				
			case '^':
				resDecimal = potencia(nombre1,nombre2);
				resText = "El resultat de elevar "
				+ nombre1
				+ " a "
				+ nombre2
				+ " �s "
				+ resDecimal;
				break;
				
			default:
				resultat = -1;
				System.out.print("ERROR!");
				break;
			}
			teclat.close();
			if (resDecimal == -1) {
				System.out.print("La operaci� no es pot fer!");
			} else {
				System.out.print(resText);
			}
			do {
				System.out.print("Vols tornara fer una operaci� (S/N)?");
				seguir = Character.toLowerCase(teclat.next().charAt(0));
			} while ((seguir!='n') && (seguir!='s'));
		} while (seguir!='n');
	}

}
