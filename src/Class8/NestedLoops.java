package Class8;

public class NestedLoops {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) { // this is called out for loop

            for (int j = 0; j < 5; j++) { // this is called inner for loop
                System.out.println(j);
            }
            System.out.println("************");
        }
    }
}
