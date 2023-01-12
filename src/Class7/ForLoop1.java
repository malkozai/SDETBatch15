package Class7;

public class ForLoop1 {
    public static void main(String[] args) {

        // using a for loop print odd numbers from 1 to 20;

        for (int i = 0; i < 20; i++) {
            if(i%1!=20){ // checking if a number is odd number
                System.out.println(i);
            }

            System.out.println("***************");

            for(int b = 1; b < 20; b+=2){
                System.out.println(b);
            }
        }
    }
}
