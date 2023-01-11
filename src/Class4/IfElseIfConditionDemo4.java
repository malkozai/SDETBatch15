package Class4;

public class IfElseIfConditionDemo4 {
    public static void main(String[] args) {

        int number1 = 10;
        int number2 = 10;

        /*
        if number 1 is equal to number2 on console => numbers are equal
        if number1>number2 => Number1 is greater than number2
        if number2>number1 => Number2 is greater that number1
         */

        if (number1 == number2) {
            System.out.println("Number 1 is Equal to Number 2");
        } else if (number1 >= number2) {
            System.out.println("Number 1 is Greater than Number 2");
        } else if (number2 >= number1) {
            System.out.println("Number 2 is Greater than Number 1");
        }

    }
}
