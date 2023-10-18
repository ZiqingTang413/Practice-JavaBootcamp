import java.util.Scanner;
// Scanner: get input from the user
public class UseScanner {
  public static void main(String[] args) {
    // variable of type Scanner
    Scanner scan = new Scanner(System.in);
    // method of Scanner: 1. nextLine() - wait for the user to enter a String
    System.out.println("Welcome. Thank you for taking the survey");
    System.out.println("What is your name?");

    int counter = 0;
    counter++;
    // store the input in a variable
    String name = scan.nextLine();
    // 2. nextDouble()
    System.out.println("How much coffee do you spend on coffee?");
    double coffeePrince = scan.nextDouble();
    counter++;
    System.out.println("How much money do you spend on fast food?");
    double foodPrint = scan.nextDouble();
    counter++;
    // 3. nextInt
    System.out.println("How many times a week do you buy coffee?");
    int coffeeAmount = scan.nextInt();
    counter++;
    System.out.println("Thank you " + name + " for answering all "+counter+" questions.");
    scan.close();



  }
}
