package example.e02_collections;

import java.util.ArrayList;

public class CollectionsExample {

    /**
     * <a href="https://www.w3schools.com/java/java_arraylist.asp">Java ArrayList</a>
     */
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
    }
}
