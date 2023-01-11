package Class4;

public class IfElseIfConditionDemo3 {
    public static void main(String[] args) {

        int day = 1; // we use one equal (=) sign to assign a value to a variable
        if(day==1){ // we use two equals (==) sign to compare two values
            System.out.println("Monday");
        }else if(day == 2) {
            System.out.println("Tuesday");
        }else if(day == 3) {
            System.out.println("Wednesday");
        }else if(day == 4) {
            System.out.println("Thursday");
        }else if(day == 5) {
            System.out.println("Friday");
        }else if(day == 6) {
            System.out.println("Saturday");
        }else if(day == 7) {
            System.out.println("Sunday");

            /* this examples: if there is no selection made for the day java will use the last option
            }else{ and will print that.
            int day = 8; // we use one equal (=) sign to assign a value to a variable
            if(day==1){ // we use two equals (==) sign to compare two values
                System.out.println("Monday");
            }else if(day == 2) {
                System.out.println("Tuesday");
            }else if(day == 3) {
                System.out.println("Wednesday");
            }else if(day == 4) {
                System.out.println("Thursday");
            }else if(day == 5) {
                System.out.println("Friday");
            }else if(day == 6) {
                System.out.println("Saturday");
            }else if(day == 7) {
                System.out.println("Sunday");
            }else{
                System.out.println("Please enter a day between 1 and 7");
            }

             */
        }

    }

}
