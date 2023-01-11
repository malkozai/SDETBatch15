package Class5;

public class SwitchCaseDemo {
    public static void main(String[] args) {

        /*
        inside switch case break means (Stop) and is important otherwise
        if break is not there java will execute all lines that break is not added.

        What is a switchCase statement:
        switch case statement is just another of achieving the same results as if-else-if conditions.

        Why should we lean about them:
        the reason we should use them is they are very fast.

        Syntax:
        String var:
        switch(var){
        case 1:
        sout"1"
        breaks:
        default:
        {otherwise output}
        }
         */

        int day = 7;
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Wrong day");

        }

    }
}
