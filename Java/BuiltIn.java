public class BuiltIn {
  public static void main(String[] args) {
    System.out.println("Hello");

    // built in math functions
    double sine = Math.sin(1.2);
    System.out.println("The sin of 1.2 is " + sine);

    double power = Math.pow(2,4);
    System.out.println("2 to the power of 4 is " + power);

    double random = Math.random(); //return a random value [0,1)
    System.out.println("The random value is " + random);
  }
}
