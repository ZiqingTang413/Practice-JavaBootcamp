package Map_ExtraPractice;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
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


        System.out.println("-------- part3 ---------");
        Scanner scanner = new Scanner(System.in);


        String cityName = promptForCityName(scanner);


        String country = promptForCountry(scanner);


        int population = promptForPopulation(scanner);


        City newCity = new City(cityName, country, population);


        CityPopulationTracker tracker1 = new CityPopulationTracker();
        tracker1.addCity(newCity);


        System.out.println("City added to the tracker: " + newCity.getName());

    }
    

    public static boolean isNullOrBlank(String input) {
        // TODO
        if (input == null || input.isBlank())
            return true;
        else
            return false;
    }
    
    public static boolean incorrectPopulation(int population) {
        // TODO
        if (population <= 0)
            return true;
        else
            return false;

    }

    public static String promptForCityName(Scanner scanner) {
        while (true) {
            System.out.print("\nPlease enter a valid city name: ");
            String cityName = scanner.nextLine();
            // TODO

            if (!isNullOrBlank(cityName))
                return cityName;

        }

}

public static String promptForCountry(Scanner scanner) {
    while (true) {
        System.out.print("\nPlease enter a valid country: ");
        String country = scanner.nextLine();
        // TODO
        if (!isNullOrBlank(country))
            return country;
    }
}
public static int promptForPopulation(Scanner scanner) {
    while (true) {
        System.out.print("\nPlease enter a valid population (greater than 0): ");
        // First check if the next input is not an integer
        if (scanner.hasNextInt()) {
            int population = scanner.nextInt();

            if (!incorrectPopulation(population))
                return population;
        }  
        
    }
}


    
    
    
}
