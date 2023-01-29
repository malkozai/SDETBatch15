package Class10;

public class ArrayDemo1 {
    public static void main(String[] args) {

        // create an array of number 10,20,30,40,50 and store the value of no.4

        int [] arr = {10,20,30,40,50};
        System.out.println(arr[4]);

        // can we print two numbers from an array
        System.out.println(arr[1]+" "+arr[4]);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
        System.out.println("*************");

        // Enhanced for loop called commonly as For Each Loop
        // when ever possible use below loop

        for (int number:arr){
            System.out.println(number);
        }
    }
}
