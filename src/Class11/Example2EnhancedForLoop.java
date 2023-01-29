package Class11;

public class Example2EnhancedForLoop {
    public static void main(String[] args) {

        // write a loop to print all the elements from this 2D array with the use of enhanced for loop

        int [][] matrix = {{10,20,30},  // index 0
                          {45,55,66},   // index 1
                          {30,40,20,10,25} // index 2
        };

        // we specify the data we want to use
        // foreach loop to print all the numbers from a 2D array

        for (int[] arr:matrix){

            for (int number:arr){
                System.out.print(number+" ");
            }
            System.out.println();
        }
    }
}
