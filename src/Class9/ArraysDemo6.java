package Class9;

public class ArraysDemo6 {
    public static void main(String[] args) {

        // Task 1. Create an empty array and store 45 44 33 20 and 10 in it and then use a loop to add all the elements
        // which are present on even indexes and print it after adding them.


       int [] numbers = new int[5];

       numbers [0] = 45; // 45+0
       numbers [1] = 44;
       numbers [2] = 33; // 45+33=78
       numbers [3] = 20;
       numbers [4] = 10; // 78+10=88

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if(i%2==0){
                sum = sum + numbers[i];
            }
            }
        System.out.println(sum);
    }
}
