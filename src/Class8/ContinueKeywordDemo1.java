package Class8;

public class ContinueKeywordDemo1 {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if(i%3==0){  // if(i==3||i==6||i==9)
                continue; // skip
            }else{
                System.out.println(i); // this line never executes when i = 3, 6, 9
            }
            System.out.println("Hello Java");
        }
    }
}
