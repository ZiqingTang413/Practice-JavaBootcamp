/*
 * @Descripttion: 
 * @version: 
 * @Author: Tang Ziqing
 * @Date: 2023-09-22 15:38:29
 * @LastEditors: Tang Ziqing
 * @LastEditTime: 2023-09-22 21:31:12
 */
import java.util.Arrays;
public class Car {
    // field is not visible anywhere else
    private String make;
    private double price;
    private int year;
    private String color;
    private String[] parts;
    // build a Constructor

    public Car(String make, double price, int year, String color, String[] parts) {
        this.make = make;
        this.price = price;
        this.year = year;
        this.color = color;
        this.parts = Arrays.copyOf(parts, parts.length);
    }
    
    // Create a constructor that defines one parameter

    public Car(Car source) {
        this.make = source.make;
        this.price = source.price;
        this.year = source.year;
        this.color = source.color;
        this.parts = Arrays.copyOf(source.parts, source.parts.length);
    }


    // Getter
    public String getMake() {
        return make;
    }

    public double getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public String[] getParts() {
        return Arrays.copyOf(this.parts, this.parts.length);
    }

    public void setParts(String[] parts) {
        this.parts = Arrays.copyOf(parts, parts.length);
    }

    public String getColor() {
        return color;
    }

    // Setter
    public void setMake(String make) {
        this.make = make;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }


    // println the object
    public String toString() {
        return "Make: " + this.make + ".\n"
                + "Price: " + this.price + ".\n"
                + "Year: " + this.year + ".\n"
                + "Parts: " + Arrays.toString(this.parts) + ".\n";
    }
    
    public void drive() {
        System.out.println("\n You bought the beuatiful " + this.make);
        System.out.println("Please drive your car to the nearest exit.\n");
    }
}
