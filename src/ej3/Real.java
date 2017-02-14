/**
 * <H1> Class Real </H1>
 * This class stores a Real Number as a double.
 * <br><br>
 * It is implemented to be used with RealVector.java
 * <br><br>
 * 
 * For further information, contact with the author via e-mail:
 * alu0100881622@ull.edu.es
 * 
 * @author Ernesto Echeverría González
 * @version 1.0.0
 * @since 14-02-2017
 */


public class Real {
  private double realNumber;
  
  public Real() {
    double realNumber = 0.;
  }
  
  /**
   * Constructor method. It stores a real number given a double
   * 
   * @param realNumber Double to be stored as Real 
   */
  public Real(double realNumber) {
    this.realNumber = realNumber;
  }
  
  /**
   * Getter method
   * 
   * @return Real number as double
   */
  public double getReal() {
    return realNumber;
  }
  
  /**
   * toString method. It uses the Double.toString(<double>) method.
   * 
   * @return Real number as String
   */
  public String toString() {
    String salida = new String(Double.toString(realNumber));
    return salida;
  }
  
  /**
   * This method returns the biggest number of two given Real numbers.
   * <br><br>
   * 
   * Its implementation takes into account the fact that the method is finished
   * since a return sentence is executed. Because of that, else sentence is
   * not needed.
   * 
   * @param numeroReal One of two Real numbers to compare
   * @return The biggest of the two numbers
   */
  public Real major(Real numeroReal) {
    if(numeroReal.getReal() > realNumber)
    return numeroReal;
    return this;
  }
  
  /**
   * This method returns the difference between two Real numbers
   * 
   * @param numeroReal The subtrahend of the difference
   * @return The difference of the caller minus the parameter
   */
  public Real difference(Real numeroReal) {
    double newReal = realNumber - numeroReal.getReal();
    Real resultado = new Real(newReal);
    return resultado;
  }
}