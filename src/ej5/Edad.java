/**
 * <H1> Edad </H1>
 * This program shows the user's age when given his birthday and the present day.
 * This parameters are readen by the command line and must have the format dd/mm/yyyy
 * 
 * It uses the class Date included in this folder.
 * 
 * For further information, contact the author via e-mail:
 * alu0100881622@ull.edu.es
 * 
 * @author Ernesto Echeverr&iacute;a Gonz&aacute;lez
 * @version 1.0.0
 * @since 13-02-2017
 */

public class Edad{
  public static void main(String[] args){
    Date birthday = new Date(args[0]);
    Date thisday = new Date(args[1]);
    
    System.out.println("Tiene usted " + birthday.resta(thisday) + " años.");
  }
}