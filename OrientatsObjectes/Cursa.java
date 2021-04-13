
public class Cursa {
	private int metres;
	private int voltes;
	
	public Cursa() {
		metres = 0;
		voltes = 0;
	}
	
	public Cursa (int m) {
		this.metres = m;
		voltes = 0;
	}
	
	//SETTERS
	public void setMetres(int m) {
		this.metres=m;
	}
	public void setVoltes (int v) {
		this.voltes = v;
	}
	
	//GETTERS
	public int getMetres() {
		return this.metres;
	}
	public int getVoltes() {
		return this.voltes;
	}
	
	//Altres mÃ¨todes
	public void incrementarVolta() {
		this.voltes++;
		//this.voltes = this.voltes +1;
	}
	public void incrementarVolta(int v) {
		this.voltes = this.voltes + v;
	}
	private void controlVoltaNegativa() {
		if (this.voltes<0) {
			this.voltes = 0;
		}
	}
	public void decrementarVolta() {
		this.voltes--;
		controlVoltaNegativa();
	}
	public void decrementarVolta(int v) {
		this.voltes = this.voltes-v;
		controlVoltaNegativa();
	}
	public int distanciaRecorreguda() {
		int calcul = this.voltes*this.metres;
		return calcul;
	}
	
	public String toString() {
		String valor;
		valor ="----INFORMACIÓ DE L'OBJECTE----\n";
		valor+= "Voltes = "+this.voltes+"\n";
		valor+= "Metres = "+this.metres+"\n";
		valor+= "Distancia recorreguda = "+distanciaRecorreguda()+"\n";
		valor+= "-------------------------------";
		return valor;
	}

}
