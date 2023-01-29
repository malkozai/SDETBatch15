package Class8;

public class NestedLoops7 {
    public static void main(String[] args) {

        /*
        Please print 0 1 2 3 4 5 in 3 in 1st lines using for loop
                     1 2 3 4 5
                     2 3 4 5
         */

        /*for (int i = 0; i <=5; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i = 1; i <=5; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i = 2; i <=5; i++) {
            System.out.print(i+" ");
       }
       */

        // now to that our code should look good and make it easy we just do ... for better understand do debug

        for (int i = 0; i < 3; i++) {
            for (int j = i; j <=5; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
