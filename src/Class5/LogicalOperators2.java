package Class5;

public class LogicalOperators2 {
    public static void main(String[] args) {

        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && false);

        /*
        if the score in all the subjects are greater than 98 print brilliant student
        otherwise print you need to work hard
         */

        double mathScore = 92.5;
        double historyScore = 91.5;
        double scienceScore = 93.5;

        /*
        if (mathScore > 90.0) {
            if (historyScore > 90.0) {
                if (scienceScore > 90.0) {
                    System.out.println("You are a brilliant Student");
                } else {
                    System.out.println("You need to work harder in Science");
                }
            } else {
                System.out.println("You need to work harder in History");
            }
        } else {
            System.out.println("You need to work harder in Math");
        }
        */

        if(mathScore>90&&historyScore>90&&scienceScore>90){
            System.out.println("You are brilliant Student");

            }else{
            System.out.println("You need to work harder");
        }
    }
}
