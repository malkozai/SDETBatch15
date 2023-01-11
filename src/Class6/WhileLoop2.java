package Class6;

public class WhileLoop2 {
    public static void main(String[] args) {

            int number = 1;
            while (number<5) { // keeps on checking the condition as long as it returns ture also if we put (true) inside while bracket then it will print infinite time or keep printing
                System.out.println(number);
                number++; // increment the number2 by 1
            }

        System.out.println("*****************************");

            int number2 = 0;
            while (number2<10){
                System.out.println(number2);
                number2+=2;
            }
    }
}

