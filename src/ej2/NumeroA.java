/**
 * <H1> Numero A</h1>
 * This program counts the number of 'A' or 'a' characters within a given sentence.
 * <br>
 * 
 * It uses the String class and its methods <b>startsWith</b> and <b>indexOf</b>.
 * 
 * For further information, contact the author via e-mail: 
 * alu0100881622@ull.edu.es
 * 
 * @author Ernesto Echeverr&iacute;a Gonz&aacute;lez
 * @version 1.0.0
 * @since 10-02-2017
 */
import java.util.Scanner;
 
public class NumeroA {
  public static void main(String[] args) {
    
    //Se declara un dispositivo de entrada y pide una línea.
    Scanner input = new Scanner(System.in);
    System.out.print("Introduce una cadena de caracteres: ");
    String entrada = input.nextLine();
    System.out.println(entrada);
    int contador = 0;
    int position = 0;
    
    //Las siguientes líneas son necesarias para contar la primera letra de la frase.
    if(entrada.startsWith("a")) contador++;
    if(entrada.startsWith("A")) contador++;
    
    //Contamos las 'a'.
    while(position >= 0) {
      position = entrada.indexOf('a', position+1);
      //El condicional nos elimina la última iteración, ya que entra en el bucle una vez más.
      if(position != -1) contador++;
    }
    
    //Reseteamos y contamos las 'A' (se añaden sobre el contador de 'a').
    position = 0;
    while(position >= 0) {
      position = entrada.indexOf('A', position+1);
      if(position != -1) contador++;
    }
    
    System.out.println("El numero de caracteres a o A es: " + contador + ".");
  }
}