import java.util.Arrays;
// Arrays.toString
// Arrays.copy

public class TDArrays {
  public static void main(String[] args) {
    int[][] grades = new int[3][4]; // 3 rows * 4 columns
    System.out.println(Arrays.toString(grades[0]));
    System.out.println(Arrays.toString(grades[1]));
    System.out.println(Arrays.toString(grades[2]));

    int[][] grade = {
      {72, 74, 78, 76}
      ,{65, 64, 61, 67}
      ,{95, 98, 99, 100}

    };
    System.out.print(Arrays.toString(grade)); // 3 references
    System.out.println(Arrays.toString(grade[0]));
    System.out.println(Arrays.toString(grade[1]));
    System.out.println(Arrays.toString(grade[2]));
  }
}
