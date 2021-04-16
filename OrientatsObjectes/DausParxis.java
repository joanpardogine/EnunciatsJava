
public class DausParxis {
	
	// Atributs
	private Dau dau1;
	private Dau dau2;
	
	// Constructor
	public DausParxis() {
		dau1 = new Dau(6);
		dau2 = new Dau(6);
	}
	
	// Metode
	public int llensar() {
		dau1.llensar();
		dau2.llensar();
		
		return dau1.getTirada() + dau2.getTirada(); 
	}
	
	// Getters
	
	/* El valor de la suma d'ambdós daus. */
	public int getTirada() {
		return dau1.getTirada() + dau2.getTirada();
	}

	// El valor de cadascú dels dos daus.
	public int getTiradaDau1() {
		return dau1.getTirada();
	}

	public int getTiradaDau2() {
		return dau2.getTirada();
	}

	// Si ha sortit un valor doble (mateix valor en ambdós daus).
	public boolean doble() {
		boolean esDoble = false;
		if (this.getTiradaDau1() == this.getTiradaDau2()) {
			esDoble = true;
		}
		return esDoble;
	}
	
	// Si ha sortit un 5 en un dels dos daus.
	public boolean esCinc() {
		boolean unEsCinc = false;
		if (this.getTiradaDau1() == 5 || 
			this.getTiradaDau2() == 5) {
			unEsCinc = true;
		}
		return unEsCinc;
	}
	
	// Si ha sortit un doble cinc (un cinc en ambdós daus).
	public boolean esCincDoble() {
		boolean unEsCincDoble = false;
		if (this.getTiradaDau1() == 5 && 
			this.getTiradaDau2() == 5) {
			unEsCincDoble = true;
		}
		return unEsCincDoble;
	}
	
	// Si els valors d'ambdós daus sumen cinc.
	public boolean sumaEsCinc() {
		boolean laSumaEsCinc = false;
		if (this.getTirada() == 5) {
			laSumaEsCinc = true;
		}
		return laSumaEsCinc;
	}

}
