package Class10;

public class ForEachLoopDemo3 {
    public static void main(String[] args) {


        // print only the odd numbers from this array with the help of normal for loop

        int[] arr={10,13,20,25,45,50};
        // we can't update the elements foreach loop because we don't have access to the index

        for(int x:arr){ // here we're directly getting the value therefore we don't have access to the index value
            if(x%2!=0){
                x=0;
            }
        }


    }
}
