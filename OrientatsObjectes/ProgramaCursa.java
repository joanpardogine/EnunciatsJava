
public class ProgramaCursa {
	
	static int generarNumeroAleatori(int max,int min) {
		return (int)(Math.random()*(max-min)+min);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cursa carrera[] = new Cursa[3];
		carrera[0] = new Cursa(200);
		carrera[1] = new Cursa(400);
		//carrera[2] = new Cursa(800);
		carrera[2] = new Cursa();
		carrera[2].setMetres(800);
		carrera[0].setVoltes(generarNumeroAleatori(1,50));
		carrera[1].setVoltes(generarNumeroAleatori(1,50));
		carrera[2].setVoltes(generarNumeroAleatori(1,50));
		
		System.out.println("Informació distancia recorreguda");
		for (int i=0; i<carrera.length; i++) {
			System.out.println("Objecte "+i+" - "+carrera[i].distanciaRecorreguda());
		}
		
		System.out.println("Informació objecte");
		for (int i=0; i<carrera.length; i++) {
			System.out.println("Objecte"+i);
			System.out.println(carrera[i]);
		}

	}

}
