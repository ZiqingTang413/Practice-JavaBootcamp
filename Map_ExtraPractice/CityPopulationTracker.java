package Map_ExtraPractice;

import java.util.HashMap;

public class CityPopulationTracker {
    private HashMap<String, City> cityPopulations;


    public CityPopulationTracker() {
        this.cityPopulations = new HashMap<>();
    }

    public City getCity(String cityName) {
        City city = new City(this.cityPopulations.get(cityName));
        return city;

    }

    public void setCity(City city) {
        this.cityPopulations.put(city.getName(), new City(city));
    }

    public void addCity(City city) {
        this.cityPopulations.put(city.getName(), new City(city));
    }
    
}
