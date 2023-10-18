package Static_Enums_Extrapractice;

import static Static_Enums_Extrapractice.Car.BodyType.*;

import Map_ExtraPractice.City;
import Map_ExtraPractice.CityPopulationTracker;

import static Static_Enums_Extrapractice.Car.*;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Camry", SEDAN, 2020, 30000);
        System.out.println(car1.getMake());

        // Uncomment the following line to test invalid input for setMake method
        // car1.setMake("");

        // Uncomment the following line to test invalid input for setModel method
        // car1.setModel("");

        // Uncomment the following line to test invalid input for setBodyType method
        // car1.setBodyType(null);

        // Uncomment the following line to test invalid input for setProductionYear method
        // car1.setProductionYear(1899);
        
        CityPopulationTracker tracker = new CityPopulationTracker();
    
    // Test the addCity method
    tracker.addCity(new City("New York", "USA", 8550405));
    tracker.addCity(new City("Los Angeles", "USA", 3971883));


    // Test the getCity method
    City nyCity = tracker.getCity("New York");
    System.out.println("Population of New York: " + nyCity.getPopulation());


    // Test the setCity method
    City updatedNyCity = new City("New York", "USA", 8600000);
    tracker.setCity(updatedNyCity);


    // Verify that the city data was updated
    nyCity = tracker.getCity("New York");
    System.out.println("Updated population of New York: " + nyCity.getPopulation());



    }
}
