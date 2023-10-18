import java.util.Scanner;
public class Param{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    double length = scan.nextDouble();
    double width = scan.nextDouble();
    double area = measureRectangle(length, width);

    System.out.println("return value: " + area);
}
  public static double measureRectangle(double length, double width) {
    double area =  length * width;
    System.out.println("The are of a rectangle is " + area);

    return area;
  }
}
