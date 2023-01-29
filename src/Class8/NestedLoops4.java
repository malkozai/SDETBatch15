package Class8;

public class NestedLoops4 {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) { // this is called out for loop (controls how many lines to print

            for (int j = 0; j < 5; j++) { // this is called inner for loop

                if (j == 1 || j == 2) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println(); // this sout starts a new line for each iteration
        }
    }
}
