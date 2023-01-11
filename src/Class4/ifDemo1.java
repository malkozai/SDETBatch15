package Class4;

public class ifDemo1 {
    public static void main(String[] args) {
        int money = 15000;
        if (money > 1000) {
            System.out.println("Lets buy and Iphone");
            if (money > 2000)
                System.out.println("Lets buy a Macbook");
        }

        boolean monthersDay = true;
        if (monthersDay) {
            System.out.println("Happy Mother's Day");
        }

        // equals method is only used for non-primitives datatype
        String name = "Mohammad";
        if (name.equals("Mohammad")) { // when ever we use the equals methods the brackets will be automatically added
            System.out.println("I Love Soccer");


        }
    }
}
