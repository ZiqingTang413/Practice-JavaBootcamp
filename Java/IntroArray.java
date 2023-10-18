public class IntroArray {
  public static void main(String[] args) {
    String[] kingdoms = {"Mercia", "Wesex","Northumbria", "E  A"};
    System.out.println(kingdoms);
    for(int i = 0; i < 4; i++) {
      System.out.println(kingdoms[i]);
    }
    // array has an method : len
    System.out.println("length of the array is " + kingdoms.length);
  }
}
