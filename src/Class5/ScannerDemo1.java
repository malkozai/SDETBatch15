package Class5;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        /* Scanner: Name of the class
           scan: is just a variable like we create primitive variable
           =: is just an assignment operator
           new: this will reserve space in the computer
           System.in: tell the computer we want to read the data from keyboard.
         */
//        System.out.println("Please Enter you age");
//        int age = scan.nextInt();
//        System.out.println("you are "+age+" Years old");
//
//        System.out.println("Please Enter you weight");
//        double weight = scan.nextDouble();
//        System.out.println("your weight is "+weight+" Kgs");
//        System.out.println("Are you hungry?");
//        boolean hungry = scan.nextBoolean();
//        System.out.println("Hungry "+hungry);
//
//        System.out.println("Please Enter your gender");
//        char gender = scan.next().charAt(0);
//        // charAt (0) Zero in bracket means java pick the first alphabet of the user input.
//
        System.out.println("Please Enter your name");
        String name = scan.next();
        System.out.println("Your name is "+name);

        scan.nextLine(); // this trick to make nextLine method work we have used any other method from Scanner class
        System.out.println("Please Enter you full name");
        String fullName = scan.nextLine();
        System.out.println("Your full name "+fullName);
        scan.close(); // Good practice because it will free space




    }
}
