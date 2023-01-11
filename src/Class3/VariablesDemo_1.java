package Class3;

public class VariablesDemo_1 {
    public static void main(String[] args) {

        int age = 10; // here requesting the computer to create a box of type int and store a value of 10 in it.
        int salary; // here only created a box of type int and don't assign any value to it.
        salary=120000; //  what do we call this box "updating a variable or reassigning a value
        System.out.println(salary);
        /* this is one type of string we can write variable in multiple line
        String name;
        String city;
        String country;
         */
        String name, city, country; // we can create multiple empty boxes in a single line of code or this is a shortcut of creating variables
        char gender, letter;
        name = "Mohammad"; // storing a value in the variable
        /* System.out.println(city); I have not stored anything inside the city variable that is why Java is confused
        and will have error
         */
        System.out.println(name);

    }
}
