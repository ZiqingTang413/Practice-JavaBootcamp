public class DocComment {
  /**
   * Function name: greet
   *
   * Inside the Function:
   * 1. print out "Hi"
  */
  public static void greet(){
    System.out.println("Hi");
  }
  /**
   * Function name: printText
   * @param name (String)
   * @param age (String)
   *
   *
   * Inside the Function:
   * 1. prints the name and age as part of the text

  */

  public static void printText(String name, String age)
{
  System.out.println("Hi, I am " + name + "and I am " + age +"years old.");

}
  /**
    * @para length (double)
    * @para width (double)
    * @return     (double)

    * Inside the function:
    * 1. calculates the area and returns it
    */
  public static double calArea(double length, double width) {
    double area = length * width;
    return area;
  }
}
