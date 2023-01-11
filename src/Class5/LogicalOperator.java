package Class5;

public class LogicalOperator {
    public static void main(String[] args) {

        if(10>5 || 4>6){
            System.out.println("1");
        }else{
            System.out.println("2");
        }

        String name = "Mohammad";
        int age = 37;
        if(name.equals("Mohammad") && age ==37){
            System.out.println("You are the Mohammad from batch 15");
        }else{
            System.out.println("I don't know you");
        }

        boolean isTrue = false;
        if(!isTrue){
            System.out.println("You got it");
        }else{
            System.out.println("Need more practice");
        }

        boolean cond=false;
        boolean condition=!cond;

        System.out.println(condition);

        if(condition){
            System.out.println(" You got it");
        }else {
            System.out.println("Need more practice");
        }
    }
}
