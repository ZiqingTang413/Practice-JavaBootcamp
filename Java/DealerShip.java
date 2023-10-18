/*
 * @Descripttion: 
 * @version: 
 * @Author: Tang Ziqing
 * @Date: 2023-09-19 23:23:39
 * @LastEditors: Tang Ziqing
 * @LastEditTime: 2023-09-22 21:33:41
 */
import java.util.Arrays;
public class DealerShip {
  private Car[] cars;

  public DealerShip(Car[] cars) {
    // the method below will lead to copy the reference of parts!!
    // this.cars = Arrays.copyOf(cars, cars.length);

    // so we need --- deep copy
    // create a new Car[]
    this.cars = new Car[cars.length];

    // deep copy every element 
    for (int i = 0; i < this.cars.length; i++) {
      this.cars[i] = new Car(cars[i]); // use the constructor for Car
    }
  }


  public String toString() {
    String temp = "";
    for (int i = 0; i < this.cars.length; i++) {
      temp += "Parking Spot" + i + "\n";
      String carDescrption = this.cars[i].toString(); // car.toString()
      temp += carDescrption + "\n";
    }
    return temp;
  }

  public void buy(int index) {
    if(index >= this.cars.length || index < 0){
      System.out.println("Error");
      return;
    }
    else {
      this.cars[index].drive();
      return;
    }
  }

}