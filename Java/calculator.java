import java.util.*;
class Calculayor{
  public static void main(String[] args) {
    // math algorithm
    /*
    */
    Scanner input = new Scanner(System.in);

    System.out.printIn("Please enter an number:");
    int one = input.nextInt();

    System.out.printIn("Enter another number");
    int two = input.nextInt();

    System.out.printIn("Enter the operator");
    int operator = input.nextInt(); // 1+ 2- 3* 4/
    if(operator == 1){
      System.out.printIn(one + two);
    }else if(operator == 2){
      System.out.printIn(one - two);
    }else if(operator == 3){
      System.out.printIn(one * two);
    }else if(operator == 4){
      System.out.printIn(one / two);
    }else{
      System.out.printIn("error");
    }


  }
}
