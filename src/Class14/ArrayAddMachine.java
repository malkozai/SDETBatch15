package Class14;

public class ArrayAddMachine {
    public static void main(String[] args) {

        int [] arr3 = {10,10,10,20,30};
        addArrayElementsMachine(arr3);

        int [] arr4 = {20,20,40,40};
        addArrayElementsMachine(arr4);
    }

    static void addArrayElementsMachine(int [] arr){
        int sum = 0;
        for(int number : arr){
            sum+=number;
        }
        System.out.println(sum);
    }
}
