
public class ProgramaDausParxis {

	public static void main(String[] args) {
		
		DausParxis dausPerJugarParxis = new DausParxis();
		int jugades = 5;
		
		for (int i = 0; i < jugades; i++) {
			System.out.println("Tirada " 
					+ i + " de " + jugades 
					+ " la tirada és = " + dausPerJugarParxis.getTirada()
					+ " la tirada dau 1 és = " + dausPerJugarParxis.getTiradaDau1()
					+ " la tirada dau 2 és = " + dausPerJugarParxis.getTiradaDau2()
					+ " és cinc = " + dausPerJugarParxis.esCinc()
					+ " és doble = " + dausPerJugarParxis.doble() );
			dausPerJugarParxis.llensar();
		}

	}

}
