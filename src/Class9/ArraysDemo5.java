package Class9;

public class ArraysDemo5 {
    public static void main(String[] args) {

        // store these numbers A B c d e F in an array

        int number = 0;
        int [] numbers = new int [5]; // an empty array of size 5 will be created 5 is the size

        numbers [0] = 50;
        numbers [1] = 30;
        numbers [2] = 55;
        numbers [3] = 60;
        numbers [4] = 52;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
            
        }

    }
}
