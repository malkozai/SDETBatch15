package Class11;

import java.util.Arrays;

public class D2Array {
    public static void main(String[] args) {

        int [][] matrix = {{10,20,30},  // index 0
                          {45,55,66},   // index 1
                          {30,40,20,10,25} // index 2
        };
        System.out.println(matrix[2][4]); // first bracket [] is used to give us the row and second bracket is used []
                                          // for the element of that array.

        // to have all the element from first array what is need to print:
        System.out.println(Arrays.toString(matrix[0]));
        // if we want to use loop to print all the elements from the arrays:
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(matrix[0][i]);
        }
        System.out.println("**************");
        // or we can use
        int [] arr=matrix[0]; // getting complete first array from 2D array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
