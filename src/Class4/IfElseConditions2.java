package Class4;

public class IfElseConditions2 {
    public static void main(String[] args) {
        boolean rain = true;
        if(rain){
            System.out.println("Lets take the umbrella");   // Plan A
        }else{
            System.out.println("Lets just take the hat");   // Plan B
        }

        /* Example if our boolean is false and we will get the Plan B option in console
        boolean rain1 = false;
        if(rain1){
            System.out.println("Lets take the umbrella");
        }else{
            System.out.println("Lets just take the hat");
        }
         */


        boolean breakTime = true;
        if(breakTime){
            System.out.println("Lets take the break");   // Plan A
        }else{
            System.out.println("Lets just carry on studies");   // Plan B
        }
    }

}
