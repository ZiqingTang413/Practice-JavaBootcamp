package Static_Enums_Extrapractice;

public class Car {
    private String make;
    private String model;
    //private String bodyType;  // Should this really be a String?
    private BodyType bodyType;
    private int productionYear;
    private double price;
    

    // use an enum to define BodyType
    public enum BodyType {
        SEDAN, COUPE, HATCHBACK, SUV, VAN, TRUCK
    }

    public static final int MIN_YEAR = 1900;
    // static: access by Class.valuename
    // final: the value cannot be changed

    public static final double MIN_PRICE = 0;
    public static final double MAX_PRICE = 200_000;
    // Car car1 = new Car("Toyota", "Camry", SEDAN, 2020, 30000);
    public Car(String make, String model, BodyType bodyType, int productionYear, double price) {
        this.setMake(make);
        this.setModel(model);
        this.setBodyType(bodyType);
        this.setProductionYear(productionYear);
        this.setPrice(price);
    }

    public Car(Car source) {
        this.setMake(source.make);
        this.setModel(source.model);
        this.setBodyType(source.bodyType);
        this.setProductionYear(source.productionYear);
        this.setPrice(source.price);
    }
    public String getMake() {
        return this.make;
    }

    public void setMake(String make) {
        if (make == null || make.isBlank()) {
            throw new IllegalArgumentException("Make cannot be null or blank");
        }
        this.make = make;

    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        if (model == null || model.isBlank()) {
            throw new IllegalArgumentException("Model cannot be null or blank");
        }
        this.model = model;
    }

    public BodyType getBodyType() {
        return this.bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        if (bodyType == null) {
            throw new IllegalArgumentException("BodyType cannot be null ");
           
        }
        this.bodyType = bodyType;

    }

    public int getProductionYear() {
        return this.productionYear;
    }

    public void setProductionYear(int productionYear) {
        if (productionYear < MIN_YEAR) {
            throw new IllegalArgumentException("Productionyear  cannot be less than 1900 ");
        }
        this.productionYear = productionYear;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        if (price < MIN_PRICE || price > MAX_PRICE) {
            throw new IllegalArgumentException("Price should between 0 - 200_000");
        }
        this.price = price;
    }

    
}
