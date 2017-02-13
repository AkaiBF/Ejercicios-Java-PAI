/**
 * <H1>Class Date</H1>
 * This class stores a date using three integers: day, month and year. It also
 * displays that date in the format dd/mm/yyyy.
 *  
 * For further information, contact the author via e-mail:
 * alu0100881622@ull.edu.es
 * 
 * @author Ernesto Echeverr&iacute;a Gonz&aacute;lez
 * @version 1.0.0
 * @since 13-02-2017
 */

import java.util.Scanner;
import java.util.Formatter;

public class Date {
  
  private int day, month, year;
  
  public Date(){
    day = 1;
    month = 1;
    year = 2000;
  }
  
  /**
   * Constructor method. It receives the date as three separated integer numbers.
   * 
   * @param day The day of the date given.
   * @param month The month of the date given.
   * @param year The year of the date given.
   */
  public Date(int day, int month, int year){
    this.day = day;
    this.month = month;
    this.year = year;
  }
  
  /**
   * This method converts the date as String to an object of this class. For that 
   * purpose, it splits the String into three Integer numbers.
   * 
   * @param fecha A date as String
   */
  public Date(String fecha) {
    Scanner entrada = new Scanner(fecha).useDelimiter("/");
    day = entrada.nextInt();
    month = entrada.nextInt();
    year = entrada.nextInt();
  }
  
  /**
   * This method converts the date into a String.
   * 
   * @return The date as a String with format dd/mm/yyyy
   */
  public String toString() {
    String cad = new String(String.format("%02d", day) + "/" + String.format("%02d", month) + "/" + String.format("%04d", year));
    return cad;
  }
  
  /**
   * It compares two dates and returns the difference between them. The earlier
   * date is the one which calls this method, while the parameter is the later one.
   * 
   * It is designed to know the age of a person using the birthday as the caller
   * and the present day as parameter.
   * 
   * @param fecha Later date to compare with the earlier one.
   * @return Difference in years between two dates.
   */
  int resta(Date fecha) {
    int resultado = fecha.year - this.year;
    if(fecha.month < this.month) {
      resultado--;
    }
    if((fecha.month == this.month) && (fecha.day < this.day)) {
      resultado--;
    }
    return resultado;
  }
}