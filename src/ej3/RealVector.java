/**
 * <H1> RealVector </H1>
 * 
 * This program reads a set of numbers from a file with name input.txt within
 * the same folder and stores them in an array. Then, looks for the biggest one 
 * and the smallest one, to calculate the difference between them and return it
 * <br><br>
 * 
 * For further information contact the author via e-mail:
 * alu0100881622@ull.edu.es
 * 
 * @author Ernesto Echeverría González
 * @version 1.0.0
 * @since 14-02-2017
 */

import java.io.File;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class RealVector {
  public static void main(String[] args) {
    ArrayList<Real> listaReal = new ArrayList<Real>();
    
    Scanner lector = null;
    File entrada = new File("input.txt");
    
    // The file reading must be done within a try statement. It can cause an 
    // exception if the file doesn't exist.
    try {
      lector = new Scanner(entrada);
      while(lector.hasNextLine()) {
        double lectura = lector.nextDouble();
        Real realAInsertar = new Real(lectura);
        listaReal.add(realAInsertar);
      }
    } 
    catch (FileNotFoundException e) {
        e.printStackTrace();
    }
    
    // We convert the dynamic ArrayList into a static array.
    Real vector[] = new Real[listaReal.size()];
    vector = listaReal.toArray(vector);
    
    // We insert the first element as the biggest and the smallest number readen.
    Real mayorReal = vector[0];
    Real menorReal = vector[0];
    
    for(int i = 0; i < listaReal.size(); i++) {
      if(vector[i] == mayorReal.major(vector[i]))
      mayorReal = vector[i];
      if(menorReal == vector[i].major(menorReal))
      menorReal = vector[i];
    }
    System.out.println("El rango es " + mayorReal.difference(menorReal) + ".");
  }
}