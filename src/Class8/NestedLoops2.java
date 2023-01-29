package Class8;

public class NestedLoops2 {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) { // this is called out for loop

            for (int j = 0; j < 5; j++) { // this is called inner for loop
                System.out.println("i = "+i+" j = "+j);
            }
            System.out.println("************");
        }
    }
}
