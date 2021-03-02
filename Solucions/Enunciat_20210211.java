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
    System.out.print(cadena);
  }

  
  public static int llegirEnterTeclat() {
    int enterLlegit = 0;
    // Escriu aqui la linea de codi (0.5 punts)
    enterLlegit = teclat.nextInt();
    return enterLlegit;
    // return teclat.nextInt();
  }
  
  public static char llegirCaracterTeclat() {
    char caracterLlegit = ' ';
    // Escriu aqui la linea de codi (0.5 punts)
    caracterLlegit = teclat.next().charAt(0);
    return caracterLlegit;
  }


  public static int llegirSegurEnter() {
    
    char caracterLlegit=' ';
    int enterLlegit = 0;
    boolean esNombre = false;
    do {
      // caracterLlegit =  quina funció pots fer servir feta anteriorment? (0.5 punts)
      caracterLlegit = llegirCaracterTeclat();
      // esLletra       =  quina funció pots fer servir feta anteriorment? (0.5 punts)
      esNombre = comprovaEsEnter(caracterLlegit);
      if (esNombre == true) {
        enterLlegit = Character.getNumericValue(caracterLlegit); 
      } else {
          System.out.println("No és nombre, torna-hi!");
      }
    } while (esNombre != true);
    
    return enterLlegit;
  }

  public static String llegirCadenaDeLletresTeclat() {
    String cadenaLlegida ="";
    char caracterLlegit=' ';
    boolean esLletra = false;
    do {
      // caracterLlegit =  quina funció pots fer servir feta anteriorment? (0.5 punts)
      caracterLlegit = llegirCaracterTeclat();
      // esLletra       =  quina funció pots fer servir feta anteriorment? (0.5 punts)
      esLletra = comprovaEsLletra(caracterLlegit);
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
      esEnter = true;
    }
    return esEnter;
  }
  
  public static void mostrarMissatgePerPantallaSegonsSaltLinea(String cadena, boolean ambSalt) {
    // Escriu aqui les teves linees de codi ( 2 punts )
    if (ambSalt == true){
      System.out.println(cadena);
      // System.out.print(cadena + "\n");
    } else { // (ambSalt == false)
      System.out.print(cadena);
    }
  }
  
  
  public static int aleatoriEntreDosNombres(int nombrePetit, int nombreGran) {
	  int nombreAleatori;
	  nombreAleatori = (int) (Math.random() * (nombreGran+1 - nombrePetit) + nombrePetit);
	  return nombreAleatori;
	  // return (int) (Math.random() * (nombreGran+1 - nombrePetit) + nombrePetit);
  }


  public static int[][] ompleMatriu(int files, int columnes, char tipusPerOmplirMatriu){
/** si tipusPerOmplirMatriu = M en Majúscules
/** si tipusPerOmplirMatriu = m en Minúscules
/** si tipusPerOmplirMatriu = e en enters  */
    int max=0, min=0;
    switch (tipusPerOmplirMatriu) {
      case 'M':
        min = 65; max = 90; break;
      case 'm':
        min = 97; max = 122; break;
      case 'e':
        min = 48; max = 57; break;
      };

    int[][] matriuPlena = new int [files][columnes];
    for (int i=0; i<matriuPlena.length; i++){
      for (int j=0; j<matriuPlena[i].length; j++){
        matriuPlena[i][j]=aleatoriEntreDosNombres(min,max);
      }
    }
    return matriuPlena;
  }

  public static void mostraMatriuEnters(int [][] matEnters){
    for (int i = 0; i < matEnters.length; i++){
      for (int j = 0; j < matEnters[i].length; j++){
        System.out.print((char)matEnters[i][j]);
        if (j<matEnters[i].length-1){
          System.out.print(" - ");
        }
      }
      System.out.println();
    }

  }


  public static void main(String[] args) {


    // boolean senseSaltDeLinia = false;
    int files = 0, columnes = 0;
    char perOmplirMatriu, perAcabar;
    boolean volsAcabar = false;
    boolean pucAcabar = false; 

    int[][] matriu;

    do {   /// REPETIR per acabar  (volsAcabar == false);
      mostrarMissatgePerPantallaSegonsSaltLinea("Entra les files de la matriu: ", false);
      files = llegirSegurEnter();

      mostrarMissatgePerPantallaSegonsSaltLinea("Entra les columnes de la matriu: ", false);
      columnes = llegirSegurEnter();
      
      mostrarMissatgePerPantallaSegonsSaltLinea("Si vols en Majúscules (M),\n" + 
         " si vols en Minúscules (m),\n" + 
        " si vols en enters (e): ", false);

      matriu = new int[files][columnes];
      pucAcabar = false;
      volsAcabar = false;

      do {   /// REPETIR per perOmplirMatriu
        perOmplirMatriu = llegirCaracterTeclat();
        
        if ( (perOmplirMatriu == 'M') || (perOmplirMatriu == 'm') || (perOmplirMatriu == 'e') ) {
          pucAcabar = true;
          matriu = ompleMatriu(files, columnes, perOmplirMatriu);
        } else { // ( !( (perOmplirMatriu == 'M') || (perOmplirMatriu == 'm') || (perOmplirMatriu == 'e') ) )
          mostrarMissatgePerPantallaSegonsSaltLinea("Si us plau entra un dels valors " 
          + " si vols Majúscules (M),\n"
          + " si vols Minúscules (m),\n"
          + " si vols enters (e): ", false);
        }
      } while (pucAcabar == false);
      mostraMatriuEnters(matriu);
      
      mostrarMissatgePerPantallaSegonsSaltLinea("Vols acabar (S/N): ", false);
      perAcabar = llegirCaracterTeclat();
      if(perAcabar == 's'){
        volsAcabar = true;
      }

    } while (volsAcabar == false);


     System.out.println("FINAL!");




/*
    missatgeAMostrar = "Entra una cadena de"
        + " caracters, pero entrant els"
        + " caracters d'un amb un,\n si"
        + " entres dos, o més, només"
        + " es llegirè el primer!";
    
    // mostrarMissatgePerPantalla(missatgeAMostrar);
    mostrarMissatgePerPantallaSegonsSaltLinea(missatgeAMostrar, false);
    
    cadenaLlegida = llegirCadenaDeLletresTeclat();
    
    mostrarMissatgePerPantalla("La cadena llegida és " + cadenaLlegida);
    */

  }

}
