package Class5;

import java.util.Scanner;

public class SwitchCaseDemo5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter your Gender M or F");
        char gender = scanner.next().charAt(0);

        switch (gender){
            case 'f':   // no break added and if we write f or F java will execute Female because break means stop in java.
            case 'F':
                System.out.println("Female");
                break;
            case 'm':
            case 'M':
                System.out.println("Male");
                break;
            default:
                System.out.println("Not specified");

              /*  char gender1 = 'm';
                switch (gender) {
                    case 'f':
                        System.out.println("Female");
                        break;
                    case 'F':
                        System.out.println("Female");
                        break;
                    case 'm':
                        System.out.println("Male");
                        break;
                    case 'M':
                        System.out.println("Male");
                        break;
                    default:
                        System.out.println("Not specified");
                } */
        }
    }
}
