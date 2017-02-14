/**
 * <H1> CasiCero </H1>
 * This program especifies wether two numbers are equal or not by their difference
 * compared to a precision epsilon.
 * <br><br>
 * Two numbers are equal if:
 * (|a-b|)/(max(a, b)) < epsilon
 * <br><br>
 * For further information, contact the author via e-mail:
 * alu0100881622@ull.edu.es
 * 
 * @author Ernesto Echeverría González
 * @version 1.0.0
 * @since 13-02-2017
 */

public class CasiCero {
  public static void main(String[] args) {
    double a, b;
    final double EPSILON = 1E-16;
    
    a = 10.0;
    b = 10.000000000000001;
    
    System.out.print(a + " y " + b + " son iguales : ");
    if(Math.abs(a-b) <= (Math.max(a, b)*EPSILON))
    System.out.println("TRUE");
    else
    System.out.println("FALSE");
  }
}