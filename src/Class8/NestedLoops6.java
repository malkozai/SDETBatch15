package Class8;

public class NestedLoops6 {
    public static void main(String[] args) {

        /*
        Please print 1 2 3 4 5 in 3 lines using for loop
         */

        for (int i = 1; i < 4; i++) { // this is called out for loop (controls how many lines to print // executes the below code 3 times

            for (int j = 1; j <=5; j++) { // this is called inner for loop

                    System.out.print(" "+j); // print the value of j from 1 to 5
                }
            System.out.println();
        }
    }
}
