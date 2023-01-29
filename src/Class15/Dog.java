package Class15;

public class Dog {

    String name; // this one is called instance variables
    String breed; // it is also instance variables
    String color; // it is also instance variables


    static int noOfLeg = 4; // static variable always starts with static

    void printFood(){
        System.out.println(name);
        String food = "meat"; // local variable
        System.out.println(food);
    }

    void printColor(){
       // System.out.println(food); // this is local therefore we get error
        System.out.println(name); // instance of method we can access it anywhere
    }
}
