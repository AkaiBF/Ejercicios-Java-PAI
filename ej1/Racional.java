

class Racional {
  int numerador, denominador;
  
  public Racional() {
    numerador = 0;
    denominador = 1;
  }
  
  public Racional(int numerador, int denominador) {
    this.numerador = numerador;
    this.denominador = denominador;
  }
  
  public String toString() {
    String cadena = numerador + "/" + denominador;
    if(denominador == 0)
      cadena = "ERROR: El denominador no puede ser cero";
    return cadena;
  }
  
  public Racional suma(Racional sumador) {
    Racional resultado = new Racional();
    resultado.numerador = this.numerador + sumador.numerador;
    resultado.denominador = this.denominador + sumador.denominador;
    return resultado;
  }
  public Racional resta(Racional minuendo) {
    Racional resultado = new Racional();
    resultado.numerador = this.numerador - minuendo.numerador;
    resultado.denominador = this.denominador - minuendo.denominador;
    return resultado;
  }
  public Racional producto(Racional multiplicador) {
    Racional resultado = new Racional();
    resultado.numerador = this.numerador * multiplicador.numerador;
    resultado.denominador = this.denominador * multiplicador.denominador;
    return resultado;
  }
  public Racional division(Racional divisor) {
    Racional resultado = new Racional();
    resultado.numerador = this.numerador * divisor.denominador;
    resultado.denominador = this.denominador * divisor.numerador;
    return resultado;
  }
  
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
  }
}