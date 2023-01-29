package Class8;

import java.util.Scanner;

public class LoopWithString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner((System.in));

        while(scanner.next().equalsIgnoreCase("Mohammad")){
            System.out.println("Great student who always wanted an example with String in loop");
        }
    }
}
