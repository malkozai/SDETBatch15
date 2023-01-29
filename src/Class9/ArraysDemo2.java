package Class9;

public class ArraysDemo2 {
    public static void main(String[] args) {

        // store these numbers 10 20 30 45 50 in an array

        int [] numbers = {10, 20, 30, 45, 50};

        // write code to add all the numbers from an array

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum=sum+numbers[i]; // accumulating the numbers from array // adding all the numbers
        }
        System.out.println(sum);
    }
}
