package Class14;

public class MethodsDemo1 {
    public static void main(String[] args) {

        int [] arr1 = {10,20,30,40,50};

        int sum = 0;
        for (int number : arr1 ) { // using enhanced loop
            sum+=number;
        }
        System.out.println(sum);

        int [] arr2 = {10,10,10,20,30};
       int sum2 = 0;
        for(int number : arr2){
            sum2+=number;
        }
        System.out.println(sum2);

        int [] arr3 = {10,10,15,20,30};
        sum2 = 0;
        for(int number : arr3){
            sum2+=number;

        }
        System.out.println(sum2);

    }
}
