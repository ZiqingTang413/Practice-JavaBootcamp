/*
 * @Descripttion: 
 * @version: 
 * @Author: Tang Ziqing
 * @Date: 2023-09-24 17:09:23
 * @LastEditors: Tang Ziqing
 * @LastEditTime: 2023-09-24 17:21:02
 */


import java.util.Scanner;

public class InputCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        User user = new User();

        System.out.println("We are setting up your user account");

        System.out.println("Your username is currently: " + user.getUsername() + ", please update it here");
        user.setUsername(scanner.nextLine());
        System.out.println("Your age is currently: " + user.getAge() + ", please update it here");
        if (scanner.hasNextInt()) {
            int age = scanner.nextInt();
            user.setAge(age);
        }
        

        scanner.close();
        
    }
}
