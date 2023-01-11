package class2;

public class StringAddition {
    public static void main(String[] args) {
        String firstName= "Mohammad";
        String lastName= "Alkozai";
        /*
        Java executes code from top to bottom but if we have multiple operation on the same line
        it executes them from left to right
         */
        System.out.println("*****"+firstName+" "+lastName+"*******");
        System.out.println("First Name = "+firstName);
        System.out.println("Last Name = " +lastName);

        System.out.println("10"+"10");

        // example : if you want to add space between name and last name also with String we can
        // combine any datatype

        String space=" ";
        System.out.println(firstName+space+lastName);
        System.out.println(firstName+" "+lastName);
        System.out.println(firstName+10);
        System.out.println(firstName+10.5);
        System.out.println(firstName+true);


    }
}
