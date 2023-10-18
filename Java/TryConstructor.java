/*
 * @Descripttion: 
 * @version: 
 * @Author: Tang Ziqing
 * @Date: 2023-09-22 15:35:28
 * @LastEditors: Tang Ziqing
 * @LastEditTime: 2023-09-22 17:41:31
 */
public class TryConstructor {
    // call the constructor while creating a new Car object
    public static void main(String[] args) {
        String[] spareParts = new String[] {"Tired", "Keys"}; // keyword: new ->create a new object
        Car nissan = new Car("Nissan", 10000, 2020, "Green", spareParts);

        Car dodge = new Car("Dodge", 11000, 2019, "Blue", spareParts);
        // call the copy constructor
        Car nissan2 = new Car(nissan);


        nissan.setColor("Jet Black");
        dodge.setPrice(20000);
        System.out.println(nissan.getMake() + ", " + nissan.getPrice() + ", " + nissan.getYear() + ", " + nissan.getColor());
        System.out.println(dodge.getMake() + ", " + dodge.getPrice() + ", " + dodge.getYear() + ", " + dodge.getColor());
        
        System.out.println(nissan2);
    }

}
