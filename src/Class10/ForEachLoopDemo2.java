package Class10;

public class ForEachLoopDemo2 {
    public static void main(String[] args) {

        /*
        Limitations of foreach loop
         */

        // print only the odd numbers from this array with the help of normal for loop

        int[] arr={10,13,20,25,45,50};
        // arr[1]=0; This is how we update a single element in an array

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2!=0){ // this code is to print the odd numbers only
                System.out.println(arr[i]);
            }
        }

        System.out.println("*********************");
        // Replace all the odd numbers in this array with the help of a normal loop
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2!=0){
                arr[i] = 0; // this code is to replace the odd numbers with zero only
            }
        }
        System.out.println("After replacing all odd numbers with zero");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }
}
