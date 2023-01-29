package Class12;

public class CarTester {
    public static void main(String[] args) {
        /*
        if I want to use something from car class how we can do it?
        first we can create the object of the class

        inside the class the sequence does not matter
         */

        Car bmw = new Car();
        bmw.make = "BMW";
        bmw.model = "i7";
        bmw.year = 2023;
        bmw.color = "Gray";
        bmw.moveForward();
        bmw.applyBrakes();


        // Create two classes of your choice and call the methods from those classes
       // a single class can be used as many times as wanted

        Car audi = new Car ();
        audi.model = "E-tron";
        audi.make = "Audi";
        audi.year = 2023;
        audi.color = "Black";
        audi.moveForward();
        audi.applyBrakes();

    }
}
