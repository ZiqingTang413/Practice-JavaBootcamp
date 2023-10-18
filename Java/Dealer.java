/*
 * @Descripttion: 
 * @version: 
 * @Author: Tang Ziqing
 * @Date: 2023-09-22 17:45:18
 * @LastEditors: Tang Ziqing
 * @LastEditTime: 2023-09-22 21:33:58
 */
import java.util.Scanner;
public class Dealer {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        Car[] cars = new Car[] {
                new Car("Nissan", 5000, 2020, "red", new String[] { "tires", "keys" }),
                new Car("Dodge", 8500, 2019, "blue", new String[] { "tires", "keys" }),
                new Car("Nissan", 5000, 2017, "yellow", new String[] { "tires", "filter" }),
                new Car("Honda", 7000, 2019, "orange", new String[] { "tires", "filter" }),
                new Car("Mercedes", 12000, 2015, "jet black", new String[] { "tires", "filter", "transmission" })
        };

        DealerShip dealerShip = new DealerShip(cars);
        
        cars[3] = new Car("Hyundai", 7000, 2019, "orange", new String[] { "tires", "filter" });

        System.out.println("\n ***** JAVA DEALERSHIP! ****** \n");
        System.out.println("Fell free to browse through our collection of cars.\n");
        System.out.println(dealerShip);
        System.out.println("Which car are you interested in? \n");

        int index = scan.nextInt();
        dealerShip.buy(index);


        scan.close();
        
    }
}
