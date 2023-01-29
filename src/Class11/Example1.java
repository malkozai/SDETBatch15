package Class11;

public class Example1 {
    public static void main(String[] args) {

        // write a loop to print all the odd numbers from the elements in 2D array.

        int [][] matrix = {{10,20,30},  // index 0
                          {45,55,66},   // index 1
                          {30,40,20,10,25} // index 2
        };
        // in below loop (matrix.length) tells us how many 1D arrays are present in this 2D array
        for (int i = 0; i < matrix.length; i++) {

            // in below loop (matrix[i].length) will give the size of each 1D array
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j]%2!=0){
                    System.out.print(matrix[i][j]+" ");
                }

            }
            System.out.println();
        }
    }
}
