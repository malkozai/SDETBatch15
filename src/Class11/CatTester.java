package Class11;

public class CatTester {
    public static void main(String[] args) {

        // creating an object from the Cat class
        Cat cat1 = new Cat();

        // we can also assign name and other attributes
        cat1.name = "Cloudy";
        cat1.breed = "Van Cat";
        cat1.age = 2;
        cat1.color = "Gray";
        cat1.weight = 1.5;

        cat1.eat();
        cat1.speak();

        Cat cat2 = new Cat();
        cat2.name = "Loki";
        cat2.breed = "Domestic";
        cat2.color = "White";

        cat2.sleep();
        System.out.println(cat2.breed);
    }
}
