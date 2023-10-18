/*
 * @Descripttion: 
 * @version: 
 * @Author: Tang Ziqing
 * @Date: 2023-09-24 16:38:19
 * @LastEditors: Tang Ziqing
 * @LastEditTime: 2023-09-24 16:46:44
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExampleOne {
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("greetings.txt");
            Scanner scanner = new Scanner(fis); // read from the file that we connected to
            System.out.println(scanner.nextLine());
            scanner.close();
        } catch(FileNotFoundException exception) {
            System.out.println(exception.getMessage());
        } finally {
            System.out.println("Process Complete");  // finally will execute whatever happens
        }
    }
}
