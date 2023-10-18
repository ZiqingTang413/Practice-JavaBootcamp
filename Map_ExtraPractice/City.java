package Map_ExtraPractice;

import javax.xml.transform.Source;

public class City {
    private String name;
    private String country;
    private long population;

    public City(City source) {
        setName(source.getName());
        setCountry(source.getCountry());
        setPopulation(source.getPopulation());

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("name cannot be null or blank");
        }
        this.name = name;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        if (country == null || country.isBlank()) {
            throw new IllegalArgumentException("country cannot be null or blank");
        }
        this.country = country;
    }

    public long getPopulation() {
        return this.population;
    }

    public void setPopulation(long population) {
        if (population <= 0) {
            throw new IllegalArgumentException("population cannot be less or equal to zero");
        }
        this.population = population;
    }

    public City(String name, String country, long population) {
        setName(name);
        setCountry(country);
        setPopulation(population);
    }
    

    
}
