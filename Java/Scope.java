public class Scope{
  // scope of the bananas spread inside the function
  static int bananas = 10; // access from anywhere from the class
  // every function / variable at the class level need to be static
  public static void main(String[] args){
    System.out.println("bananas " + bananas);
    someFunction();
  }
  public static void someFunction() {
    int apples = 5;
    System.out.println(apples); // error: cannot access a variavle outside the function scope
    System.out.println(bananas);
  }
}
