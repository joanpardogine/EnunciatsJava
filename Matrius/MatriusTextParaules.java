import java.util.Arrays;

public class MatriusTextParaules {

  public static void main(String[] args) {
    
    String arrayInicial[] = new String[6];

    int comptador;
    
    arrayInicial[0]="En un lugar de la Mancha, de cuyo nombre no quiero acordarme";
    arrayInicial[1]="no ha mucho tiempo que viv�a un hidalgo de los de lanza en astillero";
    arrayInicial[2]="adarga antigua, roc�n flaco y galgo corredor.";
    arrayInicial[3]="Una olla de algo m�s vaca que carnero, salpic�n las m�s noches";
    arrayInicial[4]="duelos y quebrantos los s�bados, lantejas los viernes, alg�n palomino";
    arrayInicial[5]="de a�adidura los domingos, consum�an las tres partes de su hacienda.";

    System.out.println( "ABANS!");
    
    for (comptador = 0; comptador < arrayInicial.length; comptador++) {
        System.out.println( "La cadena de la posici� " + 
      		  comptador + " �s " + 
      		  arrayInicial[comptador] );  
      }    
    
    Arrays.sort(arrayInicial);
    
    System.out.println( "DESPRES!");
    
    for (comptador = 0; comptador < arrayInicial.length; comptador++) {
      System.out.println( "La cadena de la posici� " + 
    		  comptador + " �s " + 
    		  arrayInicial[comptador] ); 
    }
   }
}
