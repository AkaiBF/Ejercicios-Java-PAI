/**
 * <H1> Rational numbers</h1>
 * A rational number is a kind of number conformed by a numerator and
 * a denominator. Bothof them are integer numbers and the denominator can't be
 * equal to zero.
 * <br>
 * 
 * Rational numbers are considered a superset of integer numbers and a subset of
 * real numbers
 * <br>
 * 
 * For further information, contact the author via e-mail: 
 * alu0100881622@ull.edu.es
 * 
 * @author Ernesto Echeverría González
 * @version 1.0.0
 * @since 10-02-2017
 */
 

public class Racional {
  private int numerador, denominador;
  
  /**
   * Constructor used by default. It will set the rational number 0/1 which is
   * the simplest way to write the rational number with a value equal to zero. 
   */
  public Racional() {
    numerador = 0;
    denominador = 1;
  }
  
  /**
   * Constructor used when both numerator and denominator are given.
   * 
   * @param numerador This is the numerator given.
   * @param denominador This is the denominator given.
   */
  public Racional(int numerador, int denominador) {
    this.numerador = numerador;
    this.denominador = denominador;
  }
  
  /**
   * Copy constructor.
   * 
   * @param original This is the original rational number to be copied.
   */
  public Racional(Racional original) {
    this.numerador = original.getNumerador();
    this.denominador = original.getDenominador();
  }
  
  /**
   * Getter del atributo numerador.
   * 
   * @return El atributo numerador.
   */
  public int getNumerador() {
    return numerador;
  }
  
  /**
   * Getter del atributo denominador.
   * 
   * @return El atributo denominador.
   */
  public int getDenominador() {
    return denominador;
  }
  
  /**
   * toString method. It uses the a/b syntax. If the denominator equals zero, it
   * returns an error string instead.
   * 
   * @return String <numerator>/<denominator> or "ERROR: El denominador no puede ser cero."
   */
  public String toString() {
    String cadena = numerador + "/" + denominador;
    if(denominador == 0)
      cadena = "ERROR: El denominador no puede ser cero.";
    return cadena;
  }
  
  /**
   * Addition method. It adds two rational numbers.
   * 
   * @param sumador Second rational number to be added to the object.
   * @return The result of the object plus the parameter.
   */
  public Racional suma(Racional sumador) {
    Racional resultado = new Racional();
    resultado.numerador = this.numerador + sumador.numerador;
    resultado.denominador = this.denominador + sumador.denominador;
    return resultado;
  }
  /**
   * Substraction method. It substracts two rational numbers.
   * 
   * @param minuendo Rational number to be substracted to the object.
   * @return The result of the object minus the parameter.
   */
  public Racional resta(Racional minuendo) {
    Racional resultado = new Racional();
    resultado.numerador = this.numerador - minuendo.numerador;
    resultado.denominador = this.denominador - minuendo.denominador;
    return resultado;
  }
  /**
   * Product method. It multiplies two rational numbers.
   * 
   * @param multiplicador Rational number to be multiplied by the object.
   * @return The result of the object per the parameter.
   */
  public Racional producto(Racional multiplicador) {
    Racional resultado = new Racional();
    resultado.numerador = this.numerador * multiplicador.numerador;
    resultado.denominador = this.denominador * multiplicador.denominador;
    return resultado;
  }
  /**
   * Divison method. It divides two rational numbers.
   * 
   * @param divisor Rational number to be used as the divider by the object.
   * @return The result of the object divided by the parameter.
   */
  public Racional division(Racional divisor) {
    Racional resultado = new Racional();
    resultado.numerador = this.numerador * divisor.denominador;
    resultado.denominador = this.denominador * divisor.numerador;
    return resultado;
  }
  /**
   * Method that returns the rational number which has the same "distance" to 
   * zero but is not the number given.
   * 
   * @return The opposite rational number of the object.
   */
  public Racional opuesto() {
    Racional resultado = new Racional(this);
    resultado.numerador -= 2*resultado.numerador;
    return resultado;
  }
  /**
   * Method that returns the rational number which is the result of dividing 1 
   * by the object.
   * 
   * @return The inverse rational number of the object.
   */
  public Racional inverso() {
    Racional resultado = new Racional(this);
    int auxiliar;
    auxiliar = resultado.numerador;
    resultado.numerador = resultado.denominador;
    resultado.denominador = auxiliar;
    return resultado;
  }
  /**
   * Main method. It creates two rational number, then shows the first one, adds both,
   * substracts both, multiplies them and divides them, and shows the opposite 
   * and inverse of the first one.
   * 
   */
  public static void main(String[] args) {
    Racional numeroRacional = new Racional(3, 5);
    Racional numeroRacional2 = new Racional(4, 3);
    
    System.out.print("El número es ");
    System.out.println(numeroRacional);
    System.out.print("La suma es ");
    System.out.println(numeroRacional.suma(numeroRacional2));
    System.out.print("La resta es ");
    System.out.println(numeroRacional.resta(numeroRacional2));
    System.out.print("El producto es ");
    System.out.println(numeroRacional.producto(numeroRacional2));
    System.out.print("El cociente es ");
    System.out.println(numeroRacional.division(numeroRacional2));
    System.out.print("El opuesto es ");
    System.out.println(numeroRacional.opuesto());
    System.out.print("El inverso es ");
    System.out.println(numeroRacional.inverso());
  }
}