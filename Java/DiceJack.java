import java.util.Scanner;
public class DiceJack{
  public static void main(String[] args) {
  // user imputs 3 numbers
  int sumInput = 0;
  int sumRoll = 0;

  Scanner scan = new Scanner(System.in);
  System.out.println("Please enter 3 integers between 1 and 6");
  for (int j = 1;j <= 3; j++) {
    int input = scan.nextInt();
    if (input < 1 || input > 6) {
      System.out.println("Numbers cannot be less than 1. Shutting the game down");
      System.exit(0);
    }
    sumInput += input;
  }
    scan.close();
  for(int i = 1; i <= 3; i++) {
    int roll = rollDice();
    sumRoll += roll;
    System.out.println(roll);
  }

  compare(sumInput, sumRoll);
  }
  //1. roll the DiceJack
  public static int rollDice() {
    double randomNum = Math.random() * 6;
    return (int)randomNum + 1; // type cast

  }
  // 2. Check if the user wins
  public static void compare(int sumInput, int sumRoll) {
    if (sumRoll < sumInput) {
      System.out.println("Win");
    }
    else System.out.println("Lose");
  }
}
