package Class9;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        /*
        Create a program that will be asking user to apply for a credit card 10 times.
     As soon you get an “yes” from a user program should stop asking
     what method we should follow: for loop because we know how many time we have to repeat the code
         */


        Scanner user = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
        System.out.println("Do you want a credit card?");
        String userResponse = user.next();
        if(userResponse.equalsIgnoreCase("yes")){
        break;
            }

        }
    }
}
