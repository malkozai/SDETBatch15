package class2;

public class VariableDemo2 {
    public static void main(String[] args) {
        int numberBox=10; // we don't need to define the datatype again and again java remembers it
        numberBox=20; /* we are reassigning number 20 to numberBox so it will overwrite
        10 with 20 and java will always use the last code*/
        System.out.println(numberBox);
        // Example
        numberBox=200;
        System.out.println(numberBox);
        numberBox=30;
        System.out.println(numberBox+20);

        //Example:

        int number=20;
        int number2=20;
        int number3=20;
        int number4=20;
        System.out.println(number*1);
        System.out.println(number*2);
        System.out.println(number*3);
        System.out.println(number*4);

        System.out.println("***********");
        System.out.println(number*1);
        System.out.println(number2*2);
        System.out.println(number3*3);
        System.out.println(number4*4);

    }
}
