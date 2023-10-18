import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExampleTwo {
    public static void main(String[] args) {
        try {
            readFile("greetings.txt");
        } catch (FileNotFoundException exception) {
            System.out.println(exception.getMessage());
        } finally {
            System.out.println("Process Completed!");
        }
    }

    public static void readFile(String filename) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(filename);
        Scanner scanner = new Scanner(fis);
        System.out.println(scanner.nextLine());
        scanner.close();
    }
}
