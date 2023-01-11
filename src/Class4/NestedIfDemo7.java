package Class4;

public class NestedIfDemo7 {
    public static void main(String[] args) {

        /*
        If Else / Nested If Conditions:
        If i have to test the same variable for multiple conditions i should use IF Else If.
        If i have multiple conditions and these conditions are dependent on each other i should use Nested If condition.
         */

        boolean studyHard = true;
        int salary = 90000;

        if(studyHard) {
            System.out.println("We got the Job");

            if(salary>100000){
                System.out.println("Lets buy Tesla");
            }else{
                System.out.println("Lets buy Toyota");
            }

        }else{
            System.out.println("It might take a little longer for us to get the job");
        }
    }
}
