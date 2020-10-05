import java.util.Scanner;

/**
 * program that finds a positive numbers factors
 * 
 * @author Darian
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * 
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // declare variables
    int number;
    int count = 1;
    int div = 1;
    // ask the user for a positive integer
    System.out.println("Please enter a positive integer to determine its factors:");
    number = input.nextInt();

    do {
      // check if the number is positive, if negative, restart
      if (number < 0) {
        System.out.println("Please enter a positive integer to determine its factors:");
        number = input.nextInt();

      } else {
      }
      // loop if number is negative
    } while (number < 0);

    System.out.println("The factors of " + number + " are:");

    // find the factors
    do {
      // check each number to see if it can be divided with no remainders
      if (number % div == 0) {
        System.out.println(div);
        count++;
        div++;
      } else {
        count++;
        div++;
      }
      // loop if count is less than or equal to number
    } while (count <= number);
  }
} 
