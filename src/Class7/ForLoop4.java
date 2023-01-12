package Class7;

public class ForLoop4 {
    public static void main(String[] args) {

        // 1 - 2 - 4 - 5 - 7 - 8 - 10 - 11 - 13 - 14 - 16 - 17 - 19;

        for (int num = 1; num < 20; num++) {
            if(num%3!=0){   // this condition divides all the numbers by 3 and checks if the remainder is not 0.
                System.out.println(num);
            }
        }
    }
}
