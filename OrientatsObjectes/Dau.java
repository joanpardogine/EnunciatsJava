
public class Dau {

	// Atributs
	private final int cares;  // Constant
	private int tirada;
	
	// Constructor
	
	public Dau (int caresRebudes) {
		this.cares = caresRebudes;
		this.tirada = (int) (Math.random()*this.cares)+1;
	}
	
	// Metode
	
	public int llensar() {
		this.tirada = (int) (Math.random()*this.cares) + 1;
		return this.tirada;
	}
	
	// Getter
	public int getTirada() {
		return this.tirada;
	}
	
}
