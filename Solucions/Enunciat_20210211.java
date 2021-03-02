import java.util.Scanner;

public class Enunciat_20210211 {

  public static Scanner teclat = new Scanner(System.in);
  /*
0.5 p. mostrarMissatgePerPantalla(String cadena)
          retorna res
0.5 p. llegirEnterTeclat()
          retorna int
0.5 p. llegirCaracterTeclat()
          retorna char
1.0 p. llegirCadenaDeLletresTeclat()
          retorna String
          
0.5 p. comprovaEsEnter(Char valorLlegit)
          retorna boolean
          
1.5 p. comprovaEsLletra(Char valorLlegit)
          retorna boolean

2.0 p. mostrarMissatgePerPantallaSegonsSaltLinea(String cadena)
          retorna res
          
6.0 p. TOTAL

(4 punts)

Dins del main, desenvolupa el codi necessari per:

Crear una matriu, les dimensions de la qual, li demanaràs a l'usuari,
També li demanaràs a l'usuari si vol omplir la matriu amb majúscules, minúscules o 
unitats (és a dir, enters d'un sol dígit, valors entre 0 i 9 ambdós inclosos).
I en funció del que escolli l'usuari, i fent servir la funció aleatoriEntreDosNombres(minim,maxim)
omple la matriu.
Recorda que pots fer servir el codi de la taula ASCII per obtenir lletres majúscules, 
lletres minúscules o nombres enters.

Al final de l'execució d'aquest codi, li demanaràs a l'usuari si vol tornar a 
començar, i si respon que si, repetiràs tot el procés, i si respon que no, faràs 
aparèixer un missatge de comiat i s'acabarà l'execució del programa.

Fes servir totes les funcions que puguis.

*/
  
  public static void mostrarMissatgePerPantalla(String cadena) {
    // Escriu aqui el teu codi (0.5 punts)
  }

  
  public static int llegirEnterTeclat() {
    int enterLlegit = 0;
    // Escriu aqui la linea de codi (0.5 punts)
    return enterLlegit;
  }
  
  public static char llegirCaracterTeclat() {
    char caracterLlegit = ' ';
    // Escriu aqui la linea de codi (0.5 punts)
    return caracterLlegit;
  }

  public static String llegirCadenaDeLletresTeclat() {
    String cadenaLlegida ="";
    char caracterLlegit=' ';
    boolean esLletra = false;
    do {
      // caracterLlegit =  quina funció pots fer servir feta anteriorment? (0.5 punts)
      // esLletra       =  quina funció pots fer servir feta anteriorment? (0.5 punts)
      if (caracterLlegit != '#' && esLletra == true) {
        cadenaLlegida = cadenaLlegida + caracterLlegit; 
      } else {
        if (caracterLlegit != '#') {
          System.out.println("No és lletra, torna-hi!");
        }
      }
    } while(caracterLlegit != '#');
    
    return cadenaLlegida;
  }

  public static boolean comprovaEsLletra(char caracterRebut) {
    boolean esLletra = false;
    int codiASCII;
    codiASCII = (int) caracterRebut;
    /* caracter = 0 => ASCII = 48
       caracter = 9 => ASCII = 57
       caracter = A => ASCII = 65
       caracter = Z => ASCII = 90
       caracter = a => ASCII = 97
       caracter = z => ASCII = 122 */
    
    /* A les posicions (1), (2) i (3) (1.5 punts = 3 * 0.5 punts)
     *     hi van els operadors:
     *         && 
     *         o
     *         ||
     * has de dir quin va a cada posició. */
    if ( (codiASCII >= 65 && codiASCII <= 90) || 
         (codiASCII >= 97 && codiASCII <= 122)
       ) {
      esLletra = true;
    }
    return esLletra;
  }
  
  public static boolean comprovaEsEnter(char caracterRebut) {
    boolean esEnter = false;
    int codiASCII;
    codiASCII = (int) caracterRebut;
    // caracter = 0 => ASCII = 48
    // caracter = 9 => ASCII = 57
    if(codiASCII >= 48 && codiASCII <= 57) {
      // Escriu aqui la linea de codi (0.5 punts)
    }
    return esEnter;
  }
  
  
  
  public static void mostrarMissatgePerPantallaSegonsSaltLinea(String cadena, boolean ambSalt) {
    // Escriu aqui les teves linees de codi ( 2 punts )
  }
  
  
  public static int aleatoriEntreDosNombres(int nombrePetit, int nombreGran) {
	  int nombreAleatori;
	  nombreAleatori = (int) (Math.random() * (nombreGran+1 - nombrePetit) + nombrePetit);
	  return nombreAleatori;
  }
    
  public static void main(String[] args) {
    String missatgeAMostrar;
    String cadenaLlegida;
    boolean senseSaltDeLinia = false;
    
    missatgeAMostrar = "Entra una cadena de"
        + " caracters, pero entrant els"
        + " caracters d'un amb un,\n si"
        + " entres dos, o més, només"
        + " es llegirè el primer!\n";
    
    mostrarMissatgePerPantalla(missatgeAMostrar);
    mostrarMissatgePerPantallaSegonsSaltLinea(missatgeAMostrar, senseSaltDeLinia);
    
    cadenaLlegida = llegirCadenaDeLletresTeclat();
    
    mostrarMissatgePerPantalla("La cadena llegida és " + cadenaLlegida);    
  }

}
