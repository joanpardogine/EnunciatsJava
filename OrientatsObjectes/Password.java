/**
 * Fes una classe anomenada Password que segueixi les següents condicions:
 * Que tingui els atributs de 
 * 	longitud i 
 * 	contrasenya. Per defecte, la longitud serà de 8.
 * 
 * Els constructors seran els següent:
 * 	Un constructor per defecte.
 * 	Un constructor amb la longitud que nosaltres li passem.
 * 		S'ha de generar una contrasenya aleatòria amb aquesta longitud.
 * Els mètodes que implementa seran:
 * 	esFort(): retorna un booleà si és forta o no.
 * 			Perquè sigui forta ha de tenir
 * 		més de 2 majúscules,
 * 		més d'1 minúscula i 
 * 		més de 5 números.
 * 
 * 	generarPassword(): genera la contrasenya de l'objecte amb la longitud que tingui.
 * 
 * 	Mètodes “getters” per a tots els atributs.
 * 	Mètode set per longitud.
 * */

public class Password {
	// Constant 
	private final static int LONG_DEF=8;
	
	// Atributs
	private int longitud;
	private String contrasenya;
	
	// Constructors
	public Password() {
		this(LONG_DEF);
	}
	
	public Password (int longitudRebuda) {
		this.longitud = longitudRebuda;
		this.contrasenya = generarPassword();
	}
	
	
	// Getters
	public int getLongitud() {
		return this.longitud;
	}
	
	public String getContrasenya() {
		return this.contrasenya;
	}
	
	// Setters
	public void setLongitud(int novaLongitud) {
		this.longitud = novaLongitud;
	}
	
	// metodes
	
	/* Genera una contrasenya aleatòria de la longitud definida.
	 * @return contrasenya
	 *  */
	public String generarPassword(){
		String password="";
		for (int i=0; i < this.longitud; i++) {
			// generem nombre atzar entre 1 i 3 per decidir caracter
			// 1 - minúscula
			// 2 - majúscula
			// 3 - nombre
			int eleccio = ((int) Math.floor(Math.random()*3+1));
			if (eleccio == 1) {  // 1 - minúscula
				char minuscula  = (char)((int)Math.floor(Math.random()*(123-97)+97));
				password+=minuscula; //password = password + minuscula;
			} else {
				if (eleccio == 2) {  // 2 - majúscula
					char majuscula  = (char)((int)Math.floor(Math.random()*(91-65)+65));
					password+=majuscula; //password = password + majuscula;
				} else {
					char nombre = (char)((int)Math.floor(Math.random()*(58-48)+48));
					password+=nombre; //password = password + nombre;
				}
			}
		}
		return password;
	}
	
	/* esFort(): retorna un booleà si és forta o no.
	 *  Perquè sigui forta ha de tenir
	 * 		més de 2 majúscules,
	 * 		més d'1 minúscula i 
	 * 		més de 5 números.
	 *  @return boolean
	 */
	
	public boolean esFort() {
		int comptaNombres=0;
		int comptaMinuscules=0;
		int comptaMajuscules=0;
		boolean esForta = false;
		// Comptar caràcter a caràcter per comprobar
		// el tipus de caràcter que és.
		for (int i=0; i<this.contrasenya.length();i++) {
			if( this.contrasenya.charAt(i)>=97 && 
				this.contrasenya.charAt(i)<=122){
				comptaMinuscules++;
			} else {
				if( this.contrasenya.charAt(i)>=65 && 
					this.contrasenya.charAt(i)<=90){
					comptaMajuscules++;
				} else {
					comptaNombres++;
				}
			}
		}
		if (comptaNombres>=5 && 
			comptaMinuscules>=1 &&
			comptaMajuscules>=2) {
			esForta = true;
		}
		return esForta;
	}
	
}
