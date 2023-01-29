package Class8;

public class RecapDemo1 {
    public static void main(String[] args) {

        // print the even number 10 8 6 4 2 in while loop

        int num = 10;
        while (num >= 2) {
            System.out.println(num);
            num -=2;
        }

        System.out.println("***************************");

        // print the even number 10 8 6 4 2 in do while loop

        int number2=10;
        do{
            System.out.println(number2);
            number2=number2-2; // same as number2-=2

        }while (number2>=2);

    }
}
