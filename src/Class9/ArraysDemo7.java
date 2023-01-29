package Class9;

public class ArraysDemo7 {
    public static void main(String[] args) {

        // Task 2. Create an array and store 10, 20, 30, 4, 5, 6, 7, 80 and add all the elements which are
        //  multiplied of 2

       int [] num = {10, 20, 30, 4, 5, 6, 80};

        int sum = 0;

        for (int i = 0; i < num.length; i++) {
            if(num[i] % 2 == 0){

                sum=sum+num[i];
            }
            }
        System.out.println(sum);
    }
}
